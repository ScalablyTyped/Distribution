package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2WebhookRequest extends js.Object {
  var originalDetectIntentRequest: js.UndefOr[GoogleCloudDialogflowV2OriginalDetectIntentRequest] = js.undefined
  var queryResult: js.UndefOr[GoogleCloudDialogflowV2QueryResult] = js.undefined
  var responseId: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2WebhookRequest {
  @scala.inline
  def apply(
    originalDetectIntentRequest: GoogleCloudDialogflowV2OriginalDetectIntentRequest = null,
    queryResult: GoogleCloudDialogflowV2QueryResult = null,
    responseId: String = null,
    session: String = null
  ): GoogleCloudDialogflowV2WebhookRequest = {
    val __obj = js.Dynamic.literal()
    if (originalDetectIntentRequest != null) __obj.updateDynamic("originalDetectIntentRequest")(originalDetectIntentRequest)
    if (queryResult != null) __obj.updateDynamic("queryResult")(queryResult)
    if (responseId != null) __obj.updateDynamic("responseId")(responseId)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookRequest]
  }
}

