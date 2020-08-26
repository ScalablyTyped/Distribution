package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecution extends js.Object {
  /**
    * The SQL query statements which the query execution ran.
    */
  var Query: js.UndefOr[QueryString] = js.native
  /**
    * The database in which the query execution occurred.
    */
  var QueryExecutionContext: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionContext] = js.native
  /**
    * The unique identifier for each query execution.
    */
  var QueryExecutionId: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionId] = js.native
  /**
    * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup.
    */
  var ResultConfiguration: js.UndefOr[typings.awsSdk.athenaMod.ResultConfiguration] = js.native
  /**
    * The type of query statement that was run. DDL indicates DDL query statements. DML indicates DML (Data Manipulation Language) query statements, such as CREATE TABLE AS SELECT. UTILITY indicates query statements other than DDL and DML, such as SHOW CREATE TABLE, or DESCRIBE &lt;table&gt;.
    */
  var StatementType: js.UndefOr[typings.awsSdk.athenaMod.StatementType] = js.native
  /**
    * Query execution statistics, such as the amount of data scanned, the amount of time that the query took to process, and the type of statement that was run.
    */
  var Statistics: js.UndefOr[QueryExecutionStatistics] = js.native
  /**
    * The completion date, current state, submission time, and state change reason (if applicable) for the query execution.
    */
  var Status: js.UndefOr[QueryExecutionStatus] = js.native
  /**
    * The name of the workgroup in which the query ran.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}

object QueryExecution {
  @scala.inline
  def apply(): QueryExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecution]
  }
  @scala.inline
  implicit class QueryExecutionOps[Self <: QueryExecution] (val x: Self) extends AnyVal {
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
    def setQuery(value: QueryString): Self = this.set("Query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("Query", js.undefined)
    @scala.inline
    def setQueryExecutionContext(value: QueryExecutionContext): Self = this.set("QueryExecutionContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryExecutionContext: Self = this.set("QueryExecutionContext", js.undefined)
    @scala.inline
    def setQueryExecutionId(value: QueryExecutionId): Self = this.set("QueryExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryExecutionId: Self = this.set("QueryExecutionId", js.undefined)
    @scala.inline
    def setResultConfiguration(value: ResultConfiguration): Self = this.set("ResultConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultConfiguration: Self = this.set("ResultConfiguration", js.undefined)
    @scala.inline
    def setStatementType(value: StatementType): Self = this.set("StatementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatementType: Self = this.set("StatementType", js.undefined)
    @scala.inline
    def setStatistics(value: QueryExecutionStatistics): Self = this.set("Statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("Statistics", js.undefined)
    @scala.inline
    def setStatus(value: QueryExecutionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = this.set("WorkGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkGroup: Self = this.set("WorkGroup", js.undefined)
  }
  
}

