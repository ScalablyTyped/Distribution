package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegratedMeshLayerElevationInfo
  extends stdLib.Object {
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
  var mode: java.lang.String
  /**
    * An elevation offset, which is added to the vertical position of the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    *
    * @default 0
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The unit for `offset` values.  **Possible Values:** feet | meters | kilometers | miles | us-feet | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    *
    * @default meters
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object IntegratedMeshLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    mode: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    offset: scala.Int | scala.Double = null,
    unit: java.lang.String = null
  ): IntegratedMeshLayerElevationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[IntegratedMeshLayerElevationInfo]
  }
}

