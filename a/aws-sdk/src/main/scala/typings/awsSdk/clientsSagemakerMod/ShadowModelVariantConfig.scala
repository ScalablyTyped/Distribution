package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowModelVariantConfig extends StObject {
  
  /**
    *  The percentage of inference requests that Amazon SageMaker replicates from the production variant to the shadow variant. 
    */
  var SamplingPercentage: Percentage
  
  /**
    * The name of the shadow variant.
    */
  var ShadowModelVariantName: ModelVariantName
}
object ShadowModelVariantConfig {
  
  inline def apply(SamplingPercentage: Percentage, ShadowModelVariantName: ModelVariantName): ShadowModelVariantConfig = {
    val __obj = js.Dynamic.literal(SamplingPercentage = SamplingPercentage.asInstanceOf[js.Any], ShadowModelVariantName = ShadowModelVariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowModelVariantConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowModelVariantConfig] (val x: Self) extends AnyVal {
    
    inline def setSamplingPercentage(value: Percentage): Self = StObject.set(x, "SamplingPercentage", value.asInstanceOf[js.Any])
    
    inline def setShadowModelVariantName(value: ModelVariantName): Self = StObject.set(x, "ShadowModelVariantName", value.asInstanceOf[js.Any])
  }
}
