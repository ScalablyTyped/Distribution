package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssessmentTemplatesResponse extends js.Object {
  /**
    * A list of ARNs that specifies the assessment templates returned by the action.
    */
  var assessmentTemplateArns: ListReturnedArnList
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListAssessmentTemplatesResponse {
  @scala.inline
  def apply(assessmentTemplateArns: ListReturnedArnList, nextToken: PaginationToken = null): ListAssessmentTemplatesResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplateArns = assessmentTemplateArns)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAssessmentTemplatesResponse]
  }
}

