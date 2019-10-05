package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssessmentRunAgentsRequest extends js.Object {
  /**
    * The ARN that specifies the assessment run whose agents you want to list.
    */
  var assessmentRunArn: Arn
  /**
    * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
    */
  var filter: js.UndefOr[AgentFilter] = js.undefined
  /**
    * You can use this parameter to indicate the maximum number of items that you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.undefined
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentRunAgents action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListAssessmentRunAgentsRequest {
  @scala.inline
  def apply(
    assessmentRunArn: Arn,
    filter: AgentFilter = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null
  ): ListAssessmentRunAgentsRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAssessmentRunAgentsRequest]
  }
}

