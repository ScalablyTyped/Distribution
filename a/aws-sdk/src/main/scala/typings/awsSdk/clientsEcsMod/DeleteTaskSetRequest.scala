package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTaskSetRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set found in to delete.
    */
  var cluster: String
  
  /**
    * If true, you can delete a task set even if it hasn't been scaled down to zero.
    */
  var force: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
    */
  var service: String
  
  /**
    * The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
    */
  var taskSet: String
}
object DeleteTaskSetRequest {
  
  inline def apply(cluster: String, service: String, taskSet: String): DeleteTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], taskSet = taskSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTaskSetRequest]
  }
  
  extension [Self <: DeleteTaskSetRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setForce(value: BoxedBoolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setTaskSet(value: String): Self = StObject.set(x, "taskSet", value.asInstanceOf[js.Any])
  }
}
