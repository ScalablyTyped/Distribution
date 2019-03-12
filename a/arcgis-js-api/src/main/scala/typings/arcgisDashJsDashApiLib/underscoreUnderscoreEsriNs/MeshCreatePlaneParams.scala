package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreatePlaneParams
  extends stdLib.Object {
  /**
    * Direction the plane is facing. Possible values are `east`, `west`, `north`, `south`, `up` and `down`. Defaults to `up`,
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var facing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var geographic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var material: js.UndefOr[MeshCreatePlaneParamsMaterial] = js.undefined
  /**
    * A uniform size value or an object containing individual values width and height. The unit of the size values is derived from the spatial reference of the provided location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var size: js.UndefOr[scala.Double | MeshCreatePlaneParamsSize] = js.undefined
}

object MeshCreatePlaneParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    facing: java.lang.String = null,
    geographic: js.UndefOr[scala.Boolean] = js.undefined,
    material: MeshCreatePlaneParamsMaterial = null,
    size: scala.Double | MeshCreatePlaneParamsSize = null
  ): MeshCreatePlaneParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (facing != null) __obj.updateDynamic("facing")(facing)
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic)
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshCreatePlaneParams]
  }
}

