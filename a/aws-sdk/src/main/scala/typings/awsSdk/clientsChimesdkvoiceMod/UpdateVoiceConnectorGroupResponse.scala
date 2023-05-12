package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceConnectorGroupResponse extends StObject {
  
  /**
    * The updated Voice Connector group.
    */
  var VoiceConnectorGroup: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceConnectorGroup] = js.undefined
}
object UpdateVoiceConnectorGroupResponse {
  
  inline def apply(): UpdateVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVoiceConnectorGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVoiceConnectorGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnectorGroup(value: VoiceConnectorGroup): Self = StObject.set(x, "VoiceConnectorGroup", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorGroupUndefined: Self = StObject.set(x, "VoiceConnectorGroup", js.undefined)
  }
}
