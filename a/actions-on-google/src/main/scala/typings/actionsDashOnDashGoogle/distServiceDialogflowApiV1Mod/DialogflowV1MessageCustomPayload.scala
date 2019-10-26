package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleNumbers.`4`
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.facebook
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.kik
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.line
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.skype
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.slack
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.telegram
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.viber
import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
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
    platform: facebook | kik | line | skype | slack | telegram | viber = null,
    `type`: `4` = null
  ): DialogflowV1MessageCustomPayload = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DialogflowV1MessageCustomPayload]
  }
}

