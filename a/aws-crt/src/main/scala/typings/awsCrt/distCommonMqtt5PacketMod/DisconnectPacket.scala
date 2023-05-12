package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectPacket
  extends StObject
     with IPacket {
  
  /**
    * Value indicating the reason that the sender is closing the connection
    *
    * See [MQTT5 Disconnect Reason Code](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901208)
    */
  var reasonCode: DisconnectReasonCode
  
  /**
    * Additional diagnostic information about the reason that the sender is closing the connection
    *
    * See [MQTT5 Reason String](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901212)
    */
  var reasonString: js.UndefOr[String] = js.undefined
  
  /**
    * Property indicating an alternate server that the client may temporarily or permanently attempt
    * to connect to instead of the configured endpoint.  Will only be set if the reason code indicates another
    * server may be used (ServerMoved, UseAnotherServer).
    *
    * See [MQTT5 Server Reference](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901214)
    */
  var serverReference: js.UndefOr[String] = js.undefined
  
  /**
    * Requests a change to the session expiry interval negotiated at connection time as part of the disconnect.  Only
    * valid for  DISCONNECT packets sent from client to server.  It is not valid to attempt to change session expiry
    * from zero to a non-zero value.
    *
    * See [MQTT5 Session Expiry Interval](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901211)
    */
  var sessionExpiryIntervalSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * Set of MQTT5 user properties included with the packet.
    *
    * See [MQTT5 User Property](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901213)
    */
  var userProperties: js.UndefOr[js.Array[UserProperty]] = js.undefined
}
object DisconnectPacket {
  
  inline def apply(reasonCode: DisconnectReasonCode): DisconnectPacket = {
    val __obj = js.Dynamic.literal(reasonCode = reasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectPacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisconnectPacket] (val x: Self) extends AnyVal {
    
    inline def setReasonCode(value: DisconnectReasonCode): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
    
    inline def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
    
    inline def setServerReference(value: String): Self = StObject.set(x, "serverReference", value.asInstanceOf[js.Any])
    
    inline def setServerReferenceUndefined: Self = StObject.set(x, "serverReference", js.undefined)
    
    inline def setSessionExpiryIntervalSeconds(value: Double): Self = StObject.set(x, "sessionExpiryIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setSessionExpiryIntervalSecondsUndefined: Self = StObject.set(x, "sessionExpiryIntervalSeconds", js.undefined)
    
    inline def setUserProperties(value: js.Array[UserProperty]): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    
    inline def setUserPropertiesVarargs(value: UserProperty*): Self = StObject.set(x, "userProperties", js.Array(value*))
  }
}
