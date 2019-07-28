package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpenIdTokenResponse extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on input.
    */
  var IdentityId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
  /**
    * An OpenID token, valid for 10 minutes.
    */
  var Token: js.UndefOr[OIDCToken] = js.undefined
}

object GetOpenIdTokenResponse {
  @scala.inline
  def apply(IdentityId: IdentityId = null, Token: OIDCToken = null): GetOpenIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[GetOpenIdTokenResponse]
  }
}

