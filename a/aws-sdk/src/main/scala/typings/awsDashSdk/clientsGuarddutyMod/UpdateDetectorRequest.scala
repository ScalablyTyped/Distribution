package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDetectorRequest extends js.Object {
  /**
    * The unique ID of the detector that you want to update.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * Updated boolean value for the detector that specifies whether the detector is enabled.
    */
  var Enable: js.UndefOr[Boolean] = js.undefined
  /**
    * A enum value that specifies how frequently customer got Finding updates published.
    */
  var FindingPublishingFrequency: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.FindingPublishingFrequency] = js.undefined
}

object UpdateDetectorRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    Enable: js.UndefOr[Boolean] = js.undefined,
    FindingPublishingFrequency: FindingPublishingFrequency = null
  ): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
    if (!js.isUndefined(Enable)) __obj.updateDynamic("Enable")(Enable)
    if (FindingPublishingFrequency != null) __obj.updateDynamic("FindingPublishingFrequency")(FindingPublishingFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
}

