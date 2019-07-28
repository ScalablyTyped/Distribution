package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartAssessmentRunRequest extends js.Object {
  /**
    * You can specify the name for the assessment run. The name must be unique for the assessment template whose ARN is used to start the assessment run.
    */
  var assessmentRunName: js.UndefOr[AssessmentRunName] = js.undefined
  /**
    * The ARN of the assessment template of the assessment run that you want to start.
    */
  var assessmentTemplateArn: Arn
}

object StartAssessmentRunRequest {
  @scala.inline
  def apply(assessmentTemplateArn: Arn, assessmentRunName: AssessmentRunName = null): StartAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn)
    if (assessmentRunName != null) __obj.updateDynamic("assessmentRunName")(assessmentRunName)
    __obj.asInstanceOf[StartAssessmentRunRequest]
  }
}

