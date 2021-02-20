package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocateLocateEvent extends StObject {
  
  var position: js.Any = js.native
}
object LocateLocateEvent {
  
  @scala.inline
  def apply(position: js.Any): LocateLocateEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateLocateEvent]
  }
  
  @scala.inline
  implicit class LocateLocateEventMutableBuilder[Self <: LocateLocateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
