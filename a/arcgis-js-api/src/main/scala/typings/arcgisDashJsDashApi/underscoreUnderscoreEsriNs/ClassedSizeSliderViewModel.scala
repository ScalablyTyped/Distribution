package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`max-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`min-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`value-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedSizeSliderViewModel extends SliderViewModel {
  /**
    * An array of class breaks with associated sizes. The size mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html#breaks)
    */
  var breaks: js.Array[ClassedSizeSliderViewModelBreaks] = js.native
  /**
    * A modified version of [SliderViewModel.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which is a custom function used to format labels. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original_ClassedSizeSliderViewModel: SmartMappingSliderBaseLabelFormatter = js.native
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: ClassedSizeSliderViewModelMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: ClassedSizeSliderViewModelMinChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_valuechange(name: `value-change`, eventHandler: ClassedSizeSliderViewModelValueChangeEventHandler): IHandle = js.native
}

@JSGlobal("__esri.ClassedSizeSliderViewModel")
@js.native
class ClassedSizeSliderViewModelCls () extends ClassedSizeSliderViewModel {
  def this(properties: ClassedSizeSliderViewModelProperties) = this()
}

