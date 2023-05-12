package typings.awsSdk.clientsDocdbelasticMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocDBElastic extends Service {
  
  @JSName("config")
  var config_DocDBElastic: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new Elastic DocumentDB cluster and returns its Cluster structure.
    */
  def createCluster(): Request[CreateClusterOutput, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterOutput, Unit]): Request[CreateClusterOutput, AWSError] = js.native
  /**
    * Creates a new Elastic DocumentDB cluster and returns its Cluster structure.
    */
  def createCluster(params: CreateClusterInput): Request[CreateClusterOutput, AWSError] = js.native
  def createCluster(
    params: CreateClusterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterOutput, Unit]
  ): Request[CreateClusterOutput, AWSError] = js.native
  
  /**
    * Creates a snapshot of a cluster.
    */
  def createClusterSnapshot(): Request[CreateClusterSnapshotOutput, AWSError] = js.native
  def createClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterSnapshotOutput, Unit]): Request[CreateClusterSnapshotOutput, AWSError] = js.native
  /**
    * Creates a snapshot of a cluster.
    */
  def createClusterSnapshot(params: CreateClusterSnapshotInput): Request[CreateClusterSnapshotOutput, AWSError] = js.native
  def createClusterSnapshot(
    params: CreateClusterSnapshotInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterSnapshotOutput, Unit]
  ): Request[CreateClusterSnapshotOutput, AWSError] = js.native
  
  /**
    * Delete a Elastic DocumentDB cluster.
    */
  def deleteCluster(): Request[DeleteClusterOutput, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterOutput, Unit]): Request[DeleteClusterOutput, AWSError] = js.native
  /**
    * Delete a Elastic DocumentDB cluster.
    */
  def deleteCluster(params: DeleteClusterInput): Request[DeleteClusterOutput, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterOutput, Unit]
  ): Request[DeleteClusterOutput, AWSError] = js.native
  
  /**
    * Delete a Elastic DocumentDB snapshot.
    */
  def deleteClusterSnapshot(): Request[DeleteClusterSnapshotOutput, AWSError] = js.native
  def deleteClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterSnapshotOutput, Unit]): Request[DeleteClusterSnapshotOutput, AWSError] = js.native
  /**
    * Delete a Elastic DocumentDB snapshot.
    */
  def deleteClusterSnapshot(params: DeleteClusterSnapshotInput): Request[DeleteClusterSnapshotOutput, AWSError] = js.native
  def deleteClusterSnapshot(
    params: DeleteClusterSnapshotInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterSnapshotOutput, Unit]
  ): Request[DeleteClusterSnapshotOutput, AWSError] = js.native
  
  /**
    * Returns information about a specific Elastic DocumentDB cluster.
    */
  def getCluster(): Request[GetClusterOutput, AWSError] = js.native
  def getCluster(callback: js.Function2[/* err */ AWSError, /* data */ GetClusterOutput, Unit]): Request[GetClusterOutput, AWSError] = js.native
  /**
    * Returns information about a specific Elastic DocumentDB cluster.
    */
  def getCluster(params: GetClusterInput): Request[GetClusterOutput, AWSError] = js.native
  def getCluster(
    params: GetClusterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetClusterOutput, Unit]
  ): Request[GetClusterOutput, AWSError] = js.native
  
  /**
    * Returns information about a specific Elastic DocumentDB snapshot
    */
  def getClusterSnapshot(): Request[GetClusterSnapshotOutput, AWSError] = js.native
  def getClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ GetClusterSnapshotOutput, Unit]): Request[GetClusterSnapshotOutput, AWSError] = js.native
  /**
    * Returns information about a specific Elastic DocumentDB snapshot
    */
  def getClusterSnapshot(params: GetClusterSnapshotInput): Request[GetClusterSnapshotOutput, AWSError] = js.native
  def getClusterSnapshot(
    params: GetClusterSnapshotInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetClusterSnapshotOutput, Unit]
  ): Request[GetClusterSnapshotOutput, AWSError] = js.native
  
  /**
    * Returns information about Elastic DocumentDB snapshots for a specified cluster.
    */
  def listClusterSnapshots(): Request[ListClusterSnapshotsOutput, AWSError] = js.native
  def listClusterSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ ListClusterSnapshotsOutput, Unit]): Request[ListClusterSnapshotsOutput, AWSError] = js.native
  /**
    * Returns information about Elastic DocumentDB snapshots for a specified cluster.
    */
  def listClusterSnapshots(params: ListClusterSnapshotsInput): Request[ListClusterSnapshotsOutput, AWSError] = js.native
  def listClusterSnapshots(
    params: ListClusterSnapshotsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClusterSnapshotsOutput, Unit]
  ): Request[ListClusterSnapshotsOutput, AWSError] = js.native
  
  /**
    * Returns information about provisioned Elastic DocumentDB clusters.
    */
  def listClusters(): Request[ListClustersOutput, AWSError] = js.native
  def listClusters(callback: js.Function2[/* err */ AWSError, /* data */ ListClustersOutput, Unit]): Request[ListClustersOutput, AWSError] = js.native
  /**
    * Returns information about provisioned Elastic DocumentDB clusters.
    */
  def listClusters(params: ListClustersInput): Request[ListClustersOutput, AWSError] = js.native
  def listClusters(
    params: ListClustersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClustersOutput, Unit]
  ): Request[ListClustersOutput, AWSError] = js.native
  
  /**
    * Lists all tags on a Elastic DocumentDB resource
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags on a Elastic DocumentDB resource
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Restores a Elastic DocumentDB cluster from a snapshot.
    */
  def restoreClusterFromSnapshot(): Request[RestoreClusterFromSnapshotOutput, AWSError] = js.native
  def restoreClusterFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreClusterFromSnapshotOutput, Unit]): Request[RestoreClusterFromSnapshotOutput, AWSError] = js.native
  /**
    * Restores a Elastic DocumentDB cluster from a snapshot.
    */
  def restoreClusterFromSnapshot(params: RestoreClusterFromSnapshotInput): Request[RestoreClusterFromSnapshotOutput, AWSError] = js.native
  def restoreClusterFromSnapshot(
    params: RestoreClusterFromSnapshotInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreClusterFromSnapshotOutput, Unit]
  ): Request[RestoreClusterFromSnapshotOutput, AWSError] = js.native
  
  /**
    * Adds metadata tags to a Elastic DocumentDB resource
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds metadata tags to a Elastic DocumentDB resource
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes metadata tags to a Elastic DocumentDB resource
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes metadata tags to a Elastic DocumentDB resource
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Modifies a Elastic DocumentDB cluster. This includes updating admin-username/password, upgrading API version setting up a backup window and maintenance window
    */
  def updateCluster(): Request[UpdateClusterOutput, AWSError] = js.native
  def updateCluster(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterOutput, Unit]): Request[UpdateClusterOutput, AWSError] = js.native
  /**
    * Modifies a Elastic DocumentDB cluster. This includes updating admin-username/password, upgrading API version setting up a backup window and maintenance window
    */
  def updateCluster(params: UpdateClusterInput): Request[UpdateClusterOutput, AWSError] = js.native
  def updateCluster(
    params: UpdateClusterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterOutput, Unit]
  ): Request[UpdateClusterOutput, AWSError] = js.native
}
