package typings.agGrid.clientSideRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDataTransaction extends js.Object {
  var add: js.UndefOr[js.Array[_]] = js.native
  var addIndex: js.UndefOr[Double] = js.native
  var remove: js.UndefOr[js.Array[_]] = js.native
  var update: js.UndefOr[js.Array[_]] = js.native
}

object RowDataTransaction {
  @scala.inline
  def apply(): RowDataTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDataTransaction]
  }
  @scala.inline
  implicit class RowDataTransactionOps[Self <: RowDataTransaction] (val x: Self) extends AnyVal {
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
    def setAddVarargs(value: js.Any*): Self = this.set("add", js.Array(value :_*))
    @scala.inline
    def setAdd(value: js.Array[_]): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAddIndex(value: Double): Self = this.set("addIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddIndex: Self = this.set("addIndex", js.undefined)
    @scala.inline
    def setRemoveVarargs(value: js.Any*): Self = this.set("remove", js.Array(value :_*))
    @scala.inline
    def setRemove(value: js.Array[_]): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setUpdateVarargs(value: js.Any*): Self = this.set("update", js.Array(value :_*))
    @scala.inline
    def setUpdate(value: js.Array[_]): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

