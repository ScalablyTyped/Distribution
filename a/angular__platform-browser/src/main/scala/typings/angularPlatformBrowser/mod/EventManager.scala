package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.NgZone
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "EventManager")
@js.native
open class EventManager protected () extends StObject {
  /**
    * Initializes an instance of the event-manager service.
    */
  def this(plugins: js.Array[EventManagerPlugin], _zone: NgZone) = this()
  
  /* private */ var _eventNameToPlugin: Any = js.native
  
  /* private */ var _plugins: Any = js.native
  
  /* private */ var _zone: Any = js.native
  
  /**
    * Registers a handler for a specific element and event.
    *
    * @param element The HTML element to receive event notifications.
    * @param eventName The name of the event to listen for.
    * @param handler A function to call when the notification occurs. Receives the
    * event object as an argument.
    * @returns  A callback function that can be used to remove the handler.
    */
  def addEventListener(element: HTMLElement, eventName: String, handler: js.Function): js.Function = js.native
  
  /**
    * Registers a global handler for an event in a target view.
    *
    * @param target A target for global event notifications. One of "window", "document", or "body".
    * @param eventName The name of the event to listen for.
    * @param handler A function to call when the notification occurs. Receives the
    * event object as an argument.
    * @returns A callback function that can be used to remove the handler.
    * @deprecated No longer being used in Ivy code. To be removed in version 14.
    */
  def addGlobalEventListener(target: String, eventName: String, handler: js.Function): js.Function = js.native
  
  /**
    * Retrieves the compilation zone in which event listeners are registered.
    */
  def getZone(): NgZone = js.native
}
/* static members */
object EventManager {
  
  @JSImport("@angular/platform-browser", "EventManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "EventManager.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[EventManager, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[EventManager, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "EventManager.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[EventManager] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[EventManager]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
