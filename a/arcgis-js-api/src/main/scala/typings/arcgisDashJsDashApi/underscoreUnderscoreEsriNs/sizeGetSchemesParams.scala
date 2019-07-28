package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeGetSchemesParams extends Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features against the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#getSchemes)
    */
  var basemap: String | Basemap
  /**
    * The geometry type of the features to visualize.   **Possible Values:** point | multipoint | polyline | polygon
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#getSchemes)
    */
  var geometryType: String
  /**
    * The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.undefined
  /**
    * Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#getSchemes)
    */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}

object sizeGetSchemesParams {
  @scala.inline
  def apply(
    basemap: String | Basemap,
    constructor: js.Function,
    geometryType: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: SceneView = null,
    worldScale: js.UndefOr[Boolean] = js.undefined
  ): sizeGetSchemesParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, geometryType = geometryType, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (view != null) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(worldScale)) __obj.updateDynamic("worldScale")(worldScale)
    __obj.asInstanceOf[sizeGetSchemesParams]
  }
}

