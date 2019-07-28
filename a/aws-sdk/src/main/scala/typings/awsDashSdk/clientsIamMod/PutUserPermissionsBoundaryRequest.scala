package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutUserPermissionsBoundaryRequest extends js.Object {
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  var PermissionsBoundary: arnType
  /**
    * The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
    */
  var UserName: userNameType
}

object PutUserPermissionsBoundaryRequest {
  @scala.inline
  def apply(PermissionsBoundary: arnType, UserName: userNameType): PutUserPermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(PermissionsBoundary = PermissionsBoundary, UserName = UserName)
  
    __obj.asInstanceOf[PutUserPermissionsBoundaryRequest]
  }
}

