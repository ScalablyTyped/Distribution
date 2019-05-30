package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve[T] extends js.Object {
  def resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): rxjsLib.rxjsMod.Observable[T] | js.Promise[T] | T
}

object Resolve {
  @scala.inline
  def apply[T](
    resolve: (ActivatedRouteSnapshot, RouterStateSnapshot) => rxjsLib.rxjsMod.Observable[T] | js.Promise[T] | T
  ): Resolve[T] = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
  
    __obj.asInstanceOf[Resolve[T]]
  }
}

