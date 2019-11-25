package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.GeoJSON.Geometry
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coordinates extends Geometry {
  var coordinates: js.Tuple2[Double, Double]
  var `type`: Point
}

object Anon_Coordinates {
  @scala.inline
  def apply(coordinates: js.Tuple2[Double, Double], `type`: Point): Anon_Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Coordinates]
  }
}

