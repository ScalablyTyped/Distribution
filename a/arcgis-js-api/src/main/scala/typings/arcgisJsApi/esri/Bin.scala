package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bin extends StObject {
  
  /**
    * The number of values in a dataset that are contained between the indicated `minValue` and `maxValue`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#Bin)
    */
  var count: Double
  
  /**
    * The maximum value (or bound) of the bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#Bin)
    */
  var maxValue: Double
  
  /**
    * The minimum value (or bound) of the bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#Bin)
    */
  var minValue: Double
}
object Bin {
  
  inline def apply(count: Double, maxValue: Double, minValue: Double): Bin = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  
  extension [Self <: Bin](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
