package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapSlider extends Widget_ {
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#stops)
    */
  var stops: js.Array[HeatmapColorStop] = js.native
  /**
    * The view model for the Heatmap widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the module:esri/widgets/smartMapping/HeatmapSlider/HeatmapliderViewModel class to access all properties and methods on the HeatmapSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#viewModel)
    */
  var viewModel: HeatmapSliderViewModel = js.native
  @JSName("on")
  def on_thumbchange(name: `thumb-change`, eventHandler: HeatmapSliderThumbChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbdrag(name: `thumb-drag`, eventHandler: HeatmapSliderThumbDragEventHandler): IHandle = js.native
}

