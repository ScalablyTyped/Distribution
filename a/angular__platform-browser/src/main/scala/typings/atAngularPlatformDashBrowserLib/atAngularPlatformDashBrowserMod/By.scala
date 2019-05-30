package typings
package atAngularPlatformDashBrowserLib.atAngularPlatformDashBrowserMod

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
  def all(): atAngularCoreLib.atAngularCoreMod.Predicate[atAngularCoreLib.atAngularCoreMod.DebugElement] = js.native
  /**
    * Match elements by the given CSS selector.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_css'}
    */
  def css(selector: java.lang.String): atAngularCoreLib.atAngularCoreMod.Predicate[atAngularCoreLib.atAngularCoreMod.DebugElement] = js.native
  /**
    * Match elements that have the given directive present.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_directive'}
    */
  def directive(`type`: atAngularCoreLib.atAngularCoreMod.Type[_]): atAngularCoreLib.atAngularCoreMod.Predicate[atAngularCoreLib.atAngularCoreMod.DebugElement] = js.native
}

