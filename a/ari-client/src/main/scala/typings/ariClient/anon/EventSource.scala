package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSource extends StObject {
  
  var applicationName: String
  
  var eventSource: String | js.Array[String]
}
object EventSource {
  
  inline def apply(applicationName: String, eventSource: String | js.Array[String]): EventSource = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
  
  extension [Self <: EventSource](x: Self) {
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setEventSource(value: String | js.Array[String]): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceVarargs(value: String*): Self = StObject.set(x, "eventSource", js.Array(value*))
  }
}
