package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorGroupResponse extends StObject {
  
  /**
    * The Amazon Chime Voice Connector group details.
    */
  var VoiceConnectorGroup: js.UndefOr[typings.awsSdk.chimeMod.VoiceConnectorGroup] = js.undefined
}
object GetVoiceConnectorGroupResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorGroupResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorGroupResponseMutableBuilder[Self <: GetVoiceConnectorGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorGroup(value: VoiceConnectorGroup): Self = StObject.set(x, "VoiceConnectorGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorGroupUndefined: Self = StObject.set(x, "VoiceConnectorGroup", js.undefined)
  }
}
