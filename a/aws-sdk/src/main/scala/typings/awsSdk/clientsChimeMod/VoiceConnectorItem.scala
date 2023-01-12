package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceConnectorItem extends StObject {
  
  /**
    * The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first.
    */
  var Priority: VoiceConnectorItemPriority
  
  /**
    * The Amazon Chime Voice Connector ID.
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
