package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapSlider
  extends StObject
     with Widget_ {
  
  @JSName("on")
  def on_thumbchange(name: `thumb-change`, eventHandler: HeatmapSliderThumbChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbdrag(name: `thumb-drag`, eventHandler: HeatmapSliderThumbDragEventHandler): IHandle = js.native
  
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#stops)
    */
  var stops: js.Array[HeatmapColorStop] = js.native
  
  /**
    * The view model for the Heatmap widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#viewModel)
    */
  var viewModel: HeatmapSliderViewModel = js.native
}
