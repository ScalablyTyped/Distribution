package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecutionStatus extends js.Object {
  /**
    * The date and time that the query completed.
    */
  var CompletionDateTime: js.UndefOr[_Date] = js.native
  /**
    * The state of query execution. QUEUED state is listed but is not used by Athena and is reserved for future use. RUNNING indicates that the query has been submitted to the service, and Athena will execute the query as soon as resources are available. SUCCEEDED indicates that the query completed without errors. FAILED indicates that the query experienced an error and did not complete processing. CANCELLED indicates that a user input interrupted query execution. 
    */
  var State: js.UndefOr[QueryExecutionState] = js.native
  /**
    * Further detail about the status of the query.
    */
  var StateChangeReason: js.UndefOr[String] = js.native
  /**
    * The date and time that the query was submitted.
    */
  var SubmissionDateTime: js.UndefOr[_Date] = js.native
}

object QueryExecutionStatus {
  @scala.inline
  def apply(
    CompletionDateTime: _Date = null,
    State: QueryExecutionState = null,
    StateChangeReason: String = null,
    SubmissionDateTime: _Date = null
  ): QueryExecutionStatus = {
    val __obj = js.Dynamic.literal()
    if (CompletionDateTime != null) __obj.updateDynamic("CompletionDateTime")(CompletionDateTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason.asInstanceOf[js.Any])
    if (SubmissionDateTime != null) __obj.updateDynamic("SubmissionDateTime")(SubmissionDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecutionStatus]
  }
}

