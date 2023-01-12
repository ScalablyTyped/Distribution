package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeploymentGroupOutput extends StObject {
  
  /**
    * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group, CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group. If the output contains data, CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group.
    */
  var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined
}
object DeleteDeploymentGroupOutput {
  
  inline def apply(): DeleteDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeploymentGroupOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDeploymentGroupOutput] (val x: Self) extends AnyVal {
    
    inline def setHooksNotCleanedUp(value: AutoScalingGroupList): Self = StObject.set(x, "hooksNotCleanedUp", value.asInstanceOf[js.Any])
    
    inline def setHooksNotCleanedUpUndefined: Self = StObject.set(x, "hooksNotCleanedUp", js.undefined)
    
    inline def setHooksNotCleanedUpVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "hooksNotCleanedUp", js.Array(value*))
  }
}
