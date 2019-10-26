package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1WebhookRequest extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var originalRequest: js.UndefOr[DialogflowV1OriginalRequest] = js.undefined
  var result: js.UndefOr[DialogflowV1Result] = js.undefined
  var sessionId: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[DialogflowV1Status] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
}

object DialogflowV1WebhookRequest {
  @scala.inline
  def apply(
    id: String = null,
    lang: String = null,
    originalRequest: DialogflowV1OriginalRequest = null,
    result: DialogflowV1Result = null,
    sessionId: String = null,
    status: DialogflowV1Status = null,
    timestamp: String = null,
    timezone: String = null
  ): DialogflowV1WebhookRequest = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (originalRequest != null) __obj.updateDynamic("originalRequest")(originalRequest)
    if (result != null) __obj.updateDynamic("result")(result)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[DialogflowV1WebhookRequest]
  }
}

