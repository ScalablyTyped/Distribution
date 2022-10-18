package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationMaintenanceConfigurationRequest extends StObject {
  
  /**
    * Describes the application maintenance configuration update.
    */
  var ApplicationMaintenanceConfigurationUpdate: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationMaintenanceConfigurationUpdate
  
  /**
    * The name of the application for which you want to update the maintenance configuration.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
}
object UpdateApplicationMaintenanceConfigurationRequest {
  
  inline def apply(
    ApplicationMaintenanceConfigurationUpdate: ApplicationMaintenanceConfigurationUpdate,
    ApplicationName: ApplicationName
  ): UpdateApplicationMaintenanceConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationMaintenanceConfigurationUpdate = ApplicationMaintenanceConfigurationUpdate.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationMaintenanceConfigurationRequest]
  }
  
  extension [Self <: UpdateApplicationMaintenanceConfigurationRequest](x: Self) {
    
    inline def setApplicationMaintenanceConfigurationUpdate(value: ApplicationMaintenanceConfigurationUpdate): Self = StObject.set(x, "ApplicationMaintenanceConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
  }
}
