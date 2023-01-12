package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotSortBy extends StObject {
  
  /**
    * The attribute to use to sort the list.
    */
  var attribute: SlotSortAttribute
  
  /**
    * The order to sort the list. You can choose ascending or descending.
    */
  var order: SortOrder
}
object SlotSortBy {
  
  inline def apply(attribute: SlotSortAttribute, order: SortOrder): SlotSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotSortBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotSortBy] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: SlotSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
