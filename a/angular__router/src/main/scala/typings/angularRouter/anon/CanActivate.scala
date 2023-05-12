package typings.angularRouter.anon

import typings.angularRouter.mod.ActivatedRouteSnapshot
import typings.angularRouter.mod.CanActivateFn
import typings.angularRouter.mod.RouterStateSnapshot
import typings.angularRouter.mod.UrlTree
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanActivate extends StObject {
  
  def canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  @JSName("canActivate")
  var canActivate_Original: CanActivateFn
}
object CanActivate {
  
  inline def apply(
    canActivate: (/* route */ ActivatedRouteSnapshot, /* state */ RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivate = {
    val __obj = js.Dynamic.literal(canActivate = js.Any.fromFunction2(canActivate))
    __obj.asInstanceOf[CanActivate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanActivate] (val x: Self) extends AnyVal {
    
    inline def setCanActivate(
      value: (/* route */ ActivatedRouteSnapshot, /* state */ RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = StObject.set(x, "canActivate", js.Any.fromFunction2(value))
  }
}
