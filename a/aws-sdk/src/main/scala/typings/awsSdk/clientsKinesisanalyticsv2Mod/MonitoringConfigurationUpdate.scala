package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to whether to use the default CloudWatch logging configuration for an application. You must set this property to CUSTOM in order to set the LogLevel or MetricsLevel parameters.
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined
  
  /**
    * Describes updates to the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevelUpdate: js.UndefOr[LogLevel] = js.undefined
  
  /**
    * Describes updates to the granularity of the CloudWatch Logs for an application. The Parallelism level is not recommended for applications with a Parallelism over 64 due to excessive costs.
    */
  var MetricsLevelUpdate: js.UndefOr[MetricsLevel] = js.undefined
}
object MonitoringConfigurationUpdate {
  
  inline def apply(): MonitoringConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConfigurationUpdate]
  }
  
  extension [Self <: MonitoringConfigurationUpdate](x: Self) {
    
    inline def setConfigurationTypeUpdate(value: ConfigurationType): Self = StObject.set(x, "ConfigurationTypeUpdate", value.asInstanceOf[js.Any])
    
    inline def setConfigurationTypeUpdateUndefined: Self = StObject.set(x, "ConfigurationTypeUpdate", js.undefined)
    
    inline def setLogLevelUpdate(value: LogLevel): Self = StObject.set(x, "LogLevelUpdate", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUpdateUndefined: Self = StObject.set(x, "LogLevelUpdate", js.undefined)
    
    inline def setMetricsLevelUpdate(value: MetricsLevel): Self = StObject.set(x, "MetricsLevelUpdate", value.asInstanceOf[js.Any])
    
    inline def setMetricsLevelUpdateUndefined: Self = StObject.set(x, "MetricsLevelUpdate", js.undefined)
  }
}
