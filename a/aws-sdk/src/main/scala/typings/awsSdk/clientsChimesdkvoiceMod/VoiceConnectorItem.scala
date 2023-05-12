package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceConnectorItem extends StObject {
  
  /**
    * The priority setting of a Voice Connector item. Calls are routed to hosts in priority order, with 1 as the highest priority. When hosts have equal priority, the system distributes calls among them based on their relative weight.
    */
  var Priority: VoiceConnectorItemPriority
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object VoiceConnectorItem {
  
  inline def apply(Priority: VoiceConnectorItemPriority, VoiceConnectorId: NonEmptyString): VoiceConnectorItem = {
    val __obj = js.Dynamic.literal(Priority = Priority.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceConnectorItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceConnectorItem] (val x: Self) extends AnyVal {
    
    inline def setPriority(value: VoiceConnectorItemPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
