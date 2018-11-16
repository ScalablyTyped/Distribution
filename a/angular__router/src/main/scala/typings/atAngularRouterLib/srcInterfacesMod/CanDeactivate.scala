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
  ): rxjsLib.rxjsMod.Observable[scala.Boolean] | stdLib.Promise[scala.Boolean] | scala.Boolean = js.native
  def canDeactivate(
    component: T,
    currentRoute: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    currentState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot,
    nextState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot
  ): rxjsLib.rxjsMod.Observable[scala.Boolean] | stdLib.Promise[scala.Boolean] | scala.Boolean = js.native
}

