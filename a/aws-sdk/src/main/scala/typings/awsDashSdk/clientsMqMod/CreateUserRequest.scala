package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: __string
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[__boolean] = js.undefined
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[__listOf__string] = js.undefined
  /**
    * Required. The password of the user. This value must be at least 12 characters long, must contain at least 4 unique characters, and must not contain commas.
    */
  var Password: js.UndefOr[__string] = js.undefined
  /**
    * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: __string
}

object CreateUserRequest {
  @scala.inline
  def apply(
    BrokerId: __string,
    Username: __string,
    ConsoleAccess: js.UndefOr[Boolean] = js.undefined,
    Groups: __listOf__string = null,
    Password: __string = null
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId, Username = Username)
    if (!js.isUndefined(ConsoleAccess)) __obj.updateDynamic("ConsoleAccess")(ConsoleAccess)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    __obj.asInstanceOf[CreateUserRequest]
  }
}

