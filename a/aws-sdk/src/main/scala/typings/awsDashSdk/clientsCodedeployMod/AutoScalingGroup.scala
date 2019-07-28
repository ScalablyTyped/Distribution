package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingGroup extends js.Object {
  /**
    * An Auto Scaling lifecycle event hook name.
    */
  var hook: js.UndefOr[AutoScalingGroupHook] = js.undefined
  /**
    * The Auto Scaling group name.
    */
  var name: js.UndefOr[AutoScalingGroupName] = js.undefined
}

object AutoScalingGroup {
  @scala.inline
  def apply(hook: AutoScalingGroupHook = null, name: AutoScalingGroupName = null): AutoScalingGroup = {
    val __obj = js.Dynamic.literal()
    if (hook != null) __obj.updateDynamic("hook")(hook)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AutoScalingGroup]
  }
}

