package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSortBy extends StObject {
  
  /**
    * The export field to use for sorting.
    */
  var attribute: ExportSortAttribute
  
  /**
    * The order to sort the list.
    */
  var order: SortOrder
}
object ExportSortBy {
  
  inline def apply(attribute: ExportSortAttribute, order: SortOrder): ExportSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSortBy]
  }
  
  extension [Self <: ExportSortBy](x: Self) {
    
    inline def setAttribute(value: ExportSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
