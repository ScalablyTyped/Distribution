package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "EventManager")
@js.native
class EventManager protected () extends js.Object {
  /**
    * Initializes an instance of the event-manager service.
    */
  def this(plugins: js.Array[ɵangularPackagesPlatformBrowserPlatformBrowserG], _zone: NgZone) = this()
  var _eventNameToPlugin: js.Any = js.native
  var _plugins: js.Any = js.native
  var _zone: js.Any = js.native
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
    */
  def addGlobalEventListener(target: String, eventName: String, handler: js.Function): js.Function = js.native
  /**
    * Retrieves the compilation zone in which event listeners are registered.
    */
  def getZone(): NgZone = js.native
}

