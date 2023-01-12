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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionBeforeEvent[?], T] (val x: Self & CollectionBeforeEvent[T]) extends AnyVal {
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => scala.Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
