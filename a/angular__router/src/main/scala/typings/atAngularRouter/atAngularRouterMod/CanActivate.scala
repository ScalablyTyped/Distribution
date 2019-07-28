package typings.atAngularRouter.atAngularRouterMod

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivate extends js.Object {
  def canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}

object CanActivate {
  @scala.inline
  def apply(
    canActivate: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivate = {
    val __obj = js.Dynamic.literal(canActivate = js.Any.fromFunction2(canActivate))
  
    __obj.asInstanceOf[CanActivate]
  }
}

