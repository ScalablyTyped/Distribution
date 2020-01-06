package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserPermissionsBoundaryRequest extends js.Object {
  /**
    * The name (friendly name, not ARN) of the IAM user from which you want to remove the permissions boundary.
    */
  var UserName: userNameType = js.native
}

object DeleteUserPermissionsBoundaryRequest {
  @scala.inline
  def apply(UserName: userNameType): DeleteUserPermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserPermissionsBoundaryRequest]
  }
}

