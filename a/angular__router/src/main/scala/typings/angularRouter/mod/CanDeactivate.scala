package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanDeactivate[T] extends js.Object {
  def canDeactivate(component: T, currentRoute: ActivatedRouteSnapshot, currentState: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree = js.native
  def canDeactivate(
    component: T,
    currentRoute: ActivatedRouteSnapshot,
    currentState: RouterStateSnapshot,
    nextState: RouterStateSnapshot
  ): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree = js.native
}

