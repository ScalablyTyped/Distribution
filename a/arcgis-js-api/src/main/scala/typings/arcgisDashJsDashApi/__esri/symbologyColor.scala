package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait symbologyColor extends js.Object {
  /**
    * Clones a color scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#cloneScheme)
    *
    * @param scheme The color scheme object to clone.
    *
    */
  def cloneScheme(scheme: ColorScheme): ColorScheme = js.native
  /**
    * Flips the colors in reverse order of the input color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#flipColors)
    *
    * @param scheme The color scheme to reverse.
    *
    */
  def flipColors(scheme: ColorScheme): ColorScheme = js.native
  /**
    * Returns all schemes matching the given color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getMatchingSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.theme The name of the theme from which to get color schemes.
    * @param params.colors An array of colors used to match with schemes for the given theme.
    * @param params.geometryType The geometry type of the layer for which the color scheme will be applied.
    * @param params.worldScale Indicates whether 3D volumetric symbols will be used in the visualization.
    * @param params.view The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) instance used to calculate the suggested sizes of the symbols.  This is required for 3D visualizations.
    *
    */
  def getMatchingSchemes(params: colorGetMatchingSchemesParams): js.Array[ColorScheme] = js.native
  /**
    * Returns a color scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemeByName)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.name The name of the scheme to retrieve.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features against the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme
    * The theme determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    * | Value | Description | Example |
    * | ----- | ----------- | ------- |
    * | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    * | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    * | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    * | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    */
  def getSchemeByName(params: colorGetSchemeByNameParams): ColorScheme = js.native
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for data-driven color visualizations in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). The `basemap` parameter determines the color schemes of the graphics used to visualize each feature. The `geometryType` determines which type of symbol to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features against the given basemap.
    * @param params.geometryType The geometry type of the features to visualize. **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme
    * The theme determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    * | Value | Description | Example |
    * | ----- | ----------- | ------- |
    * | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    * | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    * | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    * | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    */
  def getSchemes(params: colorGetSchemesParams): ColorSchemes = js.native
  /**
    * Returns an array of color schemes with the provided tags. These schemes define symbol properties for data-driven color visualizations in any layer that can be rendered with a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemesByTag)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.includedTags When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.excludedTags When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features against the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme
    * The theme determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    * | Value | Description | Example |
    * | ----- | ----------- | ------- |
    * | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    * | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    * | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    * | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    */
  def getSchemesByTag(params: colorGetSchemesByTagParams): js.Array[ColorScheme] = js.native
  /**
    * Returns metadata for the available themes. If a basemap is provided, returns themes that work best with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getThemes)
    *
    * @param basemap The [Esri basemap string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or object that will be used with the returned theme(s).
    *
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}

@JSGlobal("__esri.symbologyColor")
@js.native
object symbologyColor extends TopLevel[symbologyColor]

