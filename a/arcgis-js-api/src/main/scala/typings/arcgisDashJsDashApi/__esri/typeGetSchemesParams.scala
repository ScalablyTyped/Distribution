package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait typeGetSchemesParams extends Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#getSchemes)
    */
  var basemap: String | Basemap
  /**
    * The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#getSchemes)
    */
  var geometryType: String
  /**
    * Determines whether to return a standardized  unique value scheme for point cloud class renderers (i.e. when the `CLASS_CODE` field is driving the visualization in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html)), or to return the other default primary schemes used in other unique value renderers generated for non-point cloud layer types.  **Possible Values:** point-cloud-class | default
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#getSchemes)
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#getSchemes)
    */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}

object typeGetSchemesParams {
  @scala.inline
  def apply(
    basemap: String | Basemap,
    constructor: js.Function,
    geometryType: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    theme: String = null,
    view: SceneView = null,
    worldScale: js.UndefOr[Boolean] = js.undefined
  ): typeGetSchemesParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, geometryType = geometryType, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (view != null) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(worldScale)) __obj.updateDynamic("worldScale")(worldScale)
    __obj.asInstanceOf[typeGetSchemesParams]
  }
}

