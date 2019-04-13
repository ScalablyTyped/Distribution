package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupLaunchConfiguration extends js.Object {
  /**
    * Launch order of servers in the server group.
    */
  var launchOrder: js.UndefOr[LaunchOrder] = js.undefined
  /**
    * Identifier of the server group the launch configuration is associated with.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
  /**
    * Launch configuration for servers in the server group.
    */
  var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations] = js.undefined
}

object ServerGroupLaunchConfiguration {
  @scala.inline
  def apply(
    launchOrder: js.UndefOr[LaunchOrder] = js.undefined,
    serverGroupId: ServerGroupId = null,
    serverLaunchConfigurations: ServerLaunchConfigurations = null
  ): ServerGroupLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(launchOrder)) __obj.updateDynamic("launchOrder")(launchOrder)
    if (serverGroupId != null) __obj.updateDynamic("serverGroupId")(serverGroupId)
    if (serverLaunchConfigurations != null) __obj.updateDynamic("serverLaunchConfigurations")(serverLaunchConfigurations)
    __obj.asInstanceOf[ServerGroupLaunchConfiguration]
  }
}

