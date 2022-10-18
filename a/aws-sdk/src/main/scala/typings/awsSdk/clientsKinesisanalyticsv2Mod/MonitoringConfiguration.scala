package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringConfiguration extends StObject {
  
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application. You must set this property to CUSTOM in order to set the LogLevel or MetricsLevel parameters.
    */
  var ConfigurationType: typings.awsSdk.clientsKinesisanalyticsv2Mod.ConfigurationType
  
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.LogLevel] = js.undefined
  
  /**
    * Describes the granularity of the CloudWatch Logs for an application. The Parallelism level is not recommended for applications with a Parallelism over 64 due to excessive costs.
    */
  var MetricsLevel: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.MetricsLevel] = js.undefined
}
object MonitoringConfiguration {
  
  inline def apply(ConfigurationType: ConfigurationType): MonitoringConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringConfiguration]
  }
  
  extension [Self <: MonitoringConfiguration](x: Self) {
    
    inline def setConfigurationType(value: ConfigurationType): Self = StObject.set(x, "ConfigurationType", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
    
    inline def setMetricsLevel(value: MetricsLevel): Self = StObject.set(x, "MetricsLevel", value.asInstanceOf[js.Any])
    
    inline def setMetricsLevelUndefined: Self = StObject.set(x, "MetricsLevel", js.undefined)
  }
}
