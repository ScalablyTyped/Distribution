package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentityPoolsResponse extends js.Object {
  /**
    * The identity pools returned by the ListIdentityPools action.
    */
  var IdentityPools: js.UndefOr[IdentityPoolsList] = js.undefined
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}

object ListIdentityPoolsResponse {
  @scala.inline
  def apply(IdentityPools: IdentityPoolsList = null, NextToken: PaginationKey = null): ListIdentityPoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityPools != null) __obj.updateDynamic("IdentityPools")(IdentityPools)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentityPoolsResponse]
  }
}

