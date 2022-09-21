package typings.angularCommon.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "LocationStrategy")
@js.native
abstract class LocationStrategy () extends StObject {
  
  def back(): Unit = js.native
  
  def forward(): Unit = js.native
  
  def getBaseHref(): String = js.native
  
  def getState(): Any = js.native
  
  var historyGo: js.UndefOr[js.Function1[/* relativePosition */ Double, Unit]] = js.native
  
  def onPopState(fn: LocationChangeListener): Unit = js.native
  
  def path(): String = js.native
  def path(includeHash: Boolean): String = js.native
  
  def prepareExternalUrl(internal: String): String = js.native
  
  def pushState(state: Any, title: String, url: String, queryParams: String): Unit = js.native
  
  def replaceState(state: Any, title: String, url: String, queryParams: String): Unit = js.native
}
/* static members */
object LocationStrategy {
  
  @JSImport("@angular/common", "LocationStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "LocationStrategy.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[LocationStrategy, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[LocationStrategy, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "LocationStrategy.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[LocationStrategy] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[LocationStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
