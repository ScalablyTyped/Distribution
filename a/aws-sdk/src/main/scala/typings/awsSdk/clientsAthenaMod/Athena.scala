package typings.awsSdk.clientsAthenaMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Athena extends Service {
  
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
    * Returns the details of a single prepared statement or a list of up to 256 prepared statements for the array of prepared statement names that you provide. Requires you to have access to the workgroup to which the prepared statements belong. If a prepared statement cannot be retrieved for the name specified, the statement is listed in UnprocessedPreparedStatementNames.
    */
  def batchGetPreparedStatement(): Request[BatchGetPreparedStatementOutput, AWSError] = js.native
  def batchGetPreparedStatement(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetPreparedStatementOutput, Unit]): Request[BatchGetPreparedStatementOutput, AWSError] = js.native
  /**
    * Returns the details of a single prepared statement or a list of up to 256 prepared statements for the array of prepared statement names that you provide. Requires you to have access to the workgroup to which the prepared statements belong. If a prepared statement cannot be retrieved for the name specified, the statement is listed in UnprocessedPreparedStatementNames.
    */
  def batchGetPreparedStatement(params: BatchGetPreparedStatementInput): Request[BatchGetPreparedStatementOutput, AWSError] = js.native
  def batchGetPreparedStatement(
    params: BatchGetPreparedStatementInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetPreparedStatementOutput, Unit]
  ): Request[BatchGetPreparedStatementOutput, AWSError] = js.native
  
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
    * Cancels the capacity reservation with the specified name.
    */
  def cancelCapacityReservation(): Request[CancelCapacityReservationOutput, AWSError] = js.native
  def cancelCapacityReservation(callback: js.Function2[/* err */ AWSError, /* data */ CancelCapacityReservationOutput, Unit]): Request[CancelCapacityReservationOutput, AWSError] = js.native
  /**
    * Cancels the capacity reservation with the specified name.
    */
  def cancelCapacityReservation(params: CancelCapacityReservationInput): Request[CancelCapacityReservationOutput, AWSError] = js.native
  def cancelCapacityReservation(
    params: CancelCapacityReservationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelCapacityReservationOutput, Unit]
  ): Request[CancelCapacityReservationOutput, AWSError] = js.native
  
  @JSName("config")
  var config_Athena: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a capacity reservation with the specified name and number of requested data processing units.
    */
  def createCapacityReservation(): Request[CreateCapacityReservationOutput, AWSError] = js.native
  def createCapacityReservation(callback: js.Function2[/* err */ AWSError, /* data */ CreateCapacityReservationOutput, Unit]): Request[CreateCapacityReservationOutput, AWSError] = js.native
  /**
    * Creates a capacity reservation with the specified name and number of requested data processing units.
    */
  def createCapacityReservation(params: CreateCapacityReservationInput): Request[CreateCapacityReservationOutput, AWSError] = js.native
  def createCapacityReservation(
    params: CreateCapacityReservationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCapacityReservationOutput, Unit]
  ): Request[CreateCapacityReservationOutput, AWSError] = js.native
  
  /**
    * Creates (registers) a data catalog with the specified name and properties. Catalogs created are visible to all users of the same Amazon Web Services account.
    */
  def createDataCatalog(): Request[CreateDataCatalogOutput, AWSError] = js.native
  def createDataCatalog(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataCatalogOutput, Unit]): Request[CreateDataCatalogOutput, AWSError] = js.native
  /**
    * Creates (registers) a data catalog with the specified name and properties. Catalogs created are visible to all users of the same Amazon Web Services account.
    */
  def createDataCatalog(params: CreateDataCatalogInput): Request[CreateDataCatalogOutput, AWSError] = js.native
  def createDataCatalog(
    params: CreateDataCatalogInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataCatalogOutput, Unit]
  ): Request[CreateDataCatalogOutput, AWSError] = js.native
  
  /**
    * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def createNamedQuery(): Request[CreateNamedQueryOutput, AWSError] = js.native
  def createNamedQuery(callback: js.Function2[/* err */ AWSError, /* data */ CreateNamedQueryOutput, Unit]): Request[CreateNamedQueryOutput, AWSError] = js.native
  /**
    * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def createNamedQuery(params: CreateNamedQueryInput): Request[CreateNamedQueryOutput, AWSError] = js.native
  def createNamedQuery(
    params: CreateNamedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNamedQueryOutput, Unit]
  ): Request[CreateNamedQueryOutput, AWSError] = js.native
  
  /**
    * Creates an empty ipynb file in the specified Apache Spark enabled workgroup. Throws an error if a file in the workgroup with the same name already exists.
    */
  def createNotebook(): Request[CreateNotebookOutput, AWSError] = js.native
  def createNotebook(callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookOutput, Unit]): Request[CreateNotebookOutput, AWSError] = js.native
  /**
    * Creates an empty ipynb file in the specified Apache Spark enabled workgroup. Throws an error if a file in the workgroup with the same name already exists.
    */
  def createNotebook(params: CreateNotebookInput): Request[CreateNotebookOutput, AWSError] = js.native
  def createNotebook(
    params: CreateNotebookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotebookOutput, Unit]
  ): Request[CreateNotebookOutput, AWSError] = js.native
  
  /**
    * Creates a prepared statement for use with SQL queries in Athena.
    */
  def createPreparedStatement(): Request[CreatePreparedStatementOutput, AWSError] = js.native
  def createPreparedStatement(callback: js.Function2[/* err */ AWSError, /* data */ CreatePreparedStatementOutput, Unit]): Request[CreatePreparedStatementOutput, AWSError] = js.native
  /**
    * Creates a prepared statement for use with SQL queries in Athena.
    */
  def createPreparedStatement(params: CreatePreparedStatementInput): Request[CreatePreparedStatementOutput, AWSError] = js.native
  def createPreparedStatement(
    params: CreatePreparedStatementInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePreparedStatementOutput, Unit]
  ): Request[CreatePreparedStatementOutput, AWSError] = js.native
  
  /**
    * Gets an authentication token and the URL at which the notebook can be accessed. During programmatic access, CreatePresignedNotebookUrl must be called every 10 minutes to refresh the authentication token. For information about granting programmatic access, see Grant programmatic access.
    */
  def createPresignedNotebookUrl(): Request[CreatePresignedNotebookUrlResponse, AWSError] = js.native
  def createPresignedNotebookUrl(callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedNotebookUrlResponse, Unit]): Request[CreatePresignedNotebookUrlResponse, AWSError] = js.native
  /**
    * Gets an authentication token and the URL at which the notebook can be accessed. During programmatic access, CreatePresignedNotebookUrl must be called every 10 minutes to refresh the authentication token. For information about granting programmatic access, see Grant programmatic access.
    */
  def createPresignedNotebookUrl(params: CreatePresignedNotebookUrlRequest): Request[CreatePresignedNotebookUrlResponse, AWSError] = js.native
  def createPresignedNotebookUrl(
    params: CreatePresignedNotebookUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedNotebookUrlResponse, Unit]
  ): Request[CreatePresignedNotebookUrlResponse, AWSError] = js.native
  
  /**
    * Creates a workgroup with the specified name. A workgroup can be an Apache Spark enabled workgroup or an Athena SQL workgroup.
    */
  def createWorkGroup(): Request[CreateWorkGroupOutput, AWSError] = js.native
  def createWorkGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkGroupOutput, Unit]): Request[CreateWorkGroupOutput, AWSError] = js.native
  /**
    * Creates a workgroup with the specified name. A workgroup can be an Apache Spark enabled workgroup or an Athena SQL workgroup.
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
    * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def deleteNamedQuery(): Request[DeleteNamedQueryOutput, AWSError] = js.native
  def deleteNamedQuery(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamedQueryOutput, Unit]): Request[DeleteNamedQueryOutput, AWSError] = js.native
  /**
    * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def deleteNamedQuery(params: DeleteNamedQueryInput): Request[DeleteNamedQueryOutput, AWSError] = js.native
  def deleteNamedQuery(
    params: DeleteNamedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamedQueryOutput, Unit]
  ): Request[DeleteNamedQueryOutput, AWSError] = js.native
  
  /**
    * Deletes the specified notebook.
    */
  def deleteNotebook(): Request[DeleteNotebookOutput, AWSError] = js.native
  def deleteNotebook(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNotebookOutput, Unit]): Request[DeleteNotebookOutput, AWSError] = js.native
  /**
    * Deletes the specified notebook.
    */
  def deleteNotebook(params: DeleteNotebookInput): Request[DeleteNotebookOutput, AWSError] = js.native
  def deleteNotebook(
    params: DeleteNotebookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNotebookOutput, Unit]
  ): Request[DeleteNotebookOutput, AWSError] = js.native
  
  /**
    * Deletes the prepared statement with the specified name from the specified workgroup.
    */
  def deletePreparedStatement(): Request[DeletePreparedStatementOutput, AWSError] = js.native
  def deletePreparedStatement(callback: js.Function2[/* err */ AWSError, /* data */ DeletePreparedStatementOutput, Unit]): Request[DeletePreparedStatementOutput, AWSError] = js.native
  /**
    * Deletes the prepared statement with the specified name from the specified workgroup.
    */
  def deletePreparedStatement(params: DeletePreparedStatementInput): Request[DeletePreparedStatementOutput, AWSError] = js.native
  def deletePreparedStatement(
    params: DeletePreparedStatementInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePreparedStatementOutput, Unit]
  ): Request[DeletePreparedStatementOutput, AWSError] = js.native
  
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
    * Exports the specified notebook and its metadata.
    */
  def exportNotebook(): Request[ExportNotebookOutput, AWSError] = js.native
  def exportNotebook(callback: js.Function2[/* err */ AWSError, /* data */ ExportNotebookOutput, Unit]): Request[ExportNotebookOutput, AWSError] = js.native
  /**
    * Exports the specified notebook and its metadata.
    */
  def exportNotebook(params: ExportNotebookInput): Request[ExportNotebookOutput, AWSError] = js.native
  def exportNotebook(
    params: ExportNotebookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportNotebookOutput, Unit]
  ): Request[ExportNotebookOutput, AWSError] = js.native
  
  /**
    * Describes a previously submitted calculation execution.
    */
  def getCalculationExecution(): Request[GetCalculationExecutionResponse, AWSError] = js.native
  def getCalculationExecution(callback: js.Function2[/* err */ AWSError, /* data */ GetCalculationExecutionResponse, Unit]): Request[GetCalculationExecutionResponse, AWSError] = js.native
  /**
    * Describes a previously submitted calculation execution.
    */
  def getCalculationExecution(params: GetCalculationExecutionRequest): Request[GetCalculationExecutionResponse, AWSError] = js.native
  def getCalculationExecution(
    params: GetCalculationExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCalculationExecutionResponse, Unit]
  ): Request[GetCalculationExecutionResponse, AWSError] = js.native
  
  /**
    * Retrieves the unencrypted code that was executed for the calculation.
    */
  def getCalculationExecutionCode(): Request[GetCalculationExecutionCodeResponse, AWSError] = js.native
  def getCalculationExecutionCode(callback: js.Function2[/* err */ AWSError, /* data */ GetCalculationExecutionCodeResponse, Unit]): Request[GetCalculationExecutionCodeResponse, AWSError] = js.native
  /**
    * Retrieves the unencrypted code that was executed for the calculation.
    */
  def getCalculationExecutionCode(params: GetCalculationExecutionCodeRequest): Request[GetCalculationExecutionCodeResponse, AWSError] = js.native
  def getCalculationExecutionCode(
    params: GetCalculationExecutionCodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCalculationExecutionCodeResponse, Unit]
  ): Request[GetCalculationExecutionCodeResponse, AWSError] = js.native
  
  /**
    * Gets the status of a current calculation.
    */
  def getCalculationExecutionStatus(): Request[GetCalculationExecutionStatusResponse, AWSError] = js.native
  def getCalculationExecutionStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetCalculationExecutionStatusResponse, Unit]): Request[GetCalculationExecutionStatusResponse, AWSError] = js.native
  /**
    * Gets the status of a current calculation.
    */
  def getCalculationExecutionStatus(params: GetCalculationExecutionStatusRequest): Request[GetCalculationExecutionStatusResponse, AWSError] = js.native
  def getCalculationExecutionStatus(
    params: GetCalculationExecutionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCalculationExecutionStatusResponse, Unit]
  ): Request[GetCalculationExecutionStatusResponse, AWSError] = js.native
  
  /**
    * Gets the capacity assignment configuration for a capacity reservation, if one exists.
    */
  def getCapacityAssignmentConfiguration(): Request[GetCapacityAssignmentConfigurationOutput, AWSError] = js.native
  def getCapacityAssignmentConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetCapacityAssignmentConfigurationOutput, Unit]
  ): Request[GetCapacityAssignmentConfigurationOutput, AWSError] = js.native
  /**
    * Gets the capacity assignment configuration for a capacity reservation, if one exists.
    */
  def getCapacityAssignmentConfiguration(params: GetCapacityAssignmentConfigurationInput): Request[GetCapacityAssignmentConfigurationOutput, AWSError] = js.native
  def getCapacityAssignmentConfiguration(
    params: GetCapacityAssignmentConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCapacityAssignmentConfigurationOutput, Unit]
  ): Request[GetCapacityAssignmentConfigurationOutput, AWSError] = js.native
  
  /**
    * Returns information about the capacity reservation with the specified name.
    */
  def getCapacityReservation(): Request[GetCapacityReservationOutput, AWSError] = js.native
  def getCapacityReservation(callback: js.Function2[/* err */ AWSError, /* data */ GetCapacityReservationOutput, Unit]): Request[GetCapacityReservationOutput, AWSError] = js.native
  /**
    * Returns information about the capacity reservation with the specified name.
    */
  def getCapacityReservation(params: GetCapacityReservationInput): Request[GetCapacityReservationOutput, AWSError] = js.native
  def getCapacityReservation(
    params: GetCapacityReservationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCapacityReservationOutput, Unit]
  ): Request[GetCapacityReservationOutput, AWSError] = js.native
  
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
    * Returns a database object for the specified database and data catalog.
    */
  def getDatabase(): Request[GetDatabaseOutput, AWSError] = js.native
  def getDatabase(callback: js.Function2[/* err */ AWSError, /* data */ GetDatabaseOutput, Unit]): Request[GetDatabaseOutput, AWSError] = js.native
  /**
    * Returns a database object for the specified database and data catalog.
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
    * Retrieves notebook metadata for the specified notebook ID.
    */
  def getNotebookMetadata(): Request[GetNotebookMetadataOutput, AWSError] = js.native
  def getNotebookMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetNotebookMetadataOutput, Unit]): Request[GetNotebookMetadataOutput, AWSError] = js.native
  /**
    * Retrieves notebook metadata for the specified notebook ID.
    */
  def getNotebookMetadata(params: GetNotebookMetadataInput): Request[GetNotebookMetadataOutput, AWSError] = js.native
  def getNotebookMetadata(
    params: GetNotebookMetadataInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNotebookMetadataOutput, Unit]
  ): Request[GetNotebookMetadataOutput, AWSError] = js.native
  
  /**
    * Retrieves the prepared statement with the specified name from the specified workgroup.
    */
  def getPreparedStatement(): Request[GetPreparedStatementOutput, AWSError] = js.native
  def getPreparedStatement(callback: js.Function2[/* err */ AWSError, /* data */ GetPreparedStatementOutput, Unit]): Request[GetPreparedStatementOutput, AWSError] = js.native
  /**
    * Retrieves the prepared statement with the specified name from the specified workgroup.
    */
  def getPreparedStatement(params: GetPreparedStatementInput): Request[GetPreparedStatementOutput, AWSError] = js.native
  def getPreparedStatement(
    params: GetPreparedStatementInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPreparedStatementOutput, Unit]
  ): Request[GetPreparedStatementOutput, AWSError] = js.native
  
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
    * Streams the results of a single query execution specified by QueryExecutionId from the Athena query results location in Amazon S3. For more information, see Working with query results, recent queries, and output files in the Amazon Athena User Guide. This request does not execute the query but returns results. Use StartQueryExecution to run a query. To stream query results successfully, the IAM principal with permission to call GetQueryResults also must have permissions to the Amazon S3 GetObject action for the Athena query results location.  IAM principals with permission to the Amazon S3 GetObject action for the query results location are able to retrieve query results from Amazon S3 even if permission to the GetQueryResults action is denied. To restrict user or role access, ensure that Amazon S3 permissions to the Athena query location are denied. 
    */
  def getQueryResults(): Request[GetQueryResultsOutput, AWSError] = js.native
  def getQueryResults(callback: js.Function2[/* err */ AWSError, /* data */ GetQueryResultsOutput, Unit]): Request[GetQueryResultsOutput, AWSError] = js.native
  /**
    * Streams the results of a single query execution specified by QueryExecutionId from the Athena query results location in Amazon S3. For more information, see Working with query results, recent queries, and output files in the Amazon Athena User Guide. This request does not execute the query but returns results. Use StartQueryExecution to run a query. To stream query results successfully, the IAM principal with permission to call GetQueryResults also must have permissions to the Amazon S3 GetObject action for the Athena query results location.  IAM principals with permission to the Amazon S3 GetObject action for the query results location are able to retrieve query results from Amazon S3 even if permission to the GetQueryResults action is denied. To restrict user or role access, ensure that Amazon S3 permissions to the Athena query location are denied. 
    */
  def getQueryResults(params: GetQueryResultsInput): Request[GetQueryResultsOutput, AWSError] = js.native
  def getQueryResults(
    params: GetQueryResultsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueryResultsOutput, Unit]
  ): Request[GetQueryResultsOutput, AWSError] = js.native
  
  /**
    * Returns query execution runtime statistics related to a single execution of a query if you have access to the workgroup in which the query ran. Query execution runtime statistics are returned only when QueryExecutionStatus$State is in a SUCCEEDED or FAILED state. Stage-level input and output row count and data size statistics are not shown when a query has row-level filters defined in Lake Formation.
    */
  def getQueryRuntimeStatistics(): Request[GetQueryRuntimeStatisticsOutput, AWSError] = js.native
  def getQueryRuntimeStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetQueryRuntimeStatisticsOutput, Unit]): Request[GetQueryRuntimeStatisticsOutput, AWSError] = js.native
  /**
    * Returns query execution runtime statistics related to a single execution of a query if you have access to the workgroup in which the query ran. Query execution runtime statistics are returned only when QueryExecutionStatus$State is in a SUCCEEDED or FAILED state. Stage-level input and output row count and data size statistics are not shown when a query has row-level filters defined in Lake Formation.
    */
  def getQueryRuntimeStatistics(params: GetQueryRuntimeStatisticsInput): Request[GetQueryRuntimeStatisticsOutput, AWSError] = js.native
  def getQueryRuntimeStatistics(
    params: GetQueryRuntimeStatisticsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueryRuntimeStatisticsOutput, Unit]
  ): Request[GetQueryRuntimeStatisticsOutput, AWSError] = js.native
  
  /**
    * Gets the full details of a previously created session, including the session status and configuration.
    */
  def getSession(): Request[GetSessionResponse, AWSError] = js.native
  def getSession(callback: js.Function2[/* err */ AWSError, /* data */ GetSessionResponse, Unit]): Request[GetSessionResponse, AWSError] = js.native
  /**
    * Gets the full details of a previously created session, including the session status and configuration.
    */
  def getSession(params: GetSessionRequest): Request[GetSessionResponse, AWSError] = js.native
  def getSession(
    params: GetSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSessionResponse, Unit]
  ): Request[GetSessionResponse, AWSError] = js.native
  
  /**
    * Gets the current status of a session.
    */
  def getSessionStatus(): Request[GetSessionStatusResponse, AWSError] = js.native
  def getSessionStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetSessionStatusResponse, Unit]): Request[GetSessionStatusResponse, AWSError] = js.native
  /**
    * Gets the current status of a session.
    */
  def getSessionStatus(params: GetSessionStatusRequest): Request[GetSessionStatusResponse, AWSError] = js.native
  def getSessionStatus(
    params: GetSessionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSessionStatusResponse, Unit]
  ): Request[GetSessionStatusResponse, AWSError] = js.native
  
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
    * Imports a single ipynb file to a Spark enabled workgroup. The maximum file size that can be imported is 10 megabytes. If an ipynb file with the same name already exists in the workgroup, throws an error.
    */
  def importNotebook(): Request[ImportNotebookOutput, AWSError] = js.native
  def importNotebook(callback: js.Function2[/* err */ AWSError, /* data */ ImportNotebookOutput, Unit]): Request[ImportNotebookOutput, AWSError] = js.native
  /**
    * Imports a single ipynb file to a Spark enabled workgroup. The maximum file size that can be imported is 10 megabytes. If an ipynb file with the same name already exists in the workgroup, throws an error.
    */
  def importNotebook(params: ImportNotebookInput): Request[ImportNotebookOutput, AWSError] = js.native
  def importNotebook(
    params: ImportNotebookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportNotebookOutput, Unit]
  ): Request[ImportNotebookOutput, AWSError] = js.native
  
  /**
    * Returns the supported DPU sizes for the supported application runtimes (for example, Athena notebook version 1). 
    */
  def listApplicationDPUSizes(): Request[ListApplicationDPUSizesOutput, AWSError] = js.native
  def listApplicationDPUSizes(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationDPUSizesOutput, Unit]): Request[ListApplicationDPUSizesOutput, AWSError] = js.native
  /**
    * Returns the supported DPU sizes for the supported application runtimes (for example, Athena notebook version 1). 
    */
  def listApplicationDPUSizes(params: ListApplicationDPUSizesInput): Request[ListApplicationDPUSizesOutput, AWSError] = js.native
  def listApplicationDPUSizes(
    params: ListApplicationDPUSizesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationDPUSizesOutput, Unit]
  ): Request[ListApplicationDPUSizesOutput, AWSError] = js.native
  
  /**
    * Lists the calculations that have been submitted to a session in descending order. Newer calculations are listed first; older calculations are listed later.
    */
  def listCalculationExecutions(): Request[ListCalculationExecutionsResponse, AWSError] = js.native
  def listCalculationExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListCalculationExecutionsResponse, Unit]): Request[ListCalculationExecutionsResponse, AWSError] = js.native
  /**
    * Lists the calculations that have been submitted to a session in descending order. Newer calculations are listed first; older calculations are listed later.
    */
  def listCalculationExecutions(params: ListCalculationExecutionsRequest): Request[ListCalculationExecutionsResponse, AWSError] = js.native
  def listCalculationExecutions(
    params: ListCalculationExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCalculationExecutionsResponse, Unit]
  ): Request[ListCalculationExecutionsResponse, AWSError] = js.native
  
  /**
    * Lists the capacity reservations for the current account.
    */
  def listCapacityReservations(): Request[ListCapacityReservationsOutput, AWSError] = js.native
  def listCapacityReservations(callback: js.Function2[/* err */ AWSError, /* data */ ListCapacityReservationsOutput, Unit]): Request[ListCapacityReservationsOutput, AWSError] = js.native
  /**
    * Lists the capacity reservations for the current account.
    */
  def listCapacityReservations(params: ListCapacityReservationsInput): Request[ListCapacityReservationsOutput, AWSError] = js.native
  def listCapacityReservations(
    params: ListCapacityReservationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCapacityReservationsOutput, Unit]
  ): Request[ListCapacityReservationsOutput, AWSError] = js.native
  
  /**
    * Lists the data catalogs in the current Amazon Web Services account.  In the Athena console, data catalogs are listed as "data sources" on the Data sources page under the Data source name column. 
    */
  def listDataCatalogs(): Request[ListDataCatalogsOutput, AWSError] = js.native
  def listDataCatalogs(callback: js.Function2[/* err */ AWSError, /* data */ ListDataCatalogsOutput, Unit]): Request[ListDataCatalogsOutput, AWSError] = js.native
  /**
    * Lists the data catalogs in the current Amazon Web Services account.  In the Athena console, data catalogs are listed as "data sources" on the Data sources page under the Data source name column. 
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
    * Returns a list of engine versions that are available to choose from, including the Auto option.
    */
  def listEngineVersions(): Request[ListEngineVersionsOutput, AWSError] = js.native
  def listEngineVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListEngineVersionsOutput, Unit]): Request[ListEngineVersionsOutput, AWSError] = js.native
  /**
    * Returns a list of engine versions that are available to choose from, including the Auto option.
    */
  def listEngineVersions(params: ListEngineVersionsInput): Request[ListEngineVersionsOutput, AWSError] = js.native
  def listEngineVersions(
    params: ListEngineVersionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEngineVersionsOutput, Unit]
  ): Request[ListEngineVersionsOutput, AWSError] = js.native
  
  /**
    * Lists, in descending order, the executors that joined a session. Newer executors are listed first; older executors are listed later. The result can be optionally filtered by state.
    */
  def listExecutors(): Request[ListExecutorsResponse, AWSError] = js.native
  def listExecutors(callback: js.Function2[/* err */ AWSError, /* data */ ListExecutorsResponse, Unit]): Request[ListExecutorsResponse, AWSError] = js.native
  /**
    * Lists, in descending order, the executors that joined a session. Newer executors are listed first; older executors are listed later. The result can be optionally filtered by state.
    */
  def listExecutors(params: ListExecutorsRequest): Request[ListExecutorsResponse, AWSError] = js.native
  def listExecutors(
    params: ListExecutorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExecutorsResponse, Unit]
  ): Request[ListExecutorsResponse, AWSError] = js.native
  
  /**
    * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the specified workgroup. If a workgroup is not specified, lists the saved queries for the primary workgroup. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listNamedQueries(): Request[ListNamedQueriesOutput, AWSError] = js.native
  def listNamedQueries(callback: js.Function2[/* err */ AWSError, /* data */ ListNamedQueriesOutput, Unit]): Request[ListNamedQueriesOutput, AWSError] = js.native
  /**
    * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the specified workgroup. If a workgroup is not specified, lists the saved queries for the primary workgroup. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listNamedQueries(params: ListNamedQueriesInput): Request[ListNamedQueriesOutput, AWSError] = js.native
  def listNamedQueries(
    params: ListNamedQueriesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNamedQueriesOutput, Unit]
  ): Request[ListNamedQueriesOutput, AWSError] = js.native
  
  /**
    * Displays the notebook files for the specified workgroup in paginated format.
    */
  def listNotebookMetadata(): Request[ListNotebookMetadataOutput, AWSError] = js.native
  def listNotebookMetadata(callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookMetadataOutput, Unit]): Request[ListNotebookMetadataOutput, AWSError] = js.native
  /**
    * Displays the notebook files for the specified workgroup in paginated format.
    */
  def listNotebookMetadata(params: ListNotebookMetadataInput): Request[ListNotebookMetadataOutput, AWSError] = js.native
  def listNotebookMetadata(
    params: ListNotebookMetadataInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookMetadataOutput, Unit]
  ): Request[ListNotebookMetadataOutput, AWSError] = js.native
  
  /**
    * Lists, in descending order, the sessions that have been created in a notebook that are in an active state like CREATING, CREATED, IDLE or BUSY. Newer sessions are listed first; older sessions are listed later.
    */
  def listNotebookSessions(): Request[ListNotebookSessionsResponse, AWSError] = js.native
  def listNotebookSessions(callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookSessionsResponse, Unit]): Request[ListNotebookSessionsResponse, AWSError] = js.native
  /**
    * Lists, in descending order, the sessions that have been created in a notebook that are in an active state like CREATING, CREATED, IDLE or BUSY. Newer sessions are listed first; older sessions are listed later.
    */
  def listNotebookSessions(params: ListNotebookSessionsRequest): Request[ListNotebookSessionsResponse, AWSError] = js.native
  def listNotebookSessions(
    params: ListNotebookSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookSessionsResponse, Unit]
  ): Request[ListNotebookSessionsResponse, AWSError] = js.native
  
  /**
    * Lists the prepared statements in the specified workgroup.
    */
  def listPreparedStatements(): Request[ListPreparedStatementsOutput, AWSError] = js.native
  def listPreparedStatements(callback: js.Function2[/* err */ AWSError, /* data */ ListPreparedStatementsOutput, Unit]): Request[ListPreparedStatementsOutput, AWSError] = js.native
  /**
    * Lists the prepared statements in the specified workgroup.
    */
  def listPreparedStatements(params: ListPreparedStatementsInput): Request[ListPreparedStatementsOutput, AWSError] = js.native
  def listPreparedStatements(
    params: ListPreparedStatementsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPreparedStatementsOutput, Unit]
  ): Request[ListPreparedStatementsOutput, AWSError] = js.native
  
  /**
    * Provides a list of available query execution IDs for the queries in the specified workgroup. If a workgroup is not specified, returns a list of query execution IDs for the primary workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listQueryExecutions(): Request[ListQueryExecutionsOutput, AWSError] = js.native
  def listQueryExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListQueryExecutionsOutput, Unit]): Request[ListQueryExecutionsOutput, AWSError] = js.native
  /**
    * Provides a list of available query execution IDs for the queries in the specified workgroup. If a workgroup is not specified, returns a list of query execution IDs for the primary workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listQueryExecutions(params: ListQueryExecutionsInput): Request[ListQueryExecutionsOutput, AWSError] = js.native
  def listQueryExecutions(
    params: ListQueryExecutionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueryExecutionsOutput, Unit]
  ): Request[ListQueryExecutionsOutput, AWSError] = js.native
  
  /**
    * Lists the sessions in a workgroup that are in an active state like CREATING, CREATED, IDLE, or BUSY. Newer sessions are listed first; older sessions are listed later.
    */
  def listSessions(): Request[ListSessionsResponse, AWSError] = js.native
  def listSessions(callback: js.Function2[/* err */ AWSError, /* data */ ListSessionsResponse, Unit]): Request[ListSessionsResponse, AWSError] = js.native
  /**
    * Lists the sessions in a workgroup that are in an active state like CREATING, CREATED, IDLE, or BUSY. Newer sessions are listed first; older sessions are listed later.
    */
  def listSessions(params: ListSessionsRequest): Request[ListSessionsResponse, AWSError] = js.native
  def listSessions(
    params: ListSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSessionsResponse, Unit]
  ): Request[ListSessionsResponse, AWSError] = js.native
  
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
    * Lists the tags associated with an Athena resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists the tags associated with an Athena resource.
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
    * Puts a new capacity assignment configuration for a specified capacity reservation. If a capacity assignment configuration already exists for the capacity reservation, replaces the existing capacity assignment configuration.
    */
  def putCapacityAssignmentConfiguration(): Request[PutCapacityAssignmentConfigurationOutput, AWSError] = js.native
  def putCapacityAssignmentConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ PutCapacityAssignmentConfigurationOutput, Unit]
  ): Request[PutCapacityAssignmentConfigurationOutput, AWSError] = js.native
  /**
    * Puts a new capacity assignment configuration for a specified capacity reservation. If a capacity assignment configuration already exists for the capacity reservation, replaces the existing capacity assignment configuration.
    */
  def putCapacityAssignmentConfiguration(params: PutCapacityAssignmentConfigurationInput): Request[PutCapacityAssignmentConfigurationOutput, AWSError] = js.native
  def putCapacityAssignmentConfiguration(
    params: PutCapacityAssignmentConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutCapacityAssignmentConfigurationOutput, Unit]
  ): Request[PutCapacityAssignmentConfigurationOutput, AWSError] = js.native
  
  /**
    * Submits calculations for execution within a session. You can supply the code to run as an inline code block within the request.
    */
  def startCalculationExecution(): Request[StartCalculationExecutionResponse, AWSError] = js.native
  def startCalculationExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartCalculationExecutionResponse, Unit]): Request[StartCalculationExecutionResponse, AWSError] = js.native
  /**
    * Submits calculations for execution within a session. You can supply the code to run as an inline code block within the request.
    */
  def startCalculationExecution(params: StartCalculationExecutionRequest): Request[StartCalculationExecutionResponse, AWSError] = js.native
  def startCalculationExecution(
    params: StartCalculationExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCalculationExecutionResponse, Unit]
  ): Request[StartCalculationExecutionResponse, AWSError] = js.native
  
  /**
    * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. Running queries against an external catalog requires GetDataCatalog permission to the catalog. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def startQueryExecution(): Request[StartQueryExecutionOutput, AWSError] = js.native
  def startQueryExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartQueryExecutionOutput, Unit]): Request[StartQueryExecutionOutput, AWSError] = js.native
  /**
    * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. Running queries against an external catalog requires GetDataCatalog permission to the catalog. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def startQueryExecution(params: StartQueryExecutionInput): Request[StartQueryExecutionOutput, AWSError] = js.native
  def startQueryExecution(
    params: StartQueryExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartQueryExecutionOutput, Unit]
  ): Request[StartQueryExecutionOutput, AWSError] = js.native
  
  /**
    * Creates a session for running calculations within a workgroup. The session is ready when it reaches an IDLE state.
    */
  def startSession(): Request[StartSessionResponse, AWSError] = js.native
  def startSession(callback: js.Function2[/* err */ AWSError, /* data */ StartSessionResponse, Unit]): Request[StartSessionResponse, AWSError] = js.native
  /**
    * Creates a session for running calculations within a workgroup. The session is ready when it reaches an IDLE state.
    */
  def startSession(params: StartSessionRequest): Request[StartSessionResponse, AWSError] = js.native
  def startSession(
    params: StartSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSessionResponse, Unit]
  ): Request[StartSessionResponse, AWSError] = js.native
  
  /**
    * Requests the cancellation of a calculation. A StopCalculationExecution call on a calculation that is already in a terminal state (for example, STOPPED, FAILED, or COMPLETED) succeeds but has no effect.  Cancelling a calculation is done on a best effort basis. If a calculation cannot be cancelled, you can be charged for its completion. If you are concerned about being charged for a calculation that cannot be cancelled, consider terminating the session in which the calculation is running. 
    */
  def stopCalculationExecution(): Request[StopCalculationExecutionResponse, AWSError] = js.native
  def stopCalculationExecution(callback: js.Function2[/* err */ AWSError, /* data */ StopCalculationExecutionResponse, Unit]): Request[StopCalculationExecutionResponse, AWSError] = js.native
  /**
    * Requests the cancellation of a calculation. A StopCalculationExecution call on a calculation that is already in a terminal state (for example, STOPPED, FAILED, or COMPLETED) succeeds but has no effect.  Cancelling a calculation is done on a best effort basis. If a calculation cannot be cancelled, you can be charged for its completion. If you are concerned about being charged for a calculation that cannot be cancelled, consider terminating the session in which the calculation is running. 
    */
  def stopCalculationExecution(params: StopCalculationExecutionRequest): Request[StopCalculationExecutionResponse, AWSError] = js.native
  def stopCalculationExecution(
    params: StopCalculationExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopCalculationExecutionResponse, Unit]
  ): Request[StopCalculationExecutionResponse, AWSError] = js.native
  
  /**
    * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def stopQueryExecution(): Request[StopQueryExecutionOutput, AWSError] = js.native
  def stopQueryExecution(callback: js.Function2[/* err */ AWSError, /* data */ StopQueryExecutionOutput, Unit]): Request[StopQueryExecutionOutput, AWSError] = js.native
  /**
    * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the Amazon Web Services SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def stopQueryExecution(params: StopQueryExecutionInput): Request[StopQueryExecutionOutput, AWSError] = js.native
  def stopQueryExecution(
    params: StopQueryExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopQueryExecutionOutput, Unit]
  ): Request[StopQueryExecutionOutput, AWSError] = js.native
  
  /**
    * Adds one or more tags to an Athena resource. A tag is a label that you assign to a resource. Each tag consists of a key and an optional value, both of which you define. For example, you can use tags to categorize Athena workgroups, data catalogs, or capacity reservations by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter the resources in your account. For best practices, see Tagging Best Practices. Tag keys can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters. Tags can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate them by commas.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds one or more tags to an Athena resource. A tag is a label that you assign to a resource. Each tag consists of a key and an optional value, both of which you define. For example, you can use tags to categorize Athena workgroups, data catalogs, or capacity reservations by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter the resources in your account. For best practices, see Tagging Best Practices. Tag keys can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters. Tags can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate them by commas.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Terminates an active session. A TerminateSession call on a session that is already inactive (for example, in a FAILED, TERMINATED or TERMINATING state) succeeds but has no effect. Calculations running in the session when TerminateSession is called are forcefully stopped, but may display as FAILED instead of STOPPED.
    */
  def terminateSession(): Request[TerminateSessionResponse, AWSError] = js.native
  def terminateSession(callback: js.Function2[/* err */ AWSError, /* data */ TerminateSessionResponse, Unit]): Request[TerminateSessionResponse, AWSError] = js.native
  /**
    * Terminates an active session. A TerminateSession call on a session that is already inactive (for example, in a FAILED, TERMINATED or TERMINATING state) succeeds but has no effect. Calculations running in the session when TerminateSession is called are forcefully stopped, but may display as FAILED instead of STOPPED.
    */
  def terminateSession(params: TerminateSessionRequest): Request[TerminateSessionResponse, AWSError] = js.native
  def terminateSession(
    params: TerminateSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateSessionResponse, Unit]
  ): Request[TerminateSessionResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from an Athena resource.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes one or more tags from an Athena resource.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Updates the number of requested data processing units for the capacity reservation with the specified name.
    */
  def updateCapacityReservation(): Request[UpdateCapacityReservationOutput, AWSError] = js.native
  def updateCapacityReservation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCapacityReservationOutput, Unit]): Request[UpdateCapacityReservationOutput, AWSError] = js.native
  /**
    * Updates the number of requested data processing units for the capacity reservation with the specified name.
    */
  def updateCapacityReservation(params: UpdateCapacityReservationInput): Request[UpdateCapacityReservationOutput, AWSError] = js.native
  def updateCapacityReservation(
    params: UpdateCapacityReservationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCapacityReservationOutput, Unit]
  ): Request[UpdateCapacityReservationOutput, AWSError] = js.native
  
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
    * Updates a NamedQuery object. The database or workgroup cannot be updated.
    */
  def updateNamedQuery(): Request[UpdateNamedQueryOutput, AWSError] = js.native
  def updateNamedQuery(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNamedQueryOutput, Unit]): Request[UpdateNamedQueryOutput, AWSError] = js.native
  /**
    * Updates a NamedQuery object. The database or workgroup cannot be updated.
    */
  def updateNamedQuery(params: UpdateNamedQueryInput): Request[UpdateNamedQueryOutput, AWSError] = js.native
  def updateNamedQuery(
    params: UpdateNamedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNamedQueryOutput, Unit]
  ): Request[UpdateNamedQueryOutput, AWSError] = js.native
  
  /**
    * Updates the contents of a Spark notebook.
    */
  def updateNotebook(): Request[UpdateNotebookOutput, AWSError] = js.native
  def updateNotebook(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookOutput, Unit]): Request[UpdateNotebookOutput, AWSError] = js.native
  /**
    * Updates the contents of a Spark notebook.
    */
  def updateNotebook(params: UpdateNotebookInput): Request[UpdateNotebookOutput, AWSError] = js.native
  def updateNotebook(
    params: UpdateNotebookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookOutput, Unit]
  ): Request[UpdateNotebookOutput, AWSError] = js.native
  
  /**
    * Updates the metadata for a notebook.
    */
  def updateNotebookMetadata(): Request[UpdateNotebookMetadataOutput, AWSError] = js.native
  def updateNotebookMetadata(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookMetadataOutput, Unit]): Request[UpdateNotebookMetadataOutput, AWSError] = js.native
  /**
    * Updates the metadata for a notebook.
    */
  def updateNotebookMetadata(params: UpdateNotebookMetadataInput): Request[UpdateNotebookMetadataOutput, AWSError] = js.native
  def updateNotebookMetadata(
    params: UpdateNotebookMetadataInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotebookMetadataOutput, Unit]
  ): Request[UpdateNotebookMetadataOutput, AWSError] = js.native
  
  /**
    * Updates a prepared statement.
    */
  def updatePreparedStatement(): Request[UpdatePreparedStatementOutput, AWSError] = js.native
  def updatePreparedStatement(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePreparedStatementOutput, Unit]): Request[UpdatePreparedStatementOutput, AWSError] = js.native
  /**
    * Updates a prepared statement.
    */
  def updatePreparedStatement(params: UpdatePreparedStatementInput): Request[UpdatePreparedStatementOutput, AWSError] = js.native
  def updatePreparedStatement(
    params: UpdatePreparedStatementInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePreparedStatementOutput, Unit]
  ): Request[UpdatePreparedStatementOutput, AWSError] = js.native
  
  /**
    * Updates the workgroup with the specified name. The workgroup's name cannot be changed. Only ConfigurationUpdates can be specified.
    */
  def updateWorkGroup(): Request[UpdateWorkGroupOutput, AWSError] = js.native
  def updateWorkGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkGroupOutput, Unit]): Request[UpdateWorkGroupOutput, AWSError] = js.native
  /**
    * Updates the workgroup with the specified name. The workgroup's name cannot be changed. Only ConfigurationUpdates can be specified.
    */
  def updateWorkGroup(params: UpdateWorkGroupInput): Request[UpdateWorkGroupOutput, AWSError] = js.native
  def updateWorkGroup(
    params: UpdateWorkGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkGroupOutput, Unit]
  ): Request[UpdateWorkGroupOutput, AWSError] = js.native
}
