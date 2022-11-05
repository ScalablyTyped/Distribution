package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametricMonitoringConfiguration extends StObject {
  
  /**
    *  Monitoring configurations for CloudWatch.
    */
  var cloudWatchMonitoringConfiguration: js.UndefOr[ParametricCloudWatchMonitoringConfiguration] = js.undefined
  
  /**
    *  Monitoring configurations for the persistent application UI.
    */
  var persistentAppUI: js.UndefOr[TemplateParameter] = js.undefined
  
  /**
    *  Amazon S3 configuration for monitoring log publishing.
    */
  var s3MonitoringConfiguration: js.UndefOr[ParametricS3MonitoringConfiguration] = js.undefined
}
object ParametricMonitoringConfiguration {
  
  inline def apply(): ParametricMonitoringConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParametricMonitoringConfiguration]
  }
  
  extension [Self <: ParametricMonitoringConfiguration](x: Self) {
    
    inline def setCloudWatchMonitoringConfiguration(value: ParametricCloudWatchMonitoringConfiguration): Self = StObject.set(x, "cloudWatchMonitoringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchMonitoringConfigurationUndefined: Self = StObject.set(x, "cloudWatchMonitoringConfiguration", js.undefined)
    
    inline def setPersistentAppUI(value: TemplateParameter): Self = StObject.set(x, "persistentAppUI", value.asInstanceOf[js.Any])
    
    inline def setPersistentAppUIUndefined: Self = StObject.set(x, "persistentAppUI", js.undefined)
    
    inline def setS3MonitoringConfiguration(value: ParametricS3MonitoringConfiguration): Self = StObject.set(x, "s3MonitoringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3MonitoringConfigurationUndefined: Self = StObject.set(x, "s3MonitoringConfiguration", js.undefined)
  }
}
