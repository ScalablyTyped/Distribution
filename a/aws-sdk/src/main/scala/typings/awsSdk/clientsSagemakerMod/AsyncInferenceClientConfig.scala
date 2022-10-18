package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncInferenceClientConfig extends StObject {
  
  /**
    * The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, SageMaker chooses an optimal value.
    */
  var MaxConcurrentInvocationsPerInstance: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxConcurrentInvocationsPerInstance] = js.undefined
}
object AsyncInferenceClientConfig {
  
  inline def apply(): AsyncInferenceClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncInferenceClientConfig]
  }
  
  extension [Self <: AsyncInferenceClientConfig](x: Self) {
    
    inline def setMaxConcurrentInvocationsPerInstance(value: MaxConcurrentInvocationsPerInstance): Self = StObject.set(x, "MaxConcurrentInvocationsPerInstance", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentInvocationsPerInstanceUndefined: Self = StObject.set(x, "MaxConcurrentInvocationsPerInstance", js.undefined)
  }
}
