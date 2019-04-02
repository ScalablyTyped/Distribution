package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait symbologyHeatmap extends js.Object {
  /**
    * Clones a heatmap scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#cloneScheme)
    *
    * @param scheme The heatmap scheme object to clone.
    *
    */
  def cloneScheme(scheme: HeatmapScheme): HeatmapScheme = js.native
  /**
    * Returns a primary scheme and secondary schemes defining properties for heatmap visualizations in a point [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The `basemap` parameter determines the color schemes of the heatmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best colors for overlaying a heatmap against the given basemap.
    *
    */
  def getSchemes(params: heatmapGetSchemesParams): HeatmapSchemes = js.native
  /**
    * Returns metadata for the available themes. If a `basemap` is provided, returns themes that look best with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getThemes)
    *
    * @param basemap The [Esri basemap string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or object that will be used with the returned theme(s).
    *
    */
  def getThemes(): js.Array[heatmapTheme] = js.native
  def getThemes(basemap: Basemap): js.Array[heatmapTheme] = js.native
  def getThemes(basemap: java.lang.String): js.Array[heatmapTheme] = js.native
}

