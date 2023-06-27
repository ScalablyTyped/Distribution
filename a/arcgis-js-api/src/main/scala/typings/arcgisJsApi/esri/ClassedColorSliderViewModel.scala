package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassedColorSliderViewModel
  extends StObject
     with SmartMappingSliderViewModel {
  
  /**
  		 * An array of class breaks with associated colors.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
  		 */
  var breaks: js.Array[ClassedColorSliderViewModelBreaks] = js.native
  
  /**
  		 * Generates the color ramp rendered on the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#getStopInfo)
  		 */
  def getStopInfo(): js.Array[StopInfo] = js.native
}
