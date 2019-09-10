package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteStatementRequest extends js.Object {
  /**
    * Specifies the parameters for the parameterized statement in the request.
    */
  var Parameters: js.UndefOr[StatementParameters] = js.undefined
  /**
    * Specifies the statement of the request.
    */
  var Statement: typings.awsDashSdk.clientsQldbsessionMod.Statement
  /**
    * Specifies the transaction id of the request.
    */
  var TransactionId: typings.awsDashSdk.clientsQldbsessionMod.TransactionId
}

object ExecuteStatementRequest {
  @scala.inline
  def apply(Statement: Statement, TransactionId: TransactionId, Parameters: StatementParameters = null): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(Statement = Statement, TransactionId = TransactionId)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
}

