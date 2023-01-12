package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleAction extends StObject {
  
  /**
    * The name of the action, must be unique within the schedule. This name provides the main reference to an action once it is added to the schedule. A name is unique if it is no longer in the schedule. The schedule is automatically cleaned up to remove actions with a start time of more than 1 hour ago (approximately) so at that point a name can be reused.
    */
  var ActionName: string
  
  /**
    * Settings for this schedule action.
    */
  var ScheduleActionSettings: typings.awsSdk.clientsMedialiveMod.ScheduleActionSettings
  
  /**
    * The time for the action to start in the channel.
    */
  var ScheduleActionStartSettings: typings.awsSdk.clientsMedialiveMod.ScheduleActionStartSettings
}
object ScheduleAction {
  
  inline def apply(
    ActionName: string,
    ScheduleActionSettings: ScheduleActionSettings,
    ScheduleActionStartSettings: ScheduleActionStartSettings
  ): ScheduleAction = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any], ScheduleActionSettings = ScheduleActionSettings.asInstanceOf[js.Any], ScheduleActionStartSettings = ScheduleActionStartSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleAction] (val x: Self) extends AnyVal {
    
    inline def setActionName(value: string): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setScheduleActionSettings(value: ScheduleActionSettings): Self = StObject.set(x, "ScheduleActionSettings", value.asInstanceOf[js.Any])
    
    inline def setScheduleActionStartSettings(value: ScheduleActionStartSettings): Self = StObject.set(x, "ScheduleActionStartSettings", value.asInstanceOf[js.Any])
  }
}
