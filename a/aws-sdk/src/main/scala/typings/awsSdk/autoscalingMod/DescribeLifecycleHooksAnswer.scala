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
  def apply(): DescribeLifecycleHooksAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLifecycleHooksAnswer]
  }
  @scala.inline
  implicit class DescribeLifecycleHooksAnswerOps[Self <: DescribeLifecycleHooksAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLifecycleHooksVarargs(value: LifecycleHook*): Self = this.set("LifecycleHooks", js.Array(value :_*))
    @scala.inline
    def setLifecycleHooks(value: LifecycleHooks): Self = this.set("LifecycleHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleHooks: Self = this.set("LifecycleHooks", js.undefined)
  }
  
}

