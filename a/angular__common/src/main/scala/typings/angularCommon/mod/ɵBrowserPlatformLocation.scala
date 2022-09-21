package typings.angularCommon.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "\u0275BrowserPlatformLocation")
@js.native
open class ɵBrowserPlatformLocation protected () extends PlatformLocation {
  def this(_doc: Any) = this()
  
  /* private */ var _doc: Any = js.native
  
  /* private */ var _history: Any = js.native
  
  @JSName("historyGo")
  def historyGo_MɵBrowserPlatformLocation(): Unit = js.native
  @JSName("historyGo")
  def historyGo_MɵBrowserPlatformLocation(relativePosition: Double): Unit = js.native
  
  val location: typings.std.Location = js.native
  
  def pathname_=(newPath: String): Unit = js.native
}
/* static members */
object ɵBrowserPlatformLocation {
  
  @JSImport("@angular/common", "\u0275BrowserPlatformLocation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "\u0275BrowserPlatformLocation.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵBrowserPlatformLocation, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵBrowserPlatformLocation, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "\u0275BrowserPlatformLocation.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵBrowserPlatformLocation] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵBrowserPlatformLocation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
