package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanDeactivate[T] extends js.Object {
  def canDeactivate(component: T, currentRoute: ActivatedRouteSnapshot, currentState: RouterStateSnapshot): (rxjsLib.rxjsMod.Observable[scala.Boolean | UrlTree]) | (js.Promise[scala.Boolean | UrlTree]) | scala.Boolean | UrlTree = js.native
  def canDeactivate(
    component: T,
    currentRoute: ActivatedRouteSnapshot,
    currentState: RouterStateSnapshot,
    nextState: RouterStateSnapshot
  ): (rxjsLib.rxjsMod.Observable[scala.Boolean | UrlTree]) | (js.Promise[scala.Boolean | UrlTree]) | scala.Boolean | UrlTree = js.native
}

