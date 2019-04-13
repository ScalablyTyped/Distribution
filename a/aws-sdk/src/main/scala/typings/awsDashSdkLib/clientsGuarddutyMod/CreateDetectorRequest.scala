package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDetectorRequest extends js.Object {
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined
  /**
    * A boolean value that specifies whether the detector is to be enabled.
    */
  var Enable: awsDashSdkLib.clientsGuarddutyMod.Enable
  /**
    * A enum value that specifies how frequently customer got Finding updates published.
    */
  var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
}

object CreateDetectorRequest {
  @scala.inline
  def apply(
    Enable: Enable,
    ClientToken: __stringMin0Max64 = null,
    FindingPublishingFrequency: FindingPublishingFrequency = null
  ): CreateDetectorRequest = {
    val __obj = js.Dynamic.literal(Enable = Enable)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (FindingPublishingFrequency != null) __obj.updateDynamic("FindingPublishingFrequency")(FindingPublishingFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorRequest]
  }
}

