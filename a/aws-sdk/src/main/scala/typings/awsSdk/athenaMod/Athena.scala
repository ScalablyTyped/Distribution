package typings.awsSdk.athenaMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Athena extends Service {
  @JSName("config")
  var config_Athena: ConfigBase with ClientConfiguration = js.native
  /**
    * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Requires you to have access to the workgroup in which the queries were saved. Use ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries differ from executed queries. Use BatchGetQueryExecutionInput to get details about each unique query execution, and ListQueryExecutionsInput to get a list of query execution IDs.
    */
  def batchGetNamedQuery(): Request[BatchGetNamedQueryOutput, AWSError] = js.native
  def batchGetNamedQuery(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetNamedQueryOutput, Unit]): Request[BatchGetNamedQueryOutput, AWSError] = js.native
  /**
    * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Requires you to have access to the workgroup in which the queries were saved. Use ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries differ from executed queries. Use BatchGetQueryExecutionInput to get details about each unique query execution, and ListQueryExecutionsInput to get a list of query execution IDs.
    */
  def batchGetNamedQuery(params: BatchGetNamedQueryInput): Request[BatchGetNamedQueryOutput, AWSError] = js.native
  def batchGetNamedQuery(
    params: BatchGetNamedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetNamedQueryOutput, Unit]
  ): Request[BatchGetNamedQueryOutput, AWSError] = js.native
  /**
    * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.
    */
  def batchGetQueryExecution(): Request[BatchGetQueryExecutionOutput, AWSError] = js.native
  def batchGetQueryExecution(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetQueryExecutionOutput, Unit]): Request[BatchGetQueryExecutionOutput, AWSError] = js.native
  /**
    * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.
    */
  def batchGetQueryExecution(params: BatchGetQueryExecutionInput): Request[BatchGetQueryExecutionOutput, AWSError] = js.native
  def batchGetQueryExecution(
    params: BatchGetQueryExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetQueryExecutionOutput, Unit]
  ): Request[BatchGetQueryExecutionOutput, AWSError] = js.native
  /**
    * Creates (registers) a data catalog with the specified name and properties. Catalogs created are visible to all users of the same AWS account.
    */
  def createDataCatalog(): Request[CreateDataCatalogOutput, AWSError] = js.native
  def createDataCatalog(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataCatalogOutput, Unit]): Request[CreateDataCatalogOutput, AWSError] = js.native
  /**
    * Creates (registers) a data catalog with the specified name and properties. Catalogs created are visible to all users of the same AWS account.
    */
  def createDataCatalog(params: CreateDataCatalogInput): Request[CreateDataCatalogOutput, AWSError] = js.native
  def createDataCatalog(
    params: CreateDataCatalogInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataCatalogOutput, Unit]
  ): Request[CreateDataCatalogOutput, AWSError] = js.native
  /**
    * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def createNamedQuery(): Request[CreateNamedQueryOutput, AWSError] = js.native
  def createNamedQuery(callback: js.Function2[/* err */ AWSError, /* data */ CreateNamedQueryOutput, Unit]): Request[CreateNamedQueryOutput, AWSError] = js.native
  /**
    * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def createNamedQuery(params: CreateNamedQueryInput): Request[CreateNamedQueryOutput, AWSError] = js.native
  def createNamedQuery(
    params: CreateNamedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNamedQueryOutput, Unit]
  ): Request[CreateNamedQueryOutput, AWSError] = js.native
  /**
    * Creates a workgroup with the specified name.
    */
  def createWorkGroup(): Request[CreateWorkGroupOutput, AWSError] = js.native
  def createWorkGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkGroupOutput, Unit]): Request[CreateWorkGroupOutput, AWSError] = js.native
  /**
    * Creates a workgroup with the specified name.
    */
  def createWorkGroup(params: CreateWorkGroupInput): Request[CreateWorkGroupOutput, AWSError] = js.native
  def createWorkGroup(
    params: CreateWorkGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkGroupOutput, Unit]
  ): Request[CreateWorkGroupOutput, AWSError] = js.native
  /**
    * Deletes a data catalog.
    */
  def deleteDataCatalog(): Request[DeleteDataCatalogOutput, AWSError] = js.native
  def deleteDataCatalog(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataCatalogOutput, Unit]): Request[DeleteDataCatalogOutput, AWSError] = js.native
  /**
    * Deletes a data catalog.
    */
  def deleteDataCatalog(params: DeleteDataCatalogInput): Request[DeleteDataCatalogOutput, AWSError] = js.native
  def deleteDataCatalog(
    params: DeleteDataCatalogInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataCatalogOutput, Unit]
  ): Request[DeleteDataCatalogOutput, AWSError] = js.native
  /**
    * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def deleteNamedQuery(): Request[DeleteNamedQueryOutput, AWSError] = js.native
  def deleteNamedQuery(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamedQueryOutput, Unit]): Request[DeleteNamedQueryOutput, AWSError] = js.native
  /**
    * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def deleteNamedQuery(params: DeleteNamedQueryInput): Request[DeleteNamedQueryOutput, AWSError] = js.native
  def deleteNamedQuery(
    params: DeleteNamedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamedQueryOutput, Unit]
  ): Request[DeleteNamedQueryOutput, AWSError] = js.native
  /**
    * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
    */
  def deleteWorkGroup(): Request[DeleteWorkGroupOutput, AWSError] = js.native
  def deleteWorkGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkGroupOutput, Unit]): Request[DeleteWorkGroupOutput, AWSError] = js.native
  /**
    * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
    */
  def deleteWorkGroup(params: DeleteWorkGroupInput): Request[DeleteWorkGroupOutput, AWSError] = js.native
  def deleteWorkGroup(
    params: DeleteWorkGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkGroupOutput, Unit]
  ): Request[DeleteWorkGroupOutput, AWSError] = js.native
  /**
    * Returns the specified data catalog.
    */
  def getDataCatalog(): Request[GetDataCatalogOutput, AWSError] = js.native
  def getDataCatalog(callback: js.Function2[/* err */ AWSError, /* data */ GetDataCatalogOutput, Unit]): Request[GetDataCatalogOutput, AWSError] = js.native
  /**
    * Returns the specified data catalog.
    */
  def getDataCatalog(params: GetDataCatalogInput): Request[GetDataCatalogOutput, AWSError] = js.native
  def getDataCatalog(
    params: GetDataCatalogInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataCatalogOutput, Unit]
  ): Request[GetDataCatalogOutput, AWSError] = js.native
  /**
    * Returns a database object for the specfied database and data catalog.
    */
  def getDatabase(): Request[GetDatabaseOutput, AWSError] = js.native
  def getDatabase(callback: js.Function2[/* err */ AWSError, /* data */ GetDatabaseOutput, Unit]): Request[GetDatabaseOutput, AWSError] = js.native
  /**
    * Returns a database object for the specfied database and data catalog.
    */
  def getDatabase(params: GetDatabaseInput): Request[GetDatabaseOutput, AWSError] = js.native
  def getDatabase(
    params: GetDatabaseInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatabaseOutput, Unit]
  ): Request[GetDatabaseOutput, AWSError] = js.native
  /**
    * Returns information about a single query. Requires that you have access to the workgroup in which the query was saved.
    */
  def getNamedQuery(): Request[GetNamedQueryOutput, AWSError] = js.native
  def getNamedQuery(callback: js.Function2[/* err */ AWSError, /* data */ GetNamedQueryOutput, Unit]): Request[GetNamedQueryOutput, AWSError] = js.native
  /**
    * Returns information about a single query. Requires that you have access to the workgroup in which the query was saved.
    */
  def getNamedQuery(params: GetNamedQueryInput): Request[GetNamedQueryOutput, AWSError] = js.native
  def getNamedQuery(
    params: GetNamedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNamedQueryOutput, Unit]
  ): Request[GetNamedQueryOutput, AWSError] = js.native
  /**
    * Returns information about a single execution of a query if you have access to the workgroup in which the query ran. Each time a query executes, information about the query execution is saved with a unique ID.
    */
  def getQueryExecution(): Request[GetQueryExecutionOutput, AWSError] = js.native
  def getQueryExecution(callback: js.Function2[/* err */ AWSError, /* data */ GetQueryExecutionOutput, Unit]): Request[GetQueryExecutionOutput, AWSError] = js.native
  /**
    * Returns information about a single execution of a query if you have access to the workgroup in which the query ran. Each time a query executes, information about the query execution is saved with a unique ID.
    */
  def getQueryExecution(params: GetQueryExecutionInput): Request[GetQueryExecutionOutput, AWSError] = js.native
  def getQueryExecution(
    params: GetQueryExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueryExecutionOutput, Unit]
  ): Request[GetQueryExecutionOutput, AWSError] = js.native
  /**
    * Streams the results of a single query execution specified by QueryExecutionId from the Athena query results location in Amazon S3. For more information, see Query Results in the Amazon Athena User Guide. This request does not execute the query but returns results. Use StartQueryExecution to run a query. To stream query results successfully, the IAM principal with permission to call GetQueryResults also must have permissions to the Amazon S3 GetObject action for the Athena query results location.  IAM principals with permission to the Amazon S3 GetObject action for the query results location are able to retrieve query results from Amazon S3 even if permission to the GetQueryResults action is denied. To restrict user or role access, ensure that Amazon S3 permissions to the Athena query location are denied. 
    */
  def getQueryResults(): Request[GetQueryResultsOutput, AWSError] = js.native
  def getQueryResults(callback: js.Function2[/* err */ AWSError, /* data */ GetQueryResultsOutput, Unit]): Request[GetQueryResultsOutput, AWSError] = js.native
  /**
    * Streams the results of a single query execution specified by QueryExecutionId from the Athena query results location in Amazon S3. For more information, see Query Results in the Amazon Athena User Guide. This request does not execute the query but returns results. Use StartQueryExecution to run a query. To stream query results successfully, the IAM principal with permission to call GetQueryResults also must have permissions to the Amazon S3 GetObject action for the Athena query results location.  IAM principals with permission to the Amazon S3 GetObject action for the query results location are able to retrieve query results from Amazon S3 even if permission to the GetQueryResults action is denied. To restrict user or role access, ensure that Amazon S3 permissions to the Athena query location are denied. 
    */
  def getQueryResults(params: GetQueryResultsInput): Request[GetQueryResultsOutput, AWSError] = js.native
  def getQueryResults(
    params: GetQueryResultsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueryResultsOutput, Unit]
  ): Request[GetQueryResultsOutput, AWSError] = js.native
  /**
    * Returns table metadata for the specified catalog, database, and table.
    */
  def getTableMetadata(): Request[GetTableMetadataOutput, AWSError] = js.native
  def getTableMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetTableMetadataOutput, Unit]): Request[GetTableMetadataOutput, AWSError] = js.native
  /**
    * Returns table metadata for the specified catalog, database, and table.
    */
  def getTableMetadata(params: GetTableMetadataInput): Request[GetTableMetadataOutput, AWSError] = js.native
  def getTableMetadata(
    params: GetTableMetadataInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTableMetadataOutput, Unit]
  ): Request[GetTableMetadataOutput, AWSError] = js.native
  /**
    * Returns information about the workgroup with the specified name.
    */
  def getWorkGroup(): Request[GetWorkGroupOutput, AWSError] = js.native
  def getWorkGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkGroupOutput, Unit]): Request[GetWorkGroupOutput, AWSError] = js.native
  /**
    * Returns information about the workgroup with the specified name.
    */
  def getWorkGroup(params: GetWorkGroupInput): Request[GetWorkGroupOutput, AWSError] = js.native
  def getWorkGroup(
    params: GetWorkGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkGroupOutput, Unit]
  ): Request[GetWorkGroupOutput, AWSError] = js.native
  /**
    * Lists the data catalogs in the current AWS account.
    */
  def listDataCatalogs(): Request[ListDataCatalogsOutput, AWSError] = js.native
  def listDataCatalogs(callback: js.Function2[/* err */ AWSError, /* data */ ListDataCatalogsOutput, Unit]): Request[ListDataCatalogsOutput, AWSError] = js.native
  /**
    * Lists the data catalogs in the current AWS account.
    */
  def listDataCatalogs(params: ListDataCatalogsInput): Request[ListDataCatalogsOutput, AWSError] = js.native
  def listDataCatalogs(
    params: ListDataCatalogsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataCatalogsOutput, Unit]
  ): Request[ListDataCatalogsOutput, AWSError] = js.native
  /**
    * Lists the databases in the specified data catalog.
    */
  def listDatabases(): Request[ListDatabasesOutput, AWSError] = js.native
  def listDatabases(callback: js.Function2[/* err */ AWSError, /* data */ ListDatabasesOutput, Unit]): Request[ListDatabasesOutput, AWSError] = js.native
  /**
    * Lists the databases in the specified data catalog.
    */
  def listDatabases(params: ListDatabasesInput): Request[ListDatabasesOutput, AWSError] = js.native
  def listDatabases(
    params: ListDatabasesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatabasesOutput, Unit]
  ): Request[ListDatabasesOutput, AWSError] = js.native
  /**
    * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the specified workgroup. If a workgroup is not specified, lists the saved queries for the primary workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listNamedQueries(): Request[ListNamedQueriesOutput, AWSError] = js.native
  def listNamedQueries(callback: js.Function2[/* err */ AWSError, /* data */ ListNamedQueriesOutput, Unit]): Request[ListNamedQueriesOutput, AWSError] = js.native
  /**
    * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the specified workgroup. If a workgroup is not specified, lists the saved queries for the primary workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listNamedQueries(params: ListNamedQueriesInput): Request[ListNamedQueriesOutput, AWSError] = js.native
  def listNamedQueries(
    params: ListNamedQueriesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNamedQueriesOutput, Unit]
  ): Request[ListNamedQueriesOutput, AWSError] = js.native
  /**
    * Provides a list of available query execution IDs for the queries in the specified workgroup. If a workgroup is not specified, returns a list of query execution IDs for the primary workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listQueryExecutions(): Request[ListQueryExecutionsOutput, AWSError] = js.native
  def listQueryExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListQueryExecutionsOutput, Unit]): Request[ListQueryExecutionsOutput, AWSError] = js.native
  /**
    * Provides a list of available query execution IDs for the queries in the specified workgroup. If a workgroup is not specified, returns a list of query execution IDs for the primary workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listQueryExecutions(params: ListQueryExecutionsInput): Request[ListQueryExecutionsOutput, AWSError] = js.native
  def listQueryExecutions(
    params: ListQueryExecutionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueryExecutionsOutput, Unit]
  ): Request[ListQueryExecutionsOutput, AWSError] = js.native
  /**
    * Lists the metadata for the tables in the specified data catalog database.
    */
  def listTableMetadata(): Request[ListTableMetadataOutput, AWSError] = js.native
  def listTableMetadata(callback: js.Function2[/* err */ AWSError, /* data */ ListTableMetadataOutput, Unit]): Request[ListTableMetadataOutput, AWSError] = js.native
  /**
    * Lists the metadata for the tables in the specified data catalog database.
    */
  def listTableMetadata(params: ListTableMetadataInput): Request[ListTableMetadataOutput, AWSError] = js.native
  def listTableMetadata(
    params: ListTableMetadataInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTableMetadataOutput, Unit]
  ): Request[ListTableMetadataOutput, AWSError] = js.native
  /**
    * Lists the tags associated with an Athena workgroup or data catalog resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists the tags associated with an Athena workgroup or data catalog resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists available workgroups for the account.
    */
  def listWorkGroups(): Request[ListWorkGroupsOutput, AWSError] = js.native
  def listWorkGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkGroupsOutput, Unit]): Request[ListWorkGroupsOutput, AWSError] = js.native
  /**
    * Lists available workgroups for the account.
    */
  def listWorkGroups(params: ListWorkGroupsInput): Request[ListWorkGroupsOutput, AWSError] = js.native
  def listWorkGroups(
    params: ListWorkGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkGroupsOutput, Unit]
  ): Request[ListWorkGroupsOutput, AWSError] = js.native
  /**
    * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. Running queries against an external catalog requires GetDataCatalog permission to the catalog. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def startQueryExecution(): Request[StartQueryExecutionOutput, AWSError] = js.native
  def startQueryExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartQueryExecutionOutput, Unit]): Request[StartQueryExecutionOutput, AWSError] = js.native
  /**
    * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. Running queries against an external catalog requires GetDataCatalog permission to the catalog. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def startQueryExecution(params: StartQueryExecutionInput): Request[StartQueryExecutionOutput, AWSError] = js.native
  def startQueryExecution(
    params: StartQueryExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartQueryExecutionOutput, Unit]
  ): Request[StartQueryExecutionOutput, AWSError] = js.native
  /**
    * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def stopQueryExecution(): Request[StopQueryExecutionOutput, AWSError] = js.native
  def stopQueryExecution(callback: js.Function2[/* err */ AWSError, /* data */ StopQueryExecutionOutput, Unit]): Request[StopQueryExecutionOutput, AWSError] = js.native
  /**
    * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def stopQueryExecution(params: StopQueryExecutionInput): Request[StopQueryExecutionOutput, AWSError] = js.native
  def stopQueryExecution(
    params: StopQueryExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopQueryExecutionOutput, Unit]
  ): Request[StopQueryExecutionOutput, AWSError] = js.native
  /**
    * Adds one or more tags to an Athena resource. A tag is a label that you assign to a resource. In Athena, a resource can be a workgroup or data catalog. Each tag consists of a key and an optional value, both of which you define. For example, you can use tags to categorize Athena workgroups or data catalogs by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups or data catalogs in your account. For best practices, see Tagging Best Practices. Tag keys can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters. Tags can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate them by commas.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds one or more tags to an Athena resource. A tag is a label that you assign to a resource. In Athena, a resource can be a workgroup or data catalog. Each tag consists of a key and an optional value, both of which you define. For example, you can use tags to categorize Athena workgroups or data catalogs by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups or data catalogs in your account. For best practices, see Tagging Best Practices. Tag keys can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters. Tags can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate them by commas.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Removes one or more tags from a data catalog or workgroup resource.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes one or more tags from a data catalog or workgroup resource.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Updates the data catalog that has the specified name.
    */
  def updateDataCatalog(): Request[UpdateDataCatalogOutput, AWSError] = js.native
  def updateDataCatalog(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataCatalogOutput, Unit]): Request[UpdateDataCatalogOutput, AWSError] = js.native
  /**
    * Updates the data catalog that has the specified name.
    */
  def updateDataCatalog(params: UpdateDataCatalogInput): Request[UpdateDataCatalogOutput, AWSError] = js.native
  def updateDataCatalog(
    params: UpdateDataCatalogInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataCatalogOutput, Unit]
  ): Request[UpdateDataCatalogOutput, AWSError] = js.native
  /**
    * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
    */
  def updateWorkGroup(): Request[UpdateWorkGroupOutput, AWSError] = js.native
  def updateWorkGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkGroupOutput, Unit]): Request[UpdateWorkGroupOutput, AWSError] = js.native
  /**
    * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
    */
  def updateWorkGroup(params: UpdateWorkGroupInput): Request[UpdateWorkGroupOutput, AWSError] = js.native
  def updateWorkGroup(
    params: UpdateWorkGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkGroupOutput, Unit]
  ): Request[UpdateWorkGroupOutput, AWSError] = js.native
}

