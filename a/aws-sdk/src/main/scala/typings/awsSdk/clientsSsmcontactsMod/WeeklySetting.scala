package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeeklySetting extends StObject {
  
  /**
    * The day of the week when weekly recurring on-call shift rotations begins.
    */
  var DayOfWeek: typings.awsSdk.clientsSsmcontactsMod.DayOfWeek
  
  /**
    * The time of day when a weekly recurring on-call shift rotation begins.
    */
  var HandOffTime: typings.awsSdk.clientsSsmcontactsMod.HandOffTime
}
object WeeklySetting {
  
  inline def apply(DayOfWeek: DayOfWeek, HandOffTime: HandOffTime): WeeklySetting = {
    val __obj = js.Dynamic.literal(DayOfWeek = DayOfWeek.asInstanceOf[js.Any], HandOffTime = HandOffTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeeklySetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeeklySetting] (val x: Self) extends AnyVal {
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setHandOffTime(value: HandOffTime): Self = StObject.set(x, "HandOffTime", value.asInstanceOf[js.Any])
  }
}
