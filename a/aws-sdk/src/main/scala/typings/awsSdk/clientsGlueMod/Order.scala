package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  /**
    * The name of the column.
    */
  var Column: NameString
  
  /**
    * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
    */
  var SortOrder: IntegerFlag
}
object Order {
  
  inline def apply(Column: NameString, SortOrder: IntegerFlag): Order = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], SortOrder = SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setColumn(value: NameString): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: IntegerFlag): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
  }
}
