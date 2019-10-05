package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapSlider extends Widget {
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
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.HeatmapSlider")
@js.native
object HeatmapSlider extends TopLevel[HeatmapSliderConstructor]

