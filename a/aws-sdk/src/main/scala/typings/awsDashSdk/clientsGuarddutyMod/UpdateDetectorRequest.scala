package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorRequest extends js.Object {
  /**
    * The unique ID of the detector to update.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId = js.native
  /**
    * Specifies whether the detector is enabled or not enabled.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  /**
    * A enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
    */
  var FindingPublishingFrequency: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.FindingPublishingFrequency] = js.native
}

object UpdateDetectorRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    Enable: js.UndefOr[scala.Boolean] = js.undefined,
    FindingPublishingFrequency: FindingPublishingFrequency = null
  ): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    if (!js.isUndefined(Enable)) __obj.updateDynamic("Enable")(Enable.asInstanceOf[js.Any])
    if (FindingPublishingFrequency != null) __obj.updateDynamic("FindingPublishingFrequency")(FindingPublishingFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
}

