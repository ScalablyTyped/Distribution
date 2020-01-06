package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAssessmentRunRequest extends js.Object {
  /**
    * You can specify the name for the assessment run. The name must be unique for the assessment template whose ARN is used to start the assessment run.
    */
  var assessmentRunName: js.UndefOr[AssessmentRunName] = js.native
  /**
    * The ARN of the assessment template of the assessment run that you want to start.
    */
  var assessmentTemplateArn: Arn = js.native
}

object StartAssessmentRunRequest {
  @scala.inline
  def apply(assessmentTemplateArn: Arn, assessmentRunName: AssessmentRunName = null): StartAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    if (assessmentRunName != null) __obj.updateDynamic("assessmentRunName")(assessmentRunName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAssessmentRunRequest]
  }
}

