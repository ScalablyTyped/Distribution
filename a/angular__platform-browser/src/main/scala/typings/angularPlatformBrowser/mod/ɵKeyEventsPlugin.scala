package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.NgZone
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularPlatformBrowser.anon.DomEventName
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275KeyEventsPlugin")
@js.native
open class ɵKeyEventsPlugin protected ()
  extends StObject
     with EventManagerPlugin {
  /**
    * Initializes an instance of the browser plug-in.
    * @param doc The document in which key events will be detected.
    */
  def this(doc: Any) = this()
  
  /* private */ /* CompleteClass */
  var _doc: Any = js.native
  
  /* CompleteClass */
  override def addEventListener(element: HTMLElement, eventName: String, handler: js.Function): js.Function = js.native
  
  /* CompleteClass */
  var manager: EventManager = js.native
  
  /* CompleteClass */
  override def supports(eventName: String): Boolean = js.native
}
/* static members */
object ɵKeyEventsPlugin {
  
  @JSImport("@angular/platform-browser", "\u0275KeyEventsPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Configures a handler callback for a key event.
    * @param fullKey The event name that combines all simultaneous keystrokes.
    * @param handler The function that responds to the key event.
    * @param zone The zone in which the event occurred.
    * @returns A callback function.
    */
  inline def eventCallback(fullKey: String, handler: js.Function, zone: NgZone): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("eventCallback")(fullKey.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Determines whether the actual keys pressed match the configured key code string.
    * The `fullKeyCode` event is normalized in the `parseEventName` method when the
    * event is attached to the DOM during the `addEventListener` call. This is unseen
    * by the end user and is normalized for internal consistency and parsing.
    *
    * @param event The keyboard event.
    * @param fullKeyCode The normalized user defined expected key event string
    * @returns boolean.
    */
  inline def matchEventFullKeyCode(event: KeyboardEvent, fullKeyCode: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEventFullKeyCode")(event.asInstanceOf[js.Any], fullKeyCode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Parses the user provided full keyboard event definition and normalizes it for
    * later internal use. It ensures the string is all lowercase, converts special
    * characters to a standard spelling, and orders all the values consistently.
    *
    * @param eventName The name of the key event to listen for.
    * @returns an object with the full, normalized string, and the dom event name
    * or null in the case when the event doesn't match a keyboard event.
    */
  inline def parseEventName(eventName: String): DomEventName | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEventName")(eventName.asInstanceOf[js.Any]).asInstanceOf[DomEventName | Null]
  
  @JSImport("@angular/platform-browser", "\u0275KeyEventsPlugin.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵKeyEventsPlugin, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵKeyEventsPlugin, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "\u0275KeyEventsPlugin.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵKeyEventsPlugin] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵKeyEventsPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
