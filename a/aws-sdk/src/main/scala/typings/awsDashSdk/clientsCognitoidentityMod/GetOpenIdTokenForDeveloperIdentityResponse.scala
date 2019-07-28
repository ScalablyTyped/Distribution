package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpenIdTokenForDeveloperIdentityResponse extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
  /**
    * An OpenID token.
    */
  var Token: js.UndefOr[OIDCToken] = js.undefined
}

object GetOpenIdTokenForDeveloperIdentityResponse {
  @scala.inline
  def apply(IdentityId: IdentityId = null, Token: OIDCToken = null): GetOpenIdTokenForDeveloperIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityResponse]
  }
}

