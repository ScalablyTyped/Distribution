package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`max-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`min-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`value-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedColorSliderViewModel extends SliderViewModel {
  /**
    * An array of class breaks with associated colors. The colors mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
    */
  var breaks: js.Array[ClassedColorSliderViewModelBreaks] = js.native
  /**
    * A modified version of [SliderViewModel.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which is a custom function used to format labels. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original_ClassedColorSliderViewModel: SmartMappingSliderBaseLabelFormatter = js.native
  /**
    * Generates the color ramp rendered on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#getStopInfo)
    *
    *
    */
  def getStopInfo(): js.Array[StopInfo] = js.native
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: ClassedColorSliderViewModelMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: ClassedColorSliderViewModelMinChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_valuechange(name: `value-change`, eventHandler: ClassedColorSliderViewModelValueChangeEventHandler): IHandle = js.native
}

@JSGlobal("__esri.ClassedColorSliderViewModel")
@js.native
object ClassedColorSliderViewModel extends TopLevel[ClassedColorSliderViewModelConstructor]

