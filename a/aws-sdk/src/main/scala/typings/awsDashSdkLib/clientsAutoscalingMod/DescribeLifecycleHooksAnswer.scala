package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLifecycleHooksAnswer extends js.Object {
  /**
    * The lifecycle hooks for the specified group.
    */
  var LifecycleHooks: js.UndefOr[LifecycleHooks] = js.undefined
}

object DescribeLifecycleHooksAnswer {
  @scala.inline
  def apply(LifecycleHooks: LifecycleHooks = null): DescribeLifecycleHooksAnswer = {
    val __obj = js.Dynamic.literal()
    if (LifecycleHooks != null) __obj.updateDynamic("LifecycleHooks")(LifecycleHooks)
    __obj.asInstanceOf[DescribeLifecycleHooksAnswer]
  }
}

