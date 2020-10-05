package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanActivateChild extends js.Object {
  def canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree = js.native
}

object CanActivateChild {
  @scala.inline
  def apply(
    canActivateChild: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivateChild = {
    val __obj = js.Dynamic.literal(canActivateChild = js.Any.fromFunction2(canActivateChild))
    __obj.asInstanceOf[CanActivateChild]
  }
  @scala.inline
  implicit class CanActivateChildOps[Self <: CanActivateChild] (val x: Self) extends AnyVal {
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
    def setCanActivateChild(
      value: (ActivatedRouteSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = this.set("canActivateChild", js.Any.fromFunction2(value))
  }
  
}

