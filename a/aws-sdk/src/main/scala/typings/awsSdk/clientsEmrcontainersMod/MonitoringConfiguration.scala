package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringConfiguration extends StObject {
  
  /**
    * Monitoring configurations for CloudWatch.
    */
  var cloudWatchMonitoringConfiguration: js.UndefOr[CloudWatchMonitoringConfiguration] = js.undefined
  
  /**
    * Monitoring configurations for the persistent application UI. 
    */
  var persistentAppUI: js.UndefOr[PersistentAppUI] = js.undefined
  
  /**
    * Amazon S3 configuration for monitoring log publishing.
    */
  var s3MonitoringConfiguration: js.UndefOr[S3MonitoringConfiguration] = js.undefined
}
object MonitoringConfiguration {
  
  inline def apply(): MonitoringConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchMonitoringConfiguration(value: CloudWatchMonitoringConfiguration): Self = StObject.set(x, "cloudWatchMonitoringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchMonitoringConfigurationUndefined: Self = StObject.set(x, "cloudWatchMonitoringConfiguration", js.undefined)
    
    inline def setPersistentAppUI(value: PersistentAppUI): Self = StObject.set(x, "persistentAppUI", value.asInstanceOf[js.Any])
    
    inline def setPersistentAppUIUndefined: Self = StObject.set(x, "persistentAppUI", js.undefined)
    
    inline def setS3MonitoringConfiguration(value: S3MonitoringConfiguration): Self = StObject.set(x, "s3MonitoringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3MonitoringConfigurationUndefined: Self = StObject.set(x, "s3MonitoringConfiguration", js.undefined)
  }
}
