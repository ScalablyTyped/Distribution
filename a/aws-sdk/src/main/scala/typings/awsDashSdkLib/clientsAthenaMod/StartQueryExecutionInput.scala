package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartQueryExecutionInput extends js.Object {
  /**
    * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once). If another StartQueryExecution request is received, the same response is returned and another query is not created. If a parameter has changed, for example, the QueryString, an error is returned.  This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  /**
    * The database within which the query executes.
    */
  var QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined
  /**
    * The SQL query statements to be executed.
    */
  var QueryString: awsDashSdkLib.clientsAthenaMod.QueryString
  /**
    * Specifies information about where and how to save the results of the query execution. If the query runs in a workgroup, then workgroup's settings may override query settings. This affects the query results location. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined
  /**
    * The name of the workgroup in which the query is being started.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
}

object StartQueryExecutionInput {
  @scala.inline
  def apply(
    QueryString: QueryString,
    ClientRequestToken: IdempotencyToken = null,
    QueryExecutionContext: QueryExecutionContext = null,
    ResultConfiguration: ResultConfiguration = null,
    WorkGroup: WorkGroupName = null
  ): StartQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryString = QueryString)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (QueryExecutionContext != null) __obj.updateDynamic("QueryExecutionContext")(QueryExecutionContext)
    if (ResultConfiguration != null) __obj.updateDynamic("ResultConfiguration")(ResultConfiguration)
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup)
    __obj.asInstanceOf[StartQueryExecutionInput]
  }
}

