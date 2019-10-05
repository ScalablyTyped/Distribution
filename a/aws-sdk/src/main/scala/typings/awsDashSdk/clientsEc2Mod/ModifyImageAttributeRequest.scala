package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyImageAttributeRequest extends js.Object {
  /**
    * The name of the attribute to modify. The valid values are description, launchPermission, and productCodes.
    */
  var Attribute: js.UndefOr[String] = js.undefined
  /**
    * A new description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the AMI.
    */
  var ImageId: String
  /**
    * A new launch permission for the AMI.
    */
  var LaunchPermission: js.UndefOr[LaunchPermissionModifications] = js.undefined
  /**
    * The operation type. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var OperationType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.OperationType] = js.undefined
  /**
    * The DevPay product codes. After you add a product code to an AMI, it can't be removed.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.undefined
  /**
    * The user groups. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.undefined
  /**
    * The AWS account IDs. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.undefined
  /**
    * The value of the attribute being modified. This parameter can be used only when the Attribute parameter is description or productCodes.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object ModifyImageAttributeRequest {
  @scala.inline
  def apply(
    ImageId: String,
    Attribute: String = null,
    Description: AttributeValue = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LaunchPermission: LaunchPermissionModifications = null,
    OperationType: OperationType = null,
    ProductCodes: ProductCodeStringList = null,
    UserGroups: UserGroupStringList = null,
    UserIds: UserIdStringList = null,
    Value: String = null
  ): ModifyImageAttributeRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId)
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (LaunchPermission != null) __obj.updateDynamic("LaunchPermission")(LaunchPermission)
    if (OperationType != null) __obj.updateDynamic("OperationType")(OperationType.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (UserGroups != null) __obj.updateDynamic("UserGroups")(UserGroups)
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ModifyImageAttributeRequest]
  }
}

