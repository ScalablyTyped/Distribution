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
trait HeatmapSliderViewModel extends SliderViewModel {
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider-HeatmapSliderViewModel.html#stops)
    */
  var stops: js.Array[HeatmapColorStop] = js.native
  /**
    * Generates the color ramp gradient rendered on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider-HeatmapSliderViewModel.html#getStopInfo)
    *
    *
    */
  def getStopInfo(): js.Array[HeatmapSliderViewModelStopInfo] = js.native
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: HeatmapSliderViewModelMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: HeatmapSliderViewModelMinChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_valuechange(name: `value-change`, eventHandler: HeatmapSliderViewModelValueChangeEventHandler): IHandle = js.native
}

@JSGlobal("__esri.HeatmapSliderViewModel")
@js.native
object HeatmapSliderViewModel extends TopLevel[HeatmapSliderViewModelConstructor]

