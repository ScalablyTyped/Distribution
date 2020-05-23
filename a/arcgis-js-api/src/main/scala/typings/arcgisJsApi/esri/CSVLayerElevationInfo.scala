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

trait CSVLayerElevationInfo extends Object {
  /**
    * This object contains information about setting a custom z-value on the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var featureExpressionInfo: js.UndefOr[CSVLayerElevationInfoFeatureExpressionInfo] = js.undefined
  /**
    * Defines how the feature is placed with respect to the terrain surface or 3D objects in the scene. If the geometry consists of multiple points (e.g. lines or polygons), the elevation is evaluated separately for each point. See the table below for a list of possible values.  ![elevation-info](https://developers.arcgis.com/javascript/assets/img/apiref/layers/elevation-info.png)
    *
    * Mode | Description
    * ------|------------
    * on-the-ground | Features are aligned to the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html). If the scene contains an [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html), then features are aligned to the [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html). If features have z-values, then the z-values are ignored in this mode. Features with 2D symbols are draped on the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html). This is the default mode for layers without z-values containing [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) features or [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) features rendered with [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    * absolute-height | Features are placed at an absolute elevation (z-value) above sea level. This z-value is determined by the geometry's z-value (if present). If `featureExpressionInfo` is defined, the result of the expression is used instead of the geometry’s z-value. This mode doesn't take the elevation of the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or any other layers into account. This is the default value of features with any geometry type where [hasZ](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#hasZ) is `true`.
    * relative-to-ground | Features are placed at an elevation relative to the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html). The feature's elevation is determined by summing up the elevation of the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html) and the geometry's z-value (if present). If `featureExpressionInfo` is defined, the result of the expression is used instead of the geometry’s z-value. If the geometries don't have z-values, `relative-to-ground` is the default value for [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [IconSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html).
    * relative-to-scene | Features are aligned to [extruded polygons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html), 3D Object [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) or [BuildingSceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html), depending on which one has higher elevation. If the feature is not directly above a building or any other feature, it is aligned to the elevation of the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or the [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html). If present, the geometry's z-value is added to the elevation. If `featureExpressionInfo` is defined, the result of the expression is used instead of the geometry’s z-value.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`
  /**
    * An elevation offset, which is added to the vertical position of the graphic. If `unit` is not defined, the offset is in `meters`. When `mode = "on-the-ground"`, this property has no effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The unit for `featureExpressionInfo` and `offset` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.undefined
}

object CSVLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`,
    propertyIsEnumerable: PropertyKey => Boolean,
    featureExpressionInfo: CSVLayerElevationInfoFeatureExpressionInfo = null,
    offset: js.UndefOr[Double] = js.undefined,
    unit: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards = null
  ): CSVLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (featureExpressionInfo != null) __obj.updateDynamic("featureExpressionInfo")(featureExpressionInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVLayerElevationInfo]
  }
}

