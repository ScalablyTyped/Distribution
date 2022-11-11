package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTaskProtectionRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist in.
    */
  var cluster: String
  
  /**
    * If you set protectionEnabled to true, you can specify the duration for task protection in minutes. You can specify a value from 1 minute to up to 2,880 minutes (48 hours). During this time, your task will not be terminated by scale-in events from Service Auto Scaling or deployments. After this time period lapses, protectionEnabled will be reset to false. If you don’t specify the time, then the task is automatically protected for 120 minutes (2 hours).
    */
  var expiresInMinutes: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * Specify true to mark a task for protection and false to unset protection, making it eligible for termination.
    */
  var protectionEnabled: Boolean
  
  /**
    * A list of up to 10 task IDs or full ARN entries.
    */
  var tasks: StringList
}
object UpdateTaskProtectionRequest {
  
  inline def apply(cluster: String, protectionEnabled: Boolean, tasks: StringList): UpdateTaskProtectionRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], protectionEnabled = protectionEnabled.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskProtectionRequest]
  }
  
  extension [Self <: UpdateTaskProtectionRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setExpiresInMinutes(value: BoxedInteger): Self = StObject.set(x, "expiresInMinutes", value.asInstanceOf[js.Any])
    
    inline def setExpiresInMinutesUndefined: Self = StObject.set(x, "expiresInMinutes", js.undefined)
    
    inline def setProtectionEnabled(value: Boolean): Self = StObject.set(x, "protectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTasks(value: StringList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
