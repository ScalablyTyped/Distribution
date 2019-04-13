package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateServiceRoleToAccountRequest extends js.Object {
  /**
    * The ARN of the service role you wish to associate with your account.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
}

object AssociateServiceRoleToAccountRequest {
  @scala.inline
  def apply(RoleArn: __string = null): AssociateServiceRoleToAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[AssociateServiceRoleToAccountRequest]
  }
}

