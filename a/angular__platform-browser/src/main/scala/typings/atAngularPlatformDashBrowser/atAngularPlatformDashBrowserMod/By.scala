package typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod

import typings.atAngularCore.atAngularCoreMod.DebugElement
import typings.atAngularCore.atAngularCoreMod.Predicate
import typings.atAngularCore.atAngularCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "By")
@js.native
class By () extends js.Object

/* static members */
@JSImport("@angular/platform-browser", "By")
@js.native
object By extends js.Object {
  /**
    * Match all elements.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_all'}
    */
  def all(): Predicate[DebugElement] = js.native
  /**
    * Match elements by the given CSS selector.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_css'}
    */
  def css(selector: String): Predicate[DebugElement] = js.native
  /**
    * Match elements that have the given directive present.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_directive'}
    */
  def directive(`type`: Type[_]): Predicate[DebugElement] = js.native
}

