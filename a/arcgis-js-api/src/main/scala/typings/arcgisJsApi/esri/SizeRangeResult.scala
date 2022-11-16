package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeRangeResult extends StObject {
  
  /**
    * The suggested sizes of the largest symbols at various scales in a layer with a [size visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#SizeRangeResult)
    */
  var maxSize: ScaleDependentStops
  
  /**
    * The suggested sizes of the smallest symbols at various scales in a layer with a [size visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#SizeRangeResult)
    */
  var minSize: ScaleDependentStops
}
object SizeRangeResult {
  
  inline def apply(maxSize: ScaleDependentStops, minSize: ScaleDependentStops): SizeRangeResult = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeRangeResult]
  }
  
  extension [Self <: SizeRangeResult](x: Self) {
    
    inline def setMaxSize(value: ScaleDependentStops): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: ScaleDependentStops): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
  }
}
