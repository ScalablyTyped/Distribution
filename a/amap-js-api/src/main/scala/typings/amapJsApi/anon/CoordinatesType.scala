package typings.amapJsApi.anon

import typings.amapJsApi.amapJsApiStrings.LineString
import typings.amapJsApi.amapJsApiStrings.MultiPoint
import typings.amapJsApi.amapJsApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordinatesType
  extends typings.amapJsApi.AMap.GeoJSON.Geometry {
  var coordinates: js.Array[js.Tuple2[Double, Double]]
  var `type`: MultiPoint | LineString | Polygon
}

object CoordinatesType {
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): CoordinatesType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesType]
  }
}

