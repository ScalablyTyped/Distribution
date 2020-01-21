package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersTime extends js.Object {
  /**
    * ISO 8601 representation of time indicator: could be a duration, date or
    * exact datetime.
    */
  var timeIso8601: js.UndefOr[String] = js.undefined
  /**
    * Type of time indicator.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersTimeType] = js.undefined
}

object GoogleActionsV2OrdersTime {
  @scala.inline
  def apply(timeIso8601: String = null, `type`: GoogleActionsV2OrdersTimeType = null): GoogleActionsV2OrdersTime = {
    val __obj = js.Dynamic.literal()
    if (timeIso8601 != null) __obj.updateDynamic("timeIso8601")(timeIso8601.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersTime]
  }
}

