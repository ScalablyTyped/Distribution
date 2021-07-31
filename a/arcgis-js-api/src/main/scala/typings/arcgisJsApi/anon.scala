package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Items[T /* <: Base */, Base] extends StObject {
    
    var items: js.UndefOr[js.Array[T] | Collection[T]] = js.undefined
  }
  object Items {
    
    @scala.inline
    def apply[T /* <: Base */, Base](): Items[T, Base] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Items[T, Base]]
    }
    
    @scala.inline
    implicit class ItemsMutableBuilder[Self <: Items[?, ?], T /* <: Base */, Base] (val x: Self & (Items[T, Base])) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[T] | Collection[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}
