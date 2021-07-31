package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionAfterRemoveEvent extends StObject {
  
  var item: js.Any
}
object CollectionAfterRemoveEvent {
  
  @scala.inline
  def apply(item: js.Any): CollectionAfterRemoveEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAfterRemoveEvent]
  }
  
  @scala.inline
  implicit class CollectionAfterRemoveEventMutableBuilder[Self <: CollectionAfterRemoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
