package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapColorStop extends Accessor {
  /**
    * The color to shade a given pixel based on its calculated pixel intensity [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#color)
    */
  var color: Color = js.native
  /**
    * The ratio of a pixel's intensity value to the [minPixelIntensity](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#minPixelIntensity) of the renderer. The ratio of each pixel is matched to the corresponding [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#color).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio)
    */
  var ratio: Double = js.native
}

@JSGlobal("__esri.HeatmapColorStop")
@js.native
class HeatmapColorStopCls () extends HeatmapColorStop {
  def this(properties: HeatmapColorStopProperties) = this()
}

