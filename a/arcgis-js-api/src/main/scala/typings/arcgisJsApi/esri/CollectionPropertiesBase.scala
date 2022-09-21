package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionPropertiesBase[T] extends StObject {
  
  var items: js.UndefOr[js.Array[T]] = js.undefined
}
object CollectionPropertiesBase {
  
  inline def apply[T](): CollectionPropertiesBase[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPropertiesBase[T]]
  }
  
  extension [Self <: CollectionPropertiesBase[?], T](x: Self & CollectionPropertiesBase[T]) {
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
