package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssessmentTargetsResponse extends js.Object {
  /**
    * A list of ARNs that specifies the assessment targets that are returned by the action.
    */
  var assessmentTargetArns: ListReturnedArnList
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListAssessmentTargetsResponse {
  @scala.inline
  def apply(assessmentTargetArns: ListReturnedArnList, nextToken: PaginationToken = null): ListAssessmentTargetsResponse = {
    val __obj = js.Dynamic.literal(assessmentTargetArns = assessmentTargetArns)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAssessmentTargetsResponse]
  }
}

