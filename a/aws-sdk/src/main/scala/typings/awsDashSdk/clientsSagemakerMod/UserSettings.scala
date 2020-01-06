package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSettings extends js.Object {
  /**
    * The execution role for the user.
    */
  var ExecutionRole: js.UndefOr[RoleArn] = js.native
  /**
    * The Jupyter server's app settings.
    */
  var JupyterServerAppSettings: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.JupyterServerAppSettings] = js.native
  /**
    * The kernel gateway app settings.
    */
  var KernelGatewayAppSettings: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.KernelGatewayAppSettings] = js.native
  /**
    * The security groups.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.native
  /**
    * The sharing settings.
    */
  var SharingSettings: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SharingSettings] = js.native
  /**
    * The TensorBoard app settings.
    */
  var TensorBoardAppSettings: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TensorBoardAppSettings] = js.native
}

object UserSettings {
  @scala.inline
  def apply(
    ExecutionRole: RoleArn = null,
    JupyterServerAppSettings: JupyterServerAppSettings = null,
    KernelGatewayAppSettings: KernelGatewayAppSettings = null,
    SecurityGroups: SecurityGroupIds = null,
    SharingSettings: SharingSettings = null,
    TensorBoardAppSettings: TensorBoardAppSettings = null
  ): UserSettings = {
    val __obj = js.Dynamic.literal()
    if (ExecutionRole != null) __obj.updateDynamic("ExecutionRole")(ExecutionRole.asInstanceOf[js.Any])
    if (JupyterServerAppSettings != null) __obj.updateDynamic("JupyterServerAppSettings")(JupyterServerAppSettings.asInstanceOf[js.Any])
    if (KernelGatewayAppSettings != null) __obj.updateDynamic("KernelGatewayAppSettings")(KernelGatewayAppSettings.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (SharingSettings != null) __obj.updateDynamic("SharingSettings")(SharingSettings.asInstanceOf[js.Any])
    if (TensorBoardAppSettings != null) __obj.updateDynamic("TensorBoardAppSettings")(TensorBoardAppSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSettings]
  }
}

