package typings.addDomEventListener

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(target: Document, eventType: String, callback: js.Function1[/* event */ Any, Any]): Listener = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Listener]
  inline def apply(target: HTMLElement, eventType: String, callback: js.Function1[/* event */ Any, Any]): Listener = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Listener]
  inline def apply(target: Window, eventType: String, callback: js.Function1[/* event */ Any, Any]): Listener = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Listener]
  
  @JSImport("add-dom-event-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Listener extends StObject {
    
    def remove(): Unit
  }
  object Listener {
    
    inline def apply(remove: () => Unit): Listener = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
