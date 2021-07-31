package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionAfterEvent[T] extends StObject {
  
  var item: T
}
object CollectionAfterEvent {
  
  @scala.inline
  def apply[T](item: T): CollectionAfterEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAfterEvent[T]]
  }
  
  @scala.inline
  implicit class CollectionAfterEventMutableBuilder[Self <: CollectionAfterEvent[?], T] (val x: Self & CollectionAfterEvent[T]) extends AnyVal {
    
    @scala.inline
    def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
