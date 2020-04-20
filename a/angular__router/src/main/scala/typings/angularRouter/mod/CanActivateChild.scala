package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivateChild extends js.Object {
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
}

