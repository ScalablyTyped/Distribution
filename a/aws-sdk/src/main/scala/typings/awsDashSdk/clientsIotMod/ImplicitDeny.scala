package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplicitDeny extends js.Object {
  /**
    * Policies that don't contain a matching allow or deny statement for the specified action on the specified resource. 
    */
  var policies: js.UndefOr[Policies] = js.undefined
}

object ImplicitDeny {
  @scala.inline
  def apply(policies: Policies = null): ImplicitDeny = {
    val __obj = js.Dynamic.literal()
    if (policies != null) __obj.updateDynamic("policies")(policies)
    __obj.asInstanceOf[ImplicitDeny]
  }
}

