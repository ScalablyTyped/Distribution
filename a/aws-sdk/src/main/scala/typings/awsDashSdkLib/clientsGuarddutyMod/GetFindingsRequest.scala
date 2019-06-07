package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFindingsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to retrieve.
    */
  var DetectorId: awsDashSdkLib.clientsGuarddutyMod.DetectorId
  /**
    * IDs of the findings that you want to retrieve.
    */
  var FindingIds: awsDashSdkLib.clientsGuarddutyMod.FindingIds
  /**
    * Represents the criteria used for sorting findings.
    */
  var SortCriteria: js.UndefOr[SortCriteria] = js.undefined
}

object GetFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds, SortCriteria: SortCriteria = null): GetFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FindingIds = FindingIds)
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria)
    __obj.asInstanceOf[GetFindingsRequest]
  }
}

