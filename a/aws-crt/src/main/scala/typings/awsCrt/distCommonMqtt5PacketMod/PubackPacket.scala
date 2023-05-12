package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubackPacket
  extends StObject
     with IPacket {
  
  /**
    * Success indicator or failure reason for the associated PUBLISH packet.
    *
    * See [MQTT5 PUBACK Reason Code](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901124)
    */
  var reasonCode: PubackReasonCode
  
  /**
    * Additional diagnostic information about the result of the PUBLISH attempt.
    *
    * See [MQTT5 Reason String](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901127)
    */
  var reasonString: js.UndefOr[String] = js.undefined
  
  /**
    * Set of MQTT5 user properties included with the packet.
    *
    * See [MQTT5 User Property](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901128)
    */
  var userProperties: js.UndefOr[js.Array[UserProperty]] = js.undefined
}
object PubackPacket {
  
  inline def apply(reasonCode: PubackReasonCode): PubackPacket = {
    val __obj = js.Dynamic.literal(reasonCode = reasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubackPacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PubackPacket] (val x: Self) extends AnyVal {
    
    inline def setReasonCode(value: PubackReasonCode): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
    
    inline def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
    
    inline def setUserProperties(value: js.Array[UserProperty]): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    
    inline def setUserPropertiesVarargs(value: UserProperty*): Self = StObject.set(x, "userProperties", js.Array(value*))
  }
}
