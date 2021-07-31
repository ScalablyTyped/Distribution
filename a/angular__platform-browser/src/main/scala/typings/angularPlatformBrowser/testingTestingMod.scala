package typings.angularPlatformBrowser

import typings.angularCore.mod.NgZone
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.StaticProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/platform-browser/testing/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser/testing/testing", "BrowserTestingModule")
  @js.native
  class BrowserTestingModule () extends StObject
  
  @scala.inline
  def platformBrowserTesting(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserTesting")().asInstanceOf[PlatformRef]
  @scala.inline
  def platformBrowserTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserTesting")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
  
  @scala.inline
  def ɵangularPackagesPlatformBrowserTestingTestingA(): NgZone = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_testing_testing_a")().asInstanceOf[NgZone]
}
