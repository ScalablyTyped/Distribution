package typings
package atAngularRouterLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve[T] extends js.Object {
  def resolve(
    route: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    state: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot
  ): rxjsLib.rxjsMod.Observable[T] | js.Promise[T] | T
}

object Resolve {
  @scala.inline
  def apply[T](
    resolve: js.Function2[
      atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot, 
      atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot, 
      rxjsLib.rxjsMod.Observable[T] | js.Promise[T] | T
    ]
  ): Resolve[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[Resolve[T]]
  }
}

