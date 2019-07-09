package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSliderViewModel extends SliderViewModel {
  /**
    * A modified version of [SliderViewModel.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which is a custom function used to format labels. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original_SizeSliderViewModel: SmartMappingSliderBaseLabelFormatter = js.native
  /**
    * The size stops from the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#stops)
    */
  var stops: js.Array[SizeStop] = js.native
  @JSName("on")
  def on_maxchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`max-change`,
    eventHandler: SizeSliderViewModelMaxChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_minchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`min-change`,
    eventHandler: SizeSliderViewModelMinChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_valuechange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`value-change`,
    eventHandler: SizeSliderViewModelValueChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.SizeSliderViewModel")
@js.native
class SizeSliderViewModelCls () extends SizeSliderViewModel {
  def this(properties: SizeSliderViewModelProperties) = this()
}

