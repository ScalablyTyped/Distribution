package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutUserPermissionsBoundaryRequest extends js.Object {
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  var PermissionsBoundary: arnType = js.native
  /**
    * The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
    */
  var UserName: userNameType = js.native
}

object PutUserPermissionsBoundaryRequest {
  @scala.inline
  def apply(PermissionsBoundary: arnType, UserName: userNameType): PutUserPermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(PermissionsBoundary = PermissionsBoundary.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutUserPermissionsBoundaryRequest]
  }
}

