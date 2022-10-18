package typings.awsSdk.clientsRedshiftserverlessMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftServerless extends Service {
  
  @JSName("config")
  var config_RedshiftServerless: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Converts a recovery point to a snapshot. For more information about recovery points and snapshots, see Working with snapshots and recovery points.
    */
  def convertRecoveryPointToSnapshot(): Request[ConvertRecoveryPointToSnapshotResponse, AWSError] = js.native
  def convertRecoveryPointToSnapshot(
    callback: js.Function2[/* err */ AWSError, /* data */ ConvertRecoveryPointToSnapshotResponse, Unit]
  ): Request[ConvertRecoveryPointToSnapshotResponse, AWSError] = js.native
  /**
    * Converts a recovery point to a snapshot. For more information about recovery points and snapshots, see Working with snapshots and recovery points.
    */
  def convertRecoveryPointToSnapshot(params: ConvertRecoveryPointToSnapshotRequest): Request[ConvertRecoveryPointToSnapshotResponse, AWSError] = js.native
  def convertRecoveryPointToSnapshot(
    params: ConvertRecoveryPointToSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConvertRecoveryPointToSnapshotResponse, Unit]
  ): Request[ConvertRecoveryPointToSnapshotResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Redshift Serverless managed VPC endpoint.
    */
  def createEndpointAccess(): Request[CreateEndpointAccessResponse, AWSError] = js.native
  def createEndpointAccess(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointAccessResponse, Unit]): Request[CreateEndpointAccessResponse, AWSError] = js.native
  /**
    * Creates an Amazon Redshift Serverless managed VPC endpoint.
    */
  def createEndpointAccess(params: CreateEndpointAccessRequest): Request[CreateEndpointAccessResponse, AWSError] = js.native
  def createEndpointAccess(
    params: CreateEndpointAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointAccessResponse, Unit]
  ): Request[CreateEndpointAccessResponse, AWSError] = js.native
  
  /**
    * Creates a namespace in Amazon Redshift Serverless.
    */
  def createNamespace(): Request[CreateNamespaceResponse, AWSError] = js.native
  def createNamespace(callback: js.Function2[/* err */ AWSError, /* data */ CreateNamespaceResponse, Unit]): Request[CreateNamespaceResponse, AWSError] = js.native
  /**
    * Creates a namespace in Amazon Redshift Serverless.
    */
  def createNamespace(params: CreateNamespaceRequest): Request[CreateNamespaceResponse, AWSError] = js.native
  def createNamespace(
    params: CreateNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNamespaceResponse, Unit]
  ): Request[CreateNamespaceResponse, AWSError] = js.native
  
  /**
    * Creates a snapshot of all databases in a namespace. For more information about snapshots, see  Working with snapshots and recovery points.
    */
  def createSnapshot(): Request[CreateSnapshotResponse, AWSError] = js.native
  def createSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResponse, Unit]): Request[CreateSnapshotResponse, AWSError] = js.native
  /**
    * Creates a snapshot of all databases in a namespace. For more information about snapshots, see  Working with snapshots and recovery points.
    */
  def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResponse, AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResponse, Unit]
  ): Request[CreateSnapshotResponse, AWSError] = js.native
  
  /**
    * Creates a usage limit for a specified Amazon Redshift Serverless usage type. The usage limit is identified by the returned usage limit identifier. 
    */
  def createUsageLimit(): Request[CreateUsageLimitResponse, AWSError] = js.native
  def createUsageLimit(callback: js.Function2[/* err */ AWSError, /* data */ CreateUsageLimitResponse, Unit]): Request[CreateUsageLimitResponse, AWSError] = js.native
  /**
    * Creates a usage limit for a specified Amazon Redshift Serverless usage type. The usage limit is identified by the returned usage limit identifier. 
    */
  def createUsageLimit(params: CreateUsageLimitRequest): Request[CreateUsageLimitResponse, AWSError] = js.native
  def createUsageLimit(
    params: CreateUsageLimitRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUsageLimitResponse, Unit]
  ): Request[CreateUsageLimitResponse, AWSError] = js.native
  
  /**
    * Creates an workgroup in Amazon Redshift Serverless.
    */
  def createWorkgroup(): Request[CreateWorkgroupResponse, AWSError] = js.native
  def createWorkgroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkgroupResponse, Unit]): Request[CreateWorkgroupResponse, AWSError] = js.native
  /**
    * Creates an workgroup in Amazon Redshift Serverless.
    */
  def createWorkgroup(params: CreateWorkgroupRequest): Request[CreateWorkgroupResponse, AWSError] = js.native
  def createWorkgroup(
    params: CreateWorkgroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkgroupResponse, Unit]
  ): Request[CreateWorkgroupResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Redshift Serverless managed VPC endpoint.
    */
  def deleteEndpointAccess(): Request[DeleteEndpointAccessResponse, AWSError] = js.native
  def deleteEndpointAccess(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointAccessResponse, Unit]): Request[DeleteEndpointAccessResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Redshift Serverless managed VPC endpoint.
    */
  def deleteEndpointAccess(params: DeleteEndpointAccessRequest): Request[DeleteEndpointAccessResponse, AWSError] = js.native
  def deleteEndpointAccess(
    params: DeleteEndpointAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointAccessResponse, Unit]
  ): Request[DeleteEndpointAccessResponse, AWSError] = js.native
  
  /**
    * Deletes a namespace from Amazon Redshift Serverless. Before you delete the namespace, you can create a final snapshot that has all of the data within the namespace.
    */
  def deleteNamespace(): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]): Request[DeleteNamespaceResponse, AWSError] = js.native
  /**
    * Deletes a namespace from Amazon Redshift Serverless. Before you delete the namespace, you can create a final snapshot that has all of the data within the namespace.
    */
  def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(
    params: DeleteNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]
  ): Request[DeleteNamespaceResponse, AWSError] = js.native
  
  /**
    * Deletes the specified resource policy.
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified resource policy.
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]
  ): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Deletes a snapshot from Amazon Redshift Serverless.
    */
  def deleteSnapshot(): Request[DeleteSnapshotResponse, AWSError] = js.native
  def deleteSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResponse, Unit]): Request[DeleteSnapshotResponse, AWSError] = js.native
  /**
    * Deletes a snapshot from Amazon Redshift Serverless.
    */
  def deleteSnapshot(params: DeleteSnapshotRequest): Request[DeleteSnapshotResponse, AWSError] = js.native
  def deleteSnapshot(
    params: DeleteSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResponse, Unit]
  ): Request[DeleteSnapshotResponse, AWSError] = js.native
  
  /**
    * Deletes a usage limit from Amazon Redshift Serverless.
    */
  def deleteUsageLimit(): Request[DeleteUsageLimitResponse, AWSError] = js.native
  def deleteUsageLimit(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUsageLimitResponse, Unit]): Request[DeleteUsageLimitResponse, AWSError] = js.native
  /**
    * Deletes a usage limit from Amazon Redshift Serverless.
    */
  def deleteUsageLimit(params: DeleteUsageLimitRequest): Request[DeleteUsageLimitResponse, AWSError] = js.native
  def deleteUsageLimit(
    params: DeleteUsageLimitRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUsageLimitResponse, Unit]
  ): Request[DeleteUsageLimitResponse, AWSError] = js.native
  
  /**
    * Deletes a workgroup.
    */
  def deleteWorkgroup(): Request[DeleteWorkgroupResponse, AWSError] = js.native
  def deleteWorkgroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkgroupResponse, Unit]): Request[DeleteWorkgroupResponse, AWSError] = js.native
  /**
    * Deletes a workgroup.
    */
  def deleteWorkgroup(params: DeleteWorkgroupRequest): Request[DeleteWorkgroupResponse, AWSError] = js.native
  def deleteWorkgroup(
    params: DeleteWorkgroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkgroupResponse, Unit]
  ): Request[DeleteWorkgroupResponse, AWSError] = js.native
  
  /**
    * Returns a database user name and temporary password with temporary authorization to log in to Amazon Redshift Serverless. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes).  &lt;p&gt; The Identity and Access Management (IAM) user or role that runs GetCredentials must have an IAM policy attached that allows access to all necessary actions and resources. &lt;/p&gt; &lt;p&gt; If the &lt;code&gt;DbName&lt;/code&gt; parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name.&lt;/p&gt; 
    */
  def getCredentials(): Request[GetCredentialsResponse, AWSError] = js.native
  def getCredentials(callback: js.Function2[/* err */ AWSError, /* data */ GetCredentialsResponse, Unit]): Request[GetCredentialsResponse, AWSError] = js.native
  /**
    * Returns a database user name and temporary password with temporary authorization to log in to Amazon Redshift Serverless. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes).  &lt;p&gt; The Identity and Access Management (IAM) user or role that runs GetCredentials must have an IAM policy attached that allows access to all necessary actions and resources. &lt;/p&gt; &lt;p&gt; If the &lt;code&gt;DbName&lt;/code&gt; parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name.&lt;/p&gt; 
    */
  def getCredentials(params: GetCredentialsRequest): Request[GetCredentialsResponse, AWSError] = js.native
  def getCredentials(
    params: GetCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCredentialsResponse, Unit]
  ): Request[GetCredentialsResponse, AWSError] = js.native
  
  /**
    * Returns information, such as the name, about a VPC endpoint.
    */
  def getEndpointAccess(): Request[GetEndpointAccessResponse, AWSError] = js.native
  def getEndpointAccess(callback: js.Function2[/* err */ AWSError, /* data */ GetEndpointAccessResponse, Unit]): Request[GetEndpointAccessResponse, AWSError] = js.native
  /**
    * Returns information, such as the name, about a VPC endpoint.
    */
  def getEndpointAccess(params: GetEndpointAccessRequest): Request[GetEndpointAccessResponse, AWSError] = js.native
  def getEndpointAccess(
    params: GetEndpointAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEndpointAccessResponse, Unit]
  ): Request[GetEndpointAccessResponse, AWSError] = js.native
  
  /**
    * Returns information about a namespace in Amazon Redshift Serverless.
    */
  def getNamespace(): Request[GetNamespaceResponse, AWSError] = js.native
  def getNamespace(callback: js.Function2[/* err */ AWSError, /* data */ GetNamespaceResponse, Unit]): Request[GetNamespaceResponse, AWSError] = js.native
  /**
    * Returns information about a namespace in Amazon Redshift Serverless.
    */
  def getNamespace(params: GetNamespaceRequest): Request[GetNamespaceResponse, AWSError] = js.native
  def getNamespace(
    params: GetNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNamespaceResponse, Unit]
  ): Request[GetNamespaceResponse, AWSError] = js.native
  
  /**
    * Returns information about a recovery point.
    */
  def getRecoveryPoint(): Request[GetRecoveryPointResponse, AWSError] = js.native
  def getRecoveryPoint(callback: js.Function2[/* err */ AWSError, /* data */ GetRecoveryPointResponse, Unit]): Request[GetRecoveryPointResponse, AWSError] = js.native
  /**
    * Returns information about a recovery point.
    */
  def getRecoveryPoint(params: GetRecoveryPointRequest): Request[GetRecoveryPointResponse, AWSError] = js.native
  def getRecoveryPoint(
    params: GetRecoveryPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecoveryPointResponse, Unit]
  ): Request[GetRecoveryPointResponse, AWSError] = js.native
  
  /**
    * Returns a resource policy.
    */
  def getResourcePolicy(): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]): Request[GetResourcePolicyResponse, AWSError] = js.native
  /**
    * Returns a resource policy.
    */
  def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(
    params: GetResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]
  ): Request[GetResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Returns information about a specific snapshot.
    */
  def getSnapshot(): Request[GetSnapshotResponse, AWSError] = js.native
  def getSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotResponse, Unit]): Request[GetSnapshotResponse, AWSError] = js.native
  /**
    * Returns information about a specific snapshot.
    */
  def getSnapshot(params: GetSnapshotRequest): Request[GetSnapshotResponse, AWSError] = js.native
  def getSnapshot(
    params: GetSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotResponse, Unit]
  ): Request[GetSnapshotResponse, AWSError] = js.native
  
  /**
    * Returns information about a usage limit.
    */
  def getUsageLimit(): Request[GetUsageLimitResponse, AWSError] = js.native
  def getUsageLimit(callback: js.Function2[/* err */ AWSError, /* data */ GetUsageLimitResponse, Unit]): Request[GetUsageLimitResponse, AWSError] = js.native
  /**
    * Returns information about a usage limit.
    */
  def getUsageLimit(params: GetUsageLimitRequest): Request[GetUsageLimitResponse, AWSError] = js.native
  def getUsageLimit(
    params: GetUsageLimitRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUsageLimitResponse, Unit]
  ): Request[GetUsageLimitResponse, AWSError] = js.native
  
  /**
    * Returns information about a specific workgroup.
    */
  def getWorkgroup(): Request[GetWorkgroupResponse, AWSError] = js.native
  def getWorkgroup(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkgroupResponse, Unit]): Request[GetWorkgroupResponse, AWSError] = js.native
  /**
    * Returns information about a specific workgroup.
    */
  def getWorkgroup(params: GetWorkgroupRequest): Request[GetWorkgroupResponse, AWSError] = js.native
  def getWorkgroup(
    params: GetWorkgroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkgroupResponse, Unit]
  ): Request[GetWorkgroupResponse, AWSError] = js.native
  
  /**
    * Returns an array of EndpointAccess objects and relevant information.
    */
  def listEndpointAccess(): Request[ListEndpointAccessResponse, AWSError] = js.native
  def listEndpointAccess(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointAccessResponse, Unit]): Request[ListEndpointAccessResponse, AWSError] = js.native
  /**
    * Returns an array of EndpointAccess objects and relevant information.
    */
  def listEndpointAccess(params: ListEndpointAccessRequest): Request[ListEndpointAccessResponse, AWSError] = js.native
  def listEndpointAccess(
    params: ListEndpointAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointAccessResponse, Unit]
  ): Request[ListEndpointAccessResponse, AWSError] = js.native
  
  /**
    * Returns information about a list of specified namespaces.
    */
  def listNamespaces(): Request[ListNamespacesResponse, AWSError] = js.native
  def listNamespaces(callback: js.Function2[/* err */ AWSError, /* data */ ListNamespacesResponse, Unit]): Request[ListNamespacesResponse, AWSError] = js.native
  /**
    * Returns information about a list of specified namespaces.
    */
  def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse, AWSError] = js.native
  def listNamespaces(
    params: ListNamespacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNamespacesResponse, Unit]
  ): Request[ListNamespacesResponse, AWSError] = js.native
  
  /**
    * Returns an array of recovery points.
    */
  def listRecoveryPoints(): Request[ListRecoveryPointsResponse, AWSError] = js.native
  def listRecoveryPoints(callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryPointsResponse, Unit]): Request[ListRecoveryPointsResponse, AWSError] = js.native
  /**
    * Returns an array of recovery points.
    */
  def listRecoveryPoints(params: ListRecoveryPointsRequest): Request[ListRecoveryPointsResponse, AWSError] = js.native
  def listRecoveryPoints(
    params: ListRecoveryPointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryPointsResponse, Unit]
  ): Request[ListRecoveryPointsResponse, AWSError] = js.native
  
  /**
    * Returns a list of snapshots.
    */
  def listSnapshots(): Request[ListSnapshotsResponse, AWSError] = js.native
  def listSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ ListSnapshotsResponse, Unit]): Request[ListSnapshotsResponse, AWSError] = js.native
  /**
    * Returns a list of snapshots.
    */
  def listSnapshots(params: ListSnapshotsRequest): Request[ListSnapshotsResponse, AWSError] = js.native
  def listSnapshots(
    params: ListSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSnapshotsResponse, Unit]
  ): Request[ListSnapshotsResponse, AWSError] = js.native
  
  /**
    * Lists the tags assigned to a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags assigned to a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists all usage limits within Amazon Redshift Serverless.
    */
  def listUsageLimits(): Request[ListUsageLimitsResponse, AWSError] = js.native
  def listUsageLimits(callback: js.Function2[/* err */ AWSError, /* data */ ListUsageLimitsResponse, Unit]): Request[ListUsageLimitsResponse, AWSError] = js.native
  /**
    * Lists all usage limits within Amazon Redshift Serverless.
    */
  def listUsageLimits(params: ListUsageLimitsRequest): Request[ListUsageLimitsResponse, AWSError] = js.native
  def listUsageLimits(
    params: ListUsageLimitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsageLimitsResponse, Unit]
  ): Request[ListUsageLimitsResponse, AWSError] = js.native
  
  /**
    * Returns information about a list of specified workgroups.
    */
  def listWorkgroups(): Request[ListWorkgroupsResponse, AWSError] = js.native
  def listWorkgroups(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkgroupsResponse, Unit]): Request[ListWorkgroupsResponse, AWSError] = js.native
  /**
    * Returns information about a list of specified workgroups.
    */
  def listWorkgroups(params: ListWorkgroupsRequest): Request[ListWorkgroupsResponse, AWSError] = js.native
  def listWorkgroups(
    params: ListWorkgroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkgroupsResponse, Unit]
  ): Request[ListWorkgroupsResponse, AWSError] = js.native
  
  /**
    * Creates or updates a resource policy. Currently, you can use policies to share snapshots across Amazon Web Services accounts.
    */
  def putResourcePolicy(): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]): Request[PutResourcePolicyResponse, AWSError] = js.native
  /**
    * Creates or updates a resource policy. Currently, you can use policies to share snapshots across Amazon Web Services accounts.
    */
  def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]
  ): Request[PutResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Restore the data from a recovery point.
    */
  def restoreFromRecoveryPoint(): Request[RestoreFromRecoveryPointResponse, AWSError] = js.native
  def restoreFromRecoveryPoint(callback: js.Function2[/* err */ AWSError, /* data */ RestoreFromRecoveryPointResponse, Unit]): Request[RestoreFromRecoveryPointResponse, AWSError] = js.native
  /**
    * Restore the data from a recovery point.
    */
  def restoreFromRecoveryPoint(params: RestoreFromRecoveryPointRequest): Request[RestoreFromRecoveryPointResponse, AWSError] = js.native
  def restoreFromRecoveryPoint(
    params: RestoreFromRecoveryPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreFromRecoveryPointResponse, Unit]
  ): Request[RestoreFromRecoveryPointResponse, AWSError] = js.native
  
  /**
    * Restores a namespace from a snapshot.
    */
  def restoreFromSnapshot(): Request[RestoreFromSnapshotResponse, AWSError] = js.native
  def restoreFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreFromSnapshotResponse, Unit]): Request[RestoreFromSnapshotResponse, AWSError] = js.native
  /**
    * Restores a namespace from a snapshot.
    */
  def restoreFromSnapshot(params: RestoreFromSnapshotRequest): Request[RestoreFromSnapshotResponse, AWSError] = js.native
  def restoreFromSnapshot(
    params: RestoreFromSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreFromSnapshotResponse, Unit]
  ): Request[RestoreFromSnapshotResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag or set of tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag or set of tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an Amazon Redshift Serverless managed endpoint.
    */
  def updateEndpointAccess(): Request[UpdateEndpointAccessResponse, AWSError] = js.native
  def updateEndpointAccess(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointAccessResponse, Unit]): Request[UpdateEndpointAccessResponse, AWSError] = js.native
  /**
    * Updates an Amazon Redshift Serverless managed endpoint.
    */
  def updateEndpointAccess(params: UpdateEndpointAccessRequest): Request[UpdateEndpointAccessResponse, AWSError] = js.native
  def updateEndpointAccess(
    params: UpdateEndpointAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointAccessResponse, Unit]
  ): Request[UpdateEndpointAccessResponse, AWSError] = js.native
  
  /**
    * Updates a namespace with the specified settings.
    */
  def updateNamespace(): Request[UpdateNamespaceResponse, AWSError] = js.native
  def updateNamespace(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNamespaceResponse, Unit]): Request[UpdateNamespaceResponse, AWSError] = js.native
  /**
    * Updates a namespace with the specified settings.
    */
  def updateNamespace(params: UpdateNamespaceRequest): Request[UpdateNamespaceResponse, AWSError] = js.native
  def updateNamespace(
    params: UpdateNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNamespaceResponse, Unit]
  ): Request[UpdateNamespaceResponse, AWSError] = js.native
  
  /**
    * Updates a snapshot.
    */
  def updateSnapshot(): Request[UpdateSnapshotResponse, AWSError] = js.native
  def updateSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSnapshotResponse, Unit]): Request[UpdateSnapshotResponse, AWSError] = js.native
  /**
    * Updates a snapshot.
    */
  def updateSnapshot(params: UpdateSnapshotRequest): Request[UpdateSnapshotResponse, AWSError] = js.native
  def updateSnapshot(
    params: UpdateSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSnapshotResponse, Unit]
  ): Request[UpdateSnapshotResponse, AWSError] = js.native
  
  /**
    * Update a usage limit in Amazon Redshift Serverless. You can't update the usage type or period of a usage limit.
    */
  def updateUsageLimit(): Request[UpdateUsageLimitResponse, AWSError] = js.native
  def updateUsageLimit(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUsageLimitResponse, Unit]): Request[UpdateUsageLimitResponse, AWSError] = js.native
  /**
    * Update a usage limit in Amazon Redshift Serverless. You can't update the usage type or period of a usage limit.
    */
  def updateUsageLimit(params: UpdateUsageLimitRequest): Request[UpdateUsageLimitResponse, AWSError] = js.native
  def updateUsageLimit(
    params: UpdateUsageLimitRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUsageLimitResponse, Unit]
  ): Request[UpdateUsageLimitResponse, AWSError] = js.native
  
  /**
    * Updates a workgroup with the specified configuration settings.
    */
  def updateWorkgroup(): Request[UpdateWorkgroupResponse, AWSError] = js.native
  def updateWorkgroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkgroupResponse, Unit]): Request[UpdateWorkgroupResponse, AWSError] = js.native
  /**
    * Updates a workgroup with the specified configuration settings.
    */
  def updateWorkgroup(params: UpdateWorkgroupRequest): Request[UpdateWorkgroupResponse, AWSError] = js.native
  def updateWorkgroup(
    params: UpdateWorkgroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkgroupResponse, Unit]
  ): Request[UpdateWorkgroupResponse, AWSError] = js.native
}
