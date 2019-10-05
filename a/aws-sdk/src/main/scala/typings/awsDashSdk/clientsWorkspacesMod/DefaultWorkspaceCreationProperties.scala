package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultWorkspaceCreationProperties extends js.Object {
  /**
    * The identifier of any security groups to apply to WorkSpaces when they are created.
    */
  var CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined
  /**
    * The organizational unit (OU) in the directory for the WorkSpace machine accounts.
    */
  var DefaultOu: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.DefaultOu] = js.undefined
  /**
    * The public IP address to attach to all WorkSpaces that are created or rebuilt.
    */
  var EnableInternetAccess: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Specifies whether the directory is enabled for Amazon WorkDocs.
    */
  var EnableWorkDocs: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Specifies whether the WorkSpace user is an administrator on the WorkSpace.
    */
  var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.undefined
}

object DefaultWorkspaceCreationProperties {
  @scala.inline
  def apply(
    CustomSecurityGroupId: SecurityGroupId = null,
    DefaultOu: DefaultOu = null,
    EnableInternetAccess: js.UndefOr[Boolean] = js.undefined,
    EnableWorkDocs: js.UndefOr[Boolean] = js.undefined,
    UserEnabledAsLocalAdministrator: js.UndefOr[Boolean] = js.undefined
  ): DefaultWorkspaceCreationProperties = {
    val __obj = js.Dynamic.literal()
    if (CustomSecurityGroupId != null) __obj.updateDynamic("CustomSecurityGroupId")(CustomSecurityGroupId)
    if (DefaultOu != null) __obj.updateDynamic("DefaultOu")(DefaultOu)
    if (!js.isUndefined(EnableInternetAccess)) __obj.updateDynamic("EnableInternetAccess")(EnableInternetAccess)
    if (!js.isUndefined(EnableWorkDocs)) __obj.updateDynamic("EnableWorkDocs")(EnableWorkDocs)
    if (!js.isUndefined(UserEnabledAsLocalAdministrator)) __obj.updateDynamic("UserEnabledAsLocalAdministrator")(UserEnabledAsLocalAdministrator)
    __obj.asInstanceOf[DefaultWorkspaceCreationProperties]
  }
}

