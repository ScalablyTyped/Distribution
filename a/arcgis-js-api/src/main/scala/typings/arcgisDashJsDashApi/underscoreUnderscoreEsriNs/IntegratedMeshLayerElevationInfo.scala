package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegratedMeshLayerElevationInfo extends Object {
  /**
    * Defines how the mesh is placed on the vertical axis (z). Currently only `absolute-height` is supported.
    *
    * Mode | Description
    * ------|------------
    * absolute-height | The mesh is placed at an absolute elevation (z-value) above sea level. This z-value is determined by summing up the `offset` value and the mesh's z-value. It doesn't take the elevation of the terrain into account. This is the only supported elevation mode for an IntegratedMeshLayer.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var mode: String
  /**
    * An elevation offset, which is added to the vertical position of the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    *
    * @default 0
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The unit for `offset` values.  **Possible Values:** feet | meters | kilometers | miles | us-feet | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    *
    * @default meters
    */
  var unit: js.UndefOr[String] = js.undefined
}

object IntegratedMeshLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    offset: Int | Double = null,
    unit: String = null
  ): IntegratedMeshLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[IntegratedMeshLayerElevationInfo]
  }
}

