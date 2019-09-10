package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendCommandRequest extends js.Object {
  /**
    * Command to abort the current transaction.
    */
  var AbortTransaction: js.UndefOr[AbortTransactionRequest] = js.undefined
  /**
    * Command to commit the specified transaction.
    */
  var CommitTransaction: js.UndefOr[CommitTransactionRequest] = js.undefined
  /**
    * Command to end the current session.
    */
  var EndSession: js.UndefOr[EndSessionRequest] = js.undefined
  /**
    * Command to execute a statement in the specified transaction.
    */
  var ExecuteStatement: js.UndefOr[ExecuteStatementRequest] = js.undefined
  /**
    * Command to fetch a page.
    */
  var FetchPage: js.UndefOr[FetchPageRequest] = js.undefined
  /**
    * Specifies the session token for the current command. A session token is constant throughout the life of the session. To obtain a session token, run the StartSession command. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var SessionToken: js.UndefOr[typings.awsDashSdk.clientsQldbsessionMod.SessionToken] = js.undefined
  /**
    * Command to start a new session. A session token is obtained as part of the response.
    */
  var StartSession: js.UndefOr[StartSessionRequest] = js.undefined
  /**
    * Command to start a new transaction.
    */
  var StartTransaction: js.UndefOr[StartTransactionRequest] = js.undefined
}

object SendCommandRequest {
  @scala.inline
  def apply(
    AbortTransaction: AbortTransactionRequest = null,
    CommitTransaction: CommitTransactionRequest = null,
    EndSession: EndSessionRequest = null,
    ExecuteStatement: ExecuteStatementRequest = null,
    FetchPage: FetchPageRequest = null,
    SessionToken: SessionToken = null,
    StartSession: StartSessionRequest = null,
    StartTransaction: StartTransactionRequest = null
  ): SendCommandRequest = {
    val __obj = js.Dynamic.literal()
    if (AbortTransaction != null) __obj.updateDynamic("AbortTransaction")(AbortTransaction)
    if (CommitTransaction != null) __obj.updateDynamic("CommitTransaction")(CommitTransaction)
    if (EndSession != null) __obj.updateDynamic("EndSession")(EndSession)
    if (ExecuteStatement != null) __obj.updateDynamic("ExecuteStatement")(ExecuteStatement)
    if (FetchPage != null) __obj.updateDynamic("FetchPage")(FetchPage)
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken)
    if (StartSession != null) __obj.updateDynamic("StartSession")(StartSession)
    if (StartTransaction != null) __obj.updateDynamic("StartTransaction")(StartTransaction)
    __obj.asInstanceOf[SendCommandRequest]
  }
}

