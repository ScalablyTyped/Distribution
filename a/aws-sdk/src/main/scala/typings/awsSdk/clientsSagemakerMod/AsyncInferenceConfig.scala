package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncInferenceConfig extends StObject {
  
  /**
    * Configures the behavior of the client used by SageMaker to interact with the model container during asynchronous inference.
    */
  var ClientConfig: js.UndefOr[AsyncInferenceClientConfig] = js.undefined
  
  /**
    * Specifies the configuration for asynchronous inference invocation outputs.
    */
  var OutputConfig: AsyncInferenceOutputConfig
}
object AsyncInferenceConfig {
  
  inline def apply(OutputConfig: AsyncInferenceOutputConfig): AsyncInferenceConfig = {
    val __obj = js.Dynamic.literal(OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncInferenceConfig]
  }
  
  extension [Self <: AsyncInferenceConfig](x: Self) {
    
    inline def setClientConfig(value: AsyncInferenceClientConfig): Self = StObject.set(x, "ClientConfig", value.asInstanceOf[js.Any])
    
    inline def setClientConfigUndefined: Self = StObject.set(x, "ClientConfig", js.undefined)
    
    inline def setOutputConfig(value: AsyncInferenceOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
  }
}
