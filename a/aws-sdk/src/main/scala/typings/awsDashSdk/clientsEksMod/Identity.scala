package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  /**
    * The OpenID Connect identity provider information for the cluster.
    */
  var oidc: js.UndefOr[OIDC] = js.undefined
}

object Identity {
  @scala.inline
  def apply(oidc: OIDC = null): Identity = {
    val __obj = js.Dynamic.literal()
    if (oidc != null) __obj.updateDynamic("oidc")(oidc)
    __obj.asInstanceOf[Identity]
  }
}

