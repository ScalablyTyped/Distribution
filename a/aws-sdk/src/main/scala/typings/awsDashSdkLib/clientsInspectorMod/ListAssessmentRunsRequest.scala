package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssessmentRunsRequest extends js.Object {
  /**
    * The ARNs that specify the assessment templates whose assessment runs you want to list.
    */
  var assessmentTemplateArns: js.UndefOr[ListParentArnList] = js.undefined
  /**
    * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
    */
  var filter: js.UndefOr[AssessmentRunFilter] = js.undefined
  /**
    * You can use this parameter to indicate the maximum number of items that you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.undefined
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentRuns action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListAssessmentRunsRequest {
  @scala.inline
  def apply(
    assessmentTemplateArns: ListParentArnList = null,
    filter: AssessmentRunFilter = null,
    maxResults: js.UndefOr[ListMaxResults] = js.undefined,
    nextToken: PaginationToken = null
  ): ListAssessmentRunsRequest = {
    val __obj = js.Dynamic.literal()
    if (assessmentTemplateArns != null) __obj.updateDynamic("assessmentTemplateArns")(assessmentTemplateArns)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAssessmentRunsRequest]
  }
}

