package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetQueryExecutionOutput extends js.Object {
  /**
    * Information about a query execution.
    */
  var QueryExecutions: js.UndefOr[QueryExecutionList] = js.native
  /**
    * Information about the query executions that failed to run.
    */
  var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.native
}

object BatchGetQueryExecutionOutput {
  @scala.inline
  def apply(): BatchGetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetQueryExecutionOutput]
  }
  @scala.inline
  implicit class BatchGetQueryExecutionOutputOps[Self <: BatchGetQueryExecutionOutput] (val x: Self) extends AnyVal {
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
    def setQueryExecutionsVarargs(value: QueryExecution*): Self = this.set("QueryExecutions", js.Array(value :_*))
    @scala.inline
    def setQueryExecutions(value: QueryExecutionList): Self = this.set("QueryExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryExecutions: Self = this.set("QueryExecutions", js.undefined)
    @scala.inline
    def setUnprocessedQueryExecutionIdsVarargs(value: UnprocessedQueryExecutionId*): Self = this.set("UnprocessedQueryExecutionIds", js.Array(value :_*))
    @scala.inline
    def setUnprocessedQueryExecutionIds(value: UnprocessedQueryExecutionIdList): Self = this.set("UnprocessedQueryExecutionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedQueryExecutionIds: Self = this.set("UnprocessedQueryExecutionIds", js.undefined)
  }
  
}

