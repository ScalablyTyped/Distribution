package typings.angularRouter.anon

import typings.angularRouter.mod.ActivatedRouteSnapshot
import typings.angularRouter.mod.ResolveFn
import typings.angularRouter.mod.RouterStateSnapshot
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolve[T] extends StObject {
  
  def resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable_[T] | js.Promise[T] | T
  @JSName("resolve")
  var resolve_Original: ResolveFn[T]
}
object Resolve {
  
  inline def apply[T](
    resolve: (/* route */ ActivatedRouteSnapshot, /* state */ RouterStateSnapshot) => Observable_[T] | js.Promise[T] | T
  ): Resolve[T] = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
    __obj.asInstanceOf[Resolve[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resolve[?], T] (val x: Self & Resolve[T]) extends AnyVal {
    
    inline def setResolve(
      value: (/* route */ ActivatedRouteSnapshot, /* state */ RouterStateSnapshot) => Observable_[T] | js.Promise[T] | T
    ): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
  }
}
