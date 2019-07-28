package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssessmentRunsRequest extends js.Object {
  /**
    * The ARN that specifies the assessment run that you want to describe.
    */
  var assessmentRunArns: BatchDescribeArnList
}

object DescribeAssessmentRunsRequest {
  @scala.inline
  def apply(assessmentRunArns: BatchDescribeArnList): DescribeAssessmentRunsRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArns = assessmentRunArns)
  
    __obj.asInstanceOf[DescribeAssessmentRunsRequest]
  }
}

