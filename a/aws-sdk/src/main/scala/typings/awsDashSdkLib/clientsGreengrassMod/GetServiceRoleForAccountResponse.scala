package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceRoleForAccountResponse extends js.Object {
  /**
    * The time when the service role was associated with the account.
    */
  var AssociatedAt: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the role which is associated with the account.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
}

object GetServiceRoleForAccountResponse {
  @scala.inline
  def apply(AssociatedAt: __string = null, RoleArn: __string = null): GetServiceRoleForAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (AssociatedAt != null) __obj.updateDynamic("AssociatedAt")(AssociatedAt)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[GetServiceRoleForAccountResponse]
  }
}

