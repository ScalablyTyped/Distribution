package typings.appleDashMapkitDashJs

import typings.appleDashMapkitDashJs.mapkitNs.Coordinate
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
    val __obj = js.Dynamic.literal(coordinate = coordinate, timestamp = timestamp)
  
    __obj.asInstanceOf[Anon_Coordinate]
  }
}

