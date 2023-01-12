package typings.arcgisJsApi.anon

import typings.arcgisJsApi.esri.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items[T /* <: Base */, Base] extends StObject {
  
  var items: js.UndefOr[js.Array[T] | Collection[T]] = js.undefined
}
object Items {
  
  inline def apply[T /* <: Base */, Base](): Items[T, Base] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Items[T, Base]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Items[?, ?], T /* <: Base */, Base] (val x: Self & (Items[T, Base])) extends AnyVal {
    
    inline def setItems(value: js.Array[T] | Collection[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
