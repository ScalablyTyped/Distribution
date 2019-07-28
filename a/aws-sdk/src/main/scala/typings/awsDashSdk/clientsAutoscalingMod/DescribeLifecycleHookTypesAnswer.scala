package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLifecycleHookTypesAnswer extends js.Object {
  /**
    * The lifecycle hook types.
    */
  var LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
}

object DescribeLifecycleHookTypesAnswer {
  @scala.inline
  def apply(LifecycleHookTypes: AutoScalingNotificationTypes = null): DescribeLifecycleHookTypesAnswer = {
    val __obj = js.Dynamic.literal()
    if (LifecycleHookTypes != null) __obj.updateDynamic("LifecycleHookTypes")(LifecycleHookTypes)
    __obj.asInstanceOf[DescribeLifecycleHookTypesAnswer]
  }
}

