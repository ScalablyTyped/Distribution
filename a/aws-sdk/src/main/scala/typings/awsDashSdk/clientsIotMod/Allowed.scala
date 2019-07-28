package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allowed extends js.Object {
  /**
    * A list of policies that allowed the authentication.
    */
  var policies: js.UndefOr[Policies] = js.undefined
}

object Allowed {
  @scala.inline
  def apply(policies: Policies = null): Allowed = {
    val __obj = js.Dynamic.literal()
    if (policies != null) __obj.updateDynamic("policies")(policies)
    __obj.asInstanceOf[Allowed]
  }
}

