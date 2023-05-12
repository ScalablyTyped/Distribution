package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedHour extends StObject {
  
  /**
    *  End Time. RFC 3339 format 'HH:mm:ss.SSS'. 
    */
  var endTime: js.UndefOr[EndTime] = js.undefined
  
  /**
    *  Start Time. RFC 3339 format 'HH:mm:ss.SSS'. 
    */
  var startTime: js.UndefOr[StartTime] = js.undefined
}
object SupportedHour {
  
  inline def apply(): SupportedHour = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedHour]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedHour] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: EndTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: StartTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
