package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleLoggingConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the CloudWatch Logs group where the Apache Airflow log type (e.g. DagProcessingLogs) is published. For example, arn:aws:logs:us-east-1:123456789012:log-group:airflow-MyMWAAEnvironment-MwaaEnvironment-DAGProcessing:*.
    */
  var CloudWatchLogGroupArn: js.UndefOr[typings.awsSdk.clientsMwaaMod.CloudWatchLogGroupArn] = js.undefined
  
  /**
    * Indicates whether the Apache Airflow log type (e.g. DagProcessingLogs) is enabled.
    */
  var Enabled: js.UndefOr[LoggingEnabled] = js.undefined
  
  /**
    * The Apache Airflow log level for the log type (e.g. DagProcessingLogs). 
    */
  var LogLevel: js.UndefOr[LoggingLevel] = js.undefined
}
object ModuleLoggingConfiguration {
  
  inline def apply(): ModuleLoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleLoggingConfiguration]
  }
  
  extension [Self <: ModuleLoggingConfiguration](x: Self) {
    
    inline def setCloudWatchLogGroupArn(value: CloudWatchLogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setEnabled(value: LoggingEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setLogLevel(value: LoggingLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
  }
}
