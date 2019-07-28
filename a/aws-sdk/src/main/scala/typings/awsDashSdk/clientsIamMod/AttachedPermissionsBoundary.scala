package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachedPermissionsBoundary extends js.Object {
  /**
    *  The ARN of the policy used to set the permissions boundary for the user or role.
    */
  var PermissionsBoundaryArn: js.UndefOr[arnType] = js.undefined
  /**
    *  The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary for an entity. This data type can only have a value of Policy.
    */
  var PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType] = js.undefined
}

object AttachedPermissionsBoundary {
  @scala.inline
  def apply(
    PermissionsBoundaryArn: arnType = null,
    PermissionsBoundaryType: PermissionsBoundaryAttachmentType = null
  ): AttachedPermissionsBoundary = {
    val __obj = js.Dynamic.literal()
    if (PermissionsBoundaryArn != null) __obj.updateDynamic("PermissionsBoundaryArn")(PermissionsBoundaryArn)
    if (PermissionsBoundaryType != null) __obj.updateDynamic("PermissionsBoundaryType")(PermissionsBoundaryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedPermissionsBoundary]
  }
}

