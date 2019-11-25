package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleNumbers.`2`
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.facebook_
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.kik_
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.line_
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.skype_
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.slack_
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.telegram_
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.viber_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageQuickReplies
  extends DialogflowV1BaseMessage[`2`]
     with DialogflowV1Message {
  var replies: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageQuickReplies {
  @scala.inline
  def apply(
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    replies: js.Array[String] = null,
    title: String = null,
    `type`: `2` = null
  ): DialogflowV1MessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageQuickReplies]
  }
}

