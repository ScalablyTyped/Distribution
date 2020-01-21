package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLifecycleHooksAnswer extends js.Object {
  /**
    * The lifecycle hooks for the specified group.
    */
  var LifecycleHooks: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleHooks] = js.native
}

object DescribeLifecycleHooksAnswer {
  @scala.inline
  def apply(LifecycleHooks: LifecycleHooks = null): DescribeLifecycleHooksAnswer = {
    val __obj = js.Dynamic.literal()
    if (LifecycleHooks != null) __obj.updateDynamic("LifecycleHooks")(LifecycleHooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLifecycleHooksAnswer]
  }
}

