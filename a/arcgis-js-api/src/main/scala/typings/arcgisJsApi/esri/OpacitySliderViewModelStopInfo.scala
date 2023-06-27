package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacitySliderViewModelStopInfo extends StObject {
  
  /**
  		 * The color of the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html#StopInfo)
  		 */
  var color: Color_
  
  /**
  		 * The offset of the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html#StopInfo)
  		 */
  var offset: Double
}
object OpacitySliderViewModelStopInfo {
  
  inline def apply(color: Color_, offset: Double): OpacitySliderViewModelStopInfo = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacitySliderViewModelStopInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpacitySliderViewModelStopInfo] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
