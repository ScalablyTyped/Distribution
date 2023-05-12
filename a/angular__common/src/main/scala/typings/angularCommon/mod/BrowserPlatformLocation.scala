package typings.angularCommon.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "BrowserPlatformLocation")
@js.native
open class BrowserPlatformLocation () extends PlatformLocation {
  
  /* private */ var _doc: Any = js.native
  
  /* private */ var _history: Any = js.native
  
  /* private */ var _location: Any = js.native
  
  @JSName("historyGo")
  def historyGo_MBrowserPlatformLocation(): Unit = js.native
  @JSName("historyGo")
  def historyGo_MBrowserPlatformLocation(relativePosition: Double): Unit = js.native
  
  def pathname_=(newPath: String): Unit = js.native
}
/* static members */
object BrowserPlatformLocation {
  
  @JSImport("@angular/common", "BrowserPlatformLocation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "BrowserPlatformLocation.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[BrowserPlatformLocation, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[BrowserPlatformLocation, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "BrowserPlatformLocation.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[BrowserPlatformLocation] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[BrowserPlatformLocation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
