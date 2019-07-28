package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialsForIdentityResponse extends js.Object {
  /**
    * Credentials for the provided identity ID.
    */
  var Credentials: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.Credentials] = js.undefined
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
}

object GetCredentialsForIdentityResponse {
  @scala.inline
  def apply(Credentials: Credentials = null, IdentityId: IdentityId = null): GetCredentialsForIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials)
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    __obj.asInstanceOf[GetCredentialsForIdentityResponse]
  }
}

