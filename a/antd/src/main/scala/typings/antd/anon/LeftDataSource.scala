package typings.antd.anon

import typings.antd.transferMod.TransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftDataSource[RecordType /* <: TransferItem */] extends StObject {
  
  var leftDataSource: js.Array[RecordType]
  
  var rightDataSource: js.Array[RecordType]
}
object LeftDataSource {
  
  @scala.inline
  def apply[RecordType /* <: TransferItem */](leftDataSource: js.Array[RecordType], rightDataSource: js.Array[RecordType]): LeftDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(leftDataSource = leftDataSource.asInstanceOf[js.Any], rightDataSource = rightDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftDataSource[RecordType]]
  }
  
  @scala.inline
  implicit class LeftDataSourceMutableBuilder[Self <: LeftDataSource[?], RecordType /* <: TransferItem */] (val x: Self & LeftDataSource[RecordType]) extends AnyVal {
    
    @scala.inline
    def setLeftDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "leftDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "leftDataSource", js.Array(value :_*))
    
    @scala.inline
    def setRightDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "rightDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "rightDataSource", js.Array(value :_*))
  }
}
