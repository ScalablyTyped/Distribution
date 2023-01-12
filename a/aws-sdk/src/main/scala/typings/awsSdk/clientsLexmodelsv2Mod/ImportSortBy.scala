package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSortBy extends StObject {
  
  /**
    * The export field to use for sorting.
    */
  var attribute: ImportSortAttribute
  
  /**
    * The order to sort the list.
    */
  var order: SortOrder
}
object ImportSortBy {
  
  inline def apply(attribute: ImportSortAttribute, order: SortOrder): ImportSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSortBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportSortBy] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: ImportSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
