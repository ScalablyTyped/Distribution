package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionAfterEvent[T] extends StObject {
  
  var item: T
}
object CollectionAfterEvent {
  
  inline def apply[T](item: T): CollectionAfterEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAfterEvent[T]]
  }
  
  extension [Self <: CollectionAfterEvent[?], T](x: Self & CollectionAfterEvent[T]) {
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
