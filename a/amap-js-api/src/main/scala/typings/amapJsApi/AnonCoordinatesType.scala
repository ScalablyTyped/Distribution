package typings.amapJsApi

import typings.amapJsApi.AMap.GeoJSON.Geometry
import typings.amapJsApi.amapJsApiStrings.LineString
import typings.amapJsApi.amapJsApiStrings.MultiPoint
import typings.amapJsApi.amapJsApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoordinatesType extends Geometry {
  var coordinates: js.Array[js.Tuple2[Double, Double]]
  var `type`: MultiPoint | LineString | Polygon
}

object AnonCoordinatesType {
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): AnonCoordinatesType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinatesType]
  }
}

