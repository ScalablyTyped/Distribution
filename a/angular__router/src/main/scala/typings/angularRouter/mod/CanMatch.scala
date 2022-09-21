package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanMatch extends StObject {
  
  def canMatch(route: Route, segments: js.Array[UrlSegment]): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}
object CanMatch {
  
  inline def apply(
    canMatch: (Route, js.Array[UrlSegment]) => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanMatch = {
    val __obj = js.Dynamic.literal(canMatch = js.Any.fromFunction2(canMatch))
    __obj.asInstanceOf[CanMatch]
  }
  
  extension [Self <: CanMatch](x: Self) {
    
    inline def setCanMatch(
      value: (Route, js.Array[UrlSegment]) => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = StObject.set(x, "canMatch", js.Any.fromFunction2(value))
  }
}
