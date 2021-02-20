package typings.angularPlatformBrowserDynamic

import typings.angularCore.mod.CompilerFactory
import typings.angularCore.mod.Injector
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.StaticProvider
import typings.angularCore.testingMod.TestComponentRenderer
import typings.angularCore.testingMod.ɵTestingCompilerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/platform-browser-dynamic/testing/testing", "BrowserDynamicTestingModule")
  @js.native
  class BrowserDynamicTestingModule () extends StObject
  
  @JSImport("@angular/platform-browser-dynamic/testing/testing", "platformBrowserDynamicTesting")
  @js.native
  def platformBrowserDynamicTesting(): PlatformRef = js.native
  @JSImport("@angular/platform-browser-dynamic/testing/testing", "platformBrowserDynamicTesting")
  @js.native
  def platformBrowserDynamicTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  
  @JSImport("@angular/platform-browser-dynamic/testing/testing", "\u0275DOMTestComponentRenderer")
  @js.native
  class ɵDOMTestComponentRenderer protected () extends TestComponentRenderer {
    def this(_doc: js.Any) = this()
    
    var _doc: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic/testing/testing", "\u0275angular_packages_platform_browser_dynamic_testing_testing_a")
  @js.native
  val ɵangularPackagesPlatformBrowserDynamicTestingTestingA: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic/testing/testing", "\u0275angular_packages_platform_browser_dynamic_testing_testing_b")
  @js.native
  class ɵangularPackagesPlatformBrowserDynamicTestingTestingB protected () extends ɵTestingCompilerFactory {
    def this(_injector: Injector, _compilerFactory: CompilerFactory) = this()
    
    var _compilerFactory: js.Any = js.native
    
    var _injector: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic/testing/testing", "\u0275platformCoreDynamicTesting")
  @js.native
  def ɵplatformCoreDynamicTesting(): PlatformRef = js.native
  @JSImport("@angular/platform-browser-dynamic/testing/testing", "\u0275platformCoreDynamicTesting")
  @js.native
  def ɵplatformCoreDynamicTesting(extraProviders: js.Array[_]): PlatformRef = js.native
}
