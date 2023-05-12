package typings.awsCrt

import typings.awsCrt.distCommonErrorMod.ICrtError
import typings.awsCrt.distCommonMqtt5PacketMod.ConnackPacket
import typings.awsCrt.distCommonMqtt5PacketMod.DisconnectPacket
import typings.awsCrt.distCommonMqtt5PacketMod.PubackPacket
import typings.awsCrt.distCommonMqtt5PacketMod.PublishPacket
import typings.awsCrt.distCommonMqtt5PacketMod.QoS
import typings.awsCrt.distCommonMqtt5PacketMod.SubackPacket
import typings.awsCrt.distCommonMqtt5PacketMod.SubscribePacket
import typings.awsCrt.distCommonMqtt5PacketMod.UnsubackPacket
import typings.awsCrt.distCommonMqtt5PacketMod.UnsubscribePacket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonMqtt5Mod {
  
  @js.native
  sealed trait ClientSessionBehavior extends StObject
  @JSImport("aws-crt/dist/common/mqtt5", "ClientSessionBehavior")
  @js.native
  object ClientSessionBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ClientSessionBehavior & Double] = js.native
    
    /**
      * Always ask for a clean session when connecting
      */
    @js.native
    sealed trait Clean
      extends StObject
         with ClientSessionBehavior
    /* 1 */ val Clean: typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior.Clean & Double = js.native
    
    /** Maps to Clean */
    @js.native
    sealed trait Default
      extends StObject
         with ClientSessionBehavior
    /* 0 */ val Default: typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior.Default & Double = js.native
    
    /**
      * Always attempt to rejoin an existing session.  Since the client does not yet support durable session persistence,
      * this option is not guaranteed to be spec compliant because any unacknowledged qos1 publishes (which are
      * part of the client session state) will not be present on the initial connection.  Until we support
      * durable session resumption, this option is technically spec-breaking, but useful.
      */
    @js.native
    sealed trait RejoinAlways
      extends StObject
         with ClientSessionBehavior
    /* 3 */ val RejoinAlways: typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior.RejoinAlways & Double = js.native
    
    /**
      * Always attempt to rejoin an existing session after an initial connection success.
      *
      * Session rejoin requires an appropriate non-zero session expiry interval in the client's CONNECT options.
      */
    @js.native
    sealed trait RejoinPostSuccess
      extends StObject
         with ClientSessionBehavior
    /* 2 */ val RejoinPostSuccess: typings.awsCrt.distCommonMqtt5Mod.ClientSessionBehavior.RejoinPostSuccess & Double = js.native
  }
  
  @js.native
  sealed trait RetryJitterType extends StObject
  @JSImport("aws-crt/dist/common/mqtt5", "RetryJitterType")
  @js.native
  object RetryJitterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RetryJitterType & Double] = js.native
    
    /**
      * ```NextReconnectDelay = Min(MaxReconnectDelay, Random(MinReconnectDelay, 3 * CurrentReconnectDelay)```
      */
    @js.native
    sealed trait Decorrelated
      extends StObject
         with RetryJitterType
    /* 3 */ val Decorrelated: typings.awsCrt.distCommonMqtt5Mod.RetryJitterType.Decorrelated & Double = js.native
    
    /**
      * Maps to Full
      */
    @js.native
    sealed trait Default
      extends StObject
         with RetryJitterType
    /* 0 */ val Default: typings.awsCrt.distCommonMqtt5Mod.RetryJitterType.Default & Double = js.native
    
    /**
      * Fully random between no delay and the current exponential backoff value.
      * ```NextReconnectDelay = Random(0, CurrentExponentialBackoffValue)```
      */
    @js.native
    sealed trait Full
      extends StObject
         with RetryJitterType
    /* 2 */ val Full: typings.awsCrt.distCommonMqtt5Mod.RetryJitterType.Full & Double = js.native
    
    /**
      * Do not perform any randomization on the reconnect delay:
      * ```NextReconnectDelay = CurrentExponentialBackoffValue```
      */
    @js.native
    sealed trait None
      extends StObject
         with RetryJitterType
    /* 1 */ val None: typings.awsCrt.distCommonMqtt5Mod.RetryJitterType.None & Double = js.native
  }
  
  trait AttemptingConnectEvent extends StObject
  
  type AttemptingConnectEventListener = js.Function1[/* eventData */ AttemptingConnectEvent, Unit]
  
  trait ConnectionFailureEvent extends StObject {
    
    /**
      * If the connection failure was indicated by the server's CONNACK response, the CONNACK packet received from
      * the server.
      */
    var connack: js.UndefOr[ConnackPacket] = js.undefined
    
    /**
      * Description of why the connection attempt failed.
      */
    var error: ICrtError
  }
  object ConnectionFailureEvent {
    
    inline def apply(error: ICrtError): ConnectionFailureEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionFailureEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionFailureEvent] (val x: Self) extends AnyVal {
      
      inline def setConnack(value: ConnackPacket): Self = StObject.set(x, "connack", value.asInstanceOf[js.Any])
      
      inline def setConnackUndefined: Self = StObject.set(x, "connack", js.undefined)
      
      inline def setError(value: ICrtError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectionFailureEventListener = js.Function1[/* eventData */ ConnectionFailureEvent, Unit]
  
  trait ConnectionSuccessEvent extends StObject {
    
    /**
      * CONNACK packet received from the server.
      */
    var connack: ConnackPacket
    
    /**
      * Final MQTT5 connection settings negotiated with the server.
      */
    var settings: NegotiatedSettings
  }
  object ConnectionSuccessEvent {
    
    inline def apply(connack: ConnackPacket, settings: NegotiatedSettings): ConnectionSuccessEvent = {
      val __obj = js.Dynamic.literal(connack = connack.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionSuccessEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionSuccessEvent] (val x: Self) extends AnyVal {
      
      inline def setConnack(value: ConnackPacket): Self = StObject.set(x, "connack", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: NegotiatedSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectionSuccessEventListener = js.Function1[/* eventData */ ConnectionSuccessEvent, Unit]
  
  trait DisconnectionEvent extends StObject {
    
    /**
      * If the disconnection event was due to a server-side DISCONNECT packet, the DISCONNECT packet received from
      * the server.
      */
    var disconnect: js.UndefOr[DisconnectPacket] = js.undefined
    
    /**
      * Best-guess description of why the disconnection occurred.
      */
    var error: ICrtError
  }
  object DisconnectionEvent {
    
    inline def apply(error: ICrtError): DisconnectionEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisconnectionEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisconnectionEvent] (val x: Self) extends AnyVal {
      
      inline def setDisconnect(value: DisconnectPacket): Self = StObject.set(x, "disconnect", value.asInstanceOf[js.Any])
      
      inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
      
      inline def setError(value: ICrtError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  type DisconnectionEventListener = js.Function1[/* eventData */ DisconnectionEvent, Unit]
  
  type ErrorEventListener = js.Function1[/* error */ ICrtError, Unit]
  
  @js.native
  trait IMqtt5Client extends StObject {
    
    /**
      * Triggers cleanup of native resources associated with the MQTT5 client.  Once this has been invoked, callbacks
      * and events are not guaranteed to be received.
      *
      * On the browser, the implementation is an empty function.
      *
      * On Node, this must be called when finished with a client; otherwise, native resources will leak.  It is not safe
      * to invoke any further operations on the client after close() has been called.
      *
      * For a running client, safe and proper shutdown can be accomplished by
      *
      * ```ts
      * const stopped = once(client, "stopped");
      * client.stop();
      * await stopped;
      * client.close();
      * ```
      *
      * This is an asynchronous operation.
      */
    def close(): Unit = js.native
    
    /**
      * Send a message to subscribing clients by queuing a PUBLISH packet to be sent to the server.
      *
      * @param packet PUBLISH packet to send to the server
      * @returns a promise that will be rejected with an error or resolved with the PUBACK response
      */
    def publish(packet: PublishPacket): js.Promise[PublishCompletionResult] = js.native
    
    /**
      * Notifies the MQTT5 client that you want it to maintain connectivity to the configured endpoint.
      * The client will attempt to stay connected using the properties of the reconnect-related parameters
      * in the mqtt5 client configuration.
      *
      * This is an asynchronous operation.
      */
    def start(): Unit = js.native
    
    /**
      * Notifies the MQTT5 client that you want it to end connectivity to the configured endpoint, disconnecting any
      * existing connection and halting reconnection attempts.
      *
      * This is an asynchronous operation.  Once the process completes, no further events will be emitted until the client
      * has {@link start} invoked.
      *
      * @param disconnectPacket (optional) properties of a DISCONNECT packet to send as part of the shutdown process
      */
    def stop(): Unit = js.native
    def stop(packet: DisconnectPacket): Unit = js.native
    
    /**
      * Subscribe to one or more topic filters by queuing a SUBSCRIBE packet to be sent to the server.
      *
      * @param packet SUBSCRIBE packet to send to the server
      * @returns a promise that will be rejected with an error or resolved with the SUBACK response
      */
    def subscribe(packet: SubscribePacket): js.Promise[SubackPacket] = js.native
    
    /**
      * Unsubscribe from one or more topic filters by queuing an UNSUBSCRIBE packet to be sent to the server.
      *
      * @param packet UNSUBSCRIBE packet to send to the server
      * @returns a promise that will be rejected with an error or resolved with the UNSUBACK response
      */
    def unsubscribe(packet: UnsubscribePacket): js.Promise[UnsubackPacket] = js.native
  }
  
  trait MessageReceivedEvent extends StObject {
    
    /**
      * PUBLISH packet received from the server
      */
    var message: PublishPacket
  }
  object MessageReceivedEvent {
    
    inline def apply(message: PublishPacket): MessageReceivedEvent = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageReceivedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageReceivedEvent] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: PublishPacket): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageReceivedEventListener = js.Function1[/* eventData */ MessageReceivedEvent, Unit]
  
  trait NegotiatedSettings extends StObject {
    
    /**
      * The final client id in use by the newly-established connection.  This will be the configured client id if one
      * was given in the configuration, otherwise, if no client id was specified, this will be the client id assigned
      * by the server.  Reconnection attempts will always use the auto-assigned client id, allowing for auto-assigned
      * session resumption.
      */
    var clientId: String
    
    /**
      * The maximum packet size the server is willing to accept.
      */
    var maximumPacketSizeToServer: Double
    
    /**
      * The maximum QoS allowed for publishes on this connection instance
      */
    var maximumQos: QoS
    
    /**
      * The number of in-flight QoS 1 and QoS2 publications the server is willing to process concurrently.
      */
    var receiveMaximumFromServer: Double
    
    /**
      * Whether the client has rejoined an existing session.
      */
    var rejoinedSession: Boolean
    
    /**
      * Whether the server supports retained messages.
      */
    var retainAvailable: Boolean
    
    /**
      * The maximum amount of time in seconds between client packets.  The client should use PINGREQs to ensure this
      * limit is not breached.  The server will disconnect the client for inactivity if no MQTT packet is received
      * in a time interval equal to 1.5 x this value.
      */
    var serverKeepAlive: Double
    
    /**
      * The amount of time in seconds the server will retain the MQTT session after a disconnect.
      */
    var sessionExpiryInterval: Double
    
    /**
      * Whether the server supports shared subscriptions
      */
    var sharedSubscriptionsAvailable: Boolean
    
    /**
      * Whether the server supports subscription identifiers
      */
    var subscriptionIdentifiersAvailable: Boolean
    
    /**
      * Whether the server supports wildcard subscriptions.
      */
    var wildcardSubscriptionsAvailable: Boolean
  }
  object NegotiatedSettings {
    
    inline def apply(
      clientId: String,
      maximumPacketSizeToServer: Double,
      maximumQos: QoS,
      receiveMaximumFromServer: Double,
      rejoinedSession: Boolean,
      retainAvailable: Boolean,
      serverKeepAlive: Double,
      sessionExpiryInterval: Double,
      sharedSubscriptionsAvailable: Boolean,
      subscriptionIdentifiersAvailable: Boolean,
      wildcardSubscriptionsAvailable: Boolean
    ): NegotiatedSettings = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], maximumPacketSizeToServer = maximumPacketSizeToServer.asInstanceOf[js.Any], maximumQos = maximumQos.asInstanceOf[js.Any], receiveMaximumFromServer = receiveMaximumFromServer.asInstanceOf[js.Any], rejoinedSession = rejoinedSession.asInstanceOf[js.Any], retainAvailable = retainAvailable.asInstanceOf[js.Any], serverKeepAlive = serverKeepAlive.asInstanceOf[js.Any], sessionExpiryInterval = sessionExpiryInterval.asInstanceOf[js.Any], sharedSubscriptionsAvailable = sharedSubscriptionsAvailable.asInstanceOf[js.Any], subscriptionIdentifiersAvailable = subscriptionIdentifiersAvailable.asInstanceOf[js.Any], wildcardSubscriptionsAvailable = wildcardSubscriptionsAvailable.asInstanceOf[js.Any])
      __obj.asInstanceOf[NegotiatedSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NegotiatedSettings] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setMaximumPacketSizeToServer(value: Double): Self = StObject.set(x, "maximumPacketSizeToServer", value.asInstanceOf[js.Any])
      
      inline def setMaximumQos(value: QoS): Self = StObject.set(x, "maximumQos", value.asInstanceOf[js.Any])
      
      inline def setReceiveMaximumFromServer(value: Double): Self = StObject.set(x, "receiveMaximumFromServer", value.asInstanceOf[js.Any])
      
      inline def setRejoinedSession(value: Boolean): Self = StObject.set(x, "rejoinedSession", value.asInstanceOf[js.Any])
      
      inline def setRetainAvailable(value: Boolean): Self = StObject.set(x, "retainAvailable", value.asInstanceOf[js.Any])
      
      inline def setServerKeepAlive(value: Double): Self = StObject.set(x, "serverKeepAlive", value.asInstanceOf[js.Any])
      
      inline def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
      
      inline def setSharedSubscriptionsAvailable(value: Boolean): Self = StObject.set(x, "sharedSubscriptionsAvailable", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdentifiersAvailable(value: Boolean): Self = StObject.set(x, "subscriptionIdentifiersAvailable", value.asInstanceOf[js.Any])
      
      inline def setWildcardSubscriptionsAvailable(value: Boolean): Self = StObject.set(x, "wildcardSubscriptionsAvailable", value.asInstanceOf[js.Any])
    }
  }
  
  type PublishCompletionResult = js.UndefOr[PubackPacket]
  
  trait StoppedEvent extends StObject
  
  type StoppedEventListener = js.Function1[/* eventData */ StoppedEvent, Unit]
}
