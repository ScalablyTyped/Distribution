package typings.activexInterop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Item[T] extends StObject {
    
    def Item(index: Any): T
  }
  object Item {
    
    inline def apply[T](Item: Any => T): Item[T] = {
      val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
      __obj.asInstanceOf[Item[T]]
    }
    
    extension [Self <: Item[?], T](x: Self & Item[T]) {
      
      inline def setItem(value: Any => T): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    }
  }
}
