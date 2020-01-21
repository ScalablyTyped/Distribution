package typings.arcgisJsApi.heatmapSliderMod

import typings.arcgisJsApi.esri.HeatmapSlider
import typings.arcgisJsApi.esri.HeatmapSliderProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/smartMapping/HeatmapSlider", JSImport.Namespace)
@js.native
/**
  * The HeatmapSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html). At a minimum you must set the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#stops) property of the widget. The stops are used to render a color gradient on the track of the slider.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html)
  */
class Class () extends HeatmapSlider {
  def this(properties: HeatmapSliderProperties) = this()
}

