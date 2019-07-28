package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEnvironmentMembershipResult extends js.Object {
  /**
    * Information about the environment member whose settings were changed.
    */
  var membership: js.UndefOr[EnvironmentMember] = js.undefined
}

object UpdateEnvironmentMembershipResult {
  @scala.inline
  def apply(membership: EnvironmentMember = null): UpdateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal()
    if (membership != null) __obj.updateDynamic("membership")(membership)
    __obj.asInstanceOf[UpdateEnvironmentMembershipResult]
  }
}

