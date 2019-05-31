package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackTransactionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn
  /**
    * The identifier of the transaction to roll back.
    */
  var transactionId: Id
}

object RollbackTransactionRequest {
  @scala.inline
  def apply(resourceArn: Arn, secretArn: Arn, transactionId: Id): RollbackTransactionRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, secretArn = secretArn, transactionId = transactionId)
  
    __obj.asInstanceOf[RollbackTransactionRequest]
  }
}

