package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanActivateChild extends StObject {
  
  def canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}
object CanActivateChild {
  
  @scala.inline
  def apply(
    canActivateChild: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivateChild = {
    val __obj = js.Dynamic.literal(canActivateChild = js.Any.fromFunction2(canActivateChild))
    __obj.asInstanceOf[CanActivateChild]
  }
  
  @scala.inline
  implicit class CanActivateChildMutableBuilder[Self <: CanActivateChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanActivateChild(
      value: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = StObject.set(x, "canActivateChild", js.Any.fromFunction2(value))
  }
}
