package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneLayerElevationInfo extends Object {
  /**
    * Defines how the graphic is placed with respect to the terrain surface. See the table below for a list of possible values.
    *
    * Mode | Description
    * ------|------------
    * on-the-ground | Graphics are draped on the terrain surface. This is the default value for features with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [ObjectSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    * relative-to-ground | The graphic is placed at an elevation relative to the terrain surface. The graphic's elevation is determined by summing up the terrain elevation, the `offset` value and the geometry's z-value (if present). This is the default value for [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [IconSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html).
    * absolute-height | Graphics are placed at an absolute elevation (z-value) above sea level. This z-value is determined by summing up the `offset` value and the geometry's z-value (if present). It doesn't take the elevation of the terrain into account. This is the default value for features with 3D Object geometries and [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries where [hasZ](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#hasZ) is `true`.
    * relative-to-scene | Graphics are aligned to buildings and other objects part of 3D Object [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) or [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html), depending on which has higher elevation. If the graphic is not directly above a building or any other feature, it is aligned to the terrain surface elevation. If present, z-values will be ignored.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo)
    */
  var mode: String
  /**
    * An elevation offset which is added to the vertical position of the graphic. When `mode = "on-the-ground"`, this property has no effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo)
    *
    * @default 0
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The unit for `offset` values.  **Possible Values:** feet | meters | kilometers | miles | us-feet | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo)
    *
    * @default meters
    */
  var unit: js.UndefOr[String] = js.undefined
}

object SceneLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    offset: Int | Double = null,
    unit: String = null
  ): SceneLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[SceneLayerElevationInfo]
  }
}

