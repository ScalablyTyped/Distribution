package typings
package agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchTransactionItem extends js.Object {
  var rowDataTransaction: RowDataTransaction
  def callback(res: RowNodeTransaction): scala.Unit
}

object BatchTransactionItem {
  @scala.inline
  def apply(callback: RowNodeTransaction => scala.Unit, rowDataTransaction: RowDataTransaction): BatchTransactionItem = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), rowDataTransaction = rowDataTransaction)
  
    __obj.asInstanceOf[BatchTransactionItem]
  }
}

