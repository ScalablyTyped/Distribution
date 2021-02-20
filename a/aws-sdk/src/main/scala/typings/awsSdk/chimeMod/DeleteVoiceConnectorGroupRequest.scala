package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVoiceConnectorGroupRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
}
object DeleteVoiceConnectorGroupRequest {
  
  @scala.inline
  def apply(VoiceConnectorGroupId: NonEmptyString): DeleteVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteVoiceConnectorGroupRequestMutableBuilder[Self <: DeleteVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorGroupId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupId", value.asInstanceOf[js.Any])
  }
}
