package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitTransactionResponse extends js.Object {
  /**
    * The status of the commit operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.undefined
}

object CommitTransactionResponse {
  @scala.inline
  def apply(transactionStatus: TransactionStatus = null): CommitTransactionResponse = {
    val __obj = js.Dynamic.literal()
    if (transactionStatus != null) __obj.updateDynamic("transactionStatus")(transactionStatus)
    __obj.asInstanceOf[CommitTransactionResponse]
  }
}

