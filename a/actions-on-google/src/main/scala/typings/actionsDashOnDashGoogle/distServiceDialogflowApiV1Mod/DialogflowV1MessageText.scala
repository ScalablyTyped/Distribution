package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleNumbers.`0`
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

trait DialogflowV1MessageText
  extends DialogflowV1BaseMessage[`0`]
     with DialogflowV1Message {
  var speech: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageText {
  @scala.inline
  def apply(
    platform: facebook | kik | line | skype | slack | telegram | viber = null,
    speech: String = null,
    `type`: `0` = null
  ): DialogflowV1MessageText = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (speech != null) __obj.updateDynamic("speech")(speech)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DialogflowV1MessageText]
  }
}

