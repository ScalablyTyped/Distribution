package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppLaunchConfigurationRequest extends js.Object {
  /**
    * ID of the application launch configuration.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}

object GetAppLaunchConfigurationRequest {
  @scala.inline
  def apply(appId: AppId = null): GetAppLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    __obj.asInstanceOf[GetAppLaunchConfigurationRequest]
  }
}

