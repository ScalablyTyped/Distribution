package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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
    * Returns a heatmap scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getSchemeByName)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.name The name of the scheme to retrieve.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best colors for visualizing features against the given basemap.
    *
    */
  def getSchemeByName(params: heatmapGetSchemeByNameParams): HeatmapScheme = js.native
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
    * Returns an array of heatmap schemes with the provided tags. These schemes define color stop properties for any layer that can be rendered with a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getSchemesByTag)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.includedTags When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.excludedTags When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features against the given basemap.
    *
    */
  def getSchemesByTag(params: heatmapGetSchemesByTagParams): js.Array[HeatmapScheme] = js.native
  /**
    * Returns metadata for the available themes. If a basemap is provided, returns themes that work best with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getThemes)
    *
    * @param basemap The [Esri basemap string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or object that will be used with the returned theme(s).
    *
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}

@JSGlobal("__esri.symbologyHeatmap")
@js.native
object symbologyHeatmap extends TopLevel[symbologyHeatmap]

