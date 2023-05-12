package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindow extends StObject {
  
  /**
    * Displays the duration of the next maintenance window.
    */
  var durationInMinutes: DurationInMinutes
  
  /**
    * Displays the start time of the next maintenance window.
    */
  var startTime: CronExpression
}
object MaintenanceWindow {
  
  inline def apply(durationInMinutes: DurationInMinutes, startTime: CronExpression): MaintenanceWindow = {
    val __obj = js.Dynamic.literal(durationInMinutes = durationInMinutes.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
    
    inline def setDurationInMinutes(value: DurationInMinutes): Self = StObject.set(x, "durationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: CronExpression): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
