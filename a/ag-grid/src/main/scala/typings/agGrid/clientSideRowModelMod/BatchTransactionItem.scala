package typings.agGrid.clientSideRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchTransactionItem extends js.Object {
  var rowDataTransaction: RowDataTransaction
  def callback(res: RowNodeTransaction): Unit
}

object BatchTransactionItem {
  @scala.inline
  def apply(callback: RowNodeTransaction => Unit, rowDataTransaction: RowDataTransaction): BatchTransactionItem = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), rowDataTransaction = rowDataTransaction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchTransactionItem]
  }
}

