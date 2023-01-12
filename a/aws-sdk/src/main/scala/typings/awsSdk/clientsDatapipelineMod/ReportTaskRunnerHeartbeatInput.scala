package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportTaskRunnerHeartbeatInput extends StObject {
  
  /**
    * The public DNS name of the task runner.
    */
  var hostname: js.UndefOr[id] = js.undefined
  
  /**
    * The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data Pipeline Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a unique identifier when it launches the application. If you have written a custom task runner, you should assign a unique identifier for the task runner.
    */
  var taskrunnerId: id
  
  /**
    * The type of task the task runner is configured to accept and process. The worker group is set as a field on objects in the pipeline when they are created. You can only specify a single value for workerGroup. There are no wildcard values permitted in workerGroup; the string must be an exact, case-sensitive, match.
    */
  var workerGroup: js.UndefOr[String] = js.undefined
}
object ReportTaskRunnerHeartbeatInput {
  
  inline def apply(taskrunnerId: id): ReportTaskRunnerHeartbeatInput = {
    val __obj = js.Dynamic.literal(taskrunnerId = taskrunnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskRunnerHeartbeatInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportTaskRunnerHeartbeatInput] (val x: Self) extends AnyVal {
    
    inline def setHostname(value: id): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setTaskrunnerId(value: id): Self = StObject.set(x, "taskrunnerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerGroup(value: String): Self = StObject.set(x, "workerGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkerGroupUndefined: Self = StObject.set(x, "workerGroup", js.undefined)
  }
}
