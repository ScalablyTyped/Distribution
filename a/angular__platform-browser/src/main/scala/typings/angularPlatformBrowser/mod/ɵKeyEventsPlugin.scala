package typings.angularPlatformBrowser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.NgZone
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "\u0275KeyEventsPlugin")
@js.native
class ɵKeyEventsPlugin protected () extends ɵangularPackagesPlatformBrowserPlatformBrowserG {
  /**
    * Initializes an instance of the browser plug-in.
    * @param doc The document in which key events will be detected.
    */
  def this(doc: js.Any) = this()
}

/* static members */
@JSImport("@angular/platform-browser", "\u0275KeyEventsPlugin")
@js.native
object ɵKeyEventsPlugin extends js.Object {
  /**
    * Configures a handler callback for a key event.
    * @param fullKey The event name that combines all simultaneous keystrokes.
    * @param handler The function that responds to the key event.
    * @param zone The zone in which the event occurred.
    * @returns A callback function.
    */
  def eventCallback(fullKey: js.Any, handler: js.Function, zone: NgZone): js.Function = js.native
  def getEventFullKey(event: KeyboardEvent): String = js.native
  def parseEventName(eventName: String): StringDictionary[String] | Null = js.native
}

