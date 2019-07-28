package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAppLaunchConfigurationRequest extends js.Object {
  /**
    * ID of the application associated with the launch configuration.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  /**
    * Name of service role in the customer's account that Amazon CloudFormation uses to launch the application.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  /**
    * Launch configurations for server groups in the application.
    */
  var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined
}

object PutAppLaunchConfigurationRequest {
  @scala.inline
  def apply(
    appId: AppId = null,
    roleName: RoleName = null,
    serverGroupLaunchConfigurations: ServerGroupLaunchConfigurations = null
  ): PutAppLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (roleName != null) __obj.updateDynamic("roleName")(roleName)
    if (serverGroupLaunchConfigurations != null) __obj.updateDynamic("serverGroupLaunchConfigurations")(serverGroupLaunchConfigurations)
    __obj.asInstanceOf[PutAppLaunchConfigurationRequest]
  }
}

