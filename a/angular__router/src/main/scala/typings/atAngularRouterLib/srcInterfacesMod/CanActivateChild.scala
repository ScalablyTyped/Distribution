package typings
package atAngularRouterLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivateChild extends js.Object {
  def canActivateChild(
    childRoute: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    state: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot
  ): (rxjsLib.rxjsMod.Observable[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | (js.Promise[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
}

object CanActivateChild {
  @scala.inline
  def apply(
    canActivateChild: (atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot, atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot) => (rxjsLib.rxjsMod.Observable[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | (js.Promise[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  ): CanActivateChild = {
    val __obj = js.Dynamic.literal(canActivateChild = js.Any.fromFunction2(canActivateChild))
  
    __obj.asInstanceOf[CanActivateChild]
  }
}

