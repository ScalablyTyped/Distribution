package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecution extends StObject {
  
  /**
    * The SQL query statements which the query execution ran.
    */
  var Query: js.UndefOr[QueryString] = js.undefined
  
  /**
    * The database in which the query execution occurred.
    */
  var QueryExecutionContext: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionContext] = js.undefined
  
  /**
    * The unique identifier for each query execution.
    */
  var QueryExecutionId: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionId] = js.undefined
  
  /**
    * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup.
    */
  var ResultConfiguration: js.UndefOr[typings.awsSdk.athenaMod.ResultConfiguration] = js.undefined
  
  /**
    * The type of query statement that was run. DDL indicates DDL query statements. DML indicates DML (Data Manipulation Language) query statements, such as CREATE TABLE AS SELECT. UTILITY indicates query statements other than DDL and DML, such as SHOW CREATE TABLE, or DESCRIBE &lt;table&gt;.
    */
  var StatementType: js.UndefOr[typings.awsSdk.athenaMod.StatementType] = js.undefined
  
  /**
    * Query execution statistics, such as the amount of data scanned, the amount of time that the query took to process, and the type of statement that was run.
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
  
  inline def apply(): QueryExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecution]
  }
  
  extension [Self <: QueryExecution](x: Self) {
    
    inline def setQuery(value: QueryString): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionContext(value: QueryExecutionContext): Self = StObject.set(x, "QueryExecutionContext", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionContextUndefined: Self = StObject.set(x, "QueryExecutionContext", js.undefined)
    
    inline def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionIdUndefined: Self = StObject.set(x, "QueryExecutionId", js.undefined)
    
    inline def setQueryUndefined: Self = StObject.set(x, "Query", js.undefined)
    
    inline def setResultConfiguration(value: ResultConfiguration): Self = StObject.set(x, "ResultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResultConfigurationUndefined: Self = StObject.set(x, "ResultConfiguration", js.undefined)
    
    inline def setStatementType(value: StatementType): Self = StObject.set(x, "StatementType", value.asInstanceOf[js.Any])
    
    inline def setStatementTypeUndefined: Self = StObject.set(x, "StatementType", js.undefined)
    
    inline def setStatistics(value: QueryExecutionStatistics): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
    
    inline def setStatus(value: QueryExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
