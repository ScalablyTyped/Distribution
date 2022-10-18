package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentSortBy extends StObject {
  
  /**
    * The attribute to use to sort the list of intents.
    */
  var attribute: IntentSortAttribute
  
  /**
    * The order to sort the list. You can choose ascending or descending.
    */
  var order: SortOrder
}
object IntentSortBy {
  
  inline def apply(attribute: IntentSortAttribute, order: SortOrder): IntentSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentSortBy]
  }
  
  extension [Self <: IntentSortBy](x: Self) {
    
    inline def setAttribute(value: IntentSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
