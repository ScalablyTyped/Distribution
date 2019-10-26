package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleNumbers.`2`
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.facebook
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.kik
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.line
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.skype
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.slack
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.telegram
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.viber
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
    platform: facebook | kik | line | skype | slack | telegram | viber = null,
    replies: js.Array[String] = null,
    title: String = null,
    `type`: `2` = null
  ): DialogflowV1MessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DialogflowV1MessageQuickReplies]
  }
}

