package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRoleRequest extends js.Object {
  /**
    * The new description that you want to apply to the specified role.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.undefined
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours. Anyone who assumes the role from the AWS CLI or API can use the DurationSeconds API parameter or the duration-seconds CLI parameter to request a longer session. The MaxSessionDuration setting determines the maximum duration that can be requested using the DurationSeconds parameter. If users don't specify a value for the DurationSeconds parameter, their security credentials are valid for one hour by default. This applies when you use the AssumeRole* API operations or the assume-role* CLI operations but does not apply when you use those operations to create a console URL. For more information, see Using IAM Roles in the IAM User Guide.
    */
  var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined
  /**
    * The name of the role that you want to modify.
    */
  var RoleName: roleNameType
}

object UpdateRoleRequest {
  @scala.inline
  def apply(
    RoleName: roleNameType,
    Description: roleDescriptionType = null,
    MaxSessionDuration: Int | Double = null
  ): UpdateRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (MaxSessionDuration != null) __obj.updateDynamic("MaxSessionDuration")(MaxSessionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleRequest]
  }
}

