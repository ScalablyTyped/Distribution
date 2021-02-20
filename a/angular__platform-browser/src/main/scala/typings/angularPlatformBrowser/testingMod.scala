package typings.angularPlatformBrowser

import typings.angularCore.mod.NgZone
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.StaticProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/platform-browser/testing", "BrowserTestingModule")
  @js.native
  class BrowserTestingModule ()
    extends typings.angularPlatformBrowser.testingTestingMod.BrowserTestingModule
  
  @JSImport("@angular/platform-browser/testing", "platformBrowserTesting")
  @js.native
  def platformBrowserTesting(): PlatformRef = js.native
  @JSImport("@angular/platform-browser/testing", "platformBrowserTesting")
  @js.native
  def platformBrowserTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  
  @JSImport("@angular/platform-browser/testing", "\u0275angular_packages_platform_browser_testing_testing_a")
  @js.native
  def ɵangularPackagesPlatformBrowserTestingTestingA(): NgZone = js.native
}
