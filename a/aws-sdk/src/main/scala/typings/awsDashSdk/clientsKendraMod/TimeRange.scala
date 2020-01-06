package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeRange extends js.Object {
  /**
    * The UNIX datetime of the end of the time range.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The UNIX datetime of the beginning of the time range.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
}

object TimeRange {
  @scala.inline
  def apply(EndTime: Timestamp = null, StartTime: Timestamp = null): TimeRange = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRange]
  }
}

