package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAssociatedRoleResponse extends js.Object {
  /**
    * The time when the role was associated with the group.
    */
  var AssociatedAt: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the role that is associated with the group.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
}

object GetAssociatedRoleResponse {
  @scala.inline
  def apply(AssociatedAt: __string = null, RoleArn: __string = null): GetAssociatedRoleResponse = {
    val __obj = js.Dynamic.literal()
    if (AssociatedAt != null) __obj.updateDynamic("AssociatedAt")(AssociatedAt)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[GetAssociatedRoleResponse]
  }
}

