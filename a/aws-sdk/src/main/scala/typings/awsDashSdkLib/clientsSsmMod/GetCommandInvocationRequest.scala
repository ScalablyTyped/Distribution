package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommandInvocationRequest extends js.Object {
  /**
    * (Required) The parent command ID of the invocation plugin.
    */
  var CommandId: awsDashSdkLib.clientsSsmMod.CommandId
  /**
    * (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.
    */
  var InstanceId: awsDashSdkLib.clientsSsmMod.InstanceId
  /**
    * (Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.
    */
  var PluginName: js.UndefOr[CommandPluginName] = js.undefined
}

object GetCommandInvocationRequest {
  @scala.inline
  def apply(CommandId: CommandId, InstanceId: InstanceId, PluginName: CommandPluginName = null): GetCommandInvocationRequest = {
    val __obj = js.Dynamic.literal(CommandId = CommandId, InstanceId = InstanceId)
    if (PluginName != null) __obj.updateDynamic("PluginName")(PluginName)
    __obj.asInstanceOf[GetCommandInvocationRequest]
  }
}

