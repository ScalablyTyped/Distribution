package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanDeactivate[T] extends StObject {
  
  def canDeactivate(
    component: T,
    currentRoute: ActivatedRouteSnapshot,
    currentState: RouterStateSnapshot,
    nextState: RouterStateSnapshot
  ): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}
object CanDeactivate {
  
  inline def apply[T](
    canDeactivate: (T, ActivatedRouteSnapshot, RouterStateSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanDeactivate[T] = {
    val __obj = js.Dynamic.literal(canDeactivate = js.Any.fromFunction4(canDeactivate))
    __obj.asInstanceOf[CanDeactivate[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanDeactivate[?], T] (val x: Self & CanDeactivate[T]) extends AnyVal {
    
    inline def setCanDeactivate(
      value: (T, ActivatedRouteSnapshot, RouterStateSnapshot, RouterStateSnapshot) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = StObject.set(x, "canDeactivate", js.Any.fromFunction4(value))
  }
}
