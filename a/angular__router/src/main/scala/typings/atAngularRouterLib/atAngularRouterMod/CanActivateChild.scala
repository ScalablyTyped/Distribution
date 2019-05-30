package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivateChild extends js.Object {
  def canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): (rxjsLib.rxjsMod.Observable[scala.Boolean | UrlTree]) | (js.Promise[scala.Boolean | UrlTree]) | scala.Boolean | UrlTree
}

object CanActivateChild {
  @scala.inline
  def apply(
    canActivateChild: (ActivatedRouteSnapshot, RouterStateSnapshot) => (rxjsLib.rxjsMod.Observable[scala.Boolean | UrlTree]) | (js.Promise[scala.Boolean | UrlTree]) | scala.Boolean | UrlTree
  ): CanActivateChild = {
    val __obj = js.Dynamic.literal(canActivateChild = js.Any.fromFunction2(canActivateChild))
  
    __obj.asInstanceOf[CanActivateChild]
  }
}

