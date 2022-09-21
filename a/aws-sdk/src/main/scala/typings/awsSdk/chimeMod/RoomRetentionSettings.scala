package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomRetentionSettings extends StObject {
  
  /**
    * The number of days for which to retain chat-room messages.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.chimeMod.RetentionDays] = js.undefined
}
object RoomRetentionSettings {
  
  inline def apply(): RoomRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomRetentionSettings]
  }
  
  extension [Self <: RoomRetentionSettings](x: Self) {
    
    inline def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
