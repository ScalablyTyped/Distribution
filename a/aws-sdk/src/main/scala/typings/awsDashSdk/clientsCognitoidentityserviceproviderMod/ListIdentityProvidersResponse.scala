package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentityProvidersResponse extends js.Object {
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
  /**
    * A list of identity provider objects.
    */
  var Providers: ProvidersListType
}

object ListIdentityProvidersResponse {
  @scala.inline
  def apply(Providers: ProvidersListType, NextToken: PaginationKeyType = null): ListIdentityProvidersResponse = {
    val __obj = js.Dynamic.literal(Providers = Providers)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentityProvidersResponse]
  }
}

