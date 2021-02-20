package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBase[T] extends StObject {
  
  var target: T = js.native
  
  var `type`: String = js.native
}
object EventBase {
  
  @scala.inline
  def apply[T](target: T, `type`: String): EventBase[T] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBase[T]]
  }
  
  @scala.inline
  implicit class EventBaseMutableBuilder[Self <: EventBase[_], T] (val x: Self with EventBase[T]) extends AnyVal {
    
    @scala.inline
    def setTarget(value: T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
