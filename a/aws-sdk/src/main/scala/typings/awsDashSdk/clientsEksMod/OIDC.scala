package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OIDC extends js.Object {
  /**
    * The issuer URL for the OpenID Connect identity provider.
    */
  var issuer: js.UndefOr[String] = js.native
}

object OIDC {
  @scala.inline
  def apply(issuer: String = null): OIDC = {
    val __obj = js.Dynamic.literal()
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIDC]
  }
}

