package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionBeforeAddEvent extends StObject {
  
  var cancellable: Boolean
  
  var defaultPrevented: Boolean
  
  var item: Any
  
  var preventDefault: js.Function
}
object CollectionBeforeAddEvent {
  
  inline def apply(cancellable: Boolean, defaultPrevented: Boolean, item: Any, preventDefault: js.Function): CollectionBeforeAddEvent = {
    val __obj = js.Dynamic.literal(cancellable = cancellable.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionBeforeAddEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionBeforeAddEvent] (val x: Self) extends AnyVal {
    
    inline def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
  }
}
