package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * The Airflow DAG processing logs published to CloudWatch Logs and the log level.
    */
  var DagProcessingLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined
  
  /**
    * The Airflow scheduler logs published to CloudWatch Logs and the log level.
    */
  var SchedulerLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined
  
  /**
    * The Airflow task logs published to CloudWatch Logs and the log level.
    */
  var TaskLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined
  
  /**
    * The Airflow web server logs published to CloudWatch Logs and the log level.
    */
  var WebserverLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined
  
  /**
    * The Airflow worker logs published to CloudWatch Logs and the log level.
    */
  var WorkerLogs: js.UndefOr[ModuleLoggingConfiguration] = js.undefined
}
object LoggingConfiguration {
  
  inline def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDagProcessingLogs(value: ModuleLoggingConfiguration): Self = StObject.set(x, "DagProcessingLogs", value.asInstanceOf[js.Any])
    
    inline def setDagProcessingLogsUndefined: Self = StObject.set(x, "DagProcessingLogs", js.undefined)
    
    inline def setSchedulerLogs(value: ModuleLoggingConfiguration): Self = StObject.set(x, "SchedulerLogs", value.asInstanceOf[js.Any])
    
    inline def setSchedulerLogsUndefined: Self = StObject.set(x, "SchedulerLogs", js.undefined)
    
    inline def setTaskLogs(value: ModuleLoggingConfiguration): Self = StObject.set(x, "TaskLogs", value.asInstanceOf[js.Any])
    
    inline def setTaskLogsUndefined: Self = StObject.set(x, "TaskLogs", js.undefined)
    
    inline def setWebserverLogs(value: ModuleLoggingConfiguration): Self = StObject.set(x, "WebserverLogs", value.asInstanceOf[js.Any])
    
    inline def setWebserverLogsUndefined: Self = StObject.set(x, "WebserverLogs", js.undefined)
    
    inline def setWorkerLogs(value: ModuleLoggingConfiguration): Self = StObject.set(x, "WorkerLogs", value.asInstanceOf[js.Any])
    
    inline def setWorkerLogsUndefined: Self = StObject.set(x, "WorkerLogs", js.undefined)
  }
}
