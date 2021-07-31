package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionChangeEvent[T] extends StObject {
  
  var added: js.Array[T]
  
  var moved: js.Array[T]
  
  var removed: js.Array[T]
}
object CollectionChangeEvent {
  
  @scala.inline
  def apply[T](added: js.Array[T], moved: js.Array[T], removed: js.Array[T]): CollectionChangeEvent[T] = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], moved = moved.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChangeEvent[T]]
  }
  
  @scala.inline
  implicit class CollectionChangeEventMutableBuilder[Self <: CollectionChangeEvent[?], T] (val x: Self & CollectionChangeEvent[T]) extends AnyVal {
    
    @scala.inline
    def setAdded(value: js.Array[T]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedVarargs(value: T*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    @scala.inline
    def setMoved(value: js.Array[T]): Self = StObject.set(x, "moved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovedVarargs(value: T*): Self = StObject.set(x, "moved", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[T]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: T*): Self = StObject.set(x, "removed", js.Array(value :_*))
  }
}
