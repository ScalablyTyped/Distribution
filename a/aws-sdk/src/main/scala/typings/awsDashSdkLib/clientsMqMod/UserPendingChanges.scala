package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPendingChanges extends js.Object {
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[__boolean] = js.undefined
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[__listOf__string] = js.undefined
  /**
    * Required. The type of change pending for the ActiveMQ user.
    */
  var PendingChange: js.UndefOr[ChangeType] = js.undefined
}

object UserPendingChanges {
  @scala.inline
  def apply(
    ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
    Groups: __listOf__string = null,
    PendingChange: ChangeType = null
  ): UserPendingChanges = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConsoleAccess)) __obj.updateDynamic("ConsoleAccess")(ConsoleAccess)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (PendingChange != null) __obj.updateDynamic("PendingChange")(PendingChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPendingChanges]
  }
}

