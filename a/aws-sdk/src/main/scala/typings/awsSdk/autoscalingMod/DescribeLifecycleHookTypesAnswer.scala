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
  def apply(LifecycleHookTypes: AutoScalingNotificationTypes = null): DescribeLifecycleHookTypesAnswer = {
    val __obj = js.Dynamic.literal()
    if (LifecycleHookTypes != null) __obj.updateDynamic("LifecycleHookTypes")(LifecycleHookTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLifecycleHookTypesAnswer]
  }
}

