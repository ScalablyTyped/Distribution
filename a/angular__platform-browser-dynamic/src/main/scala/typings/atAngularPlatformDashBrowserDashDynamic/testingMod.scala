package typings.atAngularPlatformDashBrowserDashDynamic

import typings.atAngularCore.atAngularCoreMod.CompilerFactory
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.PlatformRef
import typings.atAngularCore.atAngularCoreMod.StaticProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class BrowserDynamicTestingModule ()
    extends typings.atAngularPlatformDashBrowserDashDynamic.testingTestingMod.BrowserDynamicTestingModule
  
  @js.native
  class ɵDOMTestComponentRenderer protected ()
    extends typings.atAngularPlatformDashBrowserDashDynamic.testingTestingMod.ɵDOMTestComponentRenderer {
    def this(_doc: js.Any) = this()
  }
  
  @js.native
  class ɵangular_packages_platform_browser_dynamic_testing_testing_b protected ()
    extends typings.atAngularPlatformDashBrowserDashDynamic.testingTestingMod.ɵangular_packages_platform_browser_dynamic_testing_testing_b {
    def this(_injector: Injector, _compilerFactory: CompilerFactory) = this()
  }
  
  val ɵangular_packages_platform_browser_dynamic_testing_testing_a: js.Array[StaticProvider] = js.native
  def platformBrowserDynamicTesting(): PlatformRef = js.native
  def platformBrowserDynamicTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def ɵplatformCoreDynamicTesting(): PlatformRef = js.native
  def ɵplatformCoreDynamicTesting(extraProviders: js.Array[_]): PlatformRef = js.native
}

