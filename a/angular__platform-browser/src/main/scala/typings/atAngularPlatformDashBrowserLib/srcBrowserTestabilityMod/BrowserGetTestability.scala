package typings
package atAngularPlatformDashBrowserLib.srcBrowserTestabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/src/browser/testability", "BrowserGetTestability")
@js.native
class BrowserGetTestability ()
  extends atAngularCoreLib.srcTestabilityTestabilityMod.GetTestability {
  /* CompleteClass */
  override def addToWindow(registry: atAngularCoreLib.srcTestabilityTestabilityMod.TestabilityRegistry): scala.Unit = js.native
  /* CompleteClass */
  override def findTestabilityInTree(
    registry: atAngularCoreLib.srcTestabilityTestabilityMod.TestabilityRegistry,
    elem: js.Any,
    findInAncestors: scala.Boolean
  ): atAngularCoreLib.srcTestabilityTestabilityMod.Testability | scala.Null = js.native
}

/* static members */
@JSImport("@angular/platform-browser/src/browser/testability", "BrowserGetTestability")
@js.native
object BrowserGetTestability extends js.Object {
  def init(): scala.Unit = js.native
}

