package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserPoolClientsRequest extends js.Object {
  /**
    * The maximum number of results you want the request to return when listing the user pool clients.
    */
  var MaxResults: js.UndefOr[QueryLimit] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
  /**
    * The user pool ID for the user pool where you want to list user pool clients.
    */
  var UserPoolId: UserPoolIdType
}

object ListUserPoolClientsRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, MaxResults: Int | Double = null, NextToken: PaginationKey = null): ListUserPoolClientsRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUserPoolClientsRequest]
  }
}

