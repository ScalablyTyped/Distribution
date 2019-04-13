package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserPermissionsBoundaryRequest extends js.Object {
  /**
    * The name (friendly name, not ARN) of the IAM user from which you want to remove the permissions boundary.
    */
  var UserName: userNameType
}

object DeleteUserPermissionsBoundaryRequest {
  @scala.inline
  def apply(UserName: userNameType): DeleteUserPermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName)
  
    __obj.asInstanceOf[DeleteUserPermissionsBoundaryRequest]
  }
}

