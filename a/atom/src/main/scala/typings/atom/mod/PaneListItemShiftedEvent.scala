package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneListItemShiftedEvent extends StObject {
  
  /** A number indicating where the item is located. */
  var index: Double
  
  /** The pane item that was added or removed. */
  var item: js.Object
}
object PaneListItemShiftedEvent {
  
  inline def apply(index: Double, item: js.Object): PaneListItemShiftedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneListItemShiftedEvent]
  }
  
  extension [Self <: PaneListItemShiftedEvent](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
