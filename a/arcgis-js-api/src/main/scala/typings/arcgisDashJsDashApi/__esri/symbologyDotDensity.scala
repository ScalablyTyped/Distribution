package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait symbologyDotDensity extends js.Object {
  /**
    * Clones a dot density scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#cloneScheme)
    *
    * @param scheme The dot density scheme object to clone.
    *
    */
  def cloneScheme(scheme: DotDensityScheme): DotDensityScheme
  /**
    * Returns a dot density scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemeByName)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.name The name of the scheme to retrieve.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    * @param params.basemapTheme If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.  **Possible Values:** light | dark
    * @param params.numColors The number of colors to visualize.
    *
    */
  def getSchemeByName(params: dotDensityGetSchemeByNameParams): DotDensityScheme
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for dot density-based data-driven visualizations in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The `basemap` parameter determines the color of the dots used to visualize each attribute. The `geometryType` determines which type of symbol to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.basemap The Esri basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features against the given basemap. If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, then use the `basemapTheme` parameter instead of this parameter.
    * @param params.basemapTheme If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.  **Possible Values:** light | dark
    * @param params.numColors The number of colors to visualize.
    *
    */
  def getSchemes(params: dotDensityGetSchemesParams): DotDensitySchemes
  /**
    * Returns an array of dot density schemes with the provided tags. These schemes define symbol properties for dot density visualizations in any layer that can be rendered with a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.includedTags When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.excludedTags When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    * @param params.basemapTheme If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.  **Possible Values:** light | dark
    * @param params.numColors The number of colors to visualize.
    *
    */
  def getSchemesByTag(params: dotDensityGetSchemesByTagParams): js.Array[DotDensityScheme]
}

@JSGlobal("__esri.symbologyDotDensity")
@js.native
object symbologyDotDensity extends TopLevel[symbologyDotDensity]

