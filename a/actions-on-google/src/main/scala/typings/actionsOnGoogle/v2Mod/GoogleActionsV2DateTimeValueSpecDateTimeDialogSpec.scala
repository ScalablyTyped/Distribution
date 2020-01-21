package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec extends js.Object {
  /**
    * This is used to create prompt to ask for date only.
    * For example: What date are you looking for?
    */
  var requestDateText: js.UndefOr[String] = js.undefined
  /**
    * This is used to create initial prompt by datetime sub-dialog.
    * Example question: \"What date and time do you want?\"
    */
  var requestDatetimeText: js.UndefOr[String] = js.undefined
  /**
    * This is used to create prompt to ask for time only.
    * For example: What time?
    */
  var requestTimeText: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec {
  @scala.inline
  def apply(requestDateText: String = null, requestDatetimeText: String = null, requestTimeText: String = null): GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec = {
    val __obj = js.Dynamic.literal()
    if (requestDateText != null) __obj.updateDynamic("requestDateText")(requestDateText.asInstanceOf[js.Any])
    if (requestDatetimeText != null) __obj.updateDynamic("requestDatetimeText")(requestDatetimeText.asInstanceOf[js.Any])
    if (requestTimeText != null) __obj.updateDynamic("requestTimeText")(requestTimeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec]
  }
}

