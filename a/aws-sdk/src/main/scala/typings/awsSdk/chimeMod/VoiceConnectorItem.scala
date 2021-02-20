package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceConnectorItem extends StObject {
  
  /**
    * The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first. 
    */
  var Priority: VoiceConnectorItemPriority = js.native
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object VoiceConnectorItem {
  
  @scala.inline
  def apply(Priority: VoiceConnectorItemPriority, VoiceConnectorId: NonEmptyString): VoiceConnectorItem = {
    val __obj = js.Dynamic.literal(Priority = Priority.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceConnectorItem]
  }
  
  @scala.inline
  implicit class VoiceConnectorItemMutableBuilder[Self <: VoiceConnectorItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: VoiceConnectorItemPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
