package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionBeforeEvent[T] extends StObject {
  
  var item: T
  
  def preventDefault(): Unit
}
object CollectionBeforeEvent {
  
  @scala.inline
  def apply[T](item: T, preventDefault: () => Unit): CollectionBeforeEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[CollectionBeforeEvent[T]]
  }
  
  @scala.inline
  implicit class CollectionBeforeEventMutableBuilder[Self <: CollectionBeforeEvent[?], T] (val x: Self & CollectionBeforeEvent[T]) extends AnyVal {
    
    @scala.inline
    def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
