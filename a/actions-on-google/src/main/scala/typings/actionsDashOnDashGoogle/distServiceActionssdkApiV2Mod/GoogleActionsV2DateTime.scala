package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod._Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2DateTime extends _Argument {
  /**
    * Date value
    */
  var date: js.UndefOr[GoogleTypeDate] = js.undefined
  /**
    * Time value
    */
  var time: js.UndefOr[GoogleTypeTimeOfDay] = js.undefined
}

object GoogleActionsV2DateTime {
  @scala.inline
  def apply(date: GoogleTypeDate = null, time: GoogleTypeTimeOfDay = null): GoogleActionsV2DateTime = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[GoogleActionsV2DateTime]
  }
}

