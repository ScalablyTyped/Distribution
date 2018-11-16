package typings
package atAngularRouterLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Resolve[T] extends js.Object {
  def resolve(
    route: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    state: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot
  ): rxjsLib.rxjsMod.Observable[T] | stdLib.Promise[T] | T
}

