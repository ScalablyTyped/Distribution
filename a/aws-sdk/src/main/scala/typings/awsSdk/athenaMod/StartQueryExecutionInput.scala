package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartQueryExecutionInput extends js.Object {
  
  /**
    * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once). If another StartQueryExecution request is received, the same response is returned and another query is not created. If a parameter has changed, for example, the QueryString, an error is returned.  This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.native
  
  /**
    * The database within which the query executes.
    */
  var QueryExecutionContext: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionContext] = js.native
  
  /**
    * The SQL query statements to be executed.
    */
  var QueryString: typings.awsSdk.athenaMod.QueryString = js.native
  
  /**
    * Specifies information about where and how to save the results of the query execution. If the query runs in a workgroup, then workgroup's settings may override query settings. This affects the query results location. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var ResultConfiguration: js.UndefOr[typings.awsSdk.athenaMod.ResultConfiguration] = js.native
  
  /**
    * The name of the workgroup in which the query is being started.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}
object StartQueryExecutionInput {
  
  @scala.inline
  def apply(QueryString: QueryString): StartQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryExecutionInput]
  }
  
  @scala.inline
  implicit class StartQueryExecutionInputOps[Self <: StartQueryExecutionInput] (val x: Self) extends AnyVal {
    
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
    def setQueryString(value: QueryString): Self = this.set("QueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: IdempotencyToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    
    @scala.inline
    def setQueryExecutionContext(value: QueryExecutionContext): Self = this.set("QueryExecutionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryExecutionContext: Self = this.set("QueryExecutionContext", js.undefined)
    
    @scala.inline
    def setResultConfiguration(value: ResultConfiguration): Self = this.set("ResultConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultConfiguration: Self = this.set("ResultConfiguration", js.undefined)
    
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = this.set("WorkGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkGroup: Self = this.set("WorkGroup", js.undefined)
  }
}
