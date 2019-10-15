package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSizeSliderViewModel extends SliderViewModel {
  /**
    * The colors and sizes corresponding with data values in the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) of the renderer associated with the slider.  Use the [fromRendererResult()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#fromRendererResult) method to conveniently construct these stops from a renderer generated from the [univariateColorSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer) smart mapping module.  Use [updateVisualVariables()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#updateVisualVariables) to update the renderer's visual variables with the values matching the slider thumb positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#stops)
    */
  var stops: js.Array[ColorSizeStop] = js.native
  /**
    * Generates the color ramp gradient rendered on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#getStopInfo)
    *
    *
    */
  def getStopInfo(): js.Array[ColorSizeSliderViewModelStopInfo] = js.native
}

@JSGlobal("__esri.ColorSizeSliderViewModel")
@js.native
object ColorSizeSliderViewModel extends TopLevel[ColorSizeSliderViewModelConstructor]

