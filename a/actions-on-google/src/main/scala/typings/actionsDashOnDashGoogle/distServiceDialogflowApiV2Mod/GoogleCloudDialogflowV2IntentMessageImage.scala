package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageImage extends js.Object {
  var accessibilityText: js.UndefOr[String] = js.undefined
  var imageUri: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageImage {
  @scala.inline
  def apply(accessibilityText: String = null, imageUri: String = null): GoogleCloudDialogflowV2IntentMessageImage = {
    val __obj = js.Dynamic.literal()
    if (accessibilityText != null) __obj.updateDynamic("accessibilityText")(accessibilityText)
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri)
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageImage]
  }
}

