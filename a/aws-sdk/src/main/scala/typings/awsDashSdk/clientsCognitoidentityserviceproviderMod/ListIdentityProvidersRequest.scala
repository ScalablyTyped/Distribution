package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentityProvidersRequest extends js.Object {
  /**
    * The maximum number of identity providers to return.
    */
  var MaxResults: js.UndefOr[ListProvidersLimitType] = js.undefined
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object ListIdentityProvidersRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    MaxResults: js.UndefOr[ListProvidersLimitType] = js.undefined,
    NextToken: PaginationKeyType = null
  ): ListIdentityProvidersRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentityProvidersRequest]
  }
}

