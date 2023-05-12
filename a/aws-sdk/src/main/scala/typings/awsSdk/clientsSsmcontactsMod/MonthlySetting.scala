package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonthlySetting extends StObject {
  
  /**
    * The day of the month when monthly recurring on-call rotations begin.
    */
  var DayOfMonth: typings.awsSdk.clientsSsmcontactsMod.DayOfMonth
  
  /**
    * The time of day when a monthly recurring on-call shift rotation begins.
    */
  var HandOffTime: typings.awsSdk.clientsSsmcontactsMod.HandOffTime
}
object MonthlySetting {
  
  inline def apply(DayOfMonth: DayOfMonth, HandOffTime: HandOffTime): MonthlySetting = {
    val __obj = js.Dynamic.literal(DayOfMonth = DayOfMonth.asInstanceOf[js.Any], HandOffTime = HandOffTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthlySetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonthlySetting] (val x: Self) extends AnyVal {
    
    inline def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "DayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setHandOffTime(value: HandOffTime): Self = StObject.set(x, "HandOffTime", value.asInstanceOf[js.Any])
  }
}
