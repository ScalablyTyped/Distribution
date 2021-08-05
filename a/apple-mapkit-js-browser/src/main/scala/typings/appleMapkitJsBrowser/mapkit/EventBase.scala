package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBase[T] extends StObject {
  
  var target: T
  
  var `type`: String
}
object EventBase {
  
  inline def apply[T](target: T, `type`: String): EventBase[T] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBase[T]]
  }
  
  extension [Self <: EventBase[?], T](x: Self & EventBase[T]) {
    
    inline def setTarget(value: T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
