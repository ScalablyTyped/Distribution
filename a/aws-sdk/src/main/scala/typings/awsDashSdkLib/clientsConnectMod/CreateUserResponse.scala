package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user account created.
    */
  var UserArn: js.UndefOr[ARN] = js.undefined
  /**
    * The unique identifier for the user account in Amazon Connect
    */
  var UserId: js.UndefOr[UserId] = js.undefined
}

object CreateUserResponse {
  @scala.inline
  def apply(UserArn: ARN = null, UserId: UserId = null): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn)
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    __obj.asInstanceOf[CreateUserResponse]
  }
}

