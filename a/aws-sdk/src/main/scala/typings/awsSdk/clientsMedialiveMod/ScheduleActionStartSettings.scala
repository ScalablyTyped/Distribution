package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleActionStartSettings extends StObject {
  
  /**
    * Option for specifying the start time for an action.
    */
  var FixedModeScheduleActionStartSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FixedModeScheduleActionStartSettings] = js.undefined
  
  /**
    * Option for specifying an action as relative to another action.
    */
  var FollowModeScheduleActionStartSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FollowModeScheduleActionStartSettings] = js.undefined
  
  /**
    * Option for specifying an action that should be applied immediately.
    */
  var ImmediateModeScheduleActionStartSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.ImmediateModeScheduleActionStartSettings] = js.undefined
}
object ScheduleActionStartSettings {
  
  inline def apply(): ScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleActionStartSettings]
  }
  
  extension [Self <: ScheduleActionStartSettings](x: Self) {
    
    inline def setFixedModeScheduleActionStartSettings(value: FixedModeScheduleActionStartSettings): Self = StObject.set(x, "FixedModeScheduleActionStartSettings", value.asInstanceOf[js.Any])
    
    inline def setFixedModeScheduleActionStartSettingsUndefined: Self = StObject.set(x, "FixedModeScheduleActionStartSettings", js.undefined)
    
    inline def setFollowModeScheduleActionStartSettings(value: FollowModeScheduleActionStartSettings): Self = StObject.set(x, "FollowModeScheduleActionStartSettings", value.asInstanceOf[js.Any])
    
    inline def setFollowModeScheduleActionStartSettingsUndefined: Self = StObject.set(x, "FollowModeScheduleActionStartSettings", js.undefined)
    
    inline def setImmediateModeScheduleActionStartSettings(value: ImmediateModeScheduleActionStartSettings): Self = StObject.set(x, "ImmediateModeScheduleActionStartSettings", value.asInstanceOf[js.Any])
    
    inline def setImmediateModeScheduleActionStartSettingsUndefined: Self = StObject.set(x, "ImmediateModeScheduleActionStartSettings", js.undefined)
  }
}
