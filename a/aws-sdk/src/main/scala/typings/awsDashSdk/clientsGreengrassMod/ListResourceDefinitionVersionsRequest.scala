package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceDefinitionVersionsRequest extends js.Object {
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[__string] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: __string
}

object ListResourceDefinitionVersionsRequest {
  @scala.inline
  def apply(ResourceDefinitionId: __string, MaxResults: __string = null, NextToken: __string = null): ListResourceDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResourceDefinitionVersionsRequest]
  }
}

