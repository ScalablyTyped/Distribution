package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseEvent[T /* <: String */, Detail] extends StObject {
  
  var currentTarget: EventTarget = js.native
  
  var detail: Detail = js.native
  
  var target: EventTarget = js.native
  
  var timeStamp: Double = js.native
  
  var `type`: T = js.native
}
object BaseEvent {
  
  @scala.inline
  def apply[T /* <: String */, Detail](currentTarget: EventTarget, detail: Detail, target: EventTarget, timeStamp: Double, `type`: T): BaseEvent[T, Detail] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent[T, Detail]]
  }
  
  @scala.inline
  implicit class BaseEventMutableBuilder[Self <: BaseEvent[_, _], T /* <: String */, Detail] (val x: Self with (BaseEvent[T, Detail])) extends AnyVal {
    
    @scala.inline
    def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: Detail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
