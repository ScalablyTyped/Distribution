package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartAssessmentRunResponse extends js.Object {
  /**
    * The ARN of the assessment run that has been started.
    */
  var assessmentRunArn: Arn
}

object StartAssessmentRunResponse {
  @scala.inline
  def apply(assessmentRunArn: Arn): StartAssessmentRunResponse = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn)
  
    __obj.asInstanceOf[StartAssessmentRunResponse]
  }
}

