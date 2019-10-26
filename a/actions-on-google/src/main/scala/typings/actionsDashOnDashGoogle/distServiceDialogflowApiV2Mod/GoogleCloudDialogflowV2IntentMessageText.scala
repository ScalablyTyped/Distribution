package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageText extends js.Object {
  var text: js.UndefOr[js.Array[String]] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageText {
  @scala.inline
  def apply(text: js.Array[String] = null): GoogleCloudDialogflowV2IntentMessageText = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageText]
  }
}

