package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackTransactionResponse extends js.Object {
  /**
    * The status of the rollback operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.native
}

object RollbackTransactionResponse {
  @scala.inline
  def apply(transactionStatus: TransactionStatus = null): RollbackTransactionResponse = {
    val __obj = js.Dynamic.literal()
    if (transactionStatus != null) __obj.updateDynamic("transactionStatus")(transactionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackTransactionResponse]
  }
}

