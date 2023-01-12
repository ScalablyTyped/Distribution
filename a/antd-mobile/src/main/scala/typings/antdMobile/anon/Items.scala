package typings.antdMobile.anon

import typings.antdMobile.esComponentsSelectorSelectorMod.SelectorOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items[V] extends StObject {
  
  var items: js.Array[SelectorOption[V]]
}
object Items {
  
  inline def apply[V](items: js.Array[SelectorOption[V]]): Items[V] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Items[?], V] (val x: Self & Items[V]) extends AnyVal {
    
    inline def setItems(value: js.Array[SelectorOption[V]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: SelectorOption[V]*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
