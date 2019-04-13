package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePasswordRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType
  /**
    * The old password.
    */
  var PreviousPassword: PasswordType
  /**
    * The new password.
    */
  var ProposedPassword: PasswordType
}

object ChangePasswordRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, PreviousPassword: PasswordType, ProposedPassword: PasswordType): ChangePasswordRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken, PreviousPassword = PreviousPassword, ProposedPassword = ProposedPassword)
  
    __obj.asInstanceOf[ChangePasswordRequest]
  }
}

