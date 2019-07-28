package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobDefinitionsRequest extends js.Object {
  /**
    * The name of the job definition to describe.
    */
  var jobDefinitionName: js.UndefOr[String] = js.undefined
  /**
    * A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
    */
  var jobDefinitions: js.UndefOr[StringList] = js.undefined
  /**
    * The maximum number of results returned by DescribeJobDefinitions in paginated output. When this parameter is used, DescribeJobDefinitions only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeJobDefinitions request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then DescribeJobDefinitions returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The nextToken value returned from a previous paginated DescribeJobDefinitions request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The status with which to filter job definitions.
    */
  var status: js.UndefOr[String] = js.undefined
}

object DescribeJobDefinitionsRequest {
  @scala.inline
  def apply(
    jobDefinitionName: String = null,
    jobDefinitions: StringList = null,
    maxResults: js.UndefOr[Integer] = js.undefined,
    nextToken: String = null,
    status: String = null
  ): DescribeJobDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    if (jobDefinitionName != null) __obj.updateDynamic("jobDefinitionName")(jobDefinitionName)
    if (jobDefinitions != null) __obj.updateDynamic("jobDefinitions")(jobDefinitions)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DescribeJobDefinitionsRequest]
  }
}

