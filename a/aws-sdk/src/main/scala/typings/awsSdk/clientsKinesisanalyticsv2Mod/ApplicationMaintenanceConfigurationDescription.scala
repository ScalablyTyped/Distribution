package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationMaintenanceConfigurationDescription extends StObject {
  
  /**
    * The end time for the maintenance window.
    */
  var ApplicationMaintenanceWindowEndTime: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationMaintenanceWindowEndTime
  
  /**
    * The start time for the maintenance window.
    */
  var ApplicationMaintenanceWindowStartTime: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationMaintenanceWindowStartTime
}
object ApplicationMaintenanceConfigurationDescription {
  
  inline def apply(
    ApplicationMaintenanceWindowEndTime: ApplicationMaintenanceWindowEndTime,
    ApplicationMaintenanceWindowStartTime: ApplicationMaintenanceWindowStartTime
  ): ApplicationMaintenanceConfigurationDescription = {
    val __obj = js.Dynamic.literal(ApplicationMaintenanceWindowEndTime = ApplicationMaintenanceWindowEndTime.asInstanceOf[js.Any], ApplicationMaintenanceWindowStartTime = ApplicationMaintenanceWindowStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMaintenanceConfigurationDescription]
  }
  
  extension [Self <: ApplicationMaintenanceConfigurationDescription](x: Self) {
    
    inline def setApplicationMaintenanceWindowEndTime(value: ApplicationMaintenanceWindowEndTime): Self = StObject.set(x, "ApplicationMaintenanceWindowEndTime", value.asInstanceOf[js.Any])
    
    inline def setApplicationMaintenanceWindowStartTime(value: ApplicationMaintenanceWindowStartTime): Self = StObject.set(x, "ApplicationMaintenanceWindowStartTime", value.asInstanceOf[js.Any])
  }
}
