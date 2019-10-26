package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.custom_payload
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.google
import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageGooglePayload
  extends DialogflowV1BaseGoogleMessage[custom_payload]
     with DialogflowV1Message {
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object DialogflowV1MessageGooglePayload {
  @scala.inline
  def apply(platform: google, payload: ApiClientObjectMap[_] = null, `type`: custom_payload = null): DialogflowV1MessageGooglePayload = {
    val __obj = js.Dynamic.literal(platform = platform)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DialogflowV1MessageGooglePayload]
  }
}

