package typings.appleMapkitJs

import typings.appleMapkitJs.mapkit.Coordinate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimestamp extends js.Object {
  var coordinate: Coordinate
  var timestamp: Date
}

object AnonTimestamp {
  @scala.inline
  def apply(coordinate: Coordinate, timestamp: Date): AnonTimestamp = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimestamp]
  }
}

