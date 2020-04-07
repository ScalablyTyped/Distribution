package typings.amapJsApi

import typings.amapJsApi.AMap.GeoJSON.Geometry
import typings.amapJsApi.amapJsApiStrings.MultiLineString
import typings.amapJsApi.amapJsApiStrings.MultiPolygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoordinatesArray extends Geometry {
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]
  var `type`: MultiLineString | MultiPolygon
}

object AnonCoordinatesArray {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): AnonCoordinatesArray = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinatesArray]
  }
}

