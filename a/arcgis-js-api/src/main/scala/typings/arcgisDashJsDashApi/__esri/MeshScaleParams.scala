package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshScaleParams extends Object {
  /**
    * Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the offset is applied in a Cartesian system with respect to the local coordinate system on the globe and is specified in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#scale)
    */
  var geographic: js.UndefOr[Boolean] = js.undefined
  /**
    * The origin point for scaling. If not specified, the mesh will be scaled around the mesh extent center.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#scale)
    */
  var origin: js.UndefOr[Point] = js.undefined
}

object MeshScaleParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    geographic: js.UndefOr[Boolean] = js.undefined,
    origin: Point = null
  ): MeshScaleParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[MeshScaleParams]
  }
}

