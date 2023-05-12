package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryDrillDownFilter extends StObject {
  
  /**
    * A list of the string inputs that are the values of the category drill down filter.
    */
  var CategoryValues: CategoryValueList
  
  /**
    * The column that the filter is applied to.
    */
  var Column: ColumnIdentifier
}
object CategoryDrillDownFilter {
  
  inline def apply(CategoryValues: CategoryValueList, Column: ColumnIdentifier): CategoryDrillDownFilter = {
    val __obj = js.Dynamic.literal(CategoryValues = CategoryValues.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryDrillDownFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryDrillDownFilter] (val x: Self) extends AnyVal {
    
    inline def setCategoryValues(value: CategoryValueList): Self = StObject.set(x, "CategoryValues", value.asInstanceOf[js.Any])
    
    inline def setCategoryValuesVarargs(value: CategoryValue*): Self = StObject.set(x, "CategoryValues", js.Array(value*))
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
  }
}
