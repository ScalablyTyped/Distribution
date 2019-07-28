package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAssessmentTargetRequest extends js.Object {
  /**
    * The ARN that specifies the assessment target that you want to delete.
    */
  var assessmentTargetArn: Arn
}

object DeleteAssessmentTargetRequest {
  @scala.inline
  def apply(assessmentTargetArn: Arn): DeleteAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn)
  
    __obj.asInstanceOf[DeleteAssessmentTargetRequest]
  }
}

