package typings
package awsDashSdkLib.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudHSMV2
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudHSMV2: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ClientConfiguration = js.native
  /**
     * Copy an AWS CloudHSM cluster backup to a different region.
     */
  def copyBackupToRegion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CopyBackupToRegionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copy an AWS CloudHSM cluster backup to a different region.
     */
  def copyBackupToRegion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CopyBackupToRegionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CopyBackupToRegionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copy an AWS CloudHSM cluster backup to a different region.
     */
  def copyBackupToRegion(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CopyBackupToRegionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CopyBackupToRegionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copy an AWS CloudHSM cluster backup to a different region.
     */
  def copyBackupToRegion(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CopyBackupToRegionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CopyBackupToRegionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CopyBackupToRegionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new AWS CloudHSM cluster.
     */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new AWS CloudHSM cluster.
     */
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new AWS CloudHSM cluster.
     */
  def createCluster(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new AWS CloudHSM cluster.
     */
  def createCluster(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
     */
  def createHsm(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
     */
  def createHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
     */
  def createHsm(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateHsmRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
     */
  def createHsm(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.CreateHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request. For more information on restoring a backup, see RestoreBackup 
     */
  def deleteBackup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteBackupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request. For more information on restoring a backup, see RestoreBackup 
     */
  def deleteBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteBackupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteBackupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request. For more information on restoring a backup, see RestoreBackup 
     */
  def deleteBackup(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteBackupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteBackupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request. For more information on restoring a backup, see RestoreBackup 
     */
  def deleteBackup(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteBackupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteBackupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteBackupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use DeleteHsm.
     */
  def deleteCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use DeleteHsm.
     */
  def deleteCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use DeleteHsm.
     */
  def deleteCluster(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use DeleteHsm.
     */
  def deleteCluster(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To find these values, use DescribeClusters.
     */
  def deleteHsm(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To find these values, use DescribeClusters.
     */
  def deleteHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To find these values, use DescribeClusters.
     */
  def deleteHsm(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteHsmRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To find these values, use DescribeClusters.
     */
  def deleteHsm(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DeleteHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about backups of AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the backups. When the response contains only a subset of backups, it includes a NextToken value. Use this value in a subsequent DescribeBackups request to get more backups. When you receive a response with no NextToken (or an empty or null value), that means there are no more backups to get.
     */
  def describeBackups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeBackupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about backups of AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the backups. When the response contains only a subset of backups, it includes a NextToken value. Use this value in a subsequent DescribeBackups request to get more backups. When you receive a response with no NextToken (or an empty or null value), that means there are no more backups to get.
     */
  def describeBackups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeBackupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeBackupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about backups of AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the backups. When the response contains only a subset of backups, it includes a NextToken value. Use this value in a subsequent DescribeBackups request to get more backups. When you receive a response with no NextToken (or an empty or null value), that means there are no more backups to get.
     */
  def describeBackups(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeBackupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeBackupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about backups of AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the backups. When the response contains only a subset of backups, it includes a NextToken value. Use this value in a subsequent DescribeBackups request to get more backups. When you receive a response with no NextToken (or an empty or null value), that means there are no more backups to get.
     */
  def describeBackups(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeBackupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeBackupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeBackupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the clusters. When the response contains only a subset of clusters, it includes a NextToken value. Use this value in a subsequent DescribeClusters request to get more clusters. When you receive a response with no NextToken (or an empty or null value), that means there are no more clusters to get.
     */
  def describeClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the clusters. When the response contains only a subset of clusters, it includes a NextToken value. Use this value in a subsequent DescribeClusters request to get more clusters. When you receive a response with no NextToken (or an empty or null value), that means there are no more clusters to get.
     */
  def describeClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the clusters. When the response contains only a subset of clusters, it includes a NextToken value. Use this value in a subsequent DescribeClusters request to get more clusters. When you receive a response with no NextToken (or an empty or null value), that means there are no more clusters to get.
     */
  def describeClusters(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeClustersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the clusters. When the response contains only a subset of clusters, it includes a NextToken value. Use this value in a subsequent DescribeClusters request to get more clusters. When you receive a response with no NextToken (or an empty or null value), that means there are no more clusters to get.
     */
  def describeClusters(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.
     */
  def initializeCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.InitializeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.
     */
  def initializeCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.InitializeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.InitializeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.
     */
  def initializeCluster(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.InitializeClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.InitializeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.
     */
  def initializeCluster(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.InitializeClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.InitializeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.InitializeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of tags for the specified AWS CloudHSM cluster. This is a paginated operation, which means that each response might contain only a subset of all the tags. When the response contains only a subset of tags, it includes a NextToken value. Use this value in a subsequent ListTags request to get more tags. When you receive a response with no NextToken (or an empty or null value), that means there are no more tags to get.
     */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of tags for the specified AWS CloudHSM cluster. This is a paginated operation, which means that each response might contain only a subset of all the tags. When the response contains only a subset of tags, it includes a NextToken value. Use this value in a subsequent ListTags request to get more tags. When you receive a response with no NextToken (or an empty or null value), that means there are no more tags to get.
     */
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of tags for the specified AWS CloudHSM cluster. This is a paginated operation, which means that each response might contain only a subset of all the tags. When the response contains only a subset of tags, it includes a NextToken value. Use this value in a subsequent ListTags request to get more tags. When you receive a response with no NextToken (or an empty or null value), that means there are no more tags to get.
     */
  def listTags(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ListTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of tags for the specified AWS CloudHSM cluster. This is a paginated operation, which means that each response might contain only a subset of all the tags. When the response contains only a subset of tags, it includes a NextToken value. Use this value in a subsequent ListTags request to get more tags. When you receive a response with no NextToken (or an empty or null value), that means there are no more tags to get.
     */
  def listTags(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For more information on deleting a backup, see DeleteBackup.
     */
  def restoreBackup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.RestoreBackupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For more information on deleting a backup, see DeleteBackup.
     */
  def restoreBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.RestoreBackupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.RestoreBackupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For more information on deleting a backup, see DeleteBackup.
     */
  def restoreBackup(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.RestoreBackupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.RestoreBackupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For more information on deleting a backup, see DeleteBackup.
     */
  def restoreBackup(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.RestoreBackupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.RestoreBackupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.RestoreBackupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
     */
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
     */
  def tagResource(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
     */
  def tagResource(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
     */
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
     */
  def untagResource(params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
     */
  def untagResource(
    params: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

