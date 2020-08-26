package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExitStandbyQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceIds] = js.native
}

object ExitStandbyQuery {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): ExitStandbyQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitStandbyQuery]
  }
  @scala.inline
  implicit class ExitStandbyQueryOps[Self <: ExitStandbyQuery] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceIdsVarargs(value: XmlStringMaxLen19*): Self = this.set("InstanceIds", js.Array(value :_*))
    @scala.inline
    def setInstanceIds(value: InstanceIds): Self = this.set("InstanceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceIds: Self = this.set("InstanceIds", js.undefined)
  }
  
}

