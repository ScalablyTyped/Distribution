package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentRunsRequest extends js.Object {
  /**
    * The ARN that specifies the assessment run that you want to describe.
    */
  var assessmentRunArns: BatchDescribeArnList = js.native
}

object DescribeAssessmentRunsRequest {
  @scala.inline
  def apply(assessmentRunArns: BatchDescribeArnList): DescribeAssessmentRunsRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArns = assessmentRunArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAssessmentRunsRequest]
  }
}

