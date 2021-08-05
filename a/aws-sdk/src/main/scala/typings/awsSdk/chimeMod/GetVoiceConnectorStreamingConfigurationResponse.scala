package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorStreamingConfigurationResponse extends StObject {
  
  /**
    * The streaming configuration details.
    */
  var StreamingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.StreamingConfiguration] = js.undefined
}
object GetVoiceConnectorStreamingConfigurationResponse {
  
  inline def apply(): GetVoiceConnectorStreamingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationResponse]
  }
  
  extension [Self <: GetVoiceConnectorStreamingConfigurationResponse](x: Self) {
    
    inline def setStreamingConfiguration(value: StreamingConfiguration): Self = StObject.set(x, "StreamingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStreamingConfigurationUndefined: Self = StObject.set(x, "StreamingConfiguration", js.undefined)
  }
}
