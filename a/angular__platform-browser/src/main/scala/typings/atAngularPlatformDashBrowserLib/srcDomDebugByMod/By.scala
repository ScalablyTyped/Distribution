package typings
package atAngularPlatformDashBrowserLib.srcDomDebugByMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/src/dom/debug/by", "By")
@js.native
class By () extends js.Object

@JSImport("@angular/platform-browser/src/dom/debug/by", "By")
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
  def all(): atAngularCoreLib.srcDebugDebugUnderscoreNodeMod.Predicate[atAngularCoreLib.coreMod.DebugElement] = js.native
  /**
    * Match elements by the given CSS selector.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_css'}
    */
  def css(selector: java.lang.String): atAngularCoreLib.srcDebugDebugUnderscoreNodeMod.Predicate[atAngularCoreLib.coreMod.DebugElement] = js.native
  /**
    * Match elements that have the given directive present.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_directive'}
    */
  def directive(`type`: atAngularCoreLib.srcTypeMod.Type[_]): atAngularCoreLib.srcDebugDebugUnderscoreNodeMod.Predicate[atAngularCoreLib.coreMod.DebugElement] = js.native
}

