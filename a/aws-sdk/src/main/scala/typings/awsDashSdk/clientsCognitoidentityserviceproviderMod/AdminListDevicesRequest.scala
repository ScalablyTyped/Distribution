package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminListDevicesRequest extends js.Object {
  /**
    * The limit of the devices request.
    */
  var Limit: js.UndefOr[QueryLimitType] = js.undefined
  /**
    * The pagination token.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name.
    */
  var Username: UsernameType
}

object AdminListDevicesRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    Limit: js.UndefOr[QueryLimitType] = js.undefined,
    PaginationToken: SearchPaginationTokenType = null
  ): AdminListDevicesRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    __obj.asInstanceOf[AdminListDevicesRequest]
  }
}

