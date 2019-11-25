package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1BaseGoogleMessage[TType /* <: String */] extends js.Object {
  var platform: google
  var `type`: js.UndefOr[TType] = js.undefined
}

object DialogflowV1BaseGoogleMessage {
  @scala.inline
  def apply[TType /* <: String */](platform: google, `type`: TType = null): DialogflowV1BaseGoogleMessage[TType] = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1BaseGoogleMessage[TType]]
  }
}

