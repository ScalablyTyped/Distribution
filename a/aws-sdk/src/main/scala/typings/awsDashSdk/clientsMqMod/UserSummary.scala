package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSummary extends js.Object {
  /**
    * The type of change pending for the ActiveMQ user.
    */
  var PendingChange: js.UndefOr[ChangeType] = js.native
  /**
    * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: js.UndefOr[__string] = js.native
}

object UserSummary {
  @scala.inline
  def apply(PendingChange: ChangeType = null, Username: __string = null): UserSummary = {
    val __obj = js.Dynamic.literal()
    if (PendingChange != null) __obj.updateDynamic("PendingChange")(PendingChange.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSummary]
  }
}

