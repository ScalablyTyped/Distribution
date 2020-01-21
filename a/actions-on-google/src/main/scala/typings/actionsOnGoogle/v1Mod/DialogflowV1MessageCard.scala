package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleNumbers.`1`
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

trait DialogflowV1MessageCard
  extends DialogflowV1BaseMessage[`1`]
     with DialogflowV1Message {
  var buttons: js.UndefOr[js.Array[DialogflowV1Button]] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageCard {
  @scala.inline
  def apply(
    buttons: js.Array[DialogflowV1Button] = null,
    imageUrl: String = null,
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    subtitle: String = null,
    title: String = null,
    `type`: `1` = null
  ): DialogflowV1MessageCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageCard]
  }
}

