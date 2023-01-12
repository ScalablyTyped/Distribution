package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleLoggingConfigurationInput extends StObject {
  
  /**
    * Indicates whether to enable the Apache Airflow log type (e.g. DagProcessingLogs).
    */
  var Enabled: LoggingEnabled
  
  /**
    * Defines the Apache Airflow log level (e.g. INFO) to send to CloudWatch Logs.
    */
  var LogLevel: LoggingLevel
}
object ModuleLoggingConfigurationInput {
  
  inline def apply(Enabled: LoggingEnabled, LogLevel: LoggingLevel): ModuleLoggingConfigurationInput = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], LogLevel = LogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleLoggingConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleLoggingConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: LoggingEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LoggingLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
  }
}
