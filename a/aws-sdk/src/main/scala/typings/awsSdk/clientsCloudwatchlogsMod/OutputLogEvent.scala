package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputLogEvent extends StObject {
  
  /**
    * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var ingestionTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The data contained in the log event.
    */
  var message: js.UndefOr[EventMessage] = js.undefined
  
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: js.UndefOr[Timestamp] = js.undefined
}
object OutputLogEvent {
  
  inline def apply(): OutputLogEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLogEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputLogEvent] (val x: Self) extends AnyVal {
    
    inline def setIngestionTime(value: Timestamp): Self = StObject.set(x, "ingestionTime", value.asInstanceOf[js.Any])
    
    inline def setIngestionTimeUndefined: Self = StObject.set(x, "ingestionTime", js.undefined)
    
    inline def setMessage(value: EventMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
