package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeferredMaintenanceWindow extends StObject {
  
  /**
    *  A timestamp for the end of the time period when we defer maintenance.
    */
  var DeferMaintenanceEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique identifier for the maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    *  A timestamp for the beginning of the time period when we defer maintenance.
    */
  var DeferMaintenanceStartTime: js.UndefOr[js.Date] = js.undefined
}
object DeferredMaintenanceWindow {
  
  inline def apply(): DeferredMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferredMaintenanceWindow]
  }
  
  extension [Self <: DeferredMaintenanceWindow](x: Self) {
    
    inline def setDeferMaintenanceEndTime(value: js.Date): Self = StObject.set(x, "DeferMaintenanceEndTime", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceEndTimeUndefined: Self = StObject.set(x, "DeferMaintenanceEndTime", js.undefined)
    
    inline def setDeferMaintenanceIdentifier(value: String): Self = StObject.set(x, "DeferMaintenanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceIdentifierUndefined: Self = StObject.set(x, "DeferMaintenanceIdentifier", js.undefined)
    
    inline def setDeferMaintenanceStartTime(value: js.Date): Self = StObject.set(x, "DeferMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceStartTimeUndefined: Self = StObject.set(x, "DeferMaintenanceStartTime", js.undefined)
  }
}
