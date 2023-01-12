package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionAfterRemoveEvent extends StObject {
  
  var item: Any
}
object CollectionAfterRemoveEvent {
  
  inline def apply(item: Any): CollectionAfterRemoveEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAfterRemoveEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionAfterRemoveEvent] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
