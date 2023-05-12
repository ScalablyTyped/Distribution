package typings.angularRouter.anon

import typings.angularRouter.mod.ActivatedRouteSnapshot
import typings.angularRouter.mod.CanActivateChildFn
import typings.angularRouter.mod.RouterStateSnapshot
import typings.angularRouter.mod.UrlTree
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanActivateChild extends StObject {
  
  def canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  @JSName("canActivateChild")
  var canActivateChild_Original: CanActivateChildFn
}
object CanActivateChild {
  
  inline def apply(
    canActivateChild: (/* childRoute */ ActivatedRouteSnapshot, /* state */ RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivateChild = {
    val __obj = js.Dynamic.literal(canActivateChild = js.Any.fromFunction2(canActivateChild))
    __obj.asInstanceOf[CanActivateChild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanActivateChild] (val x: Self) extends AnyVal {
    
    inline def setCanActivateChild(
      value: (/* childRoute */ ActivatedRouteSnapshot, /* state */ RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = StObject.set(x, "canActivateChild", js.Any.fromFunction2(value))
  }
}
