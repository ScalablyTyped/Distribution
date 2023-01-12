package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingMaintenance extends StObject {
  
  /**
    * The specific runtime engine that the maintenance schedule applies to.
    */
  var engineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The maintenance schedule for the engine version.
    */
  var schedule: js.UndefOr[MaintenanceSchedule] = js.undefined
}
object PendingMaintenance {
  
  inline def apply(): PendingMaintenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingMaintenance] (val x: Self) extends AnyVal {
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
    
    inline def setSchedule(value: MaintenanceSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
