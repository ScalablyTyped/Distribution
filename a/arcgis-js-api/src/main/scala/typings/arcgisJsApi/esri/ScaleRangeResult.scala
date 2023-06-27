package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleRangeResult extends StObject {
  
  /**
  		 * The suggested [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#maxScale) to apply to the input layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#ScaleRangeResult)
  		 */
  var maxScale: Double
  
  /**
  		 * The suggested [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#minScale) to apply to the input layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#ScaleRangeResult)
  		 */
  var minScale: Double
}
object ScaleRangeResult {
  
  inline def apply(maxScale: Double, minScale: Double): ScaleRangeResult = {
    val __obj = js.Dynamic.literal(maxScale = maxScale.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleRangeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleRangeResult] (val x: Self) extends AnyVal {
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
  }
}
