package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingProcessQuery extends StObject {
  
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
  implicit class ScalingProcessQueryMutableBuilder[Self <: ScalingProcessQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingProcesses(value: ProcessNames): Self = StObject.set(x, "ScalingProcesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingProcessesUndefined: Self = StObject.set(x, "ScalingProcesses", js.undefined)
    
    @scala.inline
    def setScalingProcessesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "ScalingProcesses", js.Array(value :_*))
  }
}
