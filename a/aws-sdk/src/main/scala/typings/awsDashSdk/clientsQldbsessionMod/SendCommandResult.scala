package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendCommandResult extends js.Object {
  /**
    * Contains the details of the aborted transaction.
    */
  var AbortTransaction: js.UndefOr[AbortTransactionResult] = js.undefined
  /**
    * Contains the details of the committed transaction.
    */
  var CommitTransaction: js.UndefOr[CommitTransactionResult] = js.undefined
  /**
    * Contains the details of the ended session.
    */
  var EndSession: js.UndefOr[EndSessionResult] = js.undefined
  /**
    * Contains the details of the executed statement.
    */
  var ExecuteStatement: js.UndefOr[ExecuteStatementResult] = js.undefined
  /**
    * Contains the details of the fetched page.
    */
  var FetchPage: js.UndefOr[FetchPageResult] = js.undefined
  /**
    * Contains the details of the started session that includes a session token. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var StartSession: js.UndefOr[StartSessionResult] = js.undefined
  /**
    * Contains the details of the started transaction.
    */
  var StartTransaction: js.UndefOr[StartTransactionResult] = js.undefined
}

object SendCommandResult {
  @scala.inline
  def apply(
    AbortTransaction: AbortTransactionResult = null,
    CommitTransaction: CommitTransactionResult = null,
    EndSession: EndSessionResult = null,
    ExecuteStatement: ExecuteStatementResult = null,
    FetchPage: FetchPageResult = null,
    StartSession: StartSessionResult = null,
    StartTransaction: StartTransactionResult = null
  ): SendCommandResult = {
    val __obj = js.Dynamic.literal()
    if (AbortTransaction != null) __obj.updateDynamic("AbortTransaction")(AbortTransaction)
    if (CommitTransaction != null) __obj.updateDynamic("CommitTransaction")(CommitTransaction)
    if (EndSession != null) __obj.updateDynamic("EndSession")(EndSession)
    if (ExecuteStatement != null) __obj.updateDynamic("ExecuteStatement")(ExecuteStatement)
    if (FetchPage != null) __obj.updateDynamic("FetchPage")(FetchPage)
    if (StartSession != null) __obj.updateDynamic("StartSession")(StartSession)
    if (StartTransaction != null) __obj.updateDynamic("StartTransaction")(StartTransaction)
    __obj.asInstanceOf[SendCommandResult]
  }
}

