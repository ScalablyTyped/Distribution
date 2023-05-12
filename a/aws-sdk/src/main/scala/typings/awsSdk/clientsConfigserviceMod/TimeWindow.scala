package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeWindow extends StObject {
  
  /**
    * The end time of an execution. The end time must be after the start date.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start time of an execution.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object TimeWindow {
  
  inline def apply(): TimeWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeWindow] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
