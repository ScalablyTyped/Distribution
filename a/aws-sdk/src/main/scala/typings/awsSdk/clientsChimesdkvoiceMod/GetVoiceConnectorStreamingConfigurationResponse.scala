package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorStreamingConfigurationResponse extends StObject {
  
  /**
    * The details of the streaming configuration.
    */
  var StreamingConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.StreamingConfiguration] = js.undefined
}
object GetVoiceConnectorStreamingConfigurationResponse {
  
  inline def apply(): GetVoiceConnectorStreamingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceConnectorStreamingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamingConfiguration(value: StreamingConfiguration): Self = StObject.set(x, "StreamingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStreamingConfigurationUndefined: Self = StObject.set(x, "StreamingConfiguration", js.undefined)
  }
}
