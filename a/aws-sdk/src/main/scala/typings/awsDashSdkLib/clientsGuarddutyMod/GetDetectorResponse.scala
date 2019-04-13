package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDetectorResponse extends js.Object {
  var CreatedAt: js.UndefOr[CreatedAt] = js.undefined
  var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
  var ServiceRole: js.UndefOr[ServiceRole] = js.undefined
  var Status: js.UndefOr[DetectorStatus] = js.undefined
  var UpdatedAt: js.UndefOr[UpdatedAt] = js.undefined
}

object GetDetectorResponse {
  @scala.inline
  def apply(
    CreatedAt: CreatedAt = null,
    FindingPublishingFrequency: FindingPublishingFrequency = null,
    ServiceRole: ServiceRole = null,
    Status: DetectorStatus = null,
    UpdatedAt: UpdatedAt = null
  ): GetDetectorResponse = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (FindingPublishingFrequency != null) __obj.updateDynamic("FindingPublishingFrequency")(FindingPublishingFrequency.asInstanceOf[js.Any])
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt)
    __obj.asInstanceOf[GetDetectorResponse]
  }
}

