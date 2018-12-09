package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/athena", "Athena")
@js.native
object AthenaNs extends js.Object {
  
  trait BatchGetNamedQueryInput extends js.Object {
    /**
         * An array of query IDs.
         */
    var NamedQueryIds: NamedQueryIdList
  }
  
  
  trait BatchGetNamedQueryOutput extends js.Object {
    /**
         * Information about the named query IDs submitted.
         */
    var NamedQueries: js.UndefOr[NamedQueryList] = js.undefined
    /**
         * Information about provided query IDs.
         */
    var UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.undefined
  }
  
  
  trait BatchGetQueryExecutionInput extends js.Object {
    /**
         * An array of query execution IDs.
         */
    var QueryExecutionIds: QueryExecutionIdList
  }
  
  
  trait BatchGetQueryExecutionOutput extends js.Object {
    /**
         * Information about a query execution.
         */
    var QueryExecutions: js.UndefOr[QueryExecutionList] = js.undefined
    /**
         * Information about the query executions that failed to run.
         */
    var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait ColumnInfo extends js.Object {
    /**
         * Indicates whether values in the column are case-sensitive.
         */
    var CaseSensitive: js.UndefOr[Boolean] = js.undefined
    /**
         * The catalog to which the query results belong.
         */
    var CatalogName: js.UndefOr[String] = js.undefined
    /**
         * A column label.
         */
    var Label: js.UndefOr[String] = js.undefined
    /**
         * The name of the column.
         */
    var Name: String
    /**
         * Indicates the column's nullable status.
         */
    var Nullable: js.UndefOr[ColumnNullable] = js.undefined
    /**
         * For DECIMAL data types, specifies the total number of digits, up to 38. For performance reasons, we recommend up to 18 digits.
         */
    var Precision: js.UndefOr[Integer] = js.undefined
    /**
         * For DECIMAL data types, specifies the total number of digits in the fractional part of the value. Defaults to 0.
         */
    var Scale: js.UndefOr[Integer] = js.undefined
    /**
         * The schema name (database name) to which the query results belong.
         */
    var SchemaName: js.UndefOr[String] = js.undefined
    /**
         * The table name for the query results.
         */
    var TableName: js.UndefOr[String] = js.undefined
    /**
         * The data type of the column.
         */
    var Type: String
  }
  
  
  trait CreateNamedQueryInput extends js.Object {
    /**
         * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once). If another CreateNamedQuery request is received, the same response is returned and another query is not created. If a parameter has changed, for example, the QueryString, an error is returned.  This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail. 
         */
    var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
    /**
         * The database to which the query belongs.
         */
    var Database: DatabaseString
    /**
         * A brief explanation of the query.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * The plain language name for the query.
         */
    var Name: NameString
    /**
         * The text of the query itself. In other words, all query statements.
         */
    var QueryString: QueryString
  }
  
  
  trait CreateNamedQueryOutput extends js.Object {
    /**
         * The unique ID of the query.
         */
    var NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
  }
  
  
  trait Datum extends js.Object {
    /**
         * The value of the datum.
         */
    var VarCharValue: js.UndefOr[datumString] = js.undefined
  }
  
  
  trait DeleteNamedQueryInput extends js.Object {
    /**
         * The unique ID of the query to delete.
         */
    var NamedQueryId: NamedQueryId
  }
  
  
  trait DeleteNamedQueryOutput extends js.Object
  
  
  trait EncryptionConfiguration extends js.Object {
    /**
         * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (SSE-S3), server-side encryption with KMS-managed keys (SSE-KMS), or client-side encryption with KMS-managed keys (CSE-KMS) is used.
         */
    var EncryptionOption: EncryptionOption
    /**
         * For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
         */
    var KmsKey: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetNamedQueryInput extends js.Object {
    /**
         * The unique ID of the query. Use ListNamedQueries to get query IDs.
         */
    var NamedQueryId: NamedQueryId
  }
  
  
  trait GetNamedQueryOutput extends js.Object {
    /**
         * Information about the query.
         */
    var NamedQuery: js.UndefOr[NamedQuery] = js.undefined
  }
  
  
  trait GetQueryExecutionInput extends js.Object {
    /**
         * The unique ID of the query execution.
         */
    var QueryExecutionId: QueryExecutionId
  }
  
  
  trait GetQueryExecutionOutput extends js.Object {
    /**
         * Information about the query execution.
         */
    var QueryExecution: js.UndefOr[QueryExecution] = js.undefined
  }
  
  
  trait GetQueryResultsInput extends js.Object {
    /**
         * The maximum number of results (rows) to return in this request.
         */
    var MaxResults: js.UndefOr[MaxQueryResults] = js.undefined
    /**
         * The token that specifies where to start pagination if a previous request was truncated.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * The unique ID of the query execution.
         */
    var QueryExecutionId: QueryExecutionId
  }
  
  
  trait GetQueryResultsOutput extends js.Object {
    /**
         * A token to be used by the next request if this request is truncated.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * The results of the query execution.
         */
    var ResultSet: js.UndefOr[ResultSet] = js.undefined
    /**
         * The number of rows inserted with a CREATE TABLE AS SELECT statement. 
         */
    var UpdateCount: js.UndefOr[Long] = js.undefined
  }
  
  
  trait ListNamedQueriesInput extends js.Object {
    /**
         * The maximum number of queries to return in this request.
         */
    var MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined
    /**
         * The token that specifies where to start pagination if a previous request was truncated.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait ListNamedQueriesOutput extends js.Object {
    /**
         * The list of unique query IDs.
         */
    var NamedQueryIds: js.UndefOr[NamedQueryIdList] = js.undefined
    /**
         * A token to be used by the next request if this request is truncated.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait ListQueryExecutionsInput extends js.Object {
    /**
         * The maximum number of query executions to return in this request.
         */
    var MaxResults: js.UndefOr[MaxQueryExecutionsCount] = js.undefined
    /**
         * The token that specifies where to start pagination if a previous request was truncated.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait ListQueryExecutionsOutput extends js.Object {
    /**
         * A token to be used by the next request if this request is truncated.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * The unique IDs of each query execution as an array of strings.
         */
    var QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined
  }
  
  
  trait NamedQuery extends js.Object {
    /**
         * The database to which the query belongs.
         */
    var Database: DatabaseString
    /**
         * A brief description of the query.
         */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
         * The plain-language name of the query.
         */
    var Name: NameString
    /**
         * The unique identifier of the query.
         */
    var NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    /**
         * The SQL query statements that comprise the query.
         */
    var QueryString: QueryString
  }
  
  
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
         * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query results.
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
  }
  
  
  trait QueryExecutionContext extends js.Object {
    /**
         * The name of the database.
         */
    var Database: js.UndefOr[DatabaseString] = js.undefined
  }
  
  
  trait QueryExecutionStatistics extends js.Object {
    /**
         * The number of bytes in the data that was queried.
         */
    var DataScannedInBytes: js.UndefOr[Long] = js.undefined
    /**
         * The number of milliseconds that the query took to execute.
         */
    var EngineExecutionTimeInMillis: js.UndefOr[Long] = js.undefined
  }
  
  
  trait QueryExecutionStatus extends js.Object {
    /**
         * The date and time that the query completed.
         */
    var CompletionDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The state of query execution. QUEUED state is listed but is not used by Athena and is reserved for future use. RUNNING indicates that the query has been submitted to the service, and Athena will execute the query as soon as resources are available. SUCCEEDED indicates that the query completed without error. FAILED indicates that the query experienced an error and did not complete processing.CANCELLED indicates that user input interrupted query execution. 
         */
    var State: js.UndefOr[QueryExecutionState] = js.undefined
    /**
         * Further detail about the status of the query.
         */
    var StateChangeReason: js.UndefOr[String] = js.undefined
    /**
         * The date and time that the query was submitted.
         */
    var SubmissionDateTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait ResultConfiguration extends js.Object {
    /**
         * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, SSE-KMS or CSE-KMS) and key information.
         */
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
    /**
         * The location in Amazon S3 where your query results are stored, such as s3://path/to/query/bucket/. For more information, see Queries and Query Result Files.  
         */
    var OutputLocation: String
  }
  
  
  trait ResultSet extends js.Object {
    /**
         * The metadata that describes the column structure and data types of a table of query results.
         */
    var ResultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined
    /**
         * The rows in the table.
         */
    var Rows: js.UndefOr[RowList] = js.undefined
  }
  
  
  trait ResultSetMetadata extends js.Object {
    /**
         * Information about the columns returned in a query result metadata.
         */
    var ColumnInfo: js.UndefOr[ColumnInfoList] = js.undefined
  }
  
  
  trait Row extends js.Object {
    /**
         * The data that populates a row in a query result table.
         */
    var Data: js.UndefOr[datumList] = js.undefined
  }
  
  
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
    var QueryString: QueryString
    /**
         * Specifies information about where and how to save the results of the query execution.
         */
    var ResultConfiguration: ResultConfiguration
  }
  
  
  trait StartQueryExecutionOutput extends js.Object {
    /**
         * The unique ID of the query that ran as a result of this request.
         */
    var QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
  }
  
  
  trait StopQueryExecutionInput extends js.Object {
    /**
         * The unique ID of the query execution to stop.
         */
    var QueryExecutionId: QueryExecutionId
  }
  
  
  trait StopQueryExecutionOutput extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Use ListNamedQueries to get the list of named query IDs. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries are different from executed queries. Use BatchGetQueryExecution to get details about each unique query execution, and ListQueryExecutions to get a list of query execution IDs.
       */
    def batchGetNamedQuery(): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Use ListNamedQueries to get the list of named query IDs. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries are different from executed queries. Use BatchGetQueryExecution to get details about each unique query execution, and ListQueryExecutions to get a list of query execution IDs.
       */
    def batchGetNamedQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Use ListNamedQueries to get the list of named query IDs. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries are different from executed queries. Use BatchGetQueryExecution to get details about each unique query execution, and ListQueryExecutions to get a list of query execution IDs.
       */
    def batchGetNamedQuery(params: BatchGetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Use ListNamedQueries to get the list of named query IDs. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries are different from executed queries. Use BatchGetQueryExecution to get details about each unique query execution, and ListQueryExecutions to get a list of query execution IDs.
       */
    def batchGetNamedQuery(
      params: BatchGetNamedQueryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. To get a list of query execution IDs, use ListQueryExecutions. Query executions are different from named (saved) queries. Use BatchGetNamedQuery to get details about named queries.
       */
    def batchGetQueryExecution(): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. To get a list of query execution IDs, use ListQueryExecutions. Query executions are different from named (saved) queries. Use BatchGetNamedQuery to get details about named queries.
       */
    def batchGetQueryExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. To get a list of query execution IDs, use ListQueryExecutions. Query executions are different from named (saved) queries. Use BatchGetNamedQuery to get details about named queries.
       */
    def batchGetQueryExecution(params: BatchGetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. To get a list of query execution IDs, use ListQueryExecutions. Query executions are different from named (saved) queries. Use BatchGetNamedQuery to get details about named queries.
       */
    def batchGetQueryExecution(
      params: BatchGetQueryExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def createNamedQuery(): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def createNamedQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def createNamedQuery(params: CreateNamedQueryInput): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def createNamedQuery(
      params: CreateNamedQueryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def deleteNamedQuery(): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def deleteNamedQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def deleteNamedQuery(params: DeleteNamedQueryInput): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def deleteNamedQuery(
      params: DeleteNamedQueryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a single query.
       */
    def getNamedQuery(): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a single query.
       */
    def getNamedQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a single query.
       */
    def getNamedQuery(params: GetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a single query.
       */
    def getNamedQuery(
      params: GetNamedQueryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a single execution of a query. Each time a query executes, information about the query execution is saved with a unique ID.
       */
    def getQueryExecution(): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a single execution of a query. Each time a query executes, information about the query execution is saved with a unique ID.
       */
    def getQueryExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a single execution of a query. Each time a query executes, information about the query execution is saved with a unique ID.
       */
    def getQueryExecution(params: GetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a single execution of a query. Each time a query executes, information about the query execution is saved with a unique ID.
       */
    def getQueryExecution(
      params: GetQueryExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the results of a single query execution specified by QueryExecutionId. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
       */
    def getQueryResults(): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the results of a single query execution specified by QueryExecutionId. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
       */
    def getQueryResults(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryResultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the results of a single query execution specified by QueryExecutionId. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
       */
    def getQueryResults(params: GetQueryResultsInput): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the results of a single query execution specified by QueryExecutionId. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
       */
    def getQueryResults(
      params: GetQueryResultsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryResultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of all available query IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def listNamedQueries(): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of all available query IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def listNamedQueries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListNamedQueriesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of all available query IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def listNamedQueries(params: ListNamedQueriesInput): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of all available query IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def listNamedQueries(
      params: ListNamedQueriesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListNamedQueriesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of all available query execution IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def listQueryExecutions(): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of all available query execution IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def listQueryExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQueryExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of all available query execution IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def listQueryExecutions(params: ListQueryExecutionsInput): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of all available query execution IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def listQueryExecutions(
      params: ListQueryExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQueryExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Runs (executes) the SQL query statements contained in the Query string. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def startQueryExecution(): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Runs (executes) the SQL query statements contained in the Query string. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def startQueryExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Runs (executes) the SQL query statements contained in the Query string. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def startQueryExecution(params: StartQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Runs (executes) the SQL query statements contained in the Query string. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def startQueryExecution(
      params: StartQueryExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a query execution. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def stopQueryExecution(): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a query execution. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def stopQueryExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a query execution. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def stopQueryExecution(params: StopQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops a query execution. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
       */
    def stopQueryExecution(
      params: StopQueryExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UnprocessedNamedQueryId extends js.Object {
    /**
         * The error code returned when the processing request for the named query failed, if applicable.
         */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
         * The error message returned when the processing request for the named query failed, if applicable.
         */
    var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
         * The unique identifier of the named query.
         */
    var NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
  }
  
  
  trait UnprocessedQueryExecutionId extends js.Object {
    /**
         * The error code returned when the query execution failed to process, if applicable.
         */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
         * The error message returned when the query execution failed to process, if applicable.
         */
    var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
         * The unique identifier of the query execution.
         */
    var QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ColumnInfoList = js.Array[ColumnInfo]
  type ColumnNullable = awsDashSdkLib.awsDashSdkLibStrings.NOT_NULL | awsDashSdkLib.awsDashSdkLibStrings.NULLABLE | awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN | java.lang.String
  type DatabaseString = java.lang.String
  type DescriptionString = java.lang.String
  type EncryptionOption = awsDashSdkLib.awsDashSdkLibStrings.SSE_S3 | awsDashSdkLib.awsDashSdkLibStrings.SSE_KMS | awsDashSdkLib.awsDashSdkLibStrings.CSE_KMS | java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type MaxNamedQueriesCount = scala.Double
  type MaxQueryExecutionsCount = scala.Double
  type MaxQueryResults = scala.Double
  type NameString = java.lang.String
  type NamedQueryId = java.lang.String
  type NamedQueryIdList = js.Array[NamedQueryId]
  type NamedQueryList = js.Array[NamedQuery]
  type QueryExecutionId = java.lang.String
  type QueryExecutionIdList = js.Array[QueryExecutionId]
  type QueryExecutionList = js.Array[QueryExecution]
  type QueryExecutionState = awsDashSdkLib.awsDashSdkLibStrings.QUEUED | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.CANCELLED | java.lang.String
  type QueryString = java.lang.String
  type RowList = js.Array[Row]
  type StatementType = awsDashSdkLib.awsDashSdkLibStrings.DDL | awsDashSdkLib.awsDashSdkLibStrings.DML | awsDashSdkLib.awsDashSdkLibStrings.UTILITY | java.lang.String
  type String = java.lang.String
  type Token = java.lang.String
  type UnprocessedNamedQueryIdList = js.Array[UnprocessedNamedQueryId]
  type UnprocessedQueryExecutionIdList = js.Array[UnprocessedQueryExecutionId]
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-05-18` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type datumList = js.Array[Datum]
  type datumString = java.lang.String
}

