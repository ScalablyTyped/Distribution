package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationChangeEvent extends StObject {
  
  var state: js.Any = js.native
  
  var `type`: String = js.native
}
object LocationChangeEvent {
  
  @scala.inline
  def apply(state: js.Any, `type`: String): LocationChangeEvent = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangeEvent]
  }
  
  @scala.inline
  implicit class LocationChangeEventMutableBuilder[Self <: LocationChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
