package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplicitDeny extends js.Object {
  /**
    * The policies that denied the authorization.
    */
  var policies: js.UndefOr[Policies] = js.undefined
}

object ExplicitDeny {
  @scala.inline
  def apply(policies: Policies = null): ExplicitDeny = {
    val __obj = js.Dynamic.literal()
    if (policies != null) __obj.updateDynamic("policies")(policies)
    __obj.asInstanceOf[ExplicitDeny]
  }
}

