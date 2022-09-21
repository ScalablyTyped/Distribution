package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanDeactivate[T] extends StObject {
  
  def canDeactivate(component: T, currentRoute: ActivatedRouteSnapshot, currentState: RouterStateSnapshot): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree = js.native
  def canDeactivate(
    component: T,
    currentRoute: ActivatedRouteSnapshot,
    currentState: RouterStateSnapshot,
    nextState: RouterStateSnapshot
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree = js.native
}
