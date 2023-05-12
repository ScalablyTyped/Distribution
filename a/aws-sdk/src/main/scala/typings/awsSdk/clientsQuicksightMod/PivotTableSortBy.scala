package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableSortBy extends StObject {
  
  /**
    * The column sort (field id, direction) for the pivot table sort by options.
    */
  var Column: js.UndefOr[ColumnSort] = js.undefined
  
  /**
    * The data path sort (data path value, direction) for the pivot table sort by options.
    */
  var DataPath: js.UndefOr[DataPathSort] = js.undefined
  
  /**
    * The field sort (field id, direction) for the pivot table sort by options.
    */
  var Field: js.UndefOr[FieldSort] = js.undefined
}
object PivotTableSortBy {
  
  inline def apply(): PivotTableSortBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableSortBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableSortBy] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnSort): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "Column", js.undefined)
    
    inline def setDataPath(value: DataPathSort): Self = StObject.set(x, "DataPath", value.asInstanceOf[js.Any])
    
    inline def setDataPathUndefined: Self = StObject.set(x, "DataPath", js.undefined)
    
    inline def setField(value: FieldSort): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "Field", js.undefined)
  }
}
