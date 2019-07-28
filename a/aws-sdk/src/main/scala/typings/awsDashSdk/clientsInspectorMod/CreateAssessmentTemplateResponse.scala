package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAssessmentTemplateResponse extends js.Object {
  /**
    * The ARN that specifies the assessment template that is created.
    */
  var assessmentTemplateArn: Arn
}

object CreateAssessmentTemplateResponse {
  @scala.inline
  def apply(assessmentTemplateArn: Arn): CreateAssessmentTemplateResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn)
  
    __obj.asInstanceOf[CreateAssessmentTemplateResponse]
  }
}

