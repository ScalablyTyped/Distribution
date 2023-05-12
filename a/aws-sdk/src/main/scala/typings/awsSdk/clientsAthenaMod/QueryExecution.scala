package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecution extends StObject {
  
  /**
    * The engine version that executed the query.
    */
  var EngineVersion: js.UndefOr[typings.awsSdk.clientsAthenaMod.EngineVersion] = js.undefined
  
  /**
    * A list of values for the parameters in a query. The values are applied sequentially to the parameters in the query in the order in which the parameters occur.
    */
  var ExecutionParameters: js.UndefOr[typings.awsSdk.clientsAthenaMod.ExecutionParameters] = js.undefined
  
  /**
    * The SQL query statements which the query execution ran.
    */
  var Query: js.UndefOr[QueryString] = js.undefined
  
  /**
    * The database in which the query execution occurred.
    */
  var QueryExecutionContext: js.UndefOr[typings.awsSdk.clientsAthenaMod.QueryExecutionContext] = js.undefined
  
  /**
    * The unique identifier for each query execution.
    */
  var QueryExecutionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.QueryExecutionId] = js.undefined
  
  /**
    * The location in Amazon S3 where query and calculation results are stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup.
    */
  var ResultConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.ResultConfiguration] = js.undefined
  
  /**
    * Specifies the query result reuse behavior that was used for the query.
    */
  var ResultReuseConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.ResultReuseConfiguration] = js.undefined
  
  /**
    * The type of query statement that was run. DDL indicates DDL query statements. DML indicates DML (Data Manipulation Language) query statements, such as CREATE TABLE AS SELECT. UTILITY indicates query statements other than DDL and DML, such as SHOW CREATE TABLE, or DESCRIBE TABLE.
    */
  var StatementType: js.UndefOr[typings.awsSdk.clientsAthenaMod.StatementType] = js.undefined
  
  /**
    * Query execution statistics, such as the amount of data scanned, the amount of time that the query took to process, and the type of statement that was run.
    */
  var Statistics: js.UndefOr[QueryExecutionStatistics] = js.undefined
  
  /**
    * The completion date, current state, submission time, and state change reason (if applicable) for the query execution.
    */
  var Status: js.UndefOr[QueryExecutionStatus] = js.undefined
  
  /**
    * The kind of query statement that was run.
    */
  var SubstatementType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the workgroup in which the query ran.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
}
object QueryExecution {
  
  inline def apply(): QueryExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryExecution] (val x: Self) extends AnyVal {
    
    inline def setEngineVersion(value: EngineVersion): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setExecutionParameters(value: ExecutionParameters): Self = StObject.set(x, "ExecutionParameters", value.asInstanceOf[js.Any])
    
    inline def setExecutionParametersUndefined: Self = StObject.set(x, "ExecutionParameters", js.undefined)
    
    inline def setExecutionParametersVarargs(value: ExecutionParameter*): Self = StObject.set(x, "ExecutionParameters", js.Array(value*))
    
    inline def setQuery(value: QueryString): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionContext(value: QueryExecutionContext): Self = StObject.set(x, "QueryExecutionContext", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionContextUndefined: Self = StObject.set(x, "QueryExecutionContext", js.undefined)
    
    inline def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionIdUndefined: Self = StObject.set(x, "QueryExecutionId", js.undefined)
    
    inline def setQueryUndefined: Self = StObject.set(x, "Query", js.undefined)
    
    inline def setResultConfiguration(value: ResultConfiguration): Self = StObject.set(x, "ResultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResultConfigurationUndefined: Self = StObject.set(x, "ResultConfiguration", js.undefined)
    
    inline def setResultReuseConfiguration(value: ResultReuseConfiguration): Self = StObject.set(x, "ResultReuseConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResultReuseConfigurationUndefined: Self = StObject.set(x, "ResultReuseConfiguration", js.undefined)
    
    inline def setStatementType(value: StatementType): Self = StObject.set(x, "StatementType", value.asInstanceOf[js.Any])
    
    inline def setStatementTypeUndefined: Self = StObject.set(x, "StatementType", js.undefined)
    
    inline def setStatistics(value: QueryExecutionStatistics): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
    
    inline def setStatus(value: QueryExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubstatementType(value: String): Self = StObject.set(x, "SubstatementType", value.asInstanceOf[js.Any])
    
    inline def setSubstatementTypeUndefined: Self = StObject.set(x, "SubstatementType", js.undefined)
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
