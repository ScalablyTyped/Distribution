package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroupLaunchConfiguration extends js.Object {
  /**
    * Launch order of servers in the server group.
    */
  var launchOrder: js.UndefOr[LaunchOrder] = js.native
  /**
    * Identifier of the server group the launch configuration is associated with.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  /**
    * Launch configuration for servers in the server group.
    */
  var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations] = js.native
}

object ServerGroupLaunchConfiguration {
  @scala.inline
  def apply(
    launchOrder: Int | Double = null,
    serverGroupId: ServerGroupId = null,
    serverLaunchConfigurations: ServerLaunchConfigurations = null
  ): ServerGroupLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    if (launchOrder != null) __obj.updateDynamic("launchOrder")(launchOrder.asInstanceOf[js.Any])
    if (serverGroupId != null) __obj.updateDynamic("serverGroupId")(serverGroupId.asInstanceOf[js.Any])
    if (serverLaunchConfigurations != null) __obj.updateDynamic("serverLaunchConfigurations")(serverLaunchConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupLaunchConfiguration]
  }
}

