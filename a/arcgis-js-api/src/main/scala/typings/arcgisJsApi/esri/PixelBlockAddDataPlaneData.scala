package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelBlockAddDataPlaneData extends StObject {
  
  /**
  		 * A two dimensional array representing the pixels to add.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
  		 */
  var pixels: js.Array[js.Array[Double]]
  
  /**
  		 * An array of objects containing numeric statistical properties.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
  		 */
  var statistics: js.Array[Any]
}
object PixelBlockAddDataPlaneData {
  
  inline def apply(pixels: js.Array[js.Array[Double]], statistics: js.Array[Any]): PixelBlockAddDataPlaneData = {
    val __obj = js.Dynamic.literal(pixels = pixels.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelBlockAddDataPlaneData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelBlockAddDataPlaneData] (val x: Self) extends AnyVal {
    
    inline def setPixels(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    inline def setPixelsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "pixels", js.Array(value*))
    
    inline def setStatistics(value: js.Array[Any]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsVarargs(value: Any*): Self = StObject.set(x, "statistics", js.Array(value*))
  }
}
