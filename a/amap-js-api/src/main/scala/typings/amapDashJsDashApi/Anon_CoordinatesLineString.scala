package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.GeoJSON.Geometry
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.LineString
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.MultiPoint
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoordinatesLineString extends Geometry {
  var coordinates: js.Array[js.Tuple2[Double, Double]]
  var `type`: MultiPoint | LineString | Polygon
}

object Anon_CoordinatesLineString {
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): Anon_CoordinatesLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CoordinatesLineString]
  }
}

