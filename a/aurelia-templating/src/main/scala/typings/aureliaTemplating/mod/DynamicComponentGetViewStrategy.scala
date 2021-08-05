package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicComponentGetViewStrategy extends StObject {
  
  /**
    * Implement this hook if you want to provide custom view strategy when this component is used with the compose element or the router.
    */
  def getViewStrategy(): String | ViewStrategy_
}
object DynamicComponentGetViewStrategy {
  
  inline def apply(getViewStrategy: () => String | ViewStrategy_): DynamicComponentGetViewStrategy = {
    val __obj = js.Dynamic.literal(getViewStrategy = js.Any.fromFunction0(getViewStrategy))
    __obj.asInstanceOf[DynamicComponentGetViewStrategy]
  }
  
  extension [Self <: DynamicComponentGetViewStrategy](x: Self) {
    
    inline def setGetViewStrategy(value: () => String | ViewStrategy_): Self = StObject.set(x, "getViewStrategy", js.Any.fromFunction0(value))
  }
}
