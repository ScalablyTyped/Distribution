package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTransactionResult extends js.Object {
  /**
    * The transaction id of the started transaction.
    */
  var TransactionId: js.UndefOr[typings.awsDashSdk.clientsQldbsessionMod.TransactionId] = js.undefined
}

object StartTransactionResult {
  @scala.inline
  def apply(TransactionId: TransactionId = null): StartTransactionResult = {
    val __obj = js.Dynamic.literal()
    if (TransactionId != null) __obj.updateDynamic("TransactionId")(TransactionId)
    __obj.asInstanceOf[StartTransactionResult]
  }
}

