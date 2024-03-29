package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedColorSliderViewModelBreaks extends StObject {
  
  /**
  		 * Features with values within the provided `min` and `max` will be rendered with this color.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
  		 */
  var color: Color_
  
  /**
  		 * The max value of the break.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
  		 */
  var max: Double
  
  /**
  		 * The min value of the break.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
  		 */
  var min: Double
}
object ClassedColorSliderViewModelBreaks {
  
  inline def apply(color: Color_, max: Double, min: Double): ClassedColorSliderViewModelBreaks = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedColorSliderViewModelBreaks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassedColorSliderViewModelBreaks] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
