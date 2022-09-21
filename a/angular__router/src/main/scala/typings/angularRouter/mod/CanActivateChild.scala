package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanActivateChild extends StObject {
  
  def canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}
object CanActivateChild {
  
  inline def apply(
    canActivateChild: (ActivatedRouteSnapshot, RouterStateSnapshot) => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivateChild = {
    val __obj = js.Dynamic.literal(canActivateChild = js.Any.fromFunction2(canActivateChild))
    __obj.asInstanceOf[CanActivateChild]
  }
  
  extension [Self <: CanActivateChild](x: Self) {
    
    inline def setCanActivateChild(
      value: (ActivatedRouteSnapshot, RouterStateSnapshot) => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = StObject.set(x, "canActivateChild", js.Any.fromFunction2(value))
  }
}
