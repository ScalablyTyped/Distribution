package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFindingsFeedbackRequest extends js.Object {
  /**
    * Additional feedback about the GuardDuty findings.
    */
  var Comments: js.UndefOr[String] = js.undefined
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to mark as useful or not useful.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * Valid values: USEFUL | NOT_USEFUL
    */
  var Feedback: typings.awsDashSdk.clientsGuarddutyMod.Feedback
  /**
    * IDs of the findings that you want to mark as useful or not useful.
    */
  var FindingIds: typings.awsDashSdk.clientsGuarddutyMod.FindingIds
}

object UpdateFindingsFeedbackRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, Feedback: Feedback, FindingIds: FindingIds, Comments: String = null): UpdateFindingsFeedbackRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, Feedback = Feedback.asInstanceOf[js.Any], FindingIds = FindingIds)
    if (Comments != null) __obj.updateDynamic("Comments")(Comments)
    __obj.asInstanceOf[UpdateFindingsFeedbackRequest]
  }
}

