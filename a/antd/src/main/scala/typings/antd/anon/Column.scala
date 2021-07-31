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
  
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType]): Column[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], order = null)
    __obj.asInstanceOf[Column[RecordType]]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column[?], RecordType] (val x: Self & Column[RecordType]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
  }
}
