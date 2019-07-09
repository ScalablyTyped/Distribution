package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacitySliderViewModel extends SliderViewModel {
  /**
    * A modified version of [SliderViewModel.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which is a custom function used to format labels. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original_OpacitySliderViewModel: SmartMappingSliderBaseLabelFormatter = js.native
  /**
    * The opacity stops from the [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) to link to the slider. The opacity values in these stops will be used to render the gradient on the slider. They should match the opacity rendered in the associated layer's opacity visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html#stops)
    */
  var stops: js.Array[OpacityStop] = js.native
  /**
    * Generates the opacity ramp gradient rendered on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html#getStopInfo)
    *
    *
    */
  def getStopInfo(): js.Array[OpacitySliderViewModelStopInfo] = js.native
  @JSName("on")
  def on_maxchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`max-change`,
    eventHandler: OpacitySliderViewModelMaxChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_minchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`min-change`,
    eventHandler: OpacitySliderViewModelMinChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_valuechange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`value-change`,
    eventHandler: OpacitySliderViewModelValueChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.OpacitySliderViewModel")
@js.native
class OpacitySliderViewModelCls () extends OpacitySliderViewModel {
  def this(properties: OpacitySliderViewModelProperties) = this()
}

