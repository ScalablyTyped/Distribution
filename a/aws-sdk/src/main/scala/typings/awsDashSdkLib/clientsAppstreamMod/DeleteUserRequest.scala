package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserRequest extends js.Object {
  /**
    * The authentication type for the user. You must specify USERPOOL.
    */
  var AuthenticationType: awsDashSdkLib.clientsAppstreamMod.AuthenticationType
  /**
    * The email address of the user.
    */
  var UserName: Username
}

object DeleteUserRequest {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, UserName: Username): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName)
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

