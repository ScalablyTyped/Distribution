package typings.angularCommon.httpMod

import typings.angularCommon.httpMod.HttpEventType.Sent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpSentEvent
  extends StObject
     with HttpEvent[Any] {
  
  var `type`: Sent
}
object HttpSentEvent {
  
  inline def apply(`type`: Sent): HttpSentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpSentEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpSentEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: Sent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
