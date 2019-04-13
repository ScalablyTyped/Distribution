package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceServersRequest extends js.Object {
  /**
    * The maximum number of resource servers to return.
    */
  var MaxResults: js.UndefOr[ListResourceServersLimitType] = js.undefined
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}

object ListResourceServersRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    MaxResults: js.UndefOr[ListResourceServersLimitType] = js.undefined,
    NextToken: PaginationKeyType = null
  ): ListResourceServersRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResourceServersRequest]
  }
}

