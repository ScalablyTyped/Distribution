package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameEvent extends StObject {
  
  var data: JSObject = js.native
  
  var `type`: String = js.native
}
object GameEvent {
  
  @scala.inline
  def apply(data: JSObject, `type`: String): GameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameEvent]
  }
  
  @scala.inline
  implicit class GameEventMutableBuilder[Self <: GameEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: JSObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
