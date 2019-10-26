package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDatetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeOptionsPrompts extends js.Object {
  /**
    * The prompt used to specifically ask for the date if not provided by user.
    * If not provided, Google will use a generic prompt.
    * @public
    */
  var date: js.UndefOr[String] = js.undefined
  /**
    * The initial prompt used to ask for a date and time.
    * If not provided, Google will use a generic prompt.
    * @public
    */
  var initial: js.UndefOr[String] = js.undefined
  /**
    * The prompt used to specifically ask for the time if not provided by user.
    * If not provided, Google will use a generic prompt.
    * @public
    */
  var time: js.UndefOr[String] = js.undefined
}

object DateTimeOptionsPrompts {
  @scala.inline
  def apply(date: String = null, initial: String = null, time: String = null): DateTimeOptionsPrompts = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[DateTimeOptionsPrompts]
  }
}

