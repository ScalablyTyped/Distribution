package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserProfileRequest extends js.Object {
  /**
    * The user's IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String
}

object DeleteUserProfileRequest {
  @scala.inline
  def apply(IamUserArn: String): DeleteUserProfileRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn)
  
    __obj.asInstanceOf[DeleteUserProfileRequest]
  }
}

