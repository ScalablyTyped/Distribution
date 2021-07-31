package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceConnectorGroupResponse extends StObject {
  
  /**
    * The Amazon Chime Voice Connector group details.
    */
  var VoiceConnectorGroup: js.UndefOr[typings.awsSdk.chimeMod.VoiceConnectorGroup] = js.undefined
}
object CreateVoiceConnectorGroupResponse {
  
  @scala.inline
  def apply(): CreateVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVoiceConnectorGroupResponse]
  }
  
  @scala.inline
  implicit class CreateVoiceConnectorGroupResponseMutableBuilder[Self <: CreateVoiceConnectorGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorGroup(value: VoiceConnectorGroup): Self = StObject.set(x, "VoiceConnectorGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorGroupUndefined: Self = StObject.set(x, "VoiceConnectorGroup", js.undefined)
  }
}
