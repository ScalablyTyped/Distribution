package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEnvironmentMembershipResult extends js.Object {
  /**
    * Information about the environment member that was added.
    */
  var membership: js.UndefOr[EnvironmentMember] = js.undefined
}

object CreateEnvironmentMembershipResult {
  @scala.inline
  def apply(membership: EnvironmentMember = null): CreateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal()
    if (membership != null) __obj.updateDynamic("membership")(membership)
    __obj.asInstanceOf[CreateEnvironmentMembershipResult]
  }
}

