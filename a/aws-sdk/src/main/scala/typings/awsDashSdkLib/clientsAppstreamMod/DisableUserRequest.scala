package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableUserRequest extends js.Object {
  /**
    * The authentication type for the user. You must specify USERPOOL.
    */
  var AuthenticationType: awsDashSdkLib.clientsAppstreamMod.AuthenticationType
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. 
    */
  var UserName: Username
}

object DisableUserRequest {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, UserName: Username): DisableUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName)
  
    __obj.asInstanceOf[DisableUserRequest]
  }
}

