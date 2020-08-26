package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecutionStatus extends js.Object {
  /**
    * The date and time that the query completed.
    */
  var CompletionDateTime: js.UndefOr[Date] = js.native
  /**
    * The state of query execution. QUEUED indicates that the query has been submitted to the service, and Athena will execute the query as soon as resources are available. RUNNING indicates that the query is in execution phase. SUCCEEDED indicates that the query completed without errors. FAILED indicates that the query experienced an error and did not complete processing. CANCELLED indicates that a user input interrupted query execution.  Athena automatically retries your queries in cases of certain transient errors. As a result, you may see the query state transition from RUNNING or FAILED to QUEUED.  
    */
  var State: js.UndefOr[QueryExecutionState] = js.native
  /**
    * Further detail about the status of the query.
    */
  var StateChangeReason: js.UndefOr[String] = js.native
  /**
    * The date and time that the query was submitted.
    */
  var SubmissionDateTime: js.UndefOr[Date] = js.native
}

object QueryExecutionStatus {
  @scala.inline
  def apply(): QueryExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionStatus]
  }
  @scala.inline
  implicit class QueryExecutionStatusOps[Self <: QueryExecutionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompletionDateTime(value: Date): Self = this.set("CompletionDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionDateTime: Self = this.set("CompletionDateTime", js.undefined)
    @scala.inline
    def setState(value: QueryExecutionState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateChangeReason(value: String): Self = this.set("StateChangeReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateChangeReason: Self = this.set("StateChangeReason", js.undefined)
    @scala.inline
    def setSubmissionDateTime(value: Date): Self = this.set("SubmissionDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmissionDateTime: Self = this.set("SubmissionDateTime", js.undefined)
  }
  
}

