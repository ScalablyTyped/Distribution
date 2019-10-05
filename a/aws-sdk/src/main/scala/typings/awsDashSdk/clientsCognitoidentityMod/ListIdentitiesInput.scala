package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentitiesInput extends js.Object {
  /**
    * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API will include disabled identities in the response.
    */
  var HideDisabled: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.HideDisabled] = js.undefined
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: QueryLimit
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}

object ListIdentitiesInput {
  @scala.inline
  def apply(
    IdentityPoolId: IdentityPoolId,
    MaxResults: QueryLimit,
    HideDisabled: js.UndefOr[Boolean] = js.undefined,
    NextToken: PaginationKey = null
  ): ListIdentitiesInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId, MaxResults = MaxResults)
    if (!js.isUndefined(HideDisabled)) __obj.updateDynamic("HideDisabled")(HideDisabled)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentitiesInput]
  }
}

