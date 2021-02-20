package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionPropertiesBase[T] extends StObject {
  
  var items: js.UndefOr[js.Array[T]] = js.native
}
object CollectionPropertiesBase {
  
  @scala.inline
  def apply[T](): CollectionPropertiesBase[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPropertiesBase[T]]
  }
  
  @scala.inline
  implicit class CollectionPropertiesBaseMutableBuilder[Self <: CollectionPropertiesBase[_], T] (val x: Self with CollectionPropertiesBase[T]) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
