package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageListSelect extends js.Object {
  var items: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageListSelectItem]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageListSelect {
  @scala.inline
  def apply(items: js.Array[GoogleCloudDialogflowV2IntentMessageListSelectItem] = null, title: String = null): GoogleCloudDialogflowV2IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageListSelect]
  }
}

