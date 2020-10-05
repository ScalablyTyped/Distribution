package typings.antd.anon

import typings.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftDataSource extends js.Object {
  var leftDataSource: js.Array[TransferItem] = js.native
  var rightDataSource: js.Array[TransferItem] = js.native
}

object LeftDataSource {
  @scala.inline
  def apply(leftDataSource: js.Array[TransferItem], rightDataSource: js.Array[TransferItem]): LeftDataSource = {
    val __obj = js.Dynamic.literal(leftDataSource = leftDataSource.asInstanceOf[js.Any], rightDataSource = rightDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftDataSource]
  }
  @scala.inline
  implicit class LeftDataSourceOps[Self <: LeftDataSource] (val x: Self) extends AnyVal {
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
    def setLeftDataSourceVarargs(value: TransferItem*): Self = this.set("leftDataSource", js.Array(value :_*))
    @scala.inline
    def setLeftDataSource(value: js.Array[TransferItem]): Self = this.set("leftDataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightDataSourceVarargs(value: TransferItem*): Self = this.set("rightDataSource", js.Array(value :_*))
    @scala.inline
    def setRightDataSource(value: js.Array[TransferItem]): Self = this.set("rightDataSource", value.asInstanceOf[js.Any])
  }
  
}

