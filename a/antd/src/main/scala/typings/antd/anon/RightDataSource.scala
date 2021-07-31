package typings.antd.anon

import typings.antd.transferMod.KeyWise
import typings.antd.transferMod.TransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightDataSource[RecordType /* <: TransferItem */] extends StObject {
  
  var leftDataSource: js.Array[KeyWise[RecordType]]
  
  var rightDataSource: js.Array[KeyWise[RecordType]]
}
object RightDataSource {
  
  @scala.inline
  def apply[RecordType /* <: TransferItem */](leftDataSource: js.Array[KeyWise[RecordType]], rightDataSource: js.Array[KeyWise[RecordType]]): RightDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(leftDataSource = leftDataSource.asInstanceOf[js.Any], rightDataSource = rightDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightDataSource[RecordType]]
  }
  
  @scala.inline
  implicit class RightDataSourceMutableBuilder[Self <: RightDataSource[?], RecordType /* <: TransferItem */] (val x: Self & RightDataSource[RecordType]) extends AnyVal {
    
    @scala.inline
    def setLeftDataSource(value: js.Array[KeyWise[RecordType]]): Self = StObject.set(x, "leftDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftDataSourceVarargs(value: KeyWise[RecordType]*): Self = StObject.set(x, "leftDataSource", js.Array(value :_*))
    
    @scala.inline
    def setRightDataSource(value: js.Array[KeyWise[RecordType]]): Self = StObject.set(x, "rightDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightDataSourceVarargs(value: KeyWise[RecordType]*): Self = StObject.set(x, "rightDataSource", js.Array(value :_*))
  }
}
