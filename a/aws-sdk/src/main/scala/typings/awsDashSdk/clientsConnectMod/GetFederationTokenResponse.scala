package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFederationTokenResponse extends js.Object {
  /**
    * The credentials to use for federation.
    */
  var Credentials: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Credentials] = js.undefined
}

object GetFederationTokenResponse {
  @scala.inline
  def apply(Credentials: Credentials = null): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials)
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
}

