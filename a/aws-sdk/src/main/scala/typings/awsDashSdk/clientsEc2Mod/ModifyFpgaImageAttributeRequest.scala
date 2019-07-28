package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyFpgaImageAttributeRequest extends js.Object {
  /**
    * The name of the attribute.
    */
  var Attribute: js.UndefOr[FpgaImageAttributeName] = js.undefined
  /**
    * A description for the AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: String
  /**
    * The load permission for the AFI.
    */
  var LoadPermission: js.UndefOr[LoadPermissionModifications] = js.undefined
  /**
    * A name for the AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The operation type.
    */
  var OperationType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.OperationType] = js.undefined
  /**
    * The product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid only when modifying the productCodes attribute.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.undefined
  /**
    * The user groups. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.undefined
  /**
    * The AWS account IDs. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.undefined
}

object ModifyFpgaImageAttributeRequest {
  @scala.inline
  def apply(
    FpgaImageId: String,
    Attribute: FpgaImageAttributeName = null,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    LoadPermission: LoadPermissionModifications = null,
    Name: String = null,
    OperationType: OperationType = null,
    ProductCodes: ProductCodeStringList = null,
    UserGroups: UserGroupStringList = null,
    UserIds: UserIdStringList = null
  ): ModifyFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId)
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (LoadPermission != null) __obj.updateDynamic("LoadPermission")(LoadPermission)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OperationType != null) __obj.updateDynamic("OperationType")(OperationType.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (UserGroups != null) __obj.updateDynamic("UserGroups")(UserGroups)
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds)
    __obj.asInstanceOf[ModifyFpgaImageAttributeRequest]
  }
}

