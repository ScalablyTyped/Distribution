package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateServiceRoleToAccountRequest extends js.Object {
  /**
    * The ARN of the service role you wish to associate with your account.
    */
  var RoleArn: __string
}

object AssociateServiceRoleToAccountRequest {
  @scala.inline
  def apply(RoleArn: __string): AssociateServiceRoleToAccountRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn)
  
    __obj.asInstanceOf[AssociateServiceRoleToAccountRequest]
  }
}

