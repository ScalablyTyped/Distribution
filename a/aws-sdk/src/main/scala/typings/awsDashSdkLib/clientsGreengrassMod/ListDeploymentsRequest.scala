package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeploymentsRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[__string] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListDeploymentsRequest {
  @scala.inline
  def apply(GroupId: __string, MaxResults: __string = null, NextToken: __string = null): ListDeploymentsRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDeploymentsRequest]
  }
}

