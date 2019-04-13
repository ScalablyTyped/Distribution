package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnarchiveFindingsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to unarchive.
    */
  var DetectorId: __string
  /**
    * IDs of the findings that you want to unarchive.
    */
  var FindingIds: awsDashSdkLib.clientsGuarddutyMod.FindingIds
}

object UnarchiveFindingsRequest {
  @scala.inline
  def apply(DetectorId: __string, FindingIds: FindingIds): UnarchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FindingIds = FindingIds)
  
    __obj.asInstanceOf[UnarchiveFindingsRequest]
  }
}

