package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCenterAtParams
  extends stdLib.Object {
  /**
    * Indicates whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the offset applied to center the mesh is applied in a Cartesian system with respect to the local coordinate system on the globe and is specified in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#centerAt)
    */
  var geographic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The origin at which to center. If not specified, the mesh will be centered at the mesh extent center.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#centerAt)
    */
  var origin: js.UndefOr[Point] = js.undefined
}

object MeshCenterAtParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    geographic: js.UndefOr[scala.Boolean] = js.undefined,
    origin: Point = null
  ): MeshCenterAtParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[MeshCenterAtParams]
  }
}

