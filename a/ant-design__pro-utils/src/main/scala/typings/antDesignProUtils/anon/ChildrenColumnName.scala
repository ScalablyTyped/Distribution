package typings.antDesignProUtils.anon

import typings.antDesignProUtils.useEditableArrayMod.RecordKey
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenColumnName[RecordType] extends StObject {
  
  var childrenColumnName: String
  
  var data: js.Array[RecordType]
  
  var getRowKey: GetRowKey[RecordType]
  
  var key: RecordKey
  
  var row: RecordType
}
object ChildrenColumnName {
  
  inline def apply[RecordType](
    childrenColumnName: String,
    data: js.Array[RecordType],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    key: RecordKey,
    row: RecordType
  ): ChildrenColumnName[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenColumnName[RecordType]]
  }
  
  extension [Self <: ChildrenColumnName[?], RecordType](x: Self & ChildrenColumnName[RecordType]) {
    
    inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
    
    inline def setKey(value: RecordKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyVarargs(value: typings.react.mod.Key*): Self = StObject.set(x, "key", js.Array(value*))
    
    inline def setRow(value: RecordType): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
