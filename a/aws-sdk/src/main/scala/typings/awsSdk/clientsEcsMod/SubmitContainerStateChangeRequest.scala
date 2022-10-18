package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitContainerStateChangeRequest extends StObject {
  
  /**
    * The short name or full ARN of the cluster that hosts the container.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * The exit code that's returned for the state change request.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The network bindings of the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.undefined
  
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
    */
  var task: js.UndefOr[String] = js.undefined
}
object SubmitContainerStateChangeRequest {
  
  inline def apply(): SubmitContainerStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitContainerStateChangeRequest]
  }
  
  extension [Self <: SubmitContainerStateChangeRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setExitCode(value: BoxedInteger): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setNetworkBindings(value: NetworkBindings): Self = StObject.set(x, "networkBindings", value.asInstanceOf[js.Any])
    
    inline def setNetworkBindingsUndefined: Self = StObject.set(x, "networkBindings", js.undefined)
    
    inline def setNetworkBindingsVarargs(value: NetworkBinding*): Self = StObject.set(x, "networkBindings", js.Array(value*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRuntimeId(value: String): Self = StObject.set(x, "runtimeId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeIdUndefined: Self = StObject.set(x, "runtimeId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
