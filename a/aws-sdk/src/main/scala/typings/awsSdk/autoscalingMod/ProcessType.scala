package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessType extends StObject {
  
  /**
    * One of the following processes:    Launch     Terminate     AddToLoadBalancer     AlarmNotification     AZRebalance     HealthCheck     InstanceRefresh     ReplaceUnhealthy     ScheduledActions   
    */
  var ProcessName: XmlStringMaxLen255
}
object ProcessType {
  
  @scala.inline
  def apply(ProcessName: XmlStringMaxLen255): ProcessType = {
    val __obj = js.Dynamic.literal(ProcessName = ProcessName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessType]
  }
  
  @scala.inline
  implicit class ProcessTypeMutableBuilder[Self <: ProcessType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessName(value: XmlStringMaxLen255): Self = StObject.set(x, "ProcessName", value.asInstanceOf[js.Any])
  }
}
