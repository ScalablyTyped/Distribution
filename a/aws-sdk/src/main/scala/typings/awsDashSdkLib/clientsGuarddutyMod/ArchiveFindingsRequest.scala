package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveFindingsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to archive.
    */
  var DetectorId: awsDashSdkLib.clientsGuarddutyMod.DetectorId
  /**
    * IDs of the findings that you want to archive.
    */
  var FindingIds: awsDashSdkLib.clientsGuarddutyMod.FindingIds
}

object ArchiveFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds): ArchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FindingIds = FindingIds)
  
    __obj.asInstanceOf[ArchiveFindingsRequest]
  }
}

