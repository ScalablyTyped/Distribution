package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFindingsFeedbackRequest extends js.Object {
  /**
    * Additional feedback about the GuardDuty findings.
    */
  var Comments: js.UndefOr[Comments] = js.undefined
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to mark as useful or not useful.
    */
  var DetectorId: __string
  /**
    * Valid values: USEFUL | NOT_USEFUL
    */
  var Feedback: awsDashSdkLib.clientsGuarddutyMod.Feedback
  /**
    * IDs of the findings that you want to mark as useful or not useful.
    */
  var FindingIds: awsDashSdkLib.clientsGuarddutyMod.FindingIds
}

object UpdateFindingsFeedbackRequest {
  @scala.inline
  def apply(DetectorId: __string, Feedback: Feedback, FindingIds: FindingIds, Comments: Comments = null): UpdateFindingsFeedbackRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, Feedback = Feedback.asInstanceOf[js.Any], FindingIds = FindingIds)
    if (Comments != null) __obj.updateDynamic("Comments")(Comments)
    __obj.asInstanceOf[UpdateFindingsFeedbackRequest]
  }
}

