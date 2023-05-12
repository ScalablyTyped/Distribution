package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorGroupRequest extends StObject {
  
  /**
    * The Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString
}
object GetVoiceConnectorGroupRequest {
  
  inline def apply(VoiceConnectorGroupId: NonEmptyString): GetVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnectorGroupId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupId", value.asInstanceOf[js.Any])
  }
}
