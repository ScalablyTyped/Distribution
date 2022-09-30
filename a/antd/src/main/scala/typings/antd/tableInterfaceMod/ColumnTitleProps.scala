package typings.antd.tableInterfaceMod

import typings.antd.anon.Column
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnTitleProps[RecordType] extends StObject {
  
  var filters: js.UndefOr[Record[String, FilterValue]] = js.undefined
  
  /** @deprecated Please use `sorterColumns` instead. */
  var sortColumn: js.UndefOr[ColumnType[RecordType]] = js.undefined
  
  var sortColumns: js.UndefOr[js.Array[Column[RecordType]]] = js.undefined
  
  /** @deprecated Please use `sorterColumns` instead. */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object ColumnTitleProps {
  
  inline def apply[RecordType](): ColumnTitleProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTitleProps[RecordType]]
  }
  
  extension [Self <: ColumnTitleProps[?], RecordType](x: Self & ColumnTitleProps[RecordType]) {
    
    inline def setFilters(value: Record[String, FilterValue]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setSortColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
    
    inline def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
    
    inline def setSortColumns(value: js.Array[Column[RecordType]]): Self = StObject.set(x, "sortColumns", value.asInstanceOf[js.Any])
    
    inline def setSortColumnsUndefined: Self = StObject.set(x, "sortColumns", js.undefined)
    
    inline def setSortColumnsVarargs(value: Column[RecordType]*): Self = StObject.set(x, "sortColumns", js.Array(value*))
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
