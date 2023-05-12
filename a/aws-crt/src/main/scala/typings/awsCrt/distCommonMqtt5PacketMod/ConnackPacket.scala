package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnackPacket
  extends StObject
     with IPacket {
  
  /**
    * Specifies a client identifier assigned to this connection by the server.  Only valid when the client id of
    * the preceding CONNECT packet was left empty.
    *
    * See [MQTT5 Assigned Client Identifier](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901087)
    */
  var assignedClientIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the maximum packet size, in bytes, that the server is willing to accept.  If undefined, there
    * is no limit beyond what is imposed by the MQTT spec itself.
    *
    * See [MQTT5 Maximum Packet Size](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901086)
    */
  var maximumPacketSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum message delivery quality of service that the server will allow on this connection.
    *
    * See [MQTT5 Maximum QoS](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901084)
    */
  var maximumQos: js.UndefOr[QoS] = js.undefined
  
  /**
    * Indicates either success or the reason for failure for the connection attempt.
    *
    * See [MQTT5 Connect Reason Code](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901079)
    */
  var reasonCode: ConnectReasonCode
  
  /**
    * Additional diagnostic information about the result of the connection attempt.
    *
    * See [MQTT5 Reason String](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901089)
    */
  var reasonString: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum amount of in-flight QoS 1 or 2 messages that the server is willing to handle at once.  If omitted,
    * the limit is based on the valid MQTT packet id space (65535).
    *
    * See [MQTT5 Receive Maximum](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901083)
    */
  var receiveMaximum: js.UndefOr[Double] = js.undefined
  
  /**
    * A value that can be used in the creation of a response topic associated with this connection.  MQTT5-based
    * request/response is outside the purview of the MQTT5 spec and this client.
    *
    * See [MQTT5 Response Information](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901095)
    */
  var responseInformation: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the server supports retained messages.  If undefined, retained messages are
    * supported.
    *
    * See [MQTT5 Retain Available](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901085)
    */
  var retainAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Server-requested override of the keep alive interval, in seconds.  If undefined, the keep alive value sent
    * by the client should be used.
    *
    * See [MQTT5 Server Keep Alive](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901094)
    */
  var serverKeepAlive: js.UndefOr[Double] = js.undefined
  
  /**
    * Property indicating an alternate server that the client may temporarily or permanently attempt
    * to connect to instead of the configured endpoint.  Will only be set if the reason code indicates another
    * server may be used (ServerMoved, UseAnotherServer).
    *
    * See [MQTT5 Server Reference](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901096)
    */
  var serverReference: js.UndefOr[String] = js.undefined
  
  /**
    * A time interval, in seconds, that the server will persist this connection's MQTT session state
    * for.  If present, this value overrides any session expiry specified in the preceding CONNECT packet.
    *
    * See [MQTT5 Session Expiry Interval](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901082)
    */
  var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * True if the client rejoined an existing session on the server, false otherwise.
    *
    * See [MQTT5 Session Present](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901078)
    */
  var sessionPresent: Boolean
  
  /**
    * Indicates whether the server supports shared subscription topic filters.  If undefined, shared subscriptions
    * are supported.
    *
    * See [MQTT5 Shared Subscriptions Available](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901093)
    */
  var sharedSubscriptionsAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the server supports subscription identifiers.  If undefined, subscription identifiers
    * are supported.
    *
    * See [MQTT5 Subscription Identifiers Available](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901092)
    */
  var subscriptionIdentifiersAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the maximum topic alias value that the server will accept from the client.
    *
    * See [MQTT5 Topic Alias Maximum](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901088)
    */
  var topicAliasMaximum: js.UndefOr[Double] = js.undefined
  
  /**
    * Set of MQTT5 user properties included with the packet.
    *
    * See [MQTT5 User Property](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901090)
    */
  var userProperties: js.UndefOr[js.Array[UserProperty]] = js.undefined
  
  /**
    * Indicates whether the server supports wildcard subscriptions.  If undefined, wildcard subscriptions
    * are supported.
    *
    * See [MQTT5 Wildcard Subscriptions Available](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901091)
    */
  var wildcardSubscriptionsAvailable: js.UndefOr[Boolean] = js.undefined
}
object ConnackPacket {
  
  inline def apply(reasonCode: ConnectReasonCode, sessionPresent: Boolean): ConnackPacket = {
    val __obj = js.Dynamic.literal(reasonCode = reasonCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnackPacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnackPacket] (val x: Self) extends AnyVal {
    
    inline def setAssignedClientIdentifier(value: String): Self = StObject.set(x, "assignedClientIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAssignedClientIdentifierUndefined: Self = StObject.set(x, "assignedClientIdentifier", js.undefined)
    
    inline def setMaximumPacketSize(value: Double): Self = StObject.set(x, "maximumPacketSize", value.asInstanceOf[js.Any])
    
    inline def setMaximumPacketSizeUndefined: Self = StObject.set(x, "maximumPacketSize", js.undefined)
    
    inline def setMaximumQos(value: QoS): Self = StObject.set(x, "maximumQos", value.asInstanceOf[js.Any])
    
    inline def setMaximumQosUndefined: Self = StObject.set(x, "maximumQos", js.undefined)
    
    inline def setReasonCode(value: ConnectReasonCode): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
    
    inline def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
    
    inline def setReceiveMaximum(value: Double): Self = StObject.set(x, "receiveMaximum", value.asInstanceOf[js.Any])
    
    inline def setReceiveMaximumUndefined: Self = StObject.set(x, "receiveMaximum", js.undefined)
    
    inline def setResponseInformation(value: String): Self = StObject.set(x, "responseInformation", value.asInstanceOf[js.Any])
    
    inline def setResponseInformationUndefined: Self = StObject.set(x, "responseInformation", js.undefined)
    
    inline def setRetainAvailable(value: Boolean): Self = StObject.set(x, "retainAvailable", value.asInstanceOf[js.Any])
    
    inline def setRetainAvailableUndefined: Self = StObject.set(x, "retainAvailable", js.undefined)
    
    inline def setServerKeepAlive(value: Double): Self = StObject.set(x, "serverKeepAlive", value.asInstanceOf[js.Any])
    
    inline def setServerKeepAliveUndefined: Self = StObject.set(x, "serverKeepAlive", js.undefined)
    
    inline def setServerReference(value: String): Self = StObject.set(x, "serverReference", value.asInstanceOf[js.Any])
    
    inline def setServerReferenceUndefined: Self = StObject.set(x, "serverReference", js.undefined)
    
    inline def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
    
    inline def setSessionExpiryIntervalUndefined: Self = StObject.set(x, "sessionExpiryInterval", js.undefined)
    
    inline def setSessionPresent(value: Boolean): Self = StObject.set(x, "sessionPresent", value.asInstanceOf[js.Any])
    
    inline def setSharedSubscriptionsAvailable(value: Boolean): Self = StObject.set(x, "sharedSubscriptionsAvailable", value.asInstanceOf[js.Any])
    
    inline def setSharedSubscriptionsAvailableUndefined: Self = StObject.set(x, "sharedSubscriptionsAvailable", js.undefined)
    
    inline def setSubscriptionIdentifiersAvailable(value: Boolean): Self = StObject.set(x, "subscriptionIdentifiersAvailable", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdentifiersAvailableUndefined: Self = StObject.set(x, "subscriptionIdentifiersAvailable", js.undefined)
    
    inline def setTopicAliasMaximum(value: Double): Self = StObject.set(x, "topicAliasMaximum", value.asInstanceOf[js.Any])
    
    inline def setTopicAliasMaximumUndefined: Self = StObject.set(x, "topicAliasMaximum", js.undefined)
    
    inline def setUserProperties(value: js.Array[UserProperty]): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    
    inline def setUserPropertiesVarargs(value: UserProperty*): Self = StObject.set(x, "userProperties", js.Array(value*))
    
    inline def setWildcardSubscriptionsAvailable(value: Boolean): Self = StObject.set(x, "wildcardSubscriptionsAvailable", value.asInstanceOf[js.Any])
    
    inline def setWildcardSubscriptionsAvailableUndefined: Self = StObject.set(x, "wildcardSubscriptionsAvailable", js.undefined)
  }
}
