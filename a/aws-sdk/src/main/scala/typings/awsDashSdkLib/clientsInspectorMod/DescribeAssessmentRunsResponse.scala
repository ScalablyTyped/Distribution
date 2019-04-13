package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssessmentRunsResponse extends js.Object {
  /**
    * Information about the assessment run.
    */
  var assessmentRuns: AssessmentRunList
  /**
    * Assessment run details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}

object DescribeAssessmentRunsResponse {
  @scala.inline
  def apply(assessmentRuns: AssessmentRunList, failedItems: FailedItems): DescribeAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal(assessmentRuns = assessmentRuns, failedItems = failedItems)
  
    __obj.asInstanceOf[DescribeAssessmentRunsResponse]
  }
}

