package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreenDeploymentTask extends StObject {
  
  /**
    * The name of the blue/green deployment task.
    */
  var Name: js.UndefOr[BlueGreenDeploymentTaskName] = js.undefined
  
  /**
    * The status of the blue/green deployment task. Values:    PENDING - The resources are being prepared for deployment.    IN_PROGRESS - The resource is being deployed.    COMPLETED - The resource has been deployed.    FAILED - Deployment of the resource failed.  
    */
  var Status: js.UndefOr[BlueGreenDeploymentTaskStatus] = js.undefined
}
object BlueGreenDeploymentTask {
  
  inline def apply(): BlueGreenDeploymentTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueGreenDeploymentTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlueGreenDeploymentTask] (val x: Self) extends AnyVal {
    
    inline def setName(value: BlueGreenDeploymentTaskName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: BlueGreenDeploymentTaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
