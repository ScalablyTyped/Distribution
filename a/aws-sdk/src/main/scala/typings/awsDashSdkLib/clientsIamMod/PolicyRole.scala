package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyRole extends js.Object {
  /**
    * The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var RoleId: js.UndefOr[idType] = js.undefined
  /**
    * The name (friendly name, not ARN) identifying the role.
    */
  var RoleName: js.UndefOr[roleNameType] = js.undefined
}

object PolicyRole {
  @scala.inline
  def apply(RoleId: idType = null, RoleName: roleNameType = null): PolicyRole = {
    val __obj = js.Dynamic.literal()
    if (RoleId != null) __obj.updateDynamic("RoleId")(RoleId)
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName)
    __obj.asInstanceOf[PolicyRole]
  }
}

