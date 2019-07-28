package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssessmentTemplatesRequest extends js.Object {
  var assessmentTemplateArns: BatchDescribeArnList
}

object DescribeAssessmentTemplatesRequest {
  @scala.inline
  def apply(assessmentTemplateArns: BatchDescribeArnList): DescribeAssessmentTemplatesRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArns = assessmentTemplateArns)
  
    __obj.asInstanceOf[DescribeAssessmentTemplatesRequest]
  }
}

