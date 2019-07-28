package typings.atAngularRouter.atAngularRouterMod

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivateChild extends js.Object {
  def canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}

object CanActivateChild {
  @scala.inline
  def apply(
    canActivateChild: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivateChild = {
    val __obj = js.Dynamic.literal(canActivateChild = js.Any.fromFunction2(canActivateChild))
  
    __obj.asInstanceOf[CanActivateChild]
  }
}

