package typings
package atAngularRouterLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivate extends js.Object {
  def canActivate(
    route: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    state: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot
  ): (rxjsLib.rxjsMod.Observable[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | (js.Promise[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
}

object CanActivate {
  @scala.inline
  def apply(
    canActivate: js.Function2[
      atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot, 
      atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot, 
      (rxjsLib.rxjsMod.Observable[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | (js.Promise[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
    ]
  ): CanActivate = {
    val __obj = js.Dynamic.literal(canActivate = canActivate)
  
    __obj.asInstanceOf[CanActivate]
  }
}

