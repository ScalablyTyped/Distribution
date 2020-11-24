package typings.antd.anon

import typings.antd.transferMod.KeyWise
import typings.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightDataSource[RecordType /* <: TransferItem */] extends js.Object {
  
  var leftDataSource: js.Array[KeyWise[RecordType]] = js.native
  
  var rightDataSource: js.Array[KeyWise[RecordType]] = js.native
}
object RightDataSource {
  
  @scala.inline
  def apply[RecordType /* <: TransferItem */](leftDataSource: js.Array[KeyWise[RecordType]], rightDataSource: js.Array[KeyWise[RecordType]]): RightDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(leftDataSource = leftDataSource.asInstanceOf[js.Any], rightDataSource = rightDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightDataSource[RecordType]]
  }
  
  @scala.inline
  implicit class RightDataSourceOps[Self <: RightDataSource[_], RecordType /* <: TransferItem */] (val x: Self with RightDataSource[RecordType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLeftDataSourceVarargs(value: KeyWise[RecordType]*): Self = this.set("leftDataSource", js.Array(value :_*))
    
    @scala.inline
    def setLeftDataSource(value: js.Array[KeyWise[RecordType]]): Self = this.set("leftDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightDataSourceVarargs(value: KeyWise[RecordType]*): Self = this.set("rightDataSource", js.Array(value :_*))
    
    @scala.inline
    def setRightDataSource(value: js.Array[KeyWise[RecordType]]): Self = this.set("rightDataSource", value.asInstanceOf[js.Any])
  }
}
