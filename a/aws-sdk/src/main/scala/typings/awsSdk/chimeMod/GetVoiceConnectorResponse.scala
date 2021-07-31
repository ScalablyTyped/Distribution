package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorResponse extends StObject {
  
  /**
    * The Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsSdk.chimeMod.VoiceConnector] = js.undefined
}
object GetVoiceConnectorResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorResponseMutableBuilder[Self <: GetVoiceConnectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnector(value: VoiceConnector): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
