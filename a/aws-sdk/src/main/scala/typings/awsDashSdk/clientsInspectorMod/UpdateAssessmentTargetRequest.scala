package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssessmentTargetRequest extends js.Object {
  /**
    * The ARN of the assessment target that you want to update.
    */
  var assessmentTargetArn: Arn = js.native
  /**
    * The name of the assessment target that you want to update.
    */
  var assessmentTargetName: AssessmentTargetName = js.native
  /**
    * The ARN of the resource group that is used to specify the new resource group to associate with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.native
}

object UpdateAssessmentTargetRequest {
  @scala.inline
  def apply(assessmentTargetArn: Arn, assessmentTargetName: AssessmentTargetName, resourceGroupArn: Arn = null): UpdateAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any], assessmentTargetName = assessmentTargetName.asInstanceOf[js.Any])
    if (resourceGroupArn != null) __obj.updateDynamic("resourceGroupArn")(resourceGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentTargetRequest]
  }
}

