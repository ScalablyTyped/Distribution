package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackTransactionResponse extends js.Object {
  /**
    * The status of the rollback operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.undefined
}

object RollbackTransactionResponse {
  @scala.inline
  def apply(transactionStatus: TransactionStatus = null): RollbackTransactionResponse = {
    val __obj = js.Dynamic.literal()
    if (transactionStatus != null) __obj.updateDynamic("transactionStatus")(transactionStatus)
    __obj.asInstanceOf[RollbackTransactionResponse]
  }
}

