package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageBasicCard extends js.Object {
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton]] = js.undefined
  var formattedText: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageBasicCard {
  @scala.inline
  def apply(
    buttons: js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton] = null,
    formattedText: String = null,
    image: GoogleCloudDialogflowV2IntentMessageImage = null,
    subtitle: String = null,
    title: String = null
  ): GoogleCloudDialogflowV2IntentMessageBasicCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (formattedText != null) __obj.updateDynamic("formattedText")(formattedText.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBasicCard]
  }
}

