package typings.appleMapkitJs.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timestamp extends js.Object {
  var coordinate: typings.appleMapkitJs.mapkit.Coordinate = js.native
  var timestamp: Date = js.native
}

object Timestamp {
  @scala.inline
  def apply(coordinate: typings.appleMapkitJs.mapkit.Coordinate, timestamp: Date): Timestamp = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
  @scala.inline
  implicit class TimestampOps[Self <: Timestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoordinate(value: typings.appleMapkitJs.mapkit.Coordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

