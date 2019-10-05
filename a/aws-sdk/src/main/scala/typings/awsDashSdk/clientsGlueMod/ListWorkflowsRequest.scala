package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkflowsRequest extends js.Object {
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object ListWorkflowsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: GenericString = null): ListWorkflowsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListWorkflowsRequest]
  }
}

