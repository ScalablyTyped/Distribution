package typings
package atAngularPlatformDashBrowserLib.atAngularPlatformDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "ɵBrowserGetTestability")
@js.native
class ɵBrowserGetTestability ()
  extends atAngularCoreLib.atAngularCoreMod.GetTestability {
  /* CompleteClass */
  override def addToWindow(registry: atAngularCoreLib.atAngularCoreMod.TestabilityRegistry): scala.Unit = js.native
  /* CompleteClass */
  override def findTestabilityInTree(
    registry: atAngularCoreLib.atAngularCoreMod.TestabilityRegistry,
    elem: js.Any,
    findInAncestors: scala.Boolean
  ): atAngularCoreLib.atAngularCoreMod.Testability | scala.Null = js.native
}

/* static members */
@JSImport("@angular/platform-browser", "ɵBrowserGetTestability")
@js.native
object ɵBrowserGetTestability extends js.Object {
  def init(): scala.Unit = js.native
}

