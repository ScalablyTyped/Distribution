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
      * The query description.
      */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
      * The query name.
      */
    var Name: NameString
    /**
      * The contents of the query with all query statements.
      */
    var QueryString: awsDashSdkLib.clientsAthenaMod.AthenaNs.QueryString
    /**
      * The name of the workgroup in which the named query is being created.
      */
    var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
  }
  
  trait CreateNamedQueryOutput extends js.Object {
    /**
      * The unique ID of the query.
      */
    var NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
  }
  
  trait CreateWorkGroupInput extends js.Object {
    /**
      * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored, the encryption configuration, if any, used for encrypting query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, the limit for the amount of bytes scanned (cutoff) per query, if it is specified, and whether workgroup's settings (specified with EnforceWorkGroupConfiguration) in the WorkGroupConfiguration override client-side settings. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
      */
    var Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined
    /**
      * The workgroup description.
      */
    var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
    /**
      * The workgroup name.
      */
    var Name: WorkGroupName
    /**
      * One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateWorkGroupOutput extends js.Object
  
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
    var NamedQueryId: awsDashSdkLib.clientsAthenaMod.AthenaNs.NamedQueryId
  }
  
  trait DeleteNamedQueryOutput extends js.Object
  
  trait DeleteWorkGroupInput extends js.Object {
    /**
      * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
      */
    var RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.undefined
    /**
      * The unique name of the workgroup to delete.
      */
    var WorkGroup: WorkGroupName
  }
  
  trait DeleteWorkGroupOutput extends js.Object
  
  trait EncryptionConfiguration extends js.Object {
    /**
      * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (SSE-S3), server-side encryption with KMS-managed keys (SSE-KMS), or client-side encryption with KMS-managed keys (CSE-KMS) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup. 
      */
    var EncryptionOption: awsDashSdkLib.clientsAthenaMod.AthenaNs.EncryptionOption
    /**
      * For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
      */
    var KmsKey: js.UndefOr[String] = js.undefined
  }
  
  trait GetNamedQueryInput extends js.Object {
    /**
      * The unique ID of the query. Use ListNamedQueries to get query IDs.
      */
    var NamedQueryId: awsDashSdkLib.clientsAthenaMod.AthenaNs.NamedQueryId
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
    var QueryExecutionId: awsDashSdkLib.clientsAthenaMod.AthenaNs.QueryExecutionId
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
    var QueryExecutionId: awsDashSdkLib.clientsAthenaMod.AthenaNs.QueryExecutionId
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
  
  trait GetWorkGroupInput extends js.Object {
    /**
      * The name of the workgroup.
      */
    var WorkGroup: WorkGroupName
  }
  
  trait GetWorkGroupOutput extends js.Object {
    /**
      * Information about the workgroup.
      */
    var WorkGroup: js.UndefOr[WorkGroup] = js.undefined
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
    /**
      * The name of the workgroup from which the named queries are being returned.
      */
    var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
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
    /**
      * The name of the workgroup from which queries are being returned.
      */
    var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
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
  
  trait ListTagsForResourceInput extends js.Object {
    /**
      * The maximum number of results to be returned per request that lists the tags for the workgroup resource.
      */
    var MaxResults: js.UndefOr[MaxTagsCount] = js.undefined
    /**
      * The token for the next set of results, or null if there are no additional results for this request, where the request lists the tags for the workgroup resource with the specified ARN.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * Lists the tags for the workgroup resource with the specified ARN.
      */
    var ResourceARN: AmazonResourceName
  }
  
  trait ListTagsForResourceOutput extends js.Object {
    /**
      * A token to be used by the next request if this request is truncated.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * The list of tags associated with this workgroup.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait ListWorkGroupsInput extends js.Object {
    /**
      * The maximum number of workgroups to return in this request.
      */
    var MaxResults: js.UndefOr[MaxWorkGroupsCount] = js.undefined
    /**
      * A token to be used by the next request if this request is truncated.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ListWorkGroupsOutput extends js.Object {
    /**
      * A token to be used by the next request if this request is truncated.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * The list of workgroups, including their names, descriptions, creation times, and states.
      */
    var WorkGroups: js.UndefOr[WorkGroupsList] = js.undefined
  }
  
  trait NamedQuery extends js.Object {
    /**
      * The database to which the query belongs.
      */
    var Database: DatabaseString
    /**
      * The query description.
      */
    var Description: js.UndefOr[DescriptionString] = js.undefined
    /**
      * The query name.
      */
    var Name: NameString
    /**
      * The unique identifier of the query.
      */
    var NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    /**
      * The SQL query statements that comprise the query.
      */
    var QueryString: awsDashSdkLib.clientsAthenaMod.AthenaNs.QueryString
    /**
      * The name of the workgroup that contains the named query.
      */
    var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
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
      * The state of query execution. QUEUED state is listed but is not used by Athena and is reserved for future use. RUNNING indicates that the query has been submitted to the service, and Athena will execute the query as soon as resources are available. SUCCEEDED indicates that the query completed without errors. FAILED indicates that the query experienced an error and did not complete processing. CANCELLED indicates that a user input interrupted query execution. 
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
      * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, SSE-KMS or CSE-KMS) and key information. This is a client-side setting. If workgroup settings override client-side settings, then the query uses the encryption configuration that is specified for the workgroup, and also uses the location for storing query results specified in the workgroup. See WorkGroupConfiguration$EnforceWorkGroupConfiguration and Workgroup Settings Override Client-Side Settings.
      */
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
    /**
      * The location in Amazon S3 where your query results are stored, such as s3://path/to/query/bucket/. For more information, see Queries and Query Result Files. If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
      */
    var OutputLocation: js.UndefOr[String] = js.undefined
  }
  
  trait ResultConfigurationUpdates extends js.Object {
    /**
      * The encryption configuration for the query results.
      */
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
    /**
      * The location in Amazon S3 where your query results are stored, such as s3://path/to/query/bucket/. For more information, see Queries and Query Result Files. If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
      */
    var OutputLocation: js.UndefOr[String] = js.undefined
    /**
      * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
      */
    var RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
    /**
      * If set to "true", indicates that the previously-specified query results location (also known as a client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
      */
    var RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.undefined
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
    var QueryString: awsDashSdkLib.clientsAthenaMod.AthenaNs.QueryString
    /**
      * Specifies information about where and how to save the results of the query execution. If the query runs in a workgroup, then workgroup's settings may override query settings. This affects the query results location. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
      */
    var ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined
    /**
      * The name of the workgroup in which the query is being started.
      */
    var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
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
    var QueryExecutionId: awsDashSdkLib.clientsAthenaMod.AthenaNs.QueryExecutionId
  }
  
  trait StopQueryExecutionOutput extends js.Object
  
  trait Tag extends js.Object {
    /**
      * A tag key. The tag key length is from 1 to 128 Unicode characters in UTF-8. You can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys are case-sensitive and must be unique per resource. 
      */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
      * A tag value. The tag value length is from 0 to 256 Unicode characters in UTF-8. You can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag values are case-sensitive. 
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagResourceInput extends js.Object {
    /**
      * Requests that one or more tags are added to the resource (such as a workgroup) for the specified ARN.
      */
    var ResourceARN: AmazonResourceName
    /**
      * One or more tags, separated by commas, to be added to the resource, such as a workgroup.
      */
    var Tags: TagList
  }
  
  trait TagResourceOutput extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Requires you to have access to the workgroup in which the queries were saved. Use ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries differ from executed queries. Use BatchGetQueryExecutionInput to get details about each unique query execution, and ListQueryExecutionsInput to get a list of query execution IDs.
      */
    def batchGetNamedQuery(): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetNamedQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Requires you to have access to the workgroup in which the queries were saved. Use ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries differ from executed queries. Use BatchGetQueryExecutionInput to get details about each unique query execution, and ListQueryExecutionsInput to get a list of query execution IDs.
      */
    def batchGetNamedQuery(params: BatchGetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetNamedQuery(
      params: BatchGetNamedQueryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.
      */
    def batchGetQueryExecution(): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetQueryExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.
      */
    def batchGetQueryExecution(params: BatchGetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetQueryExecution(
      params: BatchGetQueryExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def createNamedQuery(): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createNamedQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def createNamedQuery(params: CreateNamedQueryInput): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createNamedQuery(
      params: CreateNamedQueryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a workgroup with the specified name.
      */
    def createWorkGroup(): awsDashSdkLib.libRequestMod.Request[CreateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createWorkGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWorkGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a workgroup with the specified name.
      */
    def createWorkGroup(params: CreateWorkGroupInput): awsDashSdkLib.libRequestMod.Request[CreateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createWorkGroup(
      params: CreateWorkGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWorkGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def deleteNamedQuery(): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteNamedQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def deleteNamedQuery(params: DeleteNamedQueryInput): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteNamedQuery(
      params: DeleteNamedQueryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
      */
    def deleteWorkGroup(): awsDashSdkLib.libRequestMod.Request[DeleteWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteWorkGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWorkGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
      */
    def deleteWorkGroup(params: DeleteWorkGroupInput): awsDashSdkLib.libRequestMod.Request[DeleteWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteWorkGroup(
      params: DeleteWorkGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWorkGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a single query. Requires that you have access to the workgroup in which the query was saved.
      */
    def getNamedQuery(): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getNamedQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a single query. Requires that you have access to the workgroup in which the query was saved.
      */
    def getNamedQuery(params: GetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getNamedQuery(
      params: GetNamedQueryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetNamedQueryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a single execution of a query if you have access to the workgroup in which the query ran. Each time a query executes, information about the query execution is saved with a unique ID.
      */
    def getQueryExecution(): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQueryExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a single execution of a query if you have access to the workgroup in which the query ran. Each time a query executes, information about the query execution is saved with a unique ID.
      */
    def getQueryExecution(params: GetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQueryExecution(
      params: GetQueryExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the results of a single query execution specified by QueryExecutionId if you have access to the workgroup in which the query ran. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
      */
    def getQueryResults(): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQueryResults(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryResultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the results of a single query execution specified by QueryExecutionId if you have access to the workgroup in which the query ran. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
      */
    def getQueryResults(params: GetQueryResultsInput): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQueryResults(
      params: GetQueryResultsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryResultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the workgroup with the specified name.
      */
    def getWorkGroup(): awsDashSdkLib.libRequestMod.Request[GetWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getWorkGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetWorkGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the workgroup with the specified name.
      */
    def getWorkGroup(params: GetWorkGroupInput): awsDashSdkLib.libRequestMod.Request[GetWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getWorkGroup(
      params: GetWorkGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetWorkGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def listNamedQueries(): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listNamedQueries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListNamedQueriesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def listNamedQueries(params: ListNamedQueriesInput): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listNamedQueries(
      params: ListNamedQueriesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListNamedQueriesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a list of available query execution IDs for the queries in the specified workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def listQueryExecutions(): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listQueryExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQueryExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a list of available query execution IDs for the queries in the specified workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def listQueryExecutions(params: ListQueryExecutionsInput): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listQueryExecutions(
      params: ListQueryExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQueryExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags associated with this workgroup.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags associated with this workgroup.
      */
    def listTagsForResource(params: ListTagsForResourceInput): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists available workgroups for the account.
      */
    def listWorkGroups(): awsDashSdkLib.libRequestMod.Request[ListWorkGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listWorkGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWorkGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWorkGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists available workgroups for the account.
      */
    def listWorkGroups(params: ListWorkGroupsInput): awsDashSdkLib.libRequestMod.Request[ListWorkGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listWorkGroups(
      params: ListWorkGroupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWorkGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWorkGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def startQueryExecution(): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startQueryExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def startQueryExecution(params: StartQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startQueryExecution(
      params: StartQueryExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def stopQueryExecution(): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopQueryExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
      */
    def stopQueryExecution(params: StopQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopQueryExecution(
      params: StopQueryExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopQueryExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to the resource, such as a workgroup. A tag is a label that you assign to an AWS Athena resource (a workgroup). Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize resources (workgroups) in Athena, for example, by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups in your account. For best practices, see AWS Tagging Strategies. The key length is from 1 (minimum) to 128 (maximum) Unicode characters in UTF-8. The tag value length is from 0 (minimum) to 256 (maximum) Unicode characters in UTF-8. You can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one, separate them by commas.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to the resource, such as a workgroup. A tag is a label that you assign to an AWS Athena resource (a workgroup). Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize resources (workgroups) in Athena, for example, by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups in your account. For best practices, see AWS Tagging Strategies. The key length is from 1 (minimum) to 128 (maximum) Unicode characters in UTF-8. The tag value length is from 0 (minimum) to 256 (maximum) Unicode characters in UTF-8. You can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one, separate them by commas.
      */
    def tagResource(params: TagResourceInput): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from the workgroup resource. Takes as an input a list of TagKey Strings separated by commas, and removes their tags at the same time.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from the workgroup resource. Takes as an input a list of TagKey Strings separated by commas, and removes their tags at the same time.
      */
    def untagResource(params: UntagResourceInput): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
      */
    def updateWorkGroup(): awsDashSdkLib.libRequestMod.Request[UpdateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateWorkGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateWorkGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
      */
    def updateWorkGroup(params: UpdateWorkGroupInput): awsDashSdkLib.libRequestMod.Request[UpdateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateWorkGroup(
      params: UpdateWorkGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateWorkGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  
  trait UntagResourceInput extends js.Object {
    /**
      * Removes one or more tags from the workgroup resource for the specified ARN.
      */
    var ResourceARN: AmazonResourceName
    /**
      * Removes the tags associated with one or more tag keys from the workgroup resource.
      */
    var TagKeys: TagKeyList
  }
  
  trait UntagResourceOutput extends js.Object
  
  trait UpdateWorkGroupInput extends js.Object {
    /**
      * The workgroup configuration that will be updated for the given workgroup.
      */
    var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.undefined
    /**
      * The workgroup description.
      */
    var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
    /**
      * The workgroup state that will be updated for the given workgroup.
      */
    var State: js.UndefOr[WorkGroupState] = js.undefined
    /**
      * The specified workgroup that will be updated.
      */
    var WorkGroup: WorkGroupName
  }
  
  trait UpdateWorkGroupOutput extends js.Object
  
  trait WorkGroup extends js.Object {
    /**
      * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the encryption configuration, if any, used for query results; whether the Amazon CloudWatch Metrics are enabled for the workgroup; whether workgroup settings override client-side settings; and the data usage limit for the amount of data scanned per query, if it is specified. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
      */
    var Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined
    /**
      * The date and time the workgroup was created.
      */
    var CreationTime: js.UndefOr[_Date] = js.undefined
    /**
      * The workgroup description.
      */
    var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
    /**
      * The workgroup name.
      */
    var Name: WorkGroupName
    /**
      * The state of the workgroup: ENABLED or DISABLED.
      */
    var State: js.UndefOr[WorkGroupState] = js.undefined
  }
  
  trait WorkGroupConfiguration extends js.Object {
    /**
      * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
      */
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined
    /**
      * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
      */
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
    /**
      * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
      */
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined
    /**
      * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored and the encryption option, if any, used for query results.
      */
    var ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined
  }
  
  trait WorkGroupConfigurationUpdates extends js.Object {
    /**
      * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
      */
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined
    /**
      * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
      */
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
    /**
      * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
      */
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined
    /**
      * Indicates that the data usage control limit per query is removed. WorkGroupConfiguration$BytesScannedCutoffPerQuery 
      */
    var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.undefined
    /**
      * The result configuration information about the queries in this workgroup that will be updated. Includes the updated results location and an updated option for encrypting query results.
      */
    var ResultConfigurationUpdates: js.UndefOr[ResultConfigurationUpdates] = js.undefined
  }
  
  trait WorkGroupSummary extends js.Object {
    /**
      * The workgroup creation date and time.
      */
    var CreationTime: js.UndefOr[_Date] = js.undefined
    /**
      * The workgroup description.
      */
    var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
    /**
      * The name of the workgroup.
      */
    var Name: js.UndefOr[WorkGroupName] = js.undefined
    /**
      * The state of the workgroup.
      */
    var State: js.UndefOr[WorkGroupState] = js.undefined
  }
  
  trait _ColumnNullable extends js.Object
  
  trait _EncryptionOption extends js.Object
  
  trait _QueryExecutionState extends js.Object
  
  trait _StatementType extends js.Object
  
  trait _WorkGroupState extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AmazonResourceName = java.lang.String
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type BytesScannedCutoffValue = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ColumnInfoList = js.Array[ColumnInfo]
  type ColumnNullable = _ColumnNullable | java.lang.String
  type DatabaseString = java.lang.String
  type DescriptionString = java.lang.String
  type EncryptionOption = _EncryptionOption | java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type MaxNamedQueriesCount = scala.Double
  type MaxQueryExecutionsCount = scala.Double
  type MaxQueryResults = scala.Double
  type MaxTagsCount = scala.Double
  type MaxWorkGroupsCount = scala.Double
  type NameString = java.lang.String
  type NamedQueryId = java.lang.String
  type NamedQueryIdList = js.Array[NamedQueryId]
  type NamedQueryList = js.Array[NamedQuery]
  type QueryExecutionId = java.lang.String
  type QueryExecutionIdList = js.Array[QueryExecutionId]
  type QueryExecutionList = js.Array[QueryExecution]
  type QueryExecutionState = _QueryExecutionState | java.lang.String
  type QueryString = java.lang.String
  type RowList = js.Array[Row]
  type StatementType = _StatementType | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Token = java.lang.String
  type UnprocessedNamedQueryIdList = js.Array[UnprocessedNamedQueryId]
  type UnprocessedQueryExecutionIdList = js.Array[UnprocessedQueryExecutionId]
  type WorkGroupDescriptionString = java.lang.String
  type WorkGroupName = java.lang.String
  type WorkGroupState = _WorkGroupState | java.lang.String
  type WorkGroupsList = js.Array[WorkGroupSummary]
  type _Date = stdLib.Date
  type apiVersion = _apiVersion | java.lang.String
  type datumList = js.Array[Datum]
  type datumString = java.lang.String
}

