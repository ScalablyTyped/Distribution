package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceConnectorGroupRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString
}
object DeleteVoiceConnectorGroupRequest {
  
  inline def apply(VoiceConnectorGroupId: NonEmptyString): DeleteVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorGroupRequest]
  }
  
  extension [Self <: DeleteVoiceConnectorGroupRequest](x: Self) {
    
    inline def setVoiceConnectorGroupId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupId", value.asInstanceOf[js.Any])
  }
}
