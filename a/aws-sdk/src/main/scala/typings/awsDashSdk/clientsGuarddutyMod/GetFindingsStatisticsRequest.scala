package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsStatisticsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId = js.native
  /**
    * Represents the criteria used for querying findings.
    */
  var FindingCriteria: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.FindingCriteria] = js.native
  /**
    * Types of finding statistics to retrieve.
    */
  var FindingStatisticTypes: typings.awsDashSdk.clientsGuarddutyMod.FindingStatisticTypes = js.native
}

object GetFindingsStatisticsRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    FindingStatisticTypes: FindingStatisticTypes,
    FindingCriteria: FindingCriteria = null
  ): GetFindingsStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingStatisticTypes = FindingStatisticTypes.asInstanceOf[js.Any])
    if (FindingCriteria != null) __obj.updateDynamic("FindingCriteria")(FindingCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsRequest]
  }
}

