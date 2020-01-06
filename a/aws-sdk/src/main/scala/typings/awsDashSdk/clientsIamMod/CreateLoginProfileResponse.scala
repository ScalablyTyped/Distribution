package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoginProfileResponse extends js.Object {
  /**
    * A structure containing the user name and password create date.
    */
  var LoginProfile: typings.awsDashSdk.clientsIamMod.LoginProfile = js.native
}

object CreateLoginProfileResponse {
  @scala.inline
  def apply(LoginProfile: LoginProfile): CreateLoginProfileResponse = {
    val __obj = js.Dynamic.literal(LoginProfile = LoginProfile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateLoginProfileResponse]
  }
}

