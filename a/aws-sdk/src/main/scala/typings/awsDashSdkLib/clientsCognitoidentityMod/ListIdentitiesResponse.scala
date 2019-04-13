package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentitiesResponse extends js.Object {
  /**
    * An object containing a set of identities and associated mappings.
    */
  var Identities: js.UndefOr[IdentitiesList] = js.undefined
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}

object ListIdentitiesResponse {
  @scala.inline
  def apply(
    Identities: IdentitiesList = null,
    IdentityPoolId: IdentityPoolId = null,
    NextToken: PaginationKey = null
  ): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (Identities != null) __obj.updateDynamic("Identities")(Identities)
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
}

