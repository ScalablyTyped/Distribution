package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecution extends js.Object {
  /**
    * The SQL query statements which the query execution ran.
    */
  var Query: js.UndefOr[QueryString] = js.undefined
  /**
    * The database in which the query execution occurred.
    */
  var QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined
  /**
    * The unique identifier for each query execution.
    */
  var QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
  /**
    * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup.
    */
  var ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined
  /**
    * The type of query statement that was run. DDL indicates DDL query statements. DML indicates DML (Data Manipulation Language) query statements, such as CREATE TABLE AS SELECT. UTILITY indicates query statements other than DDL and DML, such as SHOW CREATE TABLE, or DESCRIBE &lt;table&gt;.
    */
  var StatementType: js.UndefOr[StatementType] = js.undefined
  /**
    * The amount of data scanned during the query execution and the amount of time that it took to execute, and the type of statement that was run.
    */
  var Statistics: js.UndefOr[QueryExecutionStatistics] = js.undefined
  /**
    * The completion date, current state, submission time, and state change reason (if applicable) for the query execution.
    */
  var Status: js.UndefOr[QueryExecutionStatus] = js.undefined
  /**
    * The name of the workgroup in which the query ran.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
}

object QueryExecution {
  @scala.inline
  def apply(
    Query: QueryString = null,
    QueryExecutionContext: QueryExecutionContext = null,
    QueryExecutionId: QueryExecutionId = null,
    ResultConfiguration: ResultConfiguration = null,
    StatementType: StatementType = null,
    Statistics: QueryExecutionStatistics = null,
    Status: QueryExecutionStatus = null,
    WorkGroup: WorkGroupName = null
  ): QueryExecution = {
    val __obj = js.Dynamic.literal()
    if (Query != null) __obj.updateDynamic("Query")(Query)
    if (QueryExecutionContext != null) __obj.updateDynamic("QueryExecutionContext")(QueryExecutionContext)
    if (QueryExecutionId != null) __obj.updateDynamic("QueryExecutionId")(QueryExecutionId)
    if (ResultConfiguration != null) __obj.updateDynamic("ResultConfiguration")(ResultConfiguration)
    if (StatementType != null) __obj.updateDynamic("StatementType")(StatementType.asInstanceOf[js.Any])
    if (Statistics != null) __obj.updateDynamic("Statistics")(Statistics)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup)
    __obj.asInstanceOf[QueryExecution]
  }
}

