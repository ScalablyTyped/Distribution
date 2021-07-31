package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var eventSource: String | js.Array[String]
}
object `0` {
  
  @scala.inline
  def apply(eventSource: String | js.Array[String]): `0` = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSource(value: String | js.Array[String]): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceVarargs(value: String*): Self = StObject.set(x, "eventSource", js.Array(value :_*))
  }
}
