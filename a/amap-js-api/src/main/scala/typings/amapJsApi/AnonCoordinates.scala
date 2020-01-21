package typings.amapJsApi

import typings.amapJsApi.AMap.GeoJSON.Geometry
import typings.amapJsApi.amapJsApiStrings.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoordinates extends Geometry {
  var coordinates: js.Tuple2[Double, Double]
  var `type`: Point
}

object AnonCoordinates {
  @scala.inline
  def apply(coordinates: js.Tuple2[Double, Double], `type`: Point): AnonCoordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinates]
  }
}

