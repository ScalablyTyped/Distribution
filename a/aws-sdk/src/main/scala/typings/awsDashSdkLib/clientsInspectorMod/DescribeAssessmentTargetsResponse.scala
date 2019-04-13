package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssessmentTargetsResponse extends js.Object {
  /**
    * Information about the assessment targets.
    */
  var assessmentTargets: AssessmentTargetList
  /**
    * Assessment target details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}

object DescribeAssessmentTargetsResponse {
  @scala.inline
  def apply(assessmentTargets: AssessmentTargetList, failedItems: FailedItems): DescribeAssessmentTargetsResponse = {
    val __obj = js.Dynamic.literal(assessmentTargets = assessmentTargets, failedItems = failedItems)
  
    __obj.asInstanceOf[DescribeAssessmentTargetsResponse]
  }
}

