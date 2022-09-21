package typings.antd.tableInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCurrentDataSource[RecordType] extends StObject {
  
  var action: TableAction
  
  var currentDataSource: js.Array[RecordType]
}
object TableCurrentDataSource {
  
  inline def apply[RecordType](action: TableAction, currentDataSource: js.Array[RecordType]): TableCurrentDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], currentDataSource = currentDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCurrentDataSource[RecordType]]
  }
  
  extension [Self <: TableCurrentDataSource[?], RecordType](x: Self & TableCurrentDataSource[RecordType]) {
    
    inline def setAction(value: TableAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCurrentDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "currentDataSource", value.asInstanceOf[js.Any])
    
    inline def setCurrentDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "currentDataSource", js.Array(value*))
  }
}
