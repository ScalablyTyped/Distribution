package typings.antd.anon

import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column[RecordType] extends StObject {
  
  var column: ColumnType[RecordType] = js.native
  
  var order: SortOrder = js.native
}
object Column {
  
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType]): Column[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[RecordType]]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column[_], RecordType] (val x: Self with Column[RecordType]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
  }
}
