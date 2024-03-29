package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedSizeSliderBreaks extends StObject {
  
  /**
  		 * The max value of the break.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
  		 */
  var max: Double
  
  /**
  		 * The min value of the break.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
  		 */
  var min: Double
  
  /**
  		 * The size in points of the symbol representing features with values within the given `min` and `max`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
  		 */
  var size: Double
}
object ClassedSizeSliderBreaks {
  
  inline def apply(max: Double, min: Double, size: Double): ClassedSizeSliderBreaks = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedSizeSliderBreaks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassedSizeSliderBreaks] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
