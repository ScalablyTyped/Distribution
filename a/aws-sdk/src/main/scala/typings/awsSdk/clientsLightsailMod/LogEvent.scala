package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEvent extends StObject {
  
  /**
    * The timestamp when the database log event was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The message of the database log event.
    */
  var message: js.UndefOr[String] = js.undefined
}
object LogEvent {
  
  inline def apply(): LogEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEvent]
  }
  
  extension [Self <: LogEvent](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
