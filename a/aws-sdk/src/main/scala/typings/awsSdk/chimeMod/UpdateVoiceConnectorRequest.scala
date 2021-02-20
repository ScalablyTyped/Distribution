package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVoiceConnectorRequest extends StObject {
  
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: VoiceConnectorName = js.native
  
  /**
    * When enabled, requires encryption for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: Boolean = js.native
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object UpdateVoiceConnectorRequest {
  
  @scala.inline
  def apply(Name: VoiceConnectorName, RequireEncryption: Boolean, VoiceConnectorId: NonEmptyString): UpdateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequireEncryption = RequireEncryption.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceConnectorRequest]
  }
  
  @scala.inline
  implicit class UpdateVoiceConnectorRequestMutableBuilder[Self <: UpdateVoiceConnectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: VoiceConnectorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireEncryption(value: Boolean): Self = StObject.set(x, "RequireEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
