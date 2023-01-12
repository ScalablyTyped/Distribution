package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameEvent extends StObject {
  
  var data: JSObject
  
  var `type`: String
}
object GameEvent {
  
  inline def apply(data: JSObject, `type`: String): GameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: JSObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
