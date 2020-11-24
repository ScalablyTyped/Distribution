package typings.angularPlatformBrowser

import typings.angularCore.mod.NgZone
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.StaticProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  
  def platformBrowserTesting(): PlatformRef = js.native
  def platformBrowserTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  
  @JSName("\u0275angular_packages_platform_browser_testing_testing_a")
  def ɵangularPackagesPlatformBrowserTestingTestingA(): NgZone = js.native
  
  @js.native
  class BrowserTestingModule ()
    extends typings.angularPlatformBrowser.testingTestingMod.BrowserTestingModule
}
