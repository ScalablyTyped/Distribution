package typings
package awsDashSdkLib.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudHSMV2
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudHSMV2: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Copy an AWS CloudHSM cluster backup to a different region.
    */
  def copyBackupToRegion(): awsDashSdkLib.libRequestMod.Request[CopyBackupToRegionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyBackupToRegion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyBackupToRegionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyBackupToRegionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copy an AWS CloudHSM cluster backup to a different region.
    */
  def copyBackupToRegion(params: CopyBackupToRegionRequest): awsDashSdkLib.libRequestMod.Request[CopyBackupToRegionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyBackupToRegion(
    params: CopyBackupToRegionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyBackupToRegionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyBackupToRegionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new AWS CloudHSM cluster.
    */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new AWS CloudHSM cluster.
    */
  def createCluster(params: CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
    */
  def createHsm(): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
    */
  def createHsm(params: CreateHsmRequest): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHsm(
    params: CreateHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request. For more information on restoring a backup, see RestoreBackup 
    */
  def deleteBackup(): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBackupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request. For more information on restoring a backup, see RestoreBackup 
    */
  def deleteBackup(params: DeleteBackupRequest): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackup(
    params: DeleteBackupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBackupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use DeleteHsm.
    */
  def deleteCluster(): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use DeleteHsm.
    */
  def deleteCluster(params: DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To find these values, use DescribeClusters.
    */
  def deleteHsm(): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To find these values, use DescribeClusters.
    */
  def deleteHsm(params: DeleteHsmRequest): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHsm(
    params: DeleteHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about backups of AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the backups. When the response contains only a subset of backups, it includes a NextToken value. Use this value in a subsequent DescribeBackups request to get more backups. When you receive a response with no NextToken (or an empty or null value), that means there are no more backups to get.
    */
  def describeBackups(): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBackups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBackupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about backups of AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the backups. When the response contains only a subset of backups, it includes a NextToken value. Use this value in a subsequent DescribeBackups request to get more backups. When you receive a response with no NextToken (or an empty or null value), that means there are no more backups to get.
    */
  def describeBackups(params: DescribeBackupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBackups(
    params: DescribeBackupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBackupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the clusters. When the response contains only a subset of clusters, it includes a NextToken value. Use this value in a subsequent DescribeClusters request to get more clusters. When you receive a response with no NextToken (or an empty or null value), that means there are no more clusters to get.
    */
  def describeClusters(): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the clusters. When the response contains only a subset of clusters, it includes a NextToken value. Use this value in a subsequent DescribeClusters request to get more clusters. When you receive a response with no NextToken (or an empty or null value), that means there are no more clusters to get.
    */
  def describeClusters(params: DescribeClustersRequest): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeClusters(
    params: DescribeClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.
    */
  def initializeCluster(): awsDashSdkLib.libRequestMod.Request[InitializeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def initializeCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InitializeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InitializeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.
    */
  def initializeCluster(params: InitializeClusterRequest): awsDashSdkLib.libRequestMod.Request[InitializeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def initializeCluster(
    params: InitializeClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InitializeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InitializeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of tags for the specified AWS CloudHSM cluster. This is a paginated operation, which means that each response might contain only a subset of all the tags. When the response contains only a subset of tags, it includes a NextToken value. Use this value in a subsequent ListTags request to get more tags. When you receive a response with no NextToken (or an empty or null value), that means there are no more tags to get.
    */
  def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of tags for the specified AWS CloudHSM cluster. This is a paginated operation, which means that each response might contain only a subset of all the tags. When the response contains only a subset of tags, it includes a NextToken value. Use this value in a subsequent ListTags request to get more tags. When you receive a response with no NextToken (or an empty or null value), that means there are no more tags to get.
    */
  def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For more information on deleting a backup, see DeleteBackup.
    */
  def restoreBackup(): awsDashSdkLib.libRequestMod.Request[RestoreBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreBackupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For more information on deleting a backup, see DeleteBackup.
    */
  def restoreBackup(params: RestoreBackupRequest): awsDashSdkLib.libRequestMod.Request[RestoreBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreBackup(
    params: RestoreBackupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreBackupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

