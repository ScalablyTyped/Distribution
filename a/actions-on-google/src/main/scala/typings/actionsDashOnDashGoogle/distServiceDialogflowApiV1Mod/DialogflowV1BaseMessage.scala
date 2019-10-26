package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

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

trait DialogflowV1BaseMessage[TType /* <: Double */] extends js.Object {
  var platform: js.UndefOr[facebook | kik | line | skype | slack | telegram | viber] = js.undefined
  var `type`: js.UndefOr[TType] = js.undefined
}

object DialogflowV1BaseMessage {
  @scala.inline
  def apply[TType /* <: Double */](platform: facebook | kik | line | skype | slack | telegram | viber = null, `type`: TType = null): DialogflowV1BaseMessage[TType] = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1BaseMessage[TType]]
  }
}

