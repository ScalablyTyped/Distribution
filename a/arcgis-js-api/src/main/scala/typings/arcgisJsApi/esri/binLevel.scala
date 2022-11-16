package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function that suggests a [fixedBinLevel](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#fixedBinLevel) in a [FeatureReductionBinning](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html) visualization.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-binLevel.html)
  */
trait binLevel extends StObject {
  
  /**
    * Generates a suggested [fixedBinLevel](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#fixedBinLevel) for a binning visualization based on the view scale at the time this method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-binLevel.html#binLevel)
    */
  def binLevel(params: binLevelBinLevelParams): js.Promise[Double]
}
object binLevel {
  
  inline def apply(binLevel: binLevelBinLevelParams => js.Promise[Double]): binLevel = {
    val __obj = js.Dynamic.literal(binLevel = js.Any.fromFunction1(binLevel))
    __obj.asInstanceOf[binLevel]
  }
  
  extension [Self <: binLevel](x: Self) {
    
    inline def setBinLevel(value: binLevelBinLevelParams => js.Promise[Double]): Self = StObject.set(x, "binLevel", js.Any.fromFunction1(value))
  }
}
