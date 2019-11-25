package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction extends js.Object {
  var uri: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction {
  @scala.inline
  def apply(uri: String = null): GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction]
  }
}

