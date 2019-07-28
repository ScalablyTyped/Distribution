package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait symbologyRelationship extends js.Object {
  /**
    * Clones a relationship (bivariate color) scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#cloneScheme)
    *
    * @param scheme The relationship scheme object to clone.
    *
    */
  def cloneScheme(scheme: RelationshipScheme): RelationshipScheme = js.native
  /**
    * Returns a relationship scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemeByName)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.name The name of the scheme to retrieve.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features with the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme Determines which set of primary and secondary color schemes to return  **Possible Values:** default
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    */
  def getSchemeByName(params: relationshipGetSchemeByNameParams): RelationshipScheme = js.native
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for relationship-based (bivariate choropleth) data-driven visualizations in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The `basemap` parameter determines the color of the symbols used to visualize each feature. The `geometryType` determines which type of symbol to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features with the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme Determines which set of primary and secondary color schemes to return  **Possible Values:** default
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    */
  def getSchemes(params: relationshipGetSchemesParams): RelationshipSchemes = js.native
  /**
    * Returns an array of relationship schemes with the provided tags. These schemes define symbol properties for relationship visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemesByTag)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.includedTags When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.excludedTags When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features with the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme Determines which set of primary and secondary color schemes to return  **Possible Values:** default
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    */
  def getSchemesByTag(params: relationshipGetSchemesByTagParams): js.Array[RelationshipScheme] = js.native
  /**
    * Returns metadata for the available themes. If a basemap is provided, returns themes that work best with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getThemes)
    *
    * @param basemap The [Esri basemap string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or object that will be used with the returned theme(s).
    *
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}

