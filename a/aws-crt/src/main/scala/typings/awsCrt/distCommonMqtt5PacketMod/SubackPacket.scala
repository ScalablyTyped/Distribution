package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubackPacket
  extends StObject
     with IPacket {
  
  /**
    * A list of reason codes indicating the result of each individual subscription entry in the
    * associated SUBSCRIBE packet.
    *
    * See [MQTT5 Suback Payload](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901178)
    */
  var reasonCodes: js.Array[SubackReasonCode]
  
  /**
    * Additional diagnostic information about the result of the SUBSCRIBE attempt.
    *
    * See [MQTT5 Reason String](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901176)
    */
  var reasonString: js.UndefOr[String] = js.undefined
  
  /**
    * Set of MQTT5 user properties included with the packet.
    *
    * See [MQTT5 User Property](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901177)
    */
  var userProperties: js.UndefOr[js.Array[UserProperty]] = js.undefined
}
object SubackPacket {
  
  inline def apply(reasonCodes: js.Array[SubackReasonCode]): SubackPacket = {
    val __obj = js.Dynamic.literal(reasonCodes = reasonCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubackPacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubackPacket] (val x: Self) extends AnyVal {
    
    inline def setReasonCodes(value: js.Array[SubackReasonCode]): Self = StObject.set(x, "reasonCodes", value.asInstanceOf[js.Any])
    
    inline def setReasonCodesVarargs(value: SubackReasonCode*): Self = StObject.set(x, "reasonCodes", js.Array(value*))
    
    inline def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
    
    inline def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
    
    inline def setUserProperties(value: js.Array[UserProperty]): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    
    inline def setUserPropertiesVarargs(value: UserProperty*): Self = StObject.set(x, "userProperties", js.Array(value*))
  }
}
