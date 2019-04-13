package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAssessmentTargetRequest extends js.Object {
  /**
    * The user-defined name that identifies the assessment target that you want to create. The name must be unique within the AWS account.
    */
  var assessmentTargetName: AssessmentTargetName
  /**
    * The ARN that specifies the resource group that is used to create the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.undefined
}

object CreateAssessmentTargetRequest {
  @scala.inline
  def apply(assessmentTargetName: AssessmentTargetName, resourceGroupArn: Arn = null): CreateAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetName = assessmentTargetName)
    if (resourceGroupArn != null) __obj.updateDynamic("resourceGroupArn")(resourceGroupArn)
    __obj.asInstanceOf[CreateAssessmentTargetRequest]
  }
}

