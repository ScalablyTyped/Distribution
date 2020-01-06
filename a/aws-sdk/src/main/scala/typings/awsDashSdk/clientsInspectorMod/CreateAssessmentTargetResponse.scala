package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssessmentTargetResponse extends js.Object {
  /**
    * The ARN that specifies the assessment target that is created.
    */
  var assessmentTargetArn: Arn = js.native
}

object CreateAssessmentTargetResponse {
  @scala.inline
  def apply(assessmentTargetArn: Arn): CreateAssessmentTargetResponse = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAssessmentTargetResponse]
  }
}

