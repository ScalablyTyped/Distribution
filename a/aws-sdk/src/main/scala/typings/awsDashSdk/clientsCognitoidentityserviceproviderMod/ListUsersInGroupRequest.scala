package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersInGroupRequest extends js.Object {
  /**
    * The name of the group.
    */
  var GroupName: GroupNameType
  /**
    * The limit of the request to list users.
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

object ListUsersInGroupRequest {
  @scala.inline
  def apply(
    GroupName: GroupNameType,
    UserPoolId: UserPoolIdType,
    Limit: js.UndefOr[QueryLimitType] = js.undefined,
    NextToken: PaginationKey = null
  ): ListUsersInGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, UserPoolId = UserPoolId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUsersInGroupRequest]
  }
}

