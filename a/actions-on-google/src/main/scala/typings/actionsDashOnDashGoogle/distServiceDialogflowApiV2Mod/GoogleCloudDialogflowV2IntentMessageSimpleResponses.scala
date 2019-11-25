package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageSimpleResponses extends js.Object {
  var simpleResponses: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse]] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageSimpleResponses {
  @scala.inline
  def apply(simpleResponses: js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse] = null): GoogleCloudDialogflowV2IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    if (simpleResponses != null) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponses]
  }
}

