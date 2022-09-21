package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanActivate extends StObject {
  
  def canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}
object CanActivate {
  
  inline def apply(
    canActivate: (ActivatedRouteSnapshot, RouterStateSnapshot) => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanActivate = {
    val __obj = js.Dynamic.literal(canActivate = js.Any.fromFunction2(canActivate))
    __obj.asInstanceOf[CanActivate]
  }
  
  extension [Self <: CanActivate](x: Self) {
    
    inline def setCanActivate(
      value: (ActivatedRouteSnapshot, RouterStateSnapshot) => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = StObject.set(x, "canActivate", js.Any.fromFunction2(value))
  }
}
