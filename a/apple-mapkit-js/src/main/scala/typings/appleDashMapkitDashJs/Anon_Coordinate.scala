package typings.appleDashMapkitDashJs

import typings.appleDashMapkitDashJs.mapkit.Coordinate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coordinate extends js.Object {
  var coordinate: Coordinate
  var timestamp: Date
}

object Anon_Coordinate {
  @scala.inline
  def apply(coordinate: Coordinate, timestamp: Date): Anon_Coordinate = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Coordinate]
  }
}

