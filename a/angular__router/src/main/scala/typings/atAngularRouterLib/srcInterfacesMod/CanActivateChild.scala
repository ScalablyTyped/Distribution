package typings
package atAngularRouterLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CanActivateChild extends js.Object {
  def canActivateChild(
    childRoute: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    state: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot
  ): rxjsLib.rxjsMod.Observable[scala.Boolean] | stdLib.Promise[scala.Boolean] | scala.Boolean
}

