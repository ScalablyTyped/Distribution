package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBlueGreenDeploymentRequest extends StObject {
  
  /**
    * The blue/green deployment identifier of the deployment to be deleted. This parameter isn't case-sensitive. Constraints:    Must match an existing blue/green deployment identifier.  
    */
  var BlueGreenDeploymentIdentifier: typings.awsSdk.clientsRdsMod.BlueGreenDeploymentIdentifier
  
  /**
    * A value that indicates whether to delete the resources in the green environment. You can't specify this option if the blue/green deployment status is SWITCHOVER_COMPLETED.
    */
  var DeleteTarget: js.UndefOr[BooleanOptional] = js.undefined
}
object DeleteBlueGreenDeploymentRequest {
  
  inline def apply(BlueGreenDeploymentIdentifier: BlueGreenDeploymentIdentifier): DeleteBlueGreenDeploymentRequest = {
    val __obj = js.Dynamic.literal(BlueGreenDeploymentIdentifier = BlueGreenDeploymentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBlueGreenDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBlueGreenDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setBlueGreenDeploymentIdentifier(value: BlueGreenDeploymentIdentifier): Self = StObject.set(x, "BlueGreenDeploymentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeleteTarget(value: BooleanOptional): Self = StObject.set(x, "DeleteTarget", value.asInstanceOf[js.Any])
    
    inline def setDeleteTargetUndefined: Self = StObject.set(x, "DeleteTarget", js.undefined)
  }
}
