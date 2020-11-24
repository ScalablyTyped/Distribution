package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingProcessQuery extends js.Object {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * One or more of the following processes:    Launch     Terminate     AddToLoadBalancer     AlarmNotification     AZRebalance     HealthCheck     InstanceRefresh     ReplaceUnhealthy     ScheduledActions    If you omit this parameter, all processes are specified.
    */
  var ScalingProcesses: js.UndefOr[ProcessNames] = js.native
}
object ScalingProcessQuery {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): ScalingProcessQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingProcessQuery]
  }
  
  @scala.inline
  implicit class ScalingProcessQueryOps[Self <: ScalingProcessQuery] (val x: Self) extends AnyVal {
    
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
    def setScalingProcessesVarargs(value: XmlStringMaxLen255*): Self = this.set("ScalingProcesses", js.Array(value :_*))
    
    @scala.inline
    def setScalingProcesses(value: ProcessNames): Self = this.set("ScalingProcesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingProcesses: Self = this.set("ScalingProcesses", js.undefined)
  }
}
