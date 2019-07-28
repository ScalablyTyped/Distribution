package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitTransactionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn
  /**
    * The identifier of the transaction to end and commit.
    */
  var transactionId: Id
}

object CommitTransactionRequest {
  @scala.inline
  def apply(resourceArn: Arn, secretArn: Arn, transactionId: Id): CommitTransactionRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, secretArn = secretArn, transactionId = transactionId)
  
    __obj.asInstanceOf[CommitTransactionRequest]
  }
}

