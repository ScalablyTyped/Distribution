package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.Sent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpSentEvent
  extends StObject
     with HttpEvent[js.Any] {
  
  var `type`: Sent
}
object HttpSentEvent {
  
  @scala.inline
  def apply(`type`: Sent): HttpSentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpSentEvent]
  }
  
  @scala.inline
  implicit class HttpSentEventMutableBuilder[Self <: HttpSentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Sent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
