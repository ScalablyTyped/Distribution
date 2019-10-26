package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3Time extends js.Object {
  /**
    * Represents an order-event time like reservation time, delivery time and so
    * on. Could be a duration (start & end time), just the date, date time etc.
    * Refer https://en.wikipedia.org/wiki/ISO_8601 for all supported formats.
    */
  var timeIso8601: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3Time {
  @scala.inline
  def apply(timeIso8601: String = null): GoogleActionsOrdersV3Time = {
    val __obj = js.Dynamic.literal()
    if (timeIso8601 != null) __obj.updateDynamic("timeIso8601")(timeIso8601)
    __obj.asInstanceOf[GoogleActionsOrdersV3Time]
  }
}

