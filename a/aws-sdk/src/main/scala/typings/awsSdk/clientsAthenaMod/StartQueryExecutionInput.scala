package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryExecutionInput extends StObject {
  
  /**
    * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once). If another StartQueryExecution request is received, the same response is returned and another query is not created. If a parameter has changed, for example, the QueryString, an error is returned.  This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web Services CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * A list of values for the parameters in a query. The values are applied sequentially to the parameters in the query in the order in which the parameters occur.
    */
  var ExecutionParameters: js.UndefOr[typings.awsSdk.clientsAthenaMod.ExecutionParameters] = js.undefined
  
  /**
    * The database within which the query executes.
    */
  var QueryExecutionContext: js.UndefOr[typings.awsSdk.clientsAthenaMod.QueryExecutionContext] = js.undefined
  
  /**
    * The SQL query statements to be executed.
    */
  var QueryString: typings.awsSdk.clientsAthenaMod.QueryString
  
  /**
    * Specifies information about where and how to save the results of the query execution. If the query runs in a workgroup, then workgroup's settings may override query settings. This affects the query results location. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var ResultConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.ResultConfiguration] = js.undefined
  
  /**
    * Specifies the query result reuse behavior for the query.
    */
  var ResultReuseConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.ResultReuseConfiguration] = js.undefined
  
  /**
    * The name of the workgroup in which the query is being started.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
}
object StartQueryExecutionInput {
  
  inline def apply(QueryString: QueryString): StartQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryExecutionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartQueryExecutionInput] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setExecutionParameters(value: ExecutionParameters): Self = StObject.set(x, "ExecutionParameters", value.asInstanceOf[js.Any])
    
    inline def setExecutionParametersUndefined: Self = StObject.set(x, "ExecutionParameters", js.undefined)
    
    inline def setExecutionParametersVarargs(value: ExecutionParameter*): Self = StObject.set(x, "ExecutionParameters", js.Array(value*))
    
    inline def setQueryExecutionContext(value: QueryExecutionContext): Self = StObject.set(x, "QueryExecutionContext", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionContextUndefined: Self = StObject.set(x, "QueryExecutionContext", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setResultConfiguration(value: ResultConfiguration): Self = StObject.set(x, "ResultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResultConfigurationUndefined: Self = StObject.set(x, "ResultConfiguration", js.undefined)
    
    inline def setResultReuseConfiguration(value: ResultReuseConfiguration): Self = StObject.set(x, "ResultReuseConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResultReuseConfigurationUndefined: Self = StObject.set(x, "ResultReuseConfiguration", js.undefined)
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
