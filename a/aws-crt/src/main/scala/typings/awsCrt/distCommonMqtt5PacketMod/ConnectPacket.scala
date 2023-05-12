package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectPacket
  extends StObject
     with IPacket {
  
  /**
    * A unique string identifying the client to the server.  Used to restore session state between connections.
    *
    * If left empty, the broker will auto-assign a unique client id.  When reconnecting, the mqtt5 client will
    * always use the auto-assigned client id.
    *
    * See [MQTT5 Client Identifier](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901059)
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum time interval, in seconds, that is permitted to elapse between the point at which the client
    * finishes transmitting one MQTT packet and the point it starts sending the next.  The client will use
    * PINGREQ packets to maintain this property.
    *
    * If the responding CONNACK contains a keep alive property value, then that is the negotiated keep alive value.
    * Otherwise, the keep alive sent by the client is the negotiated value.
    *
    * See [MQTT5 Keep Alive](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901045)
    */
  var keepAliveIntervalSeconds: Double
  
  /**
    * Notifies the server of the maximum packet size the client is willing to handle.  If
    * omitted, then no limit beyond the natural limits of MQTT packet size is requested.
    *
    * See [MQTT5 Maximum Packet Size](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901050)
    */
  var maximumPacketSizeBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * Opaque binary data that the server may use for client authentication and authorization.
    *
    * See [MQTT5 Password](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901072)
    */
  var password: js.UndefOr[BinaryData] = js.undefined
  
  /**
    * Notifies the server of the maximum number of in-flight Qos 1 and 2 messages the client is willing to handle.  If
    * omitted, then no limit is requested.
    *
    * See [MQTT5 Receive Maximum](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901049)
    */
  var receiveMaximum: js.UndefOr[Double] = js.undefined
  
  /**
    * If set to true, requests that the server send additional diagnostic information (via response string or
    * user properties) in DISCONNECT or CONNACK packets from the server.
    *
    * See [MQTT5 Request Problem Information](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901053)
    */
  var requestProblemInformation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, requests that the server send response information in the subsequent CONNACK.  This response
    * information may be used to set up request-response implementations over MQTT, but doing so is outside
    * the scope of the MQTT5 spec and client.
    *
    * See [MQTT5 Request Response Information](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901052)
    */
  var requestResponseInformation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A time interval, in seconds, that the client requests the server to persist this connection's MQTT session state
    * for.  Has no meaning if the client has not been configured to rejoin sessions.  Must be non-zero in order to
    * successfully rejoin a session.
    *
    * If the responding CONNACK contains a session expiry property value, then that is the negotiated session expiry
    * value.  Otherwise, the session expiry sent by the client is the negotiated value.
    *
    * See [MQTT5 Session Expiry Interval](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901048)
    */
  var sessionExpiryIntervalSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * Set of MQTT5 user properties included with the packet.
    *
    * See [MQTT5 User Property](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901054)
    */
  var userProperties: js.UndefOr[js.Array[UserProperty]] = js.undefined
  
  /**
    * A string value that the server may use for client authentication and authorization.
    *
    * See [MQTT5 User Name](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901071)
    */
  var username: js.UndefOr[String] = js.undefined
  
  /**
    * The definition of a message to be published when the connection's session is destroyed by the server or when
    * the will delay interval has elapsed, whichever comes first.  If undefined, then nothing will be sent.
    *
    * See [MQTT5 Will](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901040)
    */
  var will: js.UndefOr[PublishPacket] = js.undefined
  
  /**
    * A time interval, in seconds, that the server should wait (for a session reconnection) before sending the
    * will message associated with the connection's session.  If omitted, the server will send the will when the
    * associated session is destroyed.  If the session is destroyed before a will delay interval has elapsed, then
    * the will must be sent at the time of session destruction.
    *
    * See [MQTT5 Will Delay Interval](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901062)
    */
  var willDelayIntervalSeconds: js.UndefOr[Double] = js.undefined
}
object ConnectPacket {
  
  inline def apply(keepAliveIntervalSeconds: Double): ConnectPacket = {
    val __obj = js.Dynamic.literal(keepAliveIntervalSeconds = keepAliveIntervalSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectPacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectPacket] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setKeepAliveIntervalSeconds(value: Double): Self = StObject.set(x, "keepAliveIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumPacketSizeBytes(value: Double): Self = StObject.set(x, "maximumPacketSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setMaximumPacketSizeBytesUndefined: Self = StObject.set(x, "maximumPacketSizeBytes", js.undefined)
    
    inline def setPassword(value: BinaryData): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setReceiveMaximum(value: Double): Self = StObject.set(x, "receiveMaximum", value.asInstanceOf[js.Any])
    
    inline def setReceiveMaximumUndefined: Self = StObject.set(x, "receiveMaximum", js.undefined)
    
    inline def setRequestProblemInformation(value: Boolean): Self = StObject.set(x, "requestProblemInformation", value.asInstanceOf[js.Any])
    
    inline def setRequestProblemInformationUndefined: Self = StObject.set(x, "requestProblemInformation", js.undefined)
    
    inline def setRequestResponseInformation(value: Boolean): Self = StObject.set(x, "requestResponseInformation", value.asInstanceOf[js.Any])
    
    inline def setRequestResponseInformationUndefined: Self = StObject.set(x, "requestResponseInformation", js.undefined)
    
    inline def setSessionExpiryIntervalSeconds(value: Double): Self = StObject.set(x, "sessionExpiryIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setSessionExpiryIntervalSecondsUndefined: Self = StObject.set(x, "sessionExpiryIntervalSeconds", js.undefined)
    
    inline def setUserProperties(value: js.Array[UserProperty]): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    
    inline def setUserPropertiesVarargs(value: UserProperty*): Self = StObject.set(x, "userProperties", js.Array(value*))
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setWill(value: PublishPacket): Self = StObject.set(x, "will", value.asInstanceOf[js.Any])
    
    inline def setWillDelayIntervalSeconds(value: Double): Self = StObject.set(x, "willDelayIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setWillDelayIntervalSecondsUndefined: Self = StObject.set(x, "willDelayIntervalSeconds", js.undefined)
    
    inline def setWillUndefined: Self = StObject.set(x, "will", js.undefined)
  }
}
