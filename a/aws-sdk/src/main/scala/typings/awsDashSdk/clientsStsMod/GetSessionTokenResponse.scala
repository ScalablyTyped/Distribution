package typings.awsDashSdk.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSessionTokenResponse extends js.Object {
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsDashSdk.clientsStsMod.Credentials] = js.native
}

object GetSessionTokenResponse {
  @scala.inline
  def apply(Credentials: Credentials = null): GetSessionTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionTokenResponse]
  }
}

