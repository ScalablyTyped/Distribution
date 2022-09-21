package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingProcessQuery extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * One or more of the following processes:    Launch     Terminate     AddToLoadBalancer     AlarmNotification     AZRebalance     HealthCheck     InstanceRefresh     ReplaceUnhealthy     ScheduledActions    If you omit this property, all processes are specified.
    */
  var ScalingProcesses: js.UndefOr[ProcessNames] = js.undefined
}
object ScalingProcessQuery {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): ScalingProcessQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingProcessQuery]
  }
  
  extension [Self <: ScalingProcessQuery](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setScalingProcesses(value: ProcessNames): Self = StObject.set(x, "ScalingProcesses", value.asInstanceOf[js.Any])
    
    inline def setScalingProcessesUndefined: Self = StObject.set(x, "ScalingProcesses", js.undefined)
    
    inline def setScalingProcessesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "ScalingProcesses", js.Array(value*))
  }
}
