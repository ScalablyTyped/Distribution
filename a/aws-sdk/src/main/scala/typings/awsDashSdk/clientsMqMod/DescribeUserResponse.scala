package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserResponse extends js.Object {
  /**
    * Required. The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[__string] = js.undefined
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[__boolean] = js.undefined
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The status of the changes pending for the ActiveMQ user.
    */
  var Pending: js.UndefOr[UserPendingChanges] = js.undefined
  /**
    * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: js.UndefOr[__string] = js.undefined
}

object DescribeUserResponse {
  @scala.inline
  def apply(
    BrokerId: __string = null,
    ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
    Groups: __listOf__string = null,
    Pending: UserPendingChanges = null,
    Username: __string = null
  ): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId)
    if (!js.isUndefined(ConsoleAccess)) __obj.updateDynamic("ConsoleAccess")(ConsoleAccess)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (Pending != null) __obj.updateDynamic("Pending")(Pending)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[DescribeUserResponse]
  }
}

