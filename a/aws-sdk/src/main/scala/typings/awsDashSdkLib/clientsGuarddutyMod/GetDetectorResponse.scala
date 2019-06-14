package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDetectorResponse extends js.Object {
  /**
    * Detector creation timestamp.
    */
  var CreatedAt: js.UndefOr[String] = js.undefined
  /**
    * Finding publishing frequency.
    */
  var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
  /**
    * The GuardDuty service role.
    */
  var ServiceRole: String
  /**
    * The detector status.
    */
  var Status: DetectorStatus
  /**
    * The tags of the detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  /**
    * Detector last update timestamp.
    */
  var UpdatedAt: js.UndefOr[String] = js.undefined
}

object GetDetectorResponse {
  @scala.inline
  def apply(
    ServiceRole: String,
    Status: DetectorStatus,
    CreatedAt: String = null,
    FindingPublishingFrequency: FindingPublishingFrequency = null,
    Tags: TagMap = null,
    UpdatedAt: String = null
  ): GetDetectorResponse = {
    val __obj = js.Dynamic.literal(ServiceRole = ServiceRole, Status = Status.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (FindingPublishingFrequency != null) __obj.updateDynamic("FindingPublishingFrequency")(FindingPublishingFrequency.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt)
    __obj.asInstanceOf[GetDetectorResponse]
  }
}

