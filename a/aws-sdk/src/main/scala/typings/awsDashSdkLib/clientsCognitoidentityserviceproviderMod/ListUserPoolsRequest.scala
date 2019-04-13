package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserPoolsRequest extends js.Object {
  /**
    * The maximum number of results you want the request to return when listing the user pools.
    */
  var MaxResults: PoolQueryLimitType
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
}

object ListUserPoolsRequest {
  @scala.inline
  def apply(MaxResults: PoolQueryLimitType, NextToken: PaginationKeyType = null): ListUserPoolsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUserPoolsRequest]
  }
}

