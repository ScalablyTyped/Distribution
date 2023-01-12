package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanMatch extends StObject {
  
  def canMatch(route: Route, segments: js.Array[UrlSegment]): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}
object CanMatch {
  
  inline def apply(
    canMatch: (Route, js.Array[UrlSegment]) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanMatch = {
    val __obj = js.Dynamic.literal(canMatch = js.Any.fromFunction2(canMatch))
    __obj.asInstanceOf[CanMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanMatch] (val x: Self) extends AnyVal {
    
    inline def setCanMatch(
      value: (Route, js.Array[UrlSegment]) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = StObject.set(x, "canMatch", js.Any.fromFunction2(value))
  }
}
