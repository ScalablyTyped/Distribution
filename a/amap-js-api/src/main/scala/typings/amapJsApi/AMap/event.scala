package typings.amapJsApi.AMap

import typings.amapJsApi.amapJsApiNumbers.`0`
import typings.amapJsApi.amapJsApiNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  trait EventListener[T /* <: `0` | `1` */] extends StObject {
    
    var `type`: T
  }
  object EventListener {
    
    @scala.inline
    def apply[T /* <: `0` | `1` */](`type`: T): EventListener[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListener[T]]
    }
    
    @scala.inline
    implicit class EventListenerMutableBuilder[Self <: EventListener[?], T /* <: `0` | `1` */] (val x: Self & EventListener[T]) extends AnyVal {
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
