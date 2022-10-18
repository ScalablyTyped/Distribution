package typings.angularCommon.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/common", "PlatformLocation")
@js.native
open class PlatformLocation () extends StObject {
  
  def back(): Unit = js.native
  
  def forward(): Unit = js.native
  
  def getBaseHrefFromDOM(): String = js.native
  
  def getState(): Any = js.native
  
  def hash: String = js.native
  
  var historyGo: js.UndefOr[js.Function1[/* relativePosition */ Double, Unit]] = js.native
  
  def hostname: String = js.native
  
  def href: String = js.native
  
  /**
    * Returns a function that, when executed, removes the `hashchange` event handler.
    */
  def onHashChange(fn: LocationChangeListener): VoidFunction = js.native
  
  /**
    * Returns a function that, when executed, removes the `popstate` event handler.
    */
  def onPopState(fn: LocationChangeListener): VoidFunction = js.native
  
  def pathname: String = js.native
  
  def port: String = js.native
  
  def protocol: String = js.native
  
  def pushState(state: Any, title: String, url: String): Unit = js.native
  
  def replaceState(state: Any, title: String, url: String): Unit = js.native
  
  def search: String = js.native
}
/* static members */
object PlatformLocation {
  
  @JSImport("@angular/common", "PlatformLocation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "PlatformLocation.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[PlatformLocation, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[PlatformLocation, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "PlatformLocation.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[PlatformLocation] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[PlatformLocation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
