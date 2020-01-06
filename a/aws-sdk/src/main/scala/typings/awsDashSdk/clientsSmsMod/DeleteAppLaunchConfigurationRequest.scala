package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppLaunchConfigurationRequest extends js.Object {
  /**
    * ID of the application associated with the launch configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object DeleteAppLaunchConfigurationRequest {
  @scala.inline
  def apply(appId: AppId = null): DeleteAppLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppLaunchConfigurationRequest]
  }
}

