package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorStreamingConfigurationResponse extends StObject {
  
  /**
    * The streaming configuration details.
    */
  var StreamingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.StreamingConfiguration] = js.native
}
object GetVoiceConnectorStreamingConfigurationResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorStreamingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorStreamingConfigurationResponseMutableBuilder[Self <: GetVoiceConnectorStreamingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamingConfiguration(value: StreamingConfiguration): Self = StObject.set(x, "StreamingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingConfigurationUndefined: Self = StObject.set(x, "StreamingConfiguration", js.undefined)
  }
}
