package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2QueryResult extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var allRequiredParamsPresent: js.UndefOr[Boolean] = js.undefined
  var diagnosticInfo: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.undefined
  var fulfillmentText: js.UndefOr[String] = js.undefined
  var intent: js.UndefOr[GoogleCloudDialogflowV2Intent] = js.undefined
  var intentDetectionConfidence: js.UndefOr[Double] = js.undefined
  var languageCode: js.UndefOr[String] = js.undefined
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.undefined
  var parameters: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var queryText: js.UndefOr[String] = js.undefined
  var speechRecognitionConfidence: js.UndefOr[Double] = js.undefined
  var webhookPayload: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var webhookSource: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2QueryResult {
  @scala.inline
  def apply(
    action: String = null,
    allRequiredParamsPresent: js.UndefOr[Boolean] = js.undefined,
    diagnosticInfo: ApiClientObjectMap[_] = null,
    fulfillmentMessages: js.Array[GoogleCloudDialogflowV2IntentMessage] = null,
    fulfillmentText: String = null,
    intent: GoogleCloudDialogflowV2Intent = null,
    intentDetectionConfidence: Int | Double = null,
    languageCode: String = null,
    outputContexts: js.Array[GoogleCloudDialogflowV2Context] = null,
    parameters: ApiClientObjectMap[_] = null,
    queryText: String = null,
    speechRecognitionConfidence: Int | Double = null,
    webhookPayload: ApiClientObjectMap[_] = null,
    webhookSource: String = null
  ): GoogleCloudDialogflowV2QueryResult = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(allRequiredParamsPresent)) __obj.updateDynamic("allRequiredParamsPresent")(allRequiredParamsPresent)
    if (diagnosticInfo != null) __obj.updateDynamic("diagnosticInfo")(diagnosticInfo)
    if (fulfillmentMessages != null) __obj.updateDynamic("fulfillmentMessages")(fulfillmentMessages)
    if (fulfillmentText != null) __obj.updateDynamic("fulfillmentText")(fulfillmentText)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (intentDetectionConfidence != null) __obj.updateDynamic("intentDetectionConfidence")(intentDetectionConfidence.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (queryText != null) __obj.updateDynamic("queryText")(queryText)
    if (speechRecognitionConfidence != null) __obj.updateDynamic("speechRecognitionConfidence")(speechRecognitionConfidence.asInstanceOf[js.Any])
    if (webhookPayload != null) __obj.updateDynamic("webhookPayload")(webhookPayload)
    if (webhookSource != null) __obj.updateDynamic("webhookSource")(webhookSource)
    __obj.asInstanceOf[GoogleCloudDialogflowV2QueryResult]
  }
}

