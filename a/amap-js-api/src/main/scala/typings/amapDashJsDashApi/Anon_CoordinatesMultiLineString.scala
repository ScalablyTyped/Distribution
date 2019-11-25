package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.GeoJSON.Geometry
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.MultiLineString
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.MultiPolygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoordinatesMultiLineString extends Geometry {
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]
  var `type`: MultiLineString | MultiPolygon
}

object Anon_CoordinatesMultiLineString {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): Anon_CoordinatesMultiLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CoordinatesMultiLineString]
  }
}

