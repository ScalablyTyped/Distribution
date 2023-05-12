package typings.angularRouter.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/router", "RouteReuseStrategy")
@js.native
open class RouteReuseStrategy () extends StObject {
  
  /** Retrieves the previously stored route */
  def retrieve(route: ActivatedRouteSnapshot): DetachedRouteHandle | Null = js.native
  
  /** Determines if this route (and its subtree) should be reattached */
  def shouldAttach(route: ActivatedRouteSnapshot): Boolean = js.native
  
  /** Determines if this route (and its subtree) should be detached to be reused later */
  def shouldDetach(route: ActivatedRouteSnapshot): Boolean = js.native
  
  /** Determines if a route should be reused */
  def shouldReuseRoute(future: ActivatedRouteSnapshot, curr: ActivatedRouteSnapshot): Boolean = js.native
  
  /**
    * Stores the detached route.
    *
    * Storing a `null` value should erase the previously stored value.
    */
  def store(route: ActivatedRouteSnapshot): Unit = js.native
  def store(route: ActivatedRouteSnapshot, handle: DetachedRouteHandle): Unit = js.native
}
/* static members */
object RouteReuseStrategy {
  
  @JSImport("@angular/router", "RouteReuseStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "RouteReuseStrategy.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RouteReuseStrategy, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[RouteReuseStrategy, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "RouteReuseStrategy.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[RouteReuseStrategy] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[RouteReuseStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
