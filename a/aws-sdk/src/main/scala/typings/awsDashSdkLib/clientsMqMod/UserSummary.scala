package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSummary extends js.Object {
  /**
    * The type of change pending for the ActiveMQ user.
    */
  var PendingChange: js.UndefOr[ChangeType] = js.undefined
  /**
    * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: js.UndefOr[__string] = js.undefined
}

object UserSummary {
  @scala.inline
  def apply(PendingChange: ChangeType = null, Username: __string = null): UserSummary = {
    val __obj = js.Dynamic.literal()
    if (PendingChange != null) __obj.updateDynamic("PendingChange")(PendingChange.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[UserSummary]
  }
}

