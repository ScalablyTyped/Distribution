package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageCard extends js.Object {
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageCardButton]] = js.undefined
  var imageUri: js.UndefOr[String] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageCard {
  @scala.inline
  def apply(
    buttons: js.Array[GoogleCloudDialogflowV2IntentMessageCardButton] = null,
    imageUri: String = null,
    subtitle: String = null,
    title: String = null
  ): GoogleCloudDialogflowV2IntentMessageCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCard]
  }
}

