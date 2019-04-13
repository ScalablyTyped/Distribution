package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAssessmentTargetRequest extends js.Object {
  /**
    * The ARN of the assessment target that you want to update.
    */
  var assessmentTargetArn: Arn
  /**
    * The name of the assessment target that you want to update.
    */
  var assessmentTargetName: AssessmentTargetName
  /**
    * The ARN of the resource group that is used to specify the new resource group to associate with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.undefined
}

object UpdateAssessmentTargetRequest {
  @scala.inline
  def apply(assessmentTargetArn: Arn, assessmentTargetName: AssessmentTargetName, resourceGroupArn: Arn = null): UpdateAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn, assessmentTargetName = assessmentTargetName)
    if (resourceGroupArn != null) __obj.updateDynamic("resourceGroupArn")(resourceGroupArn)
    __obj.asInstanceOf[UpdateAssessmentTargetRequest]
  }
}

