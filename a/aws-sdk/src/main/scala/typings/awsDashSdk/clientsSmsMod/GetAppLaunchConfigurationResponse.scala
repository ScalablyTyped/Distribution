package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppLaunchConfigurationResponse extends js.Object {
  /**
    * ID of the application associated with the launch configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Name of the service role in the customer's account that Amazon CloudFormation uses to launch the application.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * List of launch configurations for server groups in this application.
    */
  var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.native
}

object GetAppLaunchConfigurationResponse {
  @scala.inline
  def apply(
    appId: AppId = null,
    roleName: RoleName = null,
    serverGroupLaunchConfigurations: ServerGroupLaunchConfigurations = null
  ): GetAppLaunchConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (serverGroupLaunchConfigurations != null) __obj.updateDynamic("serverGroupLaunchConfigurations")(serverGroupLaunchConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppLaunchConfigurationResponse]
  }
}

