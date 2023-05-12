package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandOffTime extends StObject {
  
  /**
    * The hour when an on-call rotation shift begins or ends.
    */
  var HourOfDay: typings.awsSdk.clientsSsmcontactsMod.HourOfDay
  
  /**
    * The minute when an on-call rotation shift begins or ends.
    */
  var MinuteOfHour: typings.awsSdk.clientsSsmcontactsMod.MinuteOfHour
}
object HandOffTime {
  
  inline def apply(HourOfDay: HourOfDay, MinuteOfHour: MinuteOfHour): HandOffTime = {
    val __obj = js.Dynamic.literal(HourOfDay = HourOfDay.asInstanceOf[js.Any], MinuteOfHour = MinuteOfHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandOffTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandOffTime] (val x: Self) extends AnyVal {
    
    inline def setHourOfDay(value: HourOfDay): Self = StObject.set(x, "HourOfDay", value.asInstanceOf[js.Any])
    
    inline def setMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "MinuteOfHour", value.asInstanceOf[js.Any])
  }
}
