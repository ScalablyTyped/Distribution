package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRangeFilterInput extends StObject {
  
  /**
    * The end time for the time-range filter.
    */
  var EndTime: js.Date
  
  /**
    * The start time for the time-range filter.
    */
  var StartTime: js.Date
}
object TimeRangeFilterInput {
  
  inline def apply(EndTime: js.Date, StartTime: js.Date): TimeRangeFilterInput = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRangeFilterInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeRangeFilterInput] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
