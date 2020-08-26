package typings.agGrid.clientSideRowModelMod

import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowNodeTransaction extends js.Object {
  var add: js.Array[RowNode] = js.native
  var remove: js.Array[RowNode] = js.native
  var update: js.Array[RowNode] = js.native
}

object RowNodeTransaction {
  @scala.inline
  def apply(add: js.Array[RowNode], remove: js.Array[RowNode], update: js.Array[RowNode]): RowNodeTransaction = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowNodeTransaction]
  }
  @scala.inline
  implicit class RowNodeTransactionOps[Self <: RowNodeTransaction] (val x: Self) extends AnyVal {
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
    def setAddVarargs(value: RowNode*): Self = this.set("add", js.Array(value :_*))
    @scala.inline
    def setAdd(value: js.Array[RowNode]): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveVarargs(value: RowNode*): Self = this.set("remove", js.Array(value :_*))
    @scala.inline
    def setRemove(value: js.Array[RowNode]): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateVarargs(value: RowNode*): Self = this.set("update", js.Array(value :_*))
    @scala.inline
    def setUpdate(value: js.Array[RowNode]): Self = this.set("update", value.asInstanceOf[js.Any])
  }
  
}

