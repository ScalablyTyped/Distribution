package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAssessmentRunRequest extends js.Object {
  /**
    * The ARN that specifies the assessment run that you want to delete.
    */
  var assessmentRunArn: Arn
}

object DeleteAssessmentRunRequest {
  @scala.inline
  def apply(assessmentRunArn: Arn): DeleteAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn)
  
    __obj.asInstanceOf[DeleteAssessmentRunRequest]
  }
}

