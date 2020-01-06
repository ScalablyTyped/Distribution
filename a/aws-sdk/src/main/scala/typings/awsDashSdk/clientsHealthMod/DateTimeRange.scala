package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeRange extends js.Object {
  /**
    * The starting date and time of a time range.
    */
  var from: js.UndefOr[timestamp] = js.native
  /**
    * The ending date and time of a time range.
    */
  var to: js.UndefOr[timestamp] = js.native
}

object DateTimeRange {
  @scala.inline
  def apply(from: timestamp = null, to: timestamp = null): DateTimeRange = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeRange]
  }
}

