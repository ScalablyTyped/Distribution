package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivate extends js.Object {
  def canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}

object CanActivate {
  @scala.inline
  def apply(
    canActivate: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivate = {
    val __obj = js.Dynamic.literal(canActivate = js.Any.fromFunction2(canActivate))
  
    __obj.asInstanceOf[CanActivate]
  }
}

