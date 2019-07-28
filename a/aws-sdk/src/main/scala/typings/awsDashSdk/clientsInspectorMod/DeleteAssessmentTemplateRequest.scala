package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAssessmentTemplateRequest extends js.Object {
  /**
    * The ARN that specifies the assessment template that you want to delete.
    */
  var assessmentTemplateArn: Arn
}

object DeleteAssessmentTemplateRequest {
  @scala.inline
  def apply(assessmentTemplateArn: Arn): DeleteAssessmentTemplateRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn)
  
    __obj.asInstanceOf[DeleteAssessmentTemplateRequest]
  }
}

