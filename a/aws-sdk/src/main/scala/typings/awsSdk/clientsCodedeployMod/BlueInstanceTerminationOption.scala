package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueInstanceTerminationOption extends StObject {
  
  /**
    * The action to take on instances in the original environment after a successful blue/green deployment.    TERMINATE: Instances are terminated after a specified wait time.    KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.  
    */
  var action: js.UndefOr[InstanceAction] = js.undefined
  
  /**
    * For an Amazon EC2 deployment, the number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.  For an Amazon ECS deployment, the number of minutes before deleting the original (blue) task set. During an Amazon ECS deployment, CodeDeploy shifts traffic from the original (blue) task set to a replacement (green) task set.   The maximum setting is 2880 minutes (2 days). 
    */
  var terminationWaitTimeInMinutes: js.UndefOr[Duration] = js.undefined
}
object BlueInstanceTerminationOption {
  
  inline def apply(): BlueInstanceTerminationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueInstanceTerminationOption]
  }
  
  extension [Self <: BlueInstanceTerminationOption](x: Self) {
    
    inline def setAction(value: InstanceAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setTerminationWaitTimeInMinutes(value: Duration): Self = StObject.set(x, "terminationWaitTimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTerminationWaitTimeInMinutesUndefined: Self = StObject.set(x, "terminationWaitTimeInMinutes", js.undefined)
  }
}
