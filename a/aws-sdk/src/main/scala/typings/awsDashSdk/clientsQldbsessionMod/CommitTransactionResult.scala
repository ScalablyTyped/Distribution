package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitTransactionResult extends js.Object {
  /**
    * The commit digest of the committed transaction.
    */
  var CommitDigest: js.UndefOr[typings.awsDashSdk.clientsQldbsessionMod.CommitDigest] = js.undefined
  /**
    * The transaction id of the committed transaction.
    */
  var TransactionId: js.UndefOr[typings.awsDashSdk.clientsQldbsessionMod.TransactionId] = js.undefined
}

object CommitTransactionResult {
  @scala.inline
  def apply(CommitDigest: CommitDigest = null, TransactionId: TransactionId = null): CommitTransactionResult = {
    val __obj = js.Dynamic.literal()
    if (CommitDigest != null) __obj.updateDynamic("CommitDigest")(CommitDigest.asInstanceOf[js.Any])
    if (TransactionId != null) __obj.updateDynamic("TransactionId")(TransactionId)
    __obj.asInstanceOf[CommitTransactionResult]
  }
}

