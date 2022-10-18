package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointInputConfiguration extends StObject {
  
  /**
    *  The parameter you want to benchmark against.
    */
  var EnvironmentParameterRanges: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EnvironmentParameterRanges] = js.undefined
  
  /**
    * The inference specification name in the model package version.
    */
  var InferenceSpecificationName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InferenceSpecificationName] = js.undefined
  
  /**
    * The instance types to use for the load test.
    */
  var InstanceType: ProductionVariantInstanceType
}
object EndpointInputConfiguration {
  
  inline def apply(InstanceType: ProductionVariantInstanceType): EndpointInputConfiguration = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointInputConfiguration]
  }
  
  extension [Self <: EndpointInputConfiguration](x: Self) {
    
    inline def setEnvironmentParameterRanges(value: EnvironmentParameterRanges): Self = StObject.set(x, "EnvironmentParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentParameterRangesUndefined: Self = StObject.set(x, "EnvironmentParameterRanges", js.undefined)
    
    inline def setInferenceSpecificationName(value: InferenceSpecificationName): Self = StObject.set(x, "InferenceSpecificationName", value.asInstanceOf[js.Any])
    
    inline def setInferenceSpecificationNameUndefined: Self = StObject.set(x, "InferenceSpecificationName", js.undefined)
    
    inline def setInstanceType(value: ProductionVariantInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
  }
}
