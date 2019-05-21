package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPackagingGroupsRequest extends js.Object {
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListPackagingGroupsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: __string = null): ListPackagingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListPackagingGroupsRequest]
  }
}

