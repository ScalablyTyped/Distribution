package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsubscribePacket
  extends StObject
     with IPacket {
  
  /**
    * List of topic filters that the client wishes to unsubscribe from.
    *
    * See [MQTT5 Unsubscribe Payload](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901185)
    */
  var topicFilters: js.Array[String]
  
  /**
    * Set of MQTT5 user properties included with the packet.
    *
    * See [MQTT5 User Property](https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901184)
    */
  var userProperties: js.UndefOr[js.Array[UserProperty]] = js.undefined
}
object UnsubscribePacket {
  
  inline def apply(topicFilters: js.Array[String]): UnsubscribePacket = {
    val __obj = js.Dynamic.literal(topicFilters = topicFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribePacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnsubscribePacket] (val x: Self) extends AnyVal {
    
    inline def setTopicFilters(value: js.Array[String]): Self = StObject.set(x, "topicFilters", value.asInstanceOf[js.Any])
    
    inline def setTopicFiltersVarargs(value: String*): Self = StObject.set(x, "topicFilters", js.Array(value*))
    
    inline def setUserProperties(value: js.Array[UserProperty]): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    
    inline def setUserPropertiesVarargs(value: UserProperty*): Self = StObject.set(x, "userProperties", js.Array(value*))
  }
}
