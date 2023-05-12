package typings.awsSdk.clientsLakeformationMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LakeFormation extends Service {
  
  /**
    * Attaches one or more LF-tags to an existing resource.
    */
  def addLFTagsToResource(): Request[AddLFTagsToResourceResponse, AWSError] = js.native
  def addLFTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ AddLFTagsToResourceResponse, Unit]): Request[AddLFTagsToResourceResponse, AWSError] = js.native
  /**
    * Attaches one or more LF-tags to an existing resource.
    */
  def addLFTagsToResource(params: AddLFTagsToResourceRequest): Request[AddLFTagsToResourceResponse, AWSError] = js.native
  def addLFTagsToResource(
    params: AddLFTagsToResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddLFTagsToResourceResponse, Unit]
  ): Request[AddLFTagsToResourceResponse, AWSError] = js.native
  
  /**
    * Allows a caller to assume an IAM role decorated as the SAML user specified in the SAML assertion included in the request. This decoration allows Lake Formation to enforce access policies against the SAML users and groups. This API operation requires SAML federation setup in the caller’s account as it can only be called with valid SAML assertions. Lake Formation does not scope down the permission of the assumed role. All permissions attached to the role via the SAML federation setup will be included in the role session.   This decorated role is expected to access data in Amazon S3 by getting temporary access from Lake Formation which is authorized via the virtual API GetDataAccess. Therefore, all SAML roles that can be assumed via AssumeDecoratedRoleWithSAML must at a minimum include lakeformation:GetDataAccess in their role policies. A typical IAM policy attached to such a role would look as follows: 
    */
  def assumeDecoratedRoleWithSAML(): Request[AssumeDecoratedRoleWithSAMLResponse, AWSError] = js.native
  def assumeDecoratedRoleWithSAML(callback: js.Function2[/* err */ AWSError, /* data */ AssumeDecoratedRoleWithSAMLResponse, Unit]): Request[AssumeDecoratedRoleWithSAMLResponse, AWSError] = js.native
  /**
    * Allows a caller to assume an IAM role decorated as the SAML user specified in the SAML assertion included in the request. This decoration allows Lake Formation to enforce access policies against the SAML users and groups. This API operation requires SAML federation setup in the caller’s account as it can only be called with valid SAML assertions. Lake Formation does not scope down the permission of the assumed role. All permissions attached to the role via the SAML federation setup will be included in the role session.   This decorated role is expected to access data in Amazon S3 by getting temporary access from Lake Formation which is authorized via the virtual API GetDataAccess. Therefore, all SAML roles that can be assumed via AssumeDecoratedRoleWithSAML must at a minimum include lakeformation:GetDataAccess in their role policies. A typical IAM policy attached to such a role would look as follows: 
    */
  def assumeDecoratedRoleWithSAML(params: AssumeDecoratedRoleWithSAMLRequest): Request[AssumeDecoratedRoleWithSAMLResponse, AWSError] = js.native
  def assumeDecoratedRoleWithSAML(
    params: AssumeDecoratedRoleWithSAMLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssumeDecoratedRoleWithSAMLResponse, Unit]
  ): Request[AssumeDecoratedRoleWithSAMLResponse, AWSError] = js.native
  
  /**
    * Batch operation to grant permissions to the principal.
    */
  def batchGrantPermissions(): Request[BatchGrantPermissionsResponse, AWSError] = js.native
  def batchGrantPermissions(callback: js.Function2[/* err */ AWSError, /* data */ BatchGrantPermissionsResponse, Unit]): Request[BatchGrantPermissionsResponse, AWSError] = js.native
  /**
    * Batch operation to grant permissions to the principal.
    */
  def batchGrantPermissions(params: BatchGrantPermissionsRequest): Request[BatchGrantPermissionsResponse, AWSError] = js.native
  def batchGrantPermissions(
    params: BatchGrantPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGrantPermissionsResponse, Unit]
  ): Request[BatchGrantPermissionsResponse, AWSError] = js.native
  
  /**
    * Batch operation to revoke permissions from the principal.
    */
  def batchRevokePermissions(): Request[BatchRevokePermissionsResponse, AWSError] = js.native
  def batchRevokePermissions(callback: js.Function2[/* err */ AWSError, /* data */ BatchRevokePermissionsResponse, Unit]): Request[BatchRevokePermissionsResponse, AWSError] = js.native
  /**
    * Batch operation to revoke permissions from the principal.
    */
  def batchRevokePermissions(params: BatchRevokePermissionsRequest): Request[BatchRevokePermissionsResponse, AWSError] = js.native
  def batchRevokePermissions(
    params: BatchRevokePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchRevokePermissionsResponse, Unit]
  ): Request[BatchRevokePermissionsResponse, AWSError] = js.native
  
  /**
    * Attempts to cancel the specified transaction. Returns an exception if the transaction was previously committed.
    */
  def cancelTransaction(): Request[CancelTransactionResponse, AWSError] = js.native
  def cancelTransaction(callback: js.Function2[/* err */ AWSError, /* data */ CancelTransactionResponse, Unit]): Request[CancelTransactionResponse, AWSError] = js.native
  /**
    * Attempts to cancel the specified transaction. Returns an exception if the transaction was previously committed.
    */
  def cancelTransaction(params: CancelTransactionRequest): Request[CancelTransactionResponse, AWSError] = js.native
  def cancelTransaction(
    params: CancelTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelTransactionResponse, Unit]
  ): Request[CancelTransactionResponse, AWSError] = js.native
  
  /**
    * Attempts to commit the specified transaction. Returns an exception if the transaction was previously aborted. This API action is idempotent if called multiple times for the same transaction.
    */
  def commitTransaction(): Request[CommitTransactionResponse, AWSError] = js.native
  def commitTransaction(callback: js.Function2[/* err */ AWSError, /* data */ CommitTransactionResponse, Unit]): Request[CommitTransactionResponse, AWSError] = js.native
  /**
    * Attempts to commit the specified transaction. Returns an exception if the transaction was previously aborted. This API action is idempotent if called multiple times for the same transaction.
    */
  def commitTransaction(params: CommitTransactionRequest): Request[CommitTransactionResponse, AWSError] = js.native
  def commitTransaction(
    params: CommitTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CommitTransactionResponse, Unit]
  ): Request[CommitTransactionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_LakeFormation: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a data cell filter to allow one to grant access to certain columns on certain rows.
    */
  def createDataCellsFilter(): Request[CreateDataCellsFilterResponse, AWSError] = js.native
  def createDataCellsFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataCellsFilterResponse, Unit]): Request[CreateDataCellsFilterResponse, AWSError] = js.native
  /**
    * Creates a data cell filter to allow one to grant access to certain columns on certain rows.
    */
  def createDataCellsFilter(params: CreateDataCellsFilterRequest): Request[CreateDataCellsFilterResponse, AWSError] = js.native
  def createDataCellsFilter(
    params: CreateDataCellsFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataCellsFilterResponse, Unit]
  ): Request[CreateDataCellsFilterResponse, AWSError] = js.native
  
  /**
    * Creates an LF-tag with the specified name and values.
    */
  def createLFTag(): Request[CreateLFTagResponse, AWSError] = js.native
  def createLFTag(callback: js.Function2[/* err */ AWSError, /* data */ CreateLFTagResponse, Unit]): Request[CreateLFTagResponse, AWSError] = js.native
  /**
    * Creates an LF-tag with the specified name and values.
    */
  def createLFTag(params: CreateLFTagRequest): Request[CreateLFTagResponse, AWSError] = js.native
  def createLFTag(
    params: CreateLFTagRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLFTagResponse, Unit]
  ): Request[CreateLFTagResponse, AWSError] = js.native
  
  /**
    * Deletes a data cell filter.
    */
  def deleteDataCellsFilter(): Request[DeleteDataCellsFilterResponse, AWSError] = js.native
  def deleteDataCellsFilter(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataCellsFilterResponse, Unit]): Request[DeleteDataCellsFilterResponse, AWSError] = js.native
  /**
    * Deletes a data cell filter.
    */
  def deleteDataCellsFilter(params: DeleteDataCellsFilterRequest): Request[DeleteDataCellsFilterResponse, AWSError] = js.native
  def deleteDataCellsFilter(
    params: DeleteDataCellsFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataCellsFilterResponse, Unit]
  ): Request[DeleteDataCellsFilterResponse, AWSError] = js.native
  
  /**
    * Deletes the specified LF-tag given a key name. If the input parameter tag key was not found, then the operation will throw an exception. When you delete an LF-tag, the LFTagPolicy attached to the LF-tag becomes invalid. If the deleted LF-tag was still assigned to any resource, the tag policy attach to the deleted LF-tag will no longer be applied to the resource.
    */
  def deleteLFTag(): Request[DeleteLFTagResponse, AWSError] = js.native
  def deleteLFTag(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLFTagResponse, Unit]): Request[DeleteLFTagResponse, AWSError] = js.native
  /**
    * Deletes the specified LF-tag given a key name. If the input parameter tag key was not found, then the operation will throw an exception. When you delete an LF-tag, the LFTagPolicy attached to the LF-tag becomes invalid. If the deleted LF-tag was still assigned to any resource, the tag policy attach to the deleted LF-tag will no longer be applied to the resource.
    */
  def deleteLFTag(params: DeleteLFTagRequest): Request[DeleteLFTagResponse, AWSError] = js.native
  def deleteLFTag(
    params: DeleteLFTagRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLFTagResponse, Unit]
  ): Request[DeleteLFTagResponse, AWSError] = js.native
  
  /**
    * For a specific governed table, provides a list of Amazon S3 objects that will be written during the current transaction and that can be automatically deleted if the transaction is canceled. Without this call, no Amazon S3 objects are automatically deleted when a transaction cancels.   The Glue ETL library function write_dynamic_frame.from_catalog() includes an option to automatically call DeleteObjectsOnCancel before writes. For more information, see Rolling Back Amazon S3 Writes. 
    */
  def deleteObjectsOnCancel(): Request[DeleteObjectsOnCancelResponse, AWSError] = js.native
  def deleteObjectsOnCancel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectsOnCancelResponse, Unit]): Request[DeleteObjectsOnCancelResponse, AWSError] = js.native
  /**
    * For a specific governed table, provides a list of Amazon S3 objects that will be written during the current transaction and that can be automatically deleted if the transaction is canceled. Without this call, no Amazon S3 objects are automatically deleted when a transaction cancels.   The Glue ETL library function write_dynamic_frame.from_catalog() includes an option to automatically call DeleteObjectsOnCancel before writes. For more information, see Rolling Back Amazon S3 Writes. 
    */
  def deleteObjectsOnCancel(params: DeleteObjectsOnCancelRequest): Request[DeleteObjectsOnCancelResponse, AWSError] = js.native
  def deleteObjectsOnCancel(
    params: DeleteObjectsOnCancelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectsOnCancelResponse, Unit]
  ): Request[DeleteObjectsOnCancelResponse, AWSError] = js.native
  
  /**
    * Deregisters the resource as managed by the Data Catalog. When you deregister a path, Lake Formation removes the path from the inline policy attached to your service-linked role.
    */
  def deregisterResource(): Request[DeregisterResourceResponse, AWSError] = js.native
  def deregisterResource(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterResourceResponse, Unit]): Request[DeregisterResourceResponse, AWSError] = js.native
  /**
    * Deregisters the resource as managed by the Data Catalog. When you deregister a path, Lake Formation removes the path from the inline policy attached to your service-linked role.
    */
  def deregisterResource(params: DeregisterResourceRequest): Request[DeregisterResourceResponse, AWSError] = js.native
  def deregisterResource(
    params: DeregisterResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterResourceResponse, Unit]
  ): Request[DeregisterResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves the current data access role for the given resource registered in Lake Formation.
    */
  def describeResource(): Request[DescribeResourceResponse, AWSError] = js.native
  def describeResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceResponse, Unit]): Request[DescribeResourceResponse, AWSError] = js.native
  /**
    * Retrieves the current data access role for the given resource registered in Lake Formation.
    */
  def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse, AWSError] = js.native
  def describeResource(
    params: DescribeResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceResponse, Unit]
  ): Request[DescribeResourceResponse, AWSError] = js.native
  
  /**
    * Returns the details of a single transaction.
    */
  def describeTransaction(): Request[DescribeTransactionResponse, AWSError] = js.native
  def describeTransaction(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransactionResponse, Unit]): Request[DescribeTransactionResponse, AWSError] = js.native
  /**
    * Returns the details of a single transaction.
    */
  def describeTransaction(params: DescribeTransactionRequest): Request[DescribeTransactionResponse, AWSError] = js.native
  def describeTransaction(
    params: DescribeTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTransactionResponse, Unit]
  ): Request[DescribeTransactionResponse, AWSError] = js.native
  
  /**
    * Indicates to the service that the specified transaction is still active and should not be treated as idle and aborted. Write transactions that remain idle for a long period are automatically aborted unless explicitly extended.
    */
  def extendTransaction(): Request[ExtendTransactionResponse, AWSError] = js.native
  def extendTransaction(callback: js.Function2[/* err */ AWSError, /* data */ ExtendTransactionResponse, Unit]): Request[ExtendTransactionResponse, AWSError] = js.native
  /**
    * Indicates to the service that the specified transaction is still active and should not be treated as idle and aborted. Write transactions that remain idle for a long period are automatically aborted unless explicitly extended.
    */
  def extendTransaction(params: ExtendTransactionRequest): Request[ExtendTransactionResponse, AWSError] = js.native
  def extendTransaction(
    params: ExtendTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExtendTransactionResponse, Unit]
  ): Request[ExtendTransactionResponse, AWSError] = js.native
  
  /**
    * Returns a data cells filter.
    */
  def getDataCellsFilter(): Request[GetDataCellsFilterResponse, AWSError] = js.native
  def getDataCellsFilter(callback: js.Function2[/* err */ AWSError, /* data */ GetDataCellsFilterResponse, Unit]): Request[GetDataCellsFilterResponse, AWSError] = js.native
  /**
    * Returns a data cells filter.
    */
  def getDataCellsFilter(params: GetDataCellsFilterRequest): Request[GetDataCellsFilterResponse, AWSError] = js.native
  def getDataCellsFilter(
    params: GetDataCellsFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataCellsFilterResponse, Unit]
  ): Request[GetDataCellsFilterResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake. 
    */
  def getDataLakeSettings(): Request[GetDataLakeSettingsResponse, AWSError] = js.native
  def getDataLakeSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetDataLakeSettingsResponse, Unit]): Request[GetDataLakeSettingsResponse, AWSError] = js.native
  /**
    * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake. 
    */
  def getDataLakeSettings(params: GetDataLakeSettingsRequest): Request[GetDataLakeSettingsResponse, AWSError] = js.native
  def getDataLakeSettings(
    params: GetDataLakeSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataLakeSettingsResponse, Unit]
  ): Request[GetDataLakeSettingsResponse, AWSError] = js.native
  
  /**
    * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3. GetEffectivePermissionsForPath will not return databases and tables if the catalog is encrypted.
    */
  def getEffectivePermissionsForPath(): Request[GetEffectivePermissionsForPathResponse, AWSError] = js.native
  def getEffectivePermissionsForPath(
    callback: js.Function2[/* err */ AWSError, /* data */ GetEffectivePermissionsForPathResponse, Unit]
  ): Request[GetEffectivePermissionsForPathResponse, AWSError] = js.native
  /**
    * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3. GetEffectivePermissionsForPath will not return databases and tables if the catalog is encrypted.
    */
  def getEffectivePermissionsForPath(params: GetEffectivePermissionsForPathRequest): Request[GetEffectivePermissionsForPathResponse, AWSError] = js.native
  def getEffectivePermissionsForPath(
    params: GetEffectivePermissionsForPathRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEffectivePermissionsForPathResponse, Unit]
  ): Request[GetEffectivePermissionsForPathResponse, AWSError] = js.native
  
  /**
    * Returns an LF-tag definition.
    */
  def getLFTag(): Request[GetLFTagResponse, AWSError] = js.native
  def getLFTag(callback: js.Function2[/* err */ AWSError, /* data */ GetLFTagResponse, Unit]): Request[GetLFTagResponse, AWSError] = js.native
  /**
    * Returns an LF-tag definition.
    */
  def getLFTag(params: GetLFTagRequest): Request[GetLFTagResponse, AWSError] = js.native
  def getLFTag(
    params: GetLFTagRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLFTagResponse, Unit]
  ): Request[GetLFTagResponse, AWSError] = js.native
  
  /**
    * Returns the state of a query previously submitted. Clients are expected to poll GetQueryState to monitor the current state of the planning before retrieving the work units. A query state is only visible to the principal that made the initial call to StartQueryPlanning.
    */
  def getQueryState(): Request[GetQueryStateResponse, AWSError] = js.native
  def getQueryState(callback: js.Function2[/* err */ AWSError, /* data */ GetQueryStateResponse, Unit]): Request[GetQueryStateResponse, AWSError] = js.native
  /**
    * Returns the state of a query previously submitted. Clients are expected to poll GetQueryState to monitor the current state of the planning before retrieving the work units. A query state is only visible to the principal that made the initial call to StartQueryPlanning.
    */
  def getQueryState(params: GetQueryStateRequest): Request[GetQueryStateResponse, AWSError] = js.native
  def getQueryState(
    params: GetQueryStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueryStateResponse, Unit]
  ): Request[GetQueryStateResponse, AWSError] = js.native
  
  /**
    * Retrieves statistics on the planning and execution of a query.
    */
  def getQueryStatistics(): Request[GetQueryStatisticsResponse, AWSError] = js.native
  def getQueryStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetQueryStatisticsResponse, Unit]): Request[GetQueryStatisticsResponse, AWSError] = js.native
  /**
    * Retrieves statistics on the planning and execution of a query.
    */
  def getQueryStatistics(params: GetQueryStatisticsRequest): Request[GetQueryStatisticsResponse, AWSError] = js.native
  def getQueryStatistics(
    params: GetQueryStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueryStatisticsResponse, Unit]
  ): Request[GetQueryStatisticsResponse, AWSError] = js.native
  
  /**
    * Returns the LF-tags applied to a resource.
    */
  def getResourceLFTags(): Request[GetResourceLFTagsResponse, AWSError] = js.native
  def getResourceLFTags(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceLFTagsResponse, Unit]): Request[GetResourceLFTagsResponse, AWSError] = js.native
  /**
    * Returns the LF-tags applied to a resource.
    */
  def getResourceLFTags(params: GetResourceLFTagsRequest): Request[GetResourceLFTagsResponse, AWSError] = js.native
  def getResourceLFTags(
    params: GetResourceLFTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceLFTagsResponse, Unit]
  ): Request[GetResourceLFTagsResponse, AWSError] = js.native
  
  /**
    * Returns the set of Amazon S3 objects that make up the specified governed table. A transaction ID or timestamp can be specified for time-travel queries.
    */
  def getTableObjects(): Request[GetTableObjectsResponse, AWSError] = js.native
  def getTableObjects(callback: js.Function2[/* err */ AWSError, /* data */ GetTableObjectsResponse, Unit]): Request[GetTableObjectsResponse, AWSError] = js.native
  /**
    * Returns the set of Amazon S3 objects that make up the specified governed table. A transaction ID or timestamp can be specified for time-travel queries.
    */
  def getTableObjects(params: GetTableObjectsRequest): Request[GetTableObjectsResponse, AWSError] = js.native
  def getTableObjects(
    params: GetTableObjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTableObjectsResponse, Unit]
  ): Request[GetTableObjectsResponse, AWSError] = js.native
  
  /**
    * This API is identical to GetTemporaryTableCredentials except that this is used when the target Data Catalog resource is of type Partition. Lake Formation restricts the permission of the vended credentials with the same scope down policy which restricts access to a single Amazon S3 prefix.
    */
  def getTemporaryGluePartitionCredentials(): Request[GetTemporaryGluePartitionCredentialsResponse, AWSError] = js.native
  def getTemporaryGluePartitionCredentials(
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemporaryGluePartitionCredentialsResponse, Unit]
  ): Request[GetTemporaryGluePartitionCredentialsResponse, AWSError] = js.native
  /**
    * This API is identical to GetTemporaryTableCredentials except that this is used when the target Data Catalog resource is of type Partition. Lake Formation restricts the permission of the vended credentials with the same scope down policy which restricts access to a single Amazon S3 prefix.
    */
  def getTemporaryGluePartitionCredentials(params: GetTemporaryGluePartitionCredentialsRequest): Request[GetTemporaryGluePartitionCredentialsResponse, AWSError] = js.native
  def getTemporaryGluePartitionCredentials(
    params: GetTemporaryGluePartitionCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemporaryGluePartitionCredentialsResponse, Unit]
  ): Request[GetTemporaryGluePartitionCredentialsResponse, AWSError] = js.native
  
  /**
    * Allows a caller in a secure environment to assume a role with permission to access Amazon S3. In order to vend such credentials, Lake Formation assumes the role associated with a registered location, for example an Amazon S3 bucket, with a scope down policy which restricts the access to a single prefix.
    */
  def getTemporaryGlueTableCredentials(): Request[GetTemporaryGlueTableCredentialsResponse, AWSError] = js.native
  def getTemporaryGlueTableCredentials(
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemporaryGlueTableCredentialsResponse, Unit]
  ): Request[GetTemporaryGlueTableCredentialsResponse, AWSError] = js.native
  /**
    * Allows a caller in a secure environment to assume a role with permission to access Amazon S3. In order to vend such credentials, Lake Formation assumes the role associated with a registered location, for example an Amazon S3 bucket, with a scope down policy which restricts the access to a single prefix.
    */
  def getTemporaryGlueTableCredentials(params: GetTemporaryGlueTableCredentialsRequest): Request[GetTemporaryGlueTableCredentialsResponse, AWSError] = js.native
  def getTemporaryGlueTableCredentials(
    params: GetTemporaryGlueTableCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemporaryGlueTableCredentialsResponse, Unit]
  ): Request[GetTemporaryGlueTableCredentialsResponse, AWSError] = js.native
  
  /**
    * Returns the work units resulting from the query. Work units can be executed in any order and in parallel. 
    */
  def getWorkUnitResults(): Request[GetWorkUnitResultsResponse, AWSError] = js.native
  def getWorkUnitResults(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkUnitResultsResponse, Unit]): Request[GetWorkUnitResultsResponse, AWSError] = js.native
  /**
    * Returns the work units resulting from the query. Work units can be executed in any order and in parallel. 
    */
  def getWorkUnitResults(params: GetWorkUnitResultsRequest): Request[GetWorkUnitResultsResponse, AWSError] = js.native
  def getWorkUnitResults(
    params: GetWorkUnitResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkUnitResultsResponse, Unit]
  ): Request[GetWorkUnitResultsResponse, AWSError] = js.native
  
  /**
    * Retrieves the work units generated by the StartQueryPlanning operation.
    */
  def getWorkUnits(): Request[GetWorkUnitsResponse, AWSError] = js.native
  def getWorkUnits(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkUnitsResponse, Unit]): Request[GetWorkUnitsResponse, AWSError] = js.native
  /**
    * Retrieves the work units generated by the StartQueryPlanning operation.
    */
  def getWorkUnits(params: GetWorkUnitsRequest): Request[GetWorkUnitsResponse, AWSError] = js.native
  def getWorkUnits(
    params: GetWorkUnitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkUnitsResponse, Unit]
  ): Request[GetWorkUnitsResponse, AWSError] = js.native
  
  /**
    * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  def grantPermissions(): Request[GrantPermissionsResponse, AWSError] = js.native
  def grantPermissions(callback: js.Function2[/* err */ AWSError, /* data */ GrantPermissionsResponse, Unit]): Request[GrantPermissionsResponse, AWSError] = js.native
  /**
    * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  def grantPermissions(params: GrantPermissionsRequest): Request[GrantPermissionsResponse, AWSError] = js.native
  def grantPermissions(
    params: GrantPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GrantPermissionsResponse, Unit]
  ): Request[GrantPermissionsResponse, AWSError] = js.native
  
  /**
    * Lists all the data cell filters on a table.
    */
  def listDataCellsFilter(): Request[ListDataCellsFilterResponse, AWSError] = js.native
  def listDataCellsFilter(callback: js.Function2[/* err */ AWSError, /* data */ ListDataCellsFilterResponse, Unit]): Request[ListDataCellsFilterResponse, AWSError] = js.native
  /**
    * Lists all the data cell filters on a table.
    */
  def listDataCellsFilter(params: ListDataCellsFilterRequest): Request[ListDataCellsFilterResponse, AWSError] = js.native
  def listDataCellsFilter(
    params: ListDataCellsFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataCellsFilterResponse, Unit]
  ): Request[ListDataCellsFilterResponse, AWSError] = js.native
  
  /**
    * Lists LF-tags that the requester has permission to view. 
    */
  def listLFTags(): Request[ListLFTagsResponse, AWSError] = js.native
  def listLFTags(callback: js.Function2[/* err */ AWSError, /* data */ ListLFTagsResponse, Unit]): Request[ListLFTagsResponse, AWSError] = js.native
  /**
    * Lists LF-tags that the requester has permission to view. 
    */
  def listLFTags(params: ListLFTagsRequest): Request[ListLFTagsResponse, AWSError] = js.native
  def listLFTags(
    params: ListLFTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLFTagsResponse, Unit]
  ): Request[ListLFTagsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the principal permissions on the resource, filtered by the permissions of the caller. For example, if you are granted an ALTER permission, you are able to see only the principal permissions for ALTER. This operation returns only those permissions that have been explicitly granted. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  def listPermissions(): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]): Request[ListPermissionsResponse, AWSError] = js.native
  /**
    * Returns a list of the principal permissions on the resource, filtered by the permissions of the caller. For example, if you are granted an ALTER permission, you are able to see only the principal permissions for ALTER. This operation returns only those permissions that have been explicitly granted. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(
    params: ListPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]
  ): Request[ListPermissionsResponse, AWSError] = js.native
  
  /**
    * Lists the resources registered to be managed by the Data Catalog.
    */
  def listResources(): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources registered to be managed by the Data Catalog.
    */
  def listResources(params: ListResourcesRequest): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]
  ): Request[ListResourcesResponse, AWSError] = js.native
  
  /**
    * Returns the configuration of all storage optimizers associated with a specified table.
    */
  def listTableStorageOptimizers(): Request[ListTableStorageOptimizersResponse, AWSError] = js.native
  def listTableStorageOptimizers(callback: js.Function2[/* err */ AWSError, /* data */ ListTableStorageOptimizersResponse, Unit]): Request[ListTableStorageOptimizersResponse, AWSError] = js.native
  /**
    * Returns the configuration of all storage optimizers associated with a specified table.
    */
  def listTableStorageOptimizers(params: ListTableStorageOptimizersRequest): Request[ListTableStorageOptimizersResponse, AWSError] = js.native
  def listTableStorageOptimizers(
    params: ListTableStorageOptimizersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTableStorageOptimizersResponse, Unit]
  ): Request[ListTableStorageOptimizersResponse, AWSError] = js.native
  
  /**
    * Returns metadata about transactions and their status. To prevent the response from growing indefinitely, only uncommitted transactions and those available for time-travel queries are returned. This operation can help you identify uncommitted transactions or to get information about transactions.
    */
  def listTransactions(): Request[ListTransactionsResponse, AWSError] = js.native
  def listTransactions(callback: js.Function2[/* err */ AWSError, /* data */ ListTransactionsResponse, Unit]): Request[ListTransactionsResponse, AWSError] = js.native
  /**
    * Returns metadata about transactions and their status. To prevent the response from growing indefinitely, only uncommitted transactions and those available for time-travel queries are returned. This operation can help you identify uncommitted transactions or to get information about transactions.
    */
  def listTransactions(params: ListTransactionsRequest): Request[ListTransactionsResponse, AWSError] = js.native
  def listTransactions(
    params: ListTransactionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTransactionsResponse, Unit]
  ): Request[ListTransactionsResponse, AWSError] = js.native
  
  /**
    * Sets the list of data lake administrators who have admin privileges on all resources managed by Lake Formation. For more information on admin privileges, see Granting Lake Formation Permissions. This API replaces the current list of data lake admins with the new list being passed. To add an admin, fetch the current list and add the new admin to that list and pass that list in this API.
    */
  def putDataLakeSettings(): Request[PutDataLakeSettingsResponse, AWSError] = js.native
  def putDataLakeSettings(callback: js.Function2[/* err */ AWSError, /* data */ PutDataLakeSettingsResponse, Unit]): Request[PutDataLakeSettingsResponse, AWSError] = js.native
  /**
    * Sets the list of data lake administrators who have admin privileges on all resources managed by Lake Formation. For more information on admin privileges, see Granting Lake Formation Permissions. This API replaces the current list of data lake admins with the new list being passed. To add an admin, fetch the current list and add the new admin to that list and pass that list in this API.
    */
  def putDataLakeSettings(params: PutDataLakeSettingsRequest): Request[PutDataLakeSettingsResponse, AWSError] = js.native
  def putDataLakeSettings(
    params: PutDataLakeSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDataLakeSettingsResponse, Unit]
  ): Request[PutDataLakeSettingsResponse, AWSError] = js.native
  
  /**
    * Registers the resource as managed by the Data Catalog. To add or update data, Lake Formation needs read/write access to the chosen Amazon S3 path. Choose a role that you know has permission to do this, or choose the AWSServiceRoleForLakeFormationDataAccess service-linked role. When you register the first Amazon S3 path, the service-linked role and a new inline policy are created on your behalf. Lake Formation adds the first path to the inline policy and attaches it to the service-linked role. When you register subsequent paths, Lake Formation adds the path to the existing policy. The following request registers a new location and gives Lake Formation permission to use the service-linked role to access that location.  ResourceArn = arn:aws:s3:::my-bucket UseServiceLinkedRole = true  If UseServiceLinkedRole is not set to true, you must provide or set the RoleArn:  arn:aws:iam::12345:role/my-data-access-role 
    */
  def registerResource(): Request[RegisterResourceResponse, AWSError] = js.native
  def registerResource(callback: js.Function2[/* err */ AWSError, /* data */ RegisterResourceResponse, Unit]): Request[RegisterResourceResponse, AWSError] = js.native
  /**
    * Registers the resource as managed by the Data Catalog. To add or update data, Lake Formation needs read/write access to the chosen Amazon S3 path. Choose a role that you know has permission to do this, or choose the AWSServiceRoleForLakeFormationDataAccess service-linked role. When you register the first Amazon S3 path, the service-linked role and a new inline policy are created on your behalf. Lake Formation adds the first path to the inline policy and attaches it to the service-linked role. When you register subsequent paths, Lake Formation adds the path to the existing policy. The following request registers a new location and gives Lake Formation permission to use the service-linked role to access that location.  ResourceArn = arn:aws:s3:::my-bucket UseServiceLinkedRole = true  If UseServiceLinkedRole is not set to true, you must provide or set the RoleArn:  arn:aws:iam::12345:role/my-data-access-role 
    */
  def registerResource(params: RegisterResourceRequest): Request[RegisterResourceResponse, AWSError] = js.native
  def registerResource(
    params: RegisterResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterResourceResponse, Unit]
  ): Request[RegisterResourceResponse, AWSError] = js.native
  
  /**
    * Removes an LF-tag from the resource. Only database, table, or tableWithColumns resource are allowed. To tag columns, use the column inclusion list in tableWithColumns to specify column input.
    */
  def removeLFTagsFromResource(): Request[RemoveLFTagsFromResourceResponse, AWSError] = js.native
  def removeLFTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ RemoveLFTagsFromResourceResponse, Unit]): Request[RemoveLFTagsFromResourceResponse, AWSError] = js.native
  /**
    * Removes an LF-tag from the resource. Only database, table, or tableWithColumns resource are allowed. To tag columns, use the column inclusion list in tableWithColumns to specify column input.
    */
  def removeLFTagsFromResource(params: RemoveLFTagsFromResourceRequest): Request[RemoveLFTagsFromResourceResponse, AWSError] = js.native
  def removeLFTagsFromResource(
    params: RemoveLFTagsFromResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveLFTagsFromResourceResponse, Unit]
  ): Request[RemoveLFTagsFromResourceResponse, AWSError] = js.native
  
  /**
    * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
    */
  def revokePermissions(): Request[RevokePermissionsResponse, AWSError] = js.native
  def revokePermissions(callback: js.Function2[/* err */ AWSError, /* data */ RevokePermissionsResponse, Unit]): Request[RevokePermissionsResponse, AWSError] = js.native
  /**
    * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
    */
  def revokePermissions(params: RevokePermissionsRequest): Request[RevokePermissionsResponse, AWSError] = js.native
  def revokePermissions(
    params: RevokePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokePermissionsResponse, Unit]
  ): Request[RevokePermissionsResponse, AWSError] = js.native
  
  /**
    * This operation allows a search on DATABASE resources by TagCondition. This operation is used by admins who want to grant user permissions on certain TagConditions. Before making a grant, the admin can use SearchDatabasesByTags to find all resources where the given TagConditions are valid to verify whether the returned resources can be shared.
    */
  def searchDatabasesByLFTags(): Request[SearchDatabasesByLFTagsResponse, AWSError] = js.native
  def searchDatabasesByLFTags(callback: js.Function2[/* err */ AWSError, /* data */ SearchDatabasesByLFTagsResponse, Unit]): Request[SearchDatabasesByLFTagsResponse, AWSError] = js.native
  /**
    * This operation allows a search on DATABASE resources by TagCondition. This operation is used by admins who want to grant user permissions on certain TagConditions. Before making a grant, the admin can use SearchDatabasesByTags to find all resources where the given TagConditions are valid to verify whether the returned resources can be shared.
    */
  def searchDatabasesByLFTags(params: SearchDatabasesByLFTagsRequest): Request[SearchDatabasesByLFTagsResponse, AWSError] = js.native
  def searchDatabasesByLFTags(
    params: SearchDatabasesByLFTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchDatabasesByLFTagsResponse, Unit]
  ): Request[SearchDatabasesByLFTagsResponse, AWSError] = js.native
  
  /**
    * This operation allows a search on TABLE resources by LFTags. This will be used by admins who want to grant user permissions on certain LF-tags. Before making a grant, the admin can use SearchTablesByLFTags to find all resources where the given LFTags are valid to verify whether the returned resources can be shared.
    */
  def searchTablesByLFTags(): Request[SearchTablesByLFTagsResponse, AWSError] = js.native
  def searchTablesByLFTags(callback: js.Function2[/* err */ AWSError, /* data */ SearchTablesByLFTagsResponse, Unit]): Request[SearchTablesByLFTagsResponse, AWSError] = js.native
  /**
    * This operation allows a search on TABLE resources by LFTags. This will be used by admins who want to grant user permissions on certain LF-tags. Before making a grant, the admin can use SearchTablesByLFTags to find all resources where the given LFTags are valid to verify whether the returned resources can be shared.
    */
  def searchTablesByLFTags(params: SearchTablesByLFTagsRequest): Request[SearchTablesByLFTagsResponse, AWSError] = js.native
  def searchTablesByLFTags(
    params: SearchTablesByLFTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchTablesByLFTagsResponse, Unit]
  ): Request[SearchTablesByLFTagsResponse, AWSError] = js.native
  
  /**
    * Submits a request to process a query statement. This operation generates work units that can be retrieved with the GetWorkUnits operation as soon as the query state is WORKUNITS_AVAILABLE or FINISHED.
    */
  def startQueryPlanning(): Request[StartQueryPlanningResponse, AWSError] = js.native
  def startQueryPlanning(callback: js.Function2[/* err */ AWSError, /* data */ StartQueryPlanningResponse, Unit]): Request[StartQueryPlanningResponse, AWSError] = js.native
  /**
    * Submits a request to process a query statement. This operation generates work units that can be retrieved with the GetWorkUnits operation as soon as the query state is WORKUNITS_AVAILABLE or FINISHED.
    */
  def startQueryPlanning(params: StartQueryPlanningRequest): Request[StartQueryPlanningResponse, AWSError] = js.native
  def startQueryPlanning(
    params: StartQueryPlanningRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartQueryPlanningResponse, Unit]
  ): Request[StartQueryPlanningResponse, AWSError] = js.native
  
  /**
    * Starts a new transaction and returns its transaction ID. Transaction IDs are opaque objects that you can use to identify a transaction.
    */
  def startTransaction(): Request[StartTransactionResponse, AWSError] = js.native
  def startTransaction(callback: js.Function2[/* err */ AWSError, /* data */ StartTransactionResponse, Unit]): Request[StartTransactionResponse, AWSError] = js.native
  /**
    * Starts a new transaction and returns its transaction ID. Transaction IDs are opaque objects that you can use to identify a transaction.
    */
  def startTransaction(params: StartTransactionRequest): Request[StartTransactionResponse, AWSError] = js.native
  def startTransaction(
    params: StartTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTransactionResponse, Unit]
  ): Request[StartTransactionResponse, AWSError] = js.native
  
  /**
    * Updates a data cell filter.
    */
  def updateDataCellsFilter(): Request[UpdateDataCellsFilterResponse, AWSError] = js.native
  def updateDataCellsFilter(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataCellsFilterResponse, Unit]): Request[UpdateDataCellsFilterResponse, AWSError] = js.native
  /**
    * Updates a data cell filter.
    */
  def updateDataCellsFilter(params: UpdateDataCellsFilterRequest): Request[UpdateDataCellsFilterResponse, AWSError] = js.native
  def updateDataCellsFilter(
    params: UpdateDataCellsFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataCellsFilterResponse, Unit]
  ): Request[UpdateDataCellsFilterResponse, AWSError] = js.native
  
  /**
    * Updates the list of possible values for the specified LF-tag key. If the LF-tag does not exist, the operation throws an EntityNotFoundException. The values in the delete key values will be deleted from list of possible values. If any value in the delete key values is attached to a resource, then API errors out with a 400 Exception - "Update not allowed". Untag the attribute before deleting the LF-tag key's value. 
    */
  def updateLFTag(): Request[UpdateLFTagResponse, AWSError] = js.native
  def updateLFTag(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLFTagResponse, Unit]): Request[UpdateLFTagResponse, AWSError] = js.native
  /**
    * Updates the list of possible values for the specified LF-tag key. If the LF-tag does not exist, the operation throws an EntityNotFoundException. The values in the delete key values will be deleted from list of possible values. If any value in the delete key values is attached to a resource, then API errors out with a 400 Exception - "Update not allowed". Untag the attribute before deleting the LF-tag key's value. 
    */
  def updateLFTag(params: UpdateLFTagRequest): Request[UpdateLFTagResponse, AWSError] = js.native
  def updateLFTag(
    params: UpdateLFTagRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLFTagResponse, Unit]
  ): Request[UpdateLFTagResponse, AWSError] = js.native
  
  /**
    * Updates the data access role used for vending access to the given (registered) resource in Lake Formation. 
    */
  def updateResource(): Request[UpdateResourceResponse, AWSError] = js.native
  def updateResource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceResponse, Unit]): Request[UpdateResourceResponse, AWSError] = js.native
  /**
    * Updates the data access role used for vending access to the given (registered) resource in Lake Formation. 
    */
  def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse, AWSError] = js.native
  def updateResource(
    params: UpdateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceResponse, Unit]
  ): Request[UpdateResourceResponse, AWSError] = js.native
  
  /**
    * Updates the manifest of Amazon S3 objects that make up the specified governed table.
    */
  def updateTableObjects(): Request[UpdateTableObjectsResponse, AWSError] = js.native
  def updateTableObjects(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableObjectsResponse, Unit]): Request[UpdateTableObjectsResponse, AWSError] = js.native
  /**
    * Updates the manifest of Amazon S3 objects that make up the specified governed table.
    */
  def updateTableObjects(params: UpdateTableObjectsRequest): Request[UpdateTableObjectsResponse, AWSError] = js.native
  def updateTableObjects(
    params: UpdateTableObjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableObjectsResponse, Unit]
  ): Request[UpdateTableObjectsResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of the storage optimizers for a table.
    */
  def updateTableStorageOptimizer(): Request[UpdateTableStorageOptimizerResponse, AWSError] = js.native
  def updateTableStorageOptimizer(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableStorageOptimizerResponse, Unit]): Request[UpdateTableStorageOptimizerResponse, AWSError] = js.native
  /**
    * Updates the configuration of the storage optimizers for a table.
    */
  def updateTableStorageOptimizer(params: UpdateTableStorageOptimizerRequest): Request[UpdateTableStorageOptimizerResponse, AWSError] = js.native
  def updateTableStorageOptimizer(
    params: UpdateTableStorageOptimizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableStorageOptimizerResponse, Unit]
  ): Request[UpdateTableStorageOptimizerResponse, AWSError] = js.native
}
