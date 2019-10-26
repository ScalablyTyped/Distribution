package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
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
    if (followupEventInput != null) __obj.updateDynamic("followupEventInput")(followupEventInput)
    if (fulfillmentMessages != null) __obj.updateDynamic("fulfillmentMessages")(fulfillmentMessages)
    if (fulfillmentText != null) __obj.updateDynamic("fulfillmentText")(fulfillmentText)
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookResponse]
  }
}

