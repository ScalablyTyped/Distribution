package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminListGroupsForUserRequest extends js.Object {
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
  /**
    * The username for the user.
    */
  var Username: UsernameType
}

object AdminListGroupsForUserRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    Limit: Int | Double = null,
    NextToken: PaginationKey = null
  ): AdminListGroupsForUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[AdminListGroupsForUserRequest]
  }
}

