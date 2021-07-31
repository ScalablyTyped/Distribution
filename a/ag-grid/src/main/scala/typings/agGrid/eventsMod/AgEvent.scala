package typings.agGrid.eventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgEvent extends StObject {
  
  var `type`: String
}
object AgEvent {
  
  @scala.inline
  def apply(`type`: String): AgEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgEvent]
  }
  
  @scala.inline
  implicit class AgEventMutableBuilder[Self <: AgEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
