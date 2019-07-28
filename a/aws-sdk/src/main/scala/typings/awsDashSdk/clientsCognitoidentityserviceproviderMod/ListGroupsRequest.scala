package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsRequest extends js.Object {
  /**
    * The limit of the request to list groups.
    */
  var Limit: js.UndefOr[QueryLimitType] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}

object ListGroupsRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    Limit: js.UndefOr[QueryLimitType] = js.undefined,
    NextToken: PaginationKey = null
  ): ListGroupsRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupsRequest]
  }
}

