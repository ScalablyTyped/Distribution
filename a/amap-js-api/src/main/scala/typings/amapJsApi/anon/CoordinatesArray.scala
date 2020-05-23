package typings.amapJsApi.anon

import typings.amapJsApi.amapJsApiStrings.MultiLineString
import typings.amapJsApi.amapJsApiStrings.MultiPolygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordinatesArray
  extends typings.amapJsApi.AMap.GeoJSON.Geometry {
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]
  var `type`: MultiLineString | MultiPolygon
}

object CoordinatesArray {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): CoordinatesArray = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesArray]
  }
}

