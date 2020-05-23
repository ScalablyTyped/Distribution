package typings.appleMapkitJs.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  var coordinate: typings.appleMapkitJs.mapkit.Coordinate
  var timestamp: Date
}

object Timestamp {
  @scala.inline
  def apply(coordinate: typings.appleMapkitJs.mapkit.Coordinate, timestamp: Date): Timestamp = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
}

