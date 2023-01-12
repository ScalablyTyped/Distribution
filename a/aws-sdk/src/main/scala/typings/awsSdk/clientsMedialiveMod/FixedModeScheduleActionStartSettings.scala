package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedModeScheduleActionStartSettings extends StObject {
  
  /**
    * Start time for the action to start in the channel. (Not the time for the action to be added to the schedule: actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for "UTC format".
    */
  var Time: string
}
object FixedModeScheduleActionStartSettings {
  
  inline def apply(Time: string): FixedModeScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal(Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedModeScheduleActionStartSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FixedModeScheduleActionStartSettings] (val x: Self) extends AnyVal {
    
    inline def setTime(value: string): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
  }
}
