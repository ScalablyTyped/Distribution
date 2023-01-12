package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for determining suggested [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#minScale) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#maxScale) scale ranges for an input layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html)
  */
trait scaleRange extends StObject {
  
  /**
    * Generates a suggested scale range (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  def scaleRange(params: scaleRangeScaleRangeParams): js.Promise[ScaleRangeResult]
}
object scaleRange {
  
  inline def apply(scaleRange: scaleRangeScaleRangeParams => js.Promise[ScaleRangeResult]): scaleRange = {
    val __obj = js.Dynamic.literal(scaleRange = js.Any.fromFunction1(scaleRange))
    __obj.asInstanceOf[scaleRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: scaleRange] (val x: Self) extends AnyVal {
    
    inline def setScaleRange(value: scaleRangeScaleRangeParams => js.Promise[ScaleRangeResult]): Self = StObject.set(x, "scaleRange", js.Any.fromFunction1(value))
  }
}
