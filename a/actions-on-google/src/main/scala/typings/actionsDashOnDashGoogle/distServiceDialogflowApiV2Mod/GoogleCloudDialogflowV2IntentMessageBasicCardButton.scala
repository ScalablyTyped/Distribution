package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageBasicCardButton extends js.Object {
  var openUriAction: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageBasicCardButton {
  @scala.inline
  def apply(
    openUriAction: GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction = null,
    title: String = null
  ): GoogleCloudDialogflowV2IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    if (openUriAction != null) __obj.updateDynamic("openUriAction")(openUriAction.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBasicCardButton]
  }
}

