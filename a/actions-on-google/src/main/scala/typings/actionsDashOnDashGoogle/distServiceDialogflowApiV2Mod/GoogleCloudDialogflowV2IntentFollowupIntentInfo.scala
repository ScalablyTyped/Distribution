package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentFollowupIntentInfo extends js.Object {
  var followupIntentName: js.UndefOr[String] = js.undefined
  var parentFollowupIntentName: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentFollowupIntentInfo {
  @scala.inline
  def apply(followupIntentName: String = null, parentFollowupIntentName: String = null): GoogleCloudDialogflowV2IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    if (followupIntentName != null) __obj.updateDynamic("followupIntentName")(followupIntentName)
    if (parentFollowupIntentName != null) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName)
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentFollowupIntentInfo]
  }
}

