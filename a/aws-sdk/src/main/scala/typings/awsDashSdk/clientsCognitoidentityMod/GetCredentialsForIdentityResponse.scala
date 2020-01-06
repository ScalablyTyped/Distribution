package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialsForIdentityResponse extends js.Object {
  /**
    * Credentials for the provided identity ID.
    */
  var Credentials: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.Credentials] = js.native
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityId] = js.native
}

object GetCredentialsForIdentityResponse {
  @scala.inline
  def apply(Credentials: Credentials = null, IdentityId: IdentityId = null): GetCredentialsForIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsForIdentityResponse]
  }
}

