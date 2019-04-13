package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyUser extends js.Object {
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var UserId: js.UndefOr[idType] = js.undefined
  /**
    * The name (friendly name, not ARN) identifying the user.
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
}

object PolicyUser {
  @scala.inline
  def apply(UserId: idType = null, UserName: userNameType = null): PolicyUser = {
    val __obj = js.Dynamic.literal()
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[PolicyUser]
  }
}

