package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1WebhookResponse extends js.Object {
  var contextOut: js.UndefOr[js.Array[DialogflowV1Context]] = js.undefined
  var data: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var displayText: js.UndefOr[String] = js.undefined
  var followupEvent: js.UndefOr[DialogflowV1FollowupEvent] = js.undefined
  var messages: js.UndefOr[js.Array[DialogflowV1Message]] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var speech: js.UndefOr[String] = js.undefined
}

object DialogflowV1WebhookResponse {
  @scala.inline
  def apply(
    contextOut: js.Array[DialogflowV1Context] = null,
    data: ApiClientObjectMap[_] = null,
    displayText: String = null,
    followupEvent: DialogflowV1FollowupEvent = null,
    messages: js.Array[DialogflowV1Message] = null,
    source: String = null,
    speech: String = null
  ): DialogflowV1WebhookResponse = {
    val __obj = js.Dynamic.literal()
    if (contextOut != null) __obj.updateDynamic("contextOut")(contextOut.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (followupEvent != null) __obj.updateDynamic("followupEvent")(followupEvent.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (speech != null) __obj.updateDynamic("speech")(speech.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1WebhookResponse]
  }
}

