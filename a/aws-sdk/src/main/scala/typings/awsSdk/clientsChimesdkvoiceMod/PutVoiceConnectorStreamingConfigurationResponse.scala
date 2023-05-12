package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorStreamingConfigurationResponse extends StObject {
  
  /**
    * The updated streaming settings.
    */
  var StreamingConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.StreamingConfiguration] = js.undefined
}
object PutVoiceConnectorStreamingConfigurationResponse {
  
  inline def apply(): PutVoiceConnectorStreamingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorStreamingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamingConfiguration(value: StreamingConfiguration): Self = StObject.set(x, "StreamingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStreamingConfigurationUndefined: Self = StObject.set(x, "StreamingConfiguration", js.undefined)
  }
}
