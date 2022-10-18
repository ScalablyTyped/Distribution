package typings.antvGLite

import typings.antvGLite.distDomInterfacesMod.IEventTarget
import typings.eventemitter3.mod.^
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomEventTargetMod {
  
  @JSImport("@antv/g-lite/dist/dom/EventTarget", "EventTarget")
  @js.native
  open class EventTarget ()
    extends StObject
       with IEventTarget {
    
    def addEventListener(`type`: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addEventListener(`type`: String, listener: js.Function1[/* repeated */ Any, Unit], options: Boolean): this.type = js.native
    def addEventListener(`type`: String, listener: js.Function1[/* repeated */ Any, Unit], options: AddEventListenerOptions): this.type = js.native
    
    /**
      * @deprecated
      * @alias dispatchEvent
      */
    def emit(eventName: String, `object`: js.Object): Unit = js.native
    
    /**
      * event emitter
      */
    var emitter: ^[String | js.Symbol, Any] = js.native
    
    def off(`type`: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(`type`: String, listener: js.Function1[/* repeated */ Any, Unit], options: Boolean): this.type = js.native
    def off(`type`: String, listener: js.Function1[/* repeated */ Any, Unit], options: AddEventListenerOptions): this.type = js.native
    /**
      * @deprecated
      * @alias removeEventListener
      */
    def off(`type`: String, listener: EventListenerOrEventListenerObject): this.type = js.native
    def off(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): this.type = js.native
    def off(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): this.type = js.native
    
    def on(`type`: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(`type`: String, listener: js.Function1[/* repeated */ Any, Unit], options: Boolean): this.type = js.native
    def on(`type`: String, listener: js.Function1[/* repeated */ Any, Unit], options: AddEventListenerOptions): this.type = js.native
    /**
      * @deprecated
      * @alias addEventListener
      */
    def on(`type`: String, listener: EventListenerOrEventListenerObject): this.type = js.native
    def on(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): this.type = js.native
    def on(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): this.type = js.native
    
    def removeAllEventListeners(): Unit = js.native
    
    def removeEventListener(`type`: String): this.type = js.native
    def removeEventListener(`type`: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeEventListener(`type`: String, listener: js.Function1[/* repeated */ Any, Unit], options: Boolean): this.type = js.native
    def removeEventListener(`type`: String, listener: js.Function1[/* repeated */ Any, Unit], options: AddEventListenerOptions): this.type = js.native
    def removeEventListener(`type`: String, listener: Unit, options: Boolean): this.type = js.native
    def removeEventListener(`type`: String, listener: Unit, options: AddEventListenerOptions): this.type = js.native
  }
}
