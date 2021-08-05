package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an event occurred to an item of a menu, a list box etc. */
trait ItemEvent
  extends StObject
     with EventObject {
  
  /** specifies which item is newly highlighted. */
  var Highlighted: Double
  
  /** specifies the id of the item. */
  var ItemId: Double
  
  /** specifies which item is newly selected. */
  var Selected: Double
}
object ItemEvent {
  
  inline def apply(Highlighted: Double, ItemId: Double, Selected: Double, Source: XInterface): ItemEvent = {
    val __obj = js.Dynamic.literal(Highlighted = Highlighted.asInstanceOf[js.Any], ItemId = ItemId.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEvent]
  }
  
  extension [Self <: ItemEvent](x: Self) {
    
    inline def setHighlighted(value: Double): Self = StObject.set(x, "Highlighted", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: Double): Self = StObject.set(x, "ItemId", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Double): Self = StObject.set(x, "Selected", value.asInstanceOf[js.Any])
  }
}
