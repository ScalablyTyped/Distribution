package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoginProfileResponse extends js.Object {
  /**
    * A structure containing the user name and password create date for the user.
    */
  var LoginProfile: typings.awsDashSdk.clientsIamMod.LoginProfile
}

object GetLoginProfileResponse {
  @scala.inline
  def apply(LoginProfile: LoginProfile): GetLoginProfileResponse = {
    val __obj = js.Dynamic.literal(LoginProfile = LoginProfile)
  
    __obj.asInstanceOf[GetLoginProfileResponse]
  }
}

