package typings.antd.transferListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferListState extends js.Object {
  /** Filter input value */
  var filterValue: String = js.native
}

object TransferListState {
  @scala.inline
  def apply(filterValue: String): TransferListState = {
    val __obj = js.Dynamic.literal(filterValue = filterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListState]
  }
  @scala.inline
  implicit class TransferListStateOps[Self <: TransferListState] (val x: Self) extends AnyVal {
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
    def setFilterValue(value: String): Self = this.set("filterValue", value.asInstanceOf[js.Any])
  }
  
}

