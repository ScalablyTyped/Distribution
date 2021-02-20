package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVoiceConnectorResponse extends StObject {
  
  /**
    * The updated Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsSdk.chimeMod.VoiceConnector] = js.native
}
object UpdateVoiceConnectorResponse {
  
  @scala.inline
  def apply(): UpdateVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVoiceConnectorResponse]
  }
  
  @scala.inline
  implicit class UpdateVoiceConnectorResponseMutableBuilder[Self <: UpdateVoiceConnectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnector(value: VoiceConnector): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
