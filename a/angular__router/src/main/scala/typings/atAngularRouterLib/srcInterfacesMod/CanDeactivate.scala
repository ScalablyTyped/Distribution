package typings
package atAngularRouterLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanDeactivate[T] extends js.Object {
  def canDeactivate(
    component: T,
    currentRoute: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    currentState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot
  ): (rxjsLib.rxjsMod.Observable[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | (js.Promise[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
  def canDeactivate(
    component: T,
    currentRoute: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    currentState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot,
    nextState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot
  ): (rxjsLib.rxjsMod.Observable[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | (js.Promise[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
}

