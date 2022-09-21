package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanLoad extends StObject {
  
  def canLoad(route: Route, segments: js.Array[UrlSegment]): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}
object CanLoad {
  
  inline def apply(
    canLoad: (Route, js.Array[UrlSegment]) => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanLoad = {
    val __obj = js.Dynamic.literal(canLoad = js.Any.fromFunction2(canLoad))
    __obj.asInstanceOf[CanLoad]
  }
  
  extension [Self <: CanLoad](x: Self) {
    
    inline def setCanLoad(
      value: (Route, js.Array[UrlSegment]) => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = StObject.set(x, "canLoad", js.Any.fromFunction2(value))
  }
}
