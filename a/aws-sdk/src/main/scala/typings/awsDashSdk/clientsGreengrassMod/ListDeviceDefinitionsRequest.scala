package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeviceDefinitionsRequest extends js.Object {
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[__string] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListDeviceDefinitionsRequest {
  @scala.inline
  def apply(MaxResults: __string = null, NextToken: __string = null): ListDeviceDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDeviceDefinitionsRequest]
  }
}

