package typings.actionsOnGoogle.v1Mod

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
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (originalRequest != null) __obj.updateDynamic("originalRequest")(originalRequest.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1WebhookRequest]
  }
}

