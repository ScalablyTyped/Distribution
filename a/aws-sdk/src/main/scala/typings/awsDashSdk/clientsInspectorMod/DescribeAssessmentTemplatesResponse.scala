package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssessmentTemplatesResponse extends js.Object {
  /**
    * Information about the assessment templates.
    */
  var assessmentTemplates: AssessmentTemplateList
  /**
    * Assessment template details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}

object DescribeAssessmentTemplatesResponse {
  @scala.inline
  def apply(assessmentTemplates: AssessmentTemplateList, failedItems: FailedItems): DescribeAssessmentTemplatesResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplates = assessmentTemplates, failedItems = failedItems)
  
    __obj.asInstanceOf[DescribeAssessmentTemplatesResponse]
  }
}

