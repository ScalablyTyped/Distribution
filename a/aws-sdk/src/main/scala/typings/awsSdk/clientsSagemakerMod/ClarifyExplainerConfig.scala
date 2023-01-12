package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClarifyExplainerConfig extends StObject {
  
  /**
    * A JMESPath boolean expression used to filter which records to explain. Explanations are activated by default. See  EnableExplanations for additional information.
    */
  var EnableExplanations: js.UndefOr[ClarifyEnableExplanations] = js.undefined
  
  /**
    * The inference configuration parameter for the model container.
    */
  var InferenceConfig: js.UndefOr[ClarifyInferenceConfig] = js.undefined
  
  /**
    * The configuration for SHAP analysis.
    */
  var ShapConfig: ClarifyShapConfig
}
object ClarifyExplainerConfig {
  
  inline def apply(ShapConfig: ClarifyShapConfig): ClarifyExplainerConfig = {
    val __obj = js.Dynamic.literal(ShapConfig = ShapConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClarifyExplainerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClarifyExplainerConfig] (val x: Self) extends AnyVal {
    
    inline def setEnableExplanations(value: ClarifyEnableExplanations): Self = StObject.set(x, "EnableExplanations", value.asInstanceOf[js.Any])
    
    inline def setEnableExplanationsUndefined: Self = StObject.set(x, "EnableExplanations", js.undefined)
    
    inline def setInferenceConfig(value: ClarifyInferenceConfig): Self = StObject.set(x, "InferenceConfig", value.asInstanceOf[js.Any])
    
    inline def setInferenceConfigUndefined: Self = StObject.set(x, "InferenceConfig", js.undefined)
    
    inline def setShapConfig(value: ClarifyShapConfig): Self = StObject.set(x, "ShapConfig", value.asInstanceOf[js.Any])
  }
}
