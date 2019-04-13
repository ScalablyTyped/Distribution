package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShutdownEventConfiguration extends js.Object {
  /**
    * Whether to enable Elastic Load Balancing connection draining. For more information, see Connection Draining 
    */
  var DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.undefined
  /**
    * The time, in seconds, that AWS OpsWorks Stacks will wait after triggering a Shutdown event before shutting down an instance.
    */
  var ExecutionTimeout: js.UndefOr[Integer] = js.undefined
}

object ShutdownEventConfiguration {
  @scala.inline
  def apply(
    DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.undefined,
    ExecutionTimeout: js.UndefOr[Integer] = js.undefined
  ): ShutdownEventConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DelayUntilElbConnectionsDrained)) __obj.updateDynamic("DelayUntilElbConnectionsDrained")(DelayUntilElbConnectionsDrained)
    if (!js.isUndefined(ExecutionTimeout)) __obj.updateDynamic("ExecutionTimeout")(ExecutionTimeout)
    __obj.asInstanceOf[ShutdownEventConfiguration]
  }
}

