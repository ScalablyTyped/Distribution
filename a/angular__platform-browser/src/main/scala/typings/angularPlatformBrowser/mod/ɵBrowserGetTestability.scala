package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.GetTestability
import typings.angularCore.mod.Testability
import typings.angularCore.mod.TestabilityRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275BrowserGetTestability")
@js.native
open class ɵBrowserGetTestability ()
  extends StObject
     with GetTestability {
  
  /* CompleteClass */
  override def addToWindow(registry: TestabilityRegistry): Unit = js.native
  
  /* CompleteClass */
  override def findTestabilityInTree(registry: TestabilityRegistry, elem: Any, findInAncestors: Boolean): Testability | Null = js.native
}
