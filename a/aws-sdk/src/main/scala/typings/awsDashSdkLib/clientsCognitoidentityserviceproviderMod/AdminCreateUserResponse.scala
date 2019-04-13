package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminCreateUserResponse extends js.Object {
  /**
    * The newly created user.
    */
  var User: js.UndefOr[UserType] = js.undefined
}

object AdminCreateUserResponse {
  @scala.inline
  def apply(User: UserType = null): AdminCreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[AdminCreateUserResponse]
  }
}

