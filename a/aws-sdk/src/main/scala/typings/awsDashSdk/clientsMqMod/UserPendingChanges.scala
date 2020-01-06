package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPendingChanges extends js.Object {
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[__boolean] = js.native
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[__listOf__string] = js.native
  /**
    * Required. The type of change pending for the ActiveMQ user.
    */
  var PendingChange: js.UndefOr[ChangeType] = js.native
}

object UserPendingChanges {
  @scala.inline
  def apply(
    ConsoleAccess: js.UndefOr[Boolean] = js.undefined,
    Groups: __listOf__string = null,
    PendingChange: ChangeType = null
  ): UserPendingChanges = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConsoleAccess)) __obj.updateDynamic("ConsoleAccess")(ConsoleAccess.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (PendingChange != null) __obj.updateDynamic("PendingChange")(PendingChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPendingChanges]
  }
}

