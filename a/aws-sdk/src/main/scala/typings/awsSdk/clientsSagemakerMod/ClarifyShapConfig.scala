package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClarifyShapConfig extends StObject {
  
  /**
    * The number of samples to be used for analysis by the Kernal SHAP algorithm.   The number of samples determines the size of the synthetic dataset, which has an impact on latency of explainability requests. For more information, see the Synthetic data of Configure and create an endpoint. 
    */
  var NumberOfSamples: js.UndefOr[ClarifyShapNumberOfSamples] = js.undefined
  
  /**
    * The starting value used to initialize the random number generator in the explainer. Provide a value for this parameter to obtain a deterministic SHAP result.
    */
  var Seed: js.UndefOr[ClarifyShapSeed] = js.undefined
  
  /**
    * The configuration for the SHAP baseline of the Kernal SHAP algorithm.
    */
  var ShapBaselineConfig: ClarifyShapBaselineConfig
  
  /**
    * A parameter that indicates if text features are treated as text and explanations are provided for individual units of text. Required for natural language processing (NLP) explainability only.
    */
  var TextConfig: js.UndefOr[ClarifyTextConfig] = js.undefined
  
  /**
    * A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for model predictions. Defaults to false.
    */
  var UseLogit: js.UndefOr[ClarifyShapUseLogit] = js.undefined
}
object ClarifyShapConfig {
  
  inline def apply(ShapBaselineConfig: ClarifyShapBaselineConfig): ClarifyShapConfig = {
    val __obj = js.Dynamic.literal(ShapBaselineConfig = ShapBaselineConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClarifyShapConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClarifyShapConfig] (val x: Self) extends AnyVal {
    
    inline def setNumberOfSamples(value: ClarifyShapNumberOfSamples): Self = StObject.set(x, "NumberOfSamples", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSamplesUndefined: Self = StObject.set(x, "NumberOfSamples", js.undefined)
    
    inline def setSeed(value: ClarifyShapSeed): Self = StObject.set(x, "Seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "Seed", js.undefined)
    
    inline def setShapBaselineConfig(value: ClarifyShapBaselineConfig): Self = StObject.set(x, "ShapBaselineConfig", value.asInstanceOf[js.Any])
    
    inline def setTextConfig(value: ClarifyTextConfig): Self = StObject.set(x, "TextConfig", value.asInstanceOf[js.Any])
    
    inline def setTextConfigUndefined: Self = StObject.set(x, "TextConfig", js.undefined)
    
    inline def setUseLogit(value: ClarifyShapUseLogit): Self = StObject.set(x, "UseLogit", value.asInstanceOf[js.Any])
    
    inline def setUseLogitUndefined: Self = StObject.set(x, "UseLogit", js.undefined)
  }
}
