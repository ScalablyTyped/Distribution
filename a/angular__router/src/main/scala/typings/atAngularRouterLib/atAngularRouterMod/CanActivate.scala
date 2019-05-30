package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivate extends js.Object {
  def canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): (rxjsLib.rxjsMod.Observable[scala.Boolean | UrlTree]) | (js.Promise[scala.Boolean | UrlTree]) | scala.Boolean | UrlTree
}

object CanActivate {
  @scala.inline
  def apply(
    canActivate: (ActivatedRouteSnapshot, RouterStateSnapshot) => (rxjsLib.rxjsMod.Observable[scala.Boolean | UrlTree]) | (js.Promise[scala.Boolean | UrlTree]) | scala.Boolean | UrlTree
  ): CanActivate = {
    val __obj = js.Dynamic.literal(canActivate = js.Any.fromFunction2(canActivate))
  
    __obj.asInstanceOf[CanActivate]
  }
}

