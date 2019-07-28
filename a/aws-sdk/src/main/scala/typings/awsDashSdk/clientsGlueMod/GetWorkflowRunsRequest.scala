package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkflowRunsRequest extends js.Object {
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * The maximum number of workflow runs to be included in the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * Name of the workflow whose metadata of runs should be returned.
    */
  var Name: NameString
  /**
    * The maximum size of the response.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object GetWorkflowRunsRequest {
  @scala.inline
  def apply(
    Name: NameString,
    IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: GenericString = null
  ): GetWorkflowRunsRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(IncludeGraph)) __obj.updateDynamic("IncludeGraph")(IncludeGraph)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetWorkflowRunsRequest]
  }
}

