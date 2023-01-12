package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTypeSortBy extends StObject {
  
  /**
    * The attribute to use to sort the list of slot types.
    */
  var attribute: SlotTypeSortAttribute
  
  /**
    * The order to sort the list. You can say ascending or descending.
    */
  var order: SortOrder
}
object SlotTypeSortBy {
  
  inline def apply(attribute: SlotTypeSortAttribute, order: SortOrder): SlotTypeSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTypeSortBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotTypeSortBy] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: SlotTypeSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
