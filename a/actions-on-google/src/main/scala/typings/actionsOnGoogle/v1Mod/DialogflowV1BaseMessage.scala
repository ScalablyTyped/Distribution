package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.facebook_
import typings.actionsOnGoogle.actionsOnGoogleStrings.kik_
import typings.actionsOnGoogle.actionsOnGoogleStrings.line_
import typings.actionsOnGoogle.actionsOnGoogleStrings.skype_
import typings.actionsOnGoogle.actionsOnGoogleStrings.slack_
import typings.actionsOnGoogle.actionsOnGoogleStrings.telegram_
import typings.actionsOnGoogle.actionsOnGoogleStrings.viber_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1BaseMessage[TType /* <: Double */] extends js.Object {
  var platform: js.UndefOr[facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_] = js.undefined
  var `type`: js.UndefOr[TType] = js.undefined
}

object DialogflowV1BaseMessage {
  @scala.inline
  def apply[TType](
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    `type`: TType = null
  ): DialogflowV1BaseMessage[TType] = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1BaseMessage[TType]]
  }
}

