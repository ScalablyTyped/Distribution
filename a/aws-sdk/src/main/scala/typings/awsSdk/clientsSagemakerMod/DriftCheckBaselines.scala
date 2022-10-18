package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriftCheckBaselines extends StObject {
  
  /**
    * Represents the drift check bias baselines that can be used when the model monitor is set using the model package. 
    */
  var Bias: js.UndefOr[DriftCheckBias] = js.undefined
  
  /**
    * Represents the drift check explainability baselines that can be used when the model monitor is set using the model package. 
    */
  var Explainability: js.UndefOr[DriftCheckExplainability] = js.undefined
  
  /**
    * Represents the drift check model data quality baselines that can be used when the model monitor is set using the model package.
    */
  var ModelDataQuality: js.UndefOr[DriftCheckModelDataQuality] = js.undefined
  
  /**
    * Represents the drift check model quality baselines that can be used when the model monitor is set using the model package.
    */
  var ModelQuality: js.UndefOr[DriftCheckModelQuality] = js.undefined
}
object DriftCheckBaselines {
  
  inline def apply(): DriftCheckBaselines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriftCheckBaselines]
  }
  
  extension [Self <: DriftCheckBaselines](x: Self) {
    
    inline def setBias(value: DriftCheckBias): Self = StObject.set(x, "Bias", value.asInstanceOf[js.Any])
    
    inline def setBiasUndefined: Self = StObject.set(x, "Bias", js.undefined)
    
    inline def setExplainability(value: DriftCheckExplainability): Self = StObject.set(x, "Explainability", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityUndefined: Self = StObject.set(x, "Explainability", js.undefined)
    
    inline def setModelDataQuality(value: DriftCheckModelDataQuality): Self = StObject.set(x, "ModelDataQuality", value.asInstanceOf[js.Any])
    
    inline def setModelDataQualityUndefined: Self = StObject.set(x, "ModelDataQuality", js.undefined)
    
    inline def setModelQuality(value: DriftCheckModelQuality): Self = StObject.set(x, "ModelQuality", value.asInstanceOf[js.Any])
    
    inline def setModelQualityUndefined: Self = StObject.set(x, "ModelQuality", js.undefined)
  }
}
