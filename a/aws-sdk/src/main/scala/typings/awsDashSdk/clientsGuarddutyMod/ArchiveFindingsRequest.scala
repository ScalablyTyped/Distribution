package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveFindingsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to archive.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId = js.native
  /**
    * IDs of the findings that you want to archive.
    */
  var FindingIds: typings.awsDashSdk.clientsGuarddutyMod.FindingIds = js.native
}

object ArchiveFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds): ArchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArchiveFindingsRequest]
  }
}

