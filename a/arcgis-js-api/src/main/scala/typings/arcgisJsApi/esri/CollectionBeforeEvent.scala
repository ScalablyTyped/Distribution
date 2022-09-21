package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionBeforeEvent[T] extends StObject {
  
  var item: T
  
  def preventDefault(): scala.Unit
}
object CollectionBeforeEvent {
  
  inline def apply[T](item: T, preventDefault: () => scala.Unit): CollectionBeforeEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[CollectionBeforeEvent[T]]
  }
  
  extension [Self <: CollectionBeforeEvent[?], T](x: Self & CollectionBeforeEvent[T]) {
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => scala.Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
