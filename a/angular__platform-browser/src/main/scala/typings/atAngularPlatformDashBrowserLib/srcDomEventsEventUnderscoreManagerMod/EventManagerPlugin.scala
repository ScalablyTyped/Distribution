package typings
package atAngularPlatformDashBrowserLib.srcDomEventsEventUnderscoreManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/src/dom/events/event_manager", "EventManagerPlugin")
@js.native
abstract class EventManagerPlugin protected () extends js.Object {
  def this(_doc: js.Any) = this()
  var _doc: js.Any = js.native
  var manager: EventManager = js.native
  def addEventListener(element: stdLib.HTMLElement, eventName: java.lang.String, handler: js.Function): js.Function = js.native
  def addGlobalEventListener(element: java.lang.String, eventName: java.lang.String, handler: js.Function): js.Function = js.native
  def supports(eventName: java.lang.String): scala.Boolean = js.native
}

