package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowModeConfig extends StObject {
  
  /**
    * List of shadow variant configurations.
    */
  var ShadowModelVariants: ShadowModelVariantConfigList
  
  /**
    *  The name of the production variant, which takes all the inference requests. 
    */
  var SourceModelVariantName: ModelVariantName
}
object ShadowModeConfig {
  
  inline def apply(ShadowModelVariants: ShadowModelVariantConfigList, SourceModelVariantName: ModelVariantName): ShadowModeConfig = {
    val __obj = js.Dynamic.literal(ShadowModelVariants = ShadowModelVariants.asInstanceOf[js.Any], SourceModelVariantName = SourceModelVariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowModeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowModeConfig] (val x: Self) extends AnyVal {
    
    inline def setShadowModelVariants(value: ShadowModelVariantConfigList): Self = StObject.set(x, "ShadowModelVariants", value.asInstanceOf[js.Any])
    
    inline def setShadowModelVariantsVarargs(value: ShadowModelVariantConfig*): Self = StObject.set(x, "ShadowModelVariants", js.Array(value*))
    
    inline def setSourceModelVariantName(value: ModelVariantName): Self = StObject.set(x, "SourceModelVariantName", value.asInstanceOf[js.Any])
  }
}
