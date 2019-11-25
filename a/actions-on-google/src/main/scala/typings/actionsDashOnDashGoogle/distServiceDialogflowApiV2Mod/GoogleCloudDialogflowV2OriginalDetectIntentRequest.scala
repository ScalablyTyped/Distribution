package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2OriginalDetectIntentRequest extends js.Object {
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2OriginalDetectIntentRequest {
  @scala.inline
  def apply(payload: ApiClientObjectMap[_] = null, source: String = null): GoogleCloudDialogflowV2OriginalDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2OriginalDetectIntentRequest]
  }
}

