package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitTransactionRequest extends js.Object {
  /**
    * Specifies the commit digest for the transaction to commit. For every active transaction, the commit digest must be passed. QLDB validates CommitDigest and rejects the commit with an error if the digest computed on the client does not match the digest computed by QLDB.
    */
  var CommitDigest: typings.awsDashSdk.clientsQldbsessionMod.CommitDigest
  /**
    * Specifies the transaction id of the transaction to commit.
    */
  var TransactionId: typings.awsDashSdk.clientsQldbsessionMod.TransactionId
}

object CommitTransactionRequest {
  @scala.inline
  def apply(CommitDigest: CommitDigest, TransactionId: TransactionId): CommitTransactionRequest = {
    val __obj = js.Dynamic.literal(CommitDigest = CommitDigest.asInstanceOf[js.Any], TransactionId = TransactionId)
  
    __obj.asInstanceOf[CommitTransactionRequest]
  }
}

