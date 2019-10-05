package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapSliderConstructor
  extends /**
  * The HeatmapSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html). At a minimum you must set the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#stops) property of the widget. The stops are used to render a color gradient on the track of the slider.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html)
  */
Instantiable0[HeatmapSlider]
     with Instantiable1[/* properties */ HeatmapSliderProperties, HeatmapSlider] {
  /**
    * A convenience function used to create a HeatmapSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#HeatmapRendererResult) of the [heatmapRendererCreator.createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#fromHeatmapRendererResult)
    *
    * @param rendererResult The result object from the [heatmapRendererCreator.createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer) method.
    *
    */
  def fromHeatmapRendererResult(rendererResult: HeatmapRendererResult): HeatmapSlider = js.native
}

