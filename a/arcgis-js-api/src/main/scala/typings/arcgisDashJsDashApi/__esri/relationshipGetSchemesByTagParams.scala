package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait relationshipGetSchemesByTagParams extends Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var basemap: String | Basemap
  /**
    * When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var excludedTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var geometryType: String
  /**
    * When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var includedTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Determines which set of primary and secondary color schemes to return  **Possible Values:** default
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemesByTag)
    *
    * @default default
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.undefined
  /**
    * Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}

object relationshipGetSchemesByTagParams {
  @scala.inline
  def apply(
    basemap: String | Basemap,
    constructor: js.Function,
    geometryType: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    excludedTags: js.Array[String] = null,
    includedTags: js.Array[String] = null,
    theme: String = null,
    view: SceneView = null,
    worldScale: js.UndefOr[Boolean] = js.undefined
  ): relationshipGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, geometryType = geometryType, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (excludedTags != null) __obj.updateDynamic("excludedTags")(excludedTags)
    if (includedTags != null) __obj.updateDynamic("includedTags")(includedTags)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (view != null) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(worldScale)) __obj.updateDynamic("worldScale")(worldScale)
    __obj.asInstanceOf[relationshipGetSchemesByTagParams]
  }
}

