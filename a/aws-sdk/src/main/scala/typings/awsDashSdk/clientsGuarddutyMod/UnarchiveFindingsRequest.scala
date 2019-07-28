package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnarchiveFindingsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to unarchive.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * IDs of the findings that you want to unarchive.
    */
  var FindingIds: typings.awsDashSdk.clientsGuarddutyMod.FindingIds
}

object UnarchiveFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds): UnarchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FindingIds = FindingIds)
  
    __obj.asInstanceOf[UnarchiveFindingsRequest]
  }
}

