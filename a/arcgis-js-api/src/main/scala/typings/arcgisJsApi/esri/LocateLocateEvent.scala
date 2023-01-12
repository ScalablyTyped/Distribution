package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocateLocateEvent extends StObject {
  
  var position: Any
}
object LocateLocateEvent {
  
  inline def apply(position: Any): LocateLocateEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateLocateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocateLocateEvent] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
