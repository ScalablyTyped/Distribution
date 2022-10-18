package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolve[T] extends StObject {
  
  def resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable_[T] | js.Promise[T] | T
}
object Resolve {
  
  inline def apply[T](resolve: (ActivatedRouteSnapshot, RouterStateSnapshot) => Observable_[T] | js.Promise[T] | T): Resolve[T] = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
    __obj.asInstanceOf[Resolve[T]]
  }
  
  extension [Self <: Resolve[?], T](x: Self & Resolve[T]) {
    
    inline def setResolve(value: (ActivatedRouteSnapshot, RouterStateSnapshot) => Observable_[T] | js.Promise[T] | T): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
  }
}
