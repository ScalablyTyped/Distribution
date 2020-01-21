package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleNumbers.`4`
import typings.actionsOnGoogle.actionsOnGoogleStrings.facebook_
import typings.actionsOnGoogle.actionsOnGoogleStrings.kik_
import typings.actionsOnGoogle.actionsOnGoogleStrings.line_
import typings.actionsOnGoogle.actionsOnGoogleStrings.skype_
import typings.actionsOnGoogle.actionsOnGoogleStrings.slack_
import typings.actionsOnGoogle.actionsOnGoogleStrings.telegram_
import typings.actionsOnGoogle.actionsOnGoogleStrings.viber_
import typings.actionsOnGoogle.commonMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageCustomPayload
  extends DialogflowV1BaseMessage[`4`]
     with DialogflowV1Message {
  var payload: js.UndefOr[JsonObject] = js.undefined
}

object DialogflowV1MessageCustomPayload {
  @scala.inline
  def apply(
    payload: JsonObject = null,
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    `type`: `4` = null
  ): DialogflowV1MessageCustomPayload = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageCustomPayload]
  }
}

