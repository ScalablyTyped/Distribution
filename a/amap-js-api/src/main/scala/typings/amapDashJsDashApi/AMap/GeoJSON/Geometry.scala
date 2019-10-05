package typings.amapDashJsDashApi.AMap.GeoJSON

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.GeometryCollection
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.LineString
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.MultiLineString
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.MultiPoint
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.MultiPolygon
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  var coordinates: js.UndefOr[
    (js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double])
  ] = js.undefined
  var geometries: js.UndefOr[js.Array[Geometry]] = js.undefined
  var `type`: js.UndefOr[
    GeometryCollection | LineString | MultiLineString | MultiPoint | MultiPolygon | Point | typings.amapDashJsDashApi.amapDashJsDashApiStrings.Polygon
  ] = js.undefined
}

object Geometry {
  @scala.inline
  def apply(
    coordinates: js.Tuple2[Double, Double] = null,
    geometries: js.Array[Geometry] = null,
    `type`: Point = null
  ): Geometry = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (geometries != null) __obj.updateDynamic("geometries")(geometries)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Geometry]
  }
}

