package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLifecycleHookTypesAnswer extends js.Object {
  /**
    * The lifecycle hook types.
    */
  var LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes] = js.native
}

object DescribeLifecycleHookTypesAnswer {
  @scala.inline
  def apply(): DescribeLifecycleHookTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLifecycleHookTypesAnswer]
  }
  @scala.inline
  implicit class DescribeLifecycleHookTypesAnswerOps[Self <: DescribeLifecycleHookTypesAnswer] (val x: Self) extends AnyVal {
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
    def setLifecycleHookTypesVarargs(value: XmlStringMaxLen255*): Self = this.set("LifecycleHookTypes", js.Array(value :_*))
    @scala.inline
    def setLifecycleHookTypes(value: AutoScalingNotificationTypes): Self = this.set("LifecycleHookTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleHookTypes: Self = this.set("LifecycleHookTypes", js.undefined)
  }
  
}

