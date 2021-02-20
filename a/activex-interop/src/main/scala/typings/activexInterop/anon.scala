package typings.activexInterop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Item[T] extends StObject {
    
    def Item(index: js.Any): T = js.native
  }
  object Item {
    
    @scala.inline
    def apply[T](Item: js.Any => T): Item[T] = {
      val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
      __obj.asInstanceOf[Item[T]]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item[_], T] (val x: Self with Item[T]) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Any => T): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    }
  }
}
