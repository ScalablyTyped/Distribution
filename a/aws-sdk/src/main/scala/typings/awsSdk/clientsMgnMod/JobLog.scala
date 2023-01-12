package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobLog extends StObject {
  
  /**
    * Job log event.
    */
  var event: js.UndefOr[JobLogEvent] = js.undefined
  
  /**
    * Job event data
    */
  var eventData: js.UndefOr[JobLogEventData] = js.undefined
  
  /**
    * Job log event date and time.
    */
  var logDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object JobLog {
  
  inline def apply(): JobLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobLog] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: JobLogEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventData(value: JobLogEventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setLogDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "logDateTime", value.asInstanceOf[js.Any])
    
    inline def setLogDateTimeUndefined: Self = StObject.set(x, "logDateTime", js.undefined)
  }
}
