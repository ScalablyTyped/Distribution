package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowed extends js.Object {
  /**
    * A list of policies that allowed the authentication.
    */
  var policies: js.UndefOr[Policies] = js.native
}

object Allowed {
  @scala.inline
  def apply(policies: Policies = null): Allowed = {
    val __obj = js.Dynamic.literal()
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowed]
  }
}

