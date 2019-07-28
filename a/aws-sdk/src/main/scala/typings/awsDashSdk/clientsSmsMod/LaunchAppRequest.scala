package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchAppRequest extends js.Object {
  /**
    * ID of the application to launch.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}

object LaunchAppRequest {
  @scala.inline
  def apply(appId: AppId = null): LaunchAppRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    __obj.asInstanceOf[LaunchAppRequest]
  }
}

