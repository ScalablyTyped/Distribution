package typings.antd.libTableInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SorterResult[RecordType] extends StObject {
  
  var column: js.UndefOr[ColumnType[RecordType]] = js.undefined
  
  var columnKey: js.UndefOr[Key] = js.undefined
  
  var field: js.UndefOr[Key | js.Array[Key]] = js.undefined
  
  var order: js.UndefOr[SortOrder] = js.undefined
}
object SorterResult {
  
  inline def apply[RecordType](): SorterResult[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SorterResult[RecordType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SorterResult[?], RecordType] (val x: Self & SorterResult[RecordType]) extends AnyVal {
    
    inline def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setField(value: Key | js.Array[Key]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: Key*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
