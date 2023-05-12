package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePeriod extends StObject {
  
  /**
    * The end of the time period. The end date is exclusive. For example, if end is 2017-05-01, Lightsail for Research retrieves cost and usage data from the start date up to, but not including, 2017-05-01.
    */
  var end: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The beginning of the time period. The start date is inclusive. For example, if start is 2017-01-01, Lightsail for Research retrieves cost and usage data starting at 2017-01-01 up to the end date. The start date must be equal to or no later than the current date to avoid a validation error.
    */
  var start: js.UndefOr[js.Date] = js.undefined
}
object TimePeriod {
  
  inline def apply(): TimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePeriod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimePeriod] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
