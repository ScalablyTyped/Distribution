package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApisRequest extends js.Object {
  /**
    * The maximum number of elements to be returned for this resource.
    */
  var MaxResults: js.UndefOr[__string] = js.native
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object GetApisRequest {
  @scala.inline
  def apply(MaxResults: __string = null, NextToken: __string = null): GetApisRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApisRequest]
  }
}

