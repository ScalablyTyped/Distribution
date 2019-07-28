package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConnectorDefinitionsRequest extends js.Object {
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[__string] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListConnectorDefinitionsRequest {
  @scala.inline
  def apply(MaxResults: __string = null, NextToken: __string = null): ListConnectorDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListConnectorDefinitionsRequest]
  }
}

