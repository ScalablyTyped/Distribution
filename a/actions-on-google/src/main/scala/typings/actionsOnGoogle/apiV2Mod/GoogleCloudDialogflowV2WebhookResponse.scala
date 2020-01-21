package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2WebhookResponse extends js.Object {
  var followupEventInput: js.UndefOr[GoogleCloudDialogflowV2EventInput] = js.undefined
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.undefined
  var fulfillmentText: js.UndefOr[String] = js.undefined
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.undefined
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2WebhookResponse {
  @scala.inline
  def apply(
    followupEventInput: GoogleCloudDialogflowV2EventInput = null,
    fulfillmentMessages: js.Array[GoogleCloudDialogflowV2IntentMessage] = null,
    fulfillmentText: String = null,
    outputContexts: js.Array[GoogleCloudDialogflowV2Context] = null,
    payload: ApiClientObjectMap[_] = null,
    source: String = null
  ): GoogleCloudDialogflowV2WebhookResponse = {
    val __obj = js.Dynamic.literal()
    if (followupEventInput != null) __obj.updateDynamic("followupEventInput")(followupEventInput.asInstanceOf[js.Any])
    if (fulfillmentMessages != null) __obj.updateDynamic("fulfillmentMessages")(fulfillmentMessages.asInstanceOf[js.Any])
    if (fulfillmentText != null) __obj.updateDynamic("fulfillmentText")(fulfillmentText.asInstanceOf[js.Any])
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookResponse]
  }
}

