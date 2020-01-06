package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentitiesResponse extends js.Object {
  /**
    * An object containing a set of identities and associated mappings.
    */
  var Identities: js.UndefOr[IdentitiesList] = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId] = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object ListIdentitiesResponse {
  @scala.inline
  def apply(
    Identities: IdentitiesList = null,
    IdentityPoolId: IdentityPoolId = null,
    NextToken: PaginationKey = null
  ): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (Identities != null) __obj.updateDynamic("Identities")(Identities.asInstanceOf[js.Any])
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
}

