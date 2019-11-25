package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion extends js.Object {
  var destinationName: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion {
  @scala.inline
  def apply(destinationName: String = null, uri: String = null): GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion]
  }
}

