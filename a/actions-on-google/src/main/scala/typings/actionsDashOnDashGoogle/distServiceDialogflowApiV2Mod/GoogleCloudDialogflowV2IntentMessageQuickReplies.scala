package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageQuickReplies extends js.Object {
  var quickReplies: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageQuickReplies {
  @scala.inline
  def apply(quickReplies: js.Array[String] = null, title: String = null): GoogleCloudDialogflowV2IntentMessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageQuickReplies]
  }
}

