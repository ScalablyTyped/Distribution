package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resolve[T] extends js.Object {
  def resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable_[T] | js.Promise[T] | T = js.native
}

object Resolve {
  @scala.inline
  def apply[T](resolve: (ActivatedRouteSnapshot, RouterStateSnapshot) => Observable_[T] | js.Promise[T] | T): Resolve[T] = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
    __obj.asInstanceOf[Resolve[T]]
  }
  @scala.inline
  implicit class ResolveOps[Self <: Resolve[_], T] (val x: Self with Resolve[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResolve(value: (ActivatedRouteSnapshot, RouterStateSnapshot) => Observable_[T] | js.Promise[T] | T): Self = this.set("resolve", js.Any.fromFunction2(value))
  }
  
}

