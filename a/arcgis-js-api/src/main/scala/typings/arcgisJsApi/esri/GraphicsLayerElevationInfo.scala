package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-height`
import typings.arcgisJsApi.arcgisJsApiStrings.`on-the-ground`
import typings.arcgisJsApi.arcgisJsApiStrings.`relative-to-ground`
import typings.arcgisJsApi.arcgisJsApiStrings.`relative-to-scene`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsLayerElevationInfo extends Object {
  /**
    * This object contains information about setting a custom z-value on the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var featureExpressionInfo: js.UndefOr[GraphicsLayerElevationInfoFeatureExpressionInfo] = js.undefined
  /**
    * Defines how the graphic is placed with respect to the terrain surface. If the geometry consists of multiple points (e.g. lines or polygons), the elevation is evaluated separately for each point. See the table below for a list of possible values.
    *
    * Mode | Description
    * ------|------------
    * on-the-ground | Graphics are placed on the terrain surface.
    * relative-to-ground | Graphics are placed at an elevation relative to the terrain surface. The graphic's elevation is determined by summing the terrain elevation and the geometry's z-value (if present). In case `featureExpressionInfo` is defined, the result of the expression is used instead of the geometry’s z-value.
    * absolute-height | Graphics are placed at an absolute elevation (z-value) above sea level. This z-value is determined by the geometry's z-value (if present). If `featureExpressionInfo` is defined, the result of the expression is used instead of the geometry’s z-value. It doesn't take the elevation of the terrain into account.
    * relative-to-scene | Features are aligned to [extruded polygons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html) and objects part of 3D Object [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) or [IntegratedMeshLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html), depending on which has higher elevation. If the graphic is not directly above a building or any other feature, it is aligned to the terrain surface elevation. If defined, the result of `featureExpressionInfo` is added to the 3D Object/terrain surface elevation. In this mode z-values are ignored.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`
  /**
    * An elevation offset, which is added to the vertical position of the graphic. If `unit` is not defined, the offset is in `meters`. When `mode = "on-the-ground"`, this property has no effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The unit for `featureExpressionInfo` and `offset` values. It doesn't apply to z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.undefined
}

object GraphicsLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`,
    propertyIsEnumerable: PropertyKey => Boolean,
    featureExpressionInfo: GraphicsLayerElevationInfoFeatureExpressionInfo = null,
    offset: Int | Double = null,
    unit: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards = null
  ): GraphicsLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (featureExpressionInfo != null) __obj.updateDynamic("featureExpressionInfo")(featureExpressionInfo.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsLayerElevationInfo]
  }
}

