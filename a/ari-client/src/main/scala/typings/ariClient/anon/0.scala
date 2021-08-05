package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var eventSource: String | js.Array[String]
}
object `0` {
  
  inline def apply(eventSource: String | js.Array[String]): `0` = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setEventSource(value: String | js.Array[String]): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceVarargs(value: String*): Self = StObject.set(x, "eventSource", js.Array(value :_*))
  }
}
