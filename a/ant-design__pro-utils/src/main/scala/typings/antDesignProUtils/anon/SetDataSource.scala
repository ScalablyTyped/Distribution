package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDataSource[RecordType] extends StObject {
  
  var childrenColumnName: js.UndefOr[String] = js.undefined
  
  var dataSource: RecordType
  
  def setDataSource(dataSource: RecordType): Unit
}
object SetDataSource {
  
  inline def apply[RecordType](dataSource: RecordType, setDataSource: RecordType => Unit): SetDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], setDataSource = js.Any.fromFunction1(setDataSource))
    __obj.asInstanceOf[SetDataSource[RecordType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDataSource[?], RecordType] (val x: Self & SetDataSource[RecordType]) extends AnyVal {
    
    inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
    
    inline def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
    
    inline def setDataSource(value: RecordType): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setSetDataSource(value: RecordType => Unit): Self = StObject.set(x, "setDataSource", js.Any.fromFunction1(value))
  }
}
