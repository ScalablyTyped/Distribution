package typings.agGrid.clientSideRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchTransactionItem extends js.Object {
  var rowDataTransaction: RowDataTransaction = js.native
  def callback(res: RowNodeTransaction): Unit = js.native
}

object BatchTransactionItem {
  @scala.inline
  def apply(callback: RowNodeTransaction => Unit, rowDataTransaction: RowDataTransaction): BatchTransactionItem = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), rowDataTransaction = rowDataTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchTransactionItem]
  }
  @scala.inline
  implicit class BatchTransactionItemOps[Self <: BatchTransactionItem] (val x: Self) extends AnyVal {
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
    def setCallback(value: RowNodeTransaction => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setRowDataTransaction(value: RowDataTransaction): Self = this.set("rowDataTransaction", value.asInstanceOf[js.Any])
  }
  
}

