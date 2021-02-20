package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVoiceConnectorResponse extends StObject {
  
  /**
    * The Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsSdk.chimeMod.VoiceConnector] = js.native
}
object CreateVoiceConnectorResponse {
  
  @scala.inline
  def apply(): CreateVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVoiceConnectorResponse]
  }
  
  @scala.inline
  implicit class CreateVoiceConnectorResponseMutableBuilder[Self <: CreateVoiceConnectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnector(value: VoiceConnector): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
