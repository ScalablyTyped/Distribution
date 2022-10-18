package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringConfiguration extends StObject {
  
  /**
    * The managed log persistence configuration for a job run.
    */
  var managedPersistenceMonitoringConfiguration: js.UndefOr[ManagedPersistenceMonitoringConfiguration] = js.undefined
  
  /**
    * The Amazon S3 configuration for monitoring log publishing.
    */
  var s3MonitoringConfiguration: js.UndefOr[S3MonitoringConfiguration] = js.undefined
}
object MonitoringConfiguration {
  
  inline def apply(): MonitoringConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConfiguration]
  }
  
  extension [Self <: MonitoringConfiguration](x: Self) {
    
    inline def setManagedPersistenceMonitoringConfiguration(value: ManagedPersistenceMonitoringConfiguration): Self = StObject.set(x, "managedPersistenceMonitoringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setManagedPersistenceMonitoringConfigurationUndefined: Self = StObject.set(x, "managedPersistenceMonitoringConfiguration", js.undefined)
    
    inline def setS3MonitoringConfiguration(value: S3MonitoringConfiguration): Self = StObject.set(x, "s3MonitoringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3MonitoringConfigurationUndefined: Self = StObject.set(x, "s3MonitoringConfiguration", js.undefined)
  }
}
