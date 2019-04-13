package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAppRequest extends js.Object {
  /**
    * ID of the application to delete.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  /**
    * While deleting the application, stop all replication jobs corresponding to the servers in the application.
    */
  var forceStopAppReplication: js.UndefOr[ForceStopAppReplication] = js.undefined
  /**
    * While deleting the application, terminate the stack corresponding to the application.
    */
  var forceTerminateApp: js.UndefOr[ForceTerminateApp] = js.undefined
}

object DeleteAppRequest {
  @scala.inline
  def apply(
    appId: AppId = null,
    forceStopAppReplication: js.UndefOr[ForceStopAppReplication] = js.undefined,
    forceTerminateApp: js.UndefOr[ForceTerminateApp] = js.undefined
  ): DeleteAppRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (!js.isUndefined(forceStopAppReplication)) __obj.updateDynamic("forceStopAppReplication")(forceStopAppReplication)
    if (!js.isUndefined(forceTerminateApp)) __obj.updateDynamic("forceTerminateApp")(forceTerminateApp)
    __obj.asInstanceOf[DeleteAppRequest]
  }
}

