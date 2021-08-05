package typings.antd.anon

import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column[RecordType] extends StObject {
  
  var column: ColumnType[RecordType]
  
  var order: SortOrder
}
object Column {
  
  inline def apply[RecordType](column: ColumnType[RecordType]): Column[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], order = null)
    __obj.asInstanceOf[Column[RecordType]]
  }
  
  extension [Self <: Column[?], RecordType](x: Self & Column[RecordType]) {
    
    inline def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
  }
}
