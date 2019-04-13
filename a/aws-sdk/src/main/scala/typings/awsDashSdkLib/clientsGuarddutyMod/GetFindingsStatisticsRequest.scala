package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFindingsStatisticsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
    */
  var DetectorId: __string
  /**
    * Represents the criteria used for querying findings.
    */
  var FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined
  /**
    * Types of finding statistics to retrieve.
    */
  var FindingStatisticTypes: awsDashSdkLib.clientsGuarddutyMod.FindingStatisticTypes
}

object GetFindingsStatisticsRequest {
  @scala.inline
  def apply(
    DetectorId: __string,
    FindingStatisticTypes: FindingStatisticTypes,
    FindingCriteria: FindingCriteria = null
  ): GetFindingsStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FindingStatisticTypes = FindingStatisticTypes)
    if (FindingCriteria != null) __obj.updateDynamic("FindingCriteria")(FindingCriteria)
    __obj.asInstanceOf[GetFindingsStatisticsRequest]
  }
}

