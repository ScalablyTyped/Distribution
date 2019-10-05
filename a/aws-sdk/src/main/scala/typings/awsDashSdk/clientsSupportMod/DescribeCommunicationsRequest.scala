package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCommunicationsRequest extends js.Object {
  /**
    * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var afterTime: js.UndefOr[AfterTime] = js.undefined
  /**
    * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var beforeTime: js.UndefOr[BeforeTime] = js.undefined
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: CaseId
  /**
    * The maximum number of results to return before paginating.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeCommunicationsRequest {
  @scala.inline
  def apply(
    caseId: CaseId,
    afterTime: AfterTime = null,
    beforeTime: BeforeTime = null,
    maxResults: Int | scala.Double = null,
    nextToken: NextToken = null
  ): DescribeCommunicationsRequest = {
    val __obj = js.Dynamic.literal(caseId = caseId)
    if (afterTime != null) __obj.updateDynamic("afterTime")(afterTime)
    if (beforeTime != null) __obj.updateDynamic("beforeTime")(beforeTime)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeCommunicationsRequest]
  }
}

