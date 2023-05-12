package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelConfiguration extends StObject {
  
  /**
    * The name of the compilation job used to create the recommended model artifacts.
    */
  var CompilationJobName: js.UndefOr[RecommendationJobCompilationJobName] = js.undefined
  
  /**
    * Defines the environment parameters that includes key, value types, and values.
    */
  var EnvironmentParameters: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EnvironmentParameters] = js.undefined
  
  /**
    * The inference specification name in the model package version.
    */
  var InferenceSpecificationName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InferenceSpecificationName] = js.undefined
}
object ModelConfiguration {
  
  inline def apply(): ModelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCompilationJobName(value: RecommendationJobCompilationJobName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobNameUndefined: Self = StObject.set(x, "CompilationJobName", js.undefined)
    
    inline def setEnvironmentParameters(value: EnvironmentParameters): Self = StObject.set(x, "EnvironmentParameters", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentParametersUndefined: Self = StObject.set(x, "EnvironmentParameters", js.undefined)
    
    inline def setEnvironmentParametersVarargs(value: EnvironmentParameter*): Self = StObject.set(x, "EnvironmentParameters", js.Array(value*))
    
    inline def setInferenceSpecificationName(value: InferenceSpecificationName): Self = StObject.set(x, "InferenceSpecificationName", value.asInstanceOf[js.Any])
    
    inline def setInferenceSpecificationNameUndefined: Self = StObject.set(x, "InferenceSpecificationName", js.undefined)
  }
}
