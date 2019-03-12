package typings
package awsDashSdkLib.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudhsmv2", "CloudHSMV2")
@js.native
object CloudHSMV2Ns extends js.Object {
  trait Backup extends js.Object {
    /**
      * The identifier (ID) of the backup.
      */
    var BackupId: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.BackupId
    /**
      * The state of the backup.
      */
    var BackupState: js.UndefOr[BackupState] = js.undefined
    /**
      * The identifier (ID) of the cluster that was backed up.
      */
    var ClusterId: js.UndefOr[ClusterId] = js.undefined
    var CopyTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The date and time when the backup was created.
      */
    var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The date and time when the backup will be permanently deleted.
      */
    var DeleteTimestamp: js.UndefOr[Timestamp] = js.undefined
    var SourceBackup: js.UndefOr[BackupId] = js.undefined
    var SourceCluster: js.UndefOr[ClusterId] = js.undefined
    var SourceRegion: js.UndefOr[Region] = js.undefined
  }
  
  trait Certificates extends js.Object {
    /**
      * The HSM hardware certificate issued (signed) by AWS CloudHSM.
      */
    var AwsHardwareCertificate: js.UndefOr[Cert] = js.undefined
    /**
      * The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
      */
    var ClusterCertificate: js.UndefOr[Cert] = js.undefined
    /**
      * The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is UNINITIALIZED.
      */
    var ClusterCsr: js.UndefOr[Cert] = js.undefined
    /**
      * The HSM certificate issued (signed) by the HSM hardware.
      */
    var HsmCertificate: js.UndefOr[Cert] = js.undefined
    /**
      * The HSM hardware certificate issued (signed) by the hardware manufacturer.
      */
    var ManufacturerHardwareCertificate: js.UndefOr[Cert] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Cluster extends js.Object {
    /**
      * The cluster's backup policy.
      */
    var BackupPolicy: js.UndefOr[BackupPolicy] = js.undefined
    /**
      * Contains one or more certificates or a certificate signing request (CSR).
      */
    var Certificates: js.UndefOr[Certificates] = js.undefined
    /**
      * The cluster's identifier (ID).
      */
    var ClusterId: js.UndefOr[ClusterId] = js.undefined
    /**
      * The date and time when the cluster was created.
      */
    var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The type of HSM that the cluster contains.
      */
    var HsmType: js.UndefOr[HsmType] = js.undefined
    /**
      * Contains information about the HSMs in the cluster.
      */
    var Hsms: js.UndefOr[Hsms] = js.undefined
    /**
      * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
      */
    var PreCoPassword: js.UndefOr[PreCoPassword] = js.undefined
    /**
      * The identifier (ID) of the cluster's security group.
      */
    var SecurityGroup: js.UndefOr[SecurityGroup] = js.undefined
    /**
      * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created from a backup.
      */
    var SourceBackupId: js.UndefOr[BackupId] = js.undefined
    /**
      * The cluster's state.
      */
    var State: js.UndefOr[ClusterState] = js.undefined
    /**
      * A description of the cluster's state.
      */
    var StateMessage: js.UndefOr[StateMessage] = js.undefined
    /**
      * A map of the cluster's subnets and their corresponding Availability Zones.
      */
    var SubnetMapping: js.UndefOr[ExternalSubnetMapping] = js.undefined
    /**
      * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
      */
    var VpcId: js.UndefOr[VpcId] = js.undefined
  }
  
  trait CopyBackupToRegionRequest extends js.Object {
    /**
      * The ID of the backup that will be copied to the destination region. 
      */
    var BackupId: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.BackupId
    /**
      * The AWS region that will contain your copied CloudHSM cluster backup.
      */
    var DestinationRegion: Region
  }
  
  trait CopyBackupToRegionResponse extends js.Object {
    /**
      * Information on the backup that will be copied to the destination region, including CreateTimestamp, SourceBackup, SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same as that of the source backup. You will need to use the sourceBackupID returned in this operation to use the DescribeBackups operation on the backup that will be copied to the destination region.
      */
    var DestinationBackup: js.UndefOr[DestinationBackup] = js.undefined
  }
  
  trait CreateClusterRequest extends js.Object {
    /**
      * The type of HSM to use in the cluster. Currently the only allowed value is hsm1.medium.
      */
    var HsmType: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.HsmType
    /**
      * The identifier (ID) of the cluster backup to restore. Use this value to restore the cluster from a backup instead of creating a new cluster. To find the backup ID, use DescribeBackups.
      */
    var SourceBackupId: js.UndefOr[BackupId] = js.undefined
    /**
      * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If you specify multiple subnets, they must meet the following criteria:   All subnets must be in the same virtual private cloud (VPC).   You can specify only one subnet per Availability Zone.  
      */
    var SubnetIds: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.SubnetIds
  }
  
  trait CreateClusterResponse extends js.Object {
    /**
      * Information about the cluster that was created.
      */
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait CreateHsmRequest extends js.Object {
    /**
      * The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use DescribeClusters.
      */
    var AvailabilityZone: ExternalAz
    /**
      * The identifier (ID) of the HSM's cluster. To find the cluster ID, use DescribeClusters.
      */
    var ClusterId: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ClusterId
    /**
      * The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to the Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen for you from that subnet.
      */
    var IpAddress: js.UndefOr[IpAddress] = js.undefined
  }
  
  trait CreateHsmResponse extends js.Object {
    /**
      * Information about the HSM that was created.
      */
    var Hsm: js.UndefOr[Hsm] = js.undefined
  }
  
  trait DeleteBackupRequest extends js.Object {
    /**
      * The ID of the backup to be deleted. To find the ID of a backup, use the DescribeBackups operation.
      */
    var BackupId: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.BackupId
  }
  
  trait DeleteBackupResponse extends js.Object {
    /**
      * Information on the Backup object deleted.
      */
    var Backup: js.UndefOr[Backup] = js.undefined
  }
  
  trait DeleteClusterRequest extends js.Object {
    /**
      * The identifier (ID) of the cluster that you are deleting. To find the cluster ID, use DescribeClusters.
      */
    var ClusterId: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ClusterId
  }
  
  trait DeleteClusterResponse extends js.Object {
    /**
      * Information about the cluster that was deleted.
      */
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait DeleteHsmRequest extends js.Object {
    /**
      * The identifier (ID) of the cluster that contains the HSM that you are deleting.
      */
    var ClusterId: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ClusterId
    /**
      * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
      */
    var EniId: js.UndefOr[EniId] = js.undefined
    /**
      * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
      */
    var EniIp: js.UndefOr[IpAddress] = js.undefined
    /**
      * The identifier (ID) of the HSM that you are deleting.
      */
    var HsmId: js.UndefOr[HsmId] = js.undefined
  }
  
  trait DeleteHsmResponse extends js.Object {
    /**
      * The identifier (ID) of the HSM that was deleted.
      */
    var HsmId: js.UndefOr[HsmId] = js.undefined
  }
  
  trait DescribeBackupsRequest extends js.Object {
    /**
      * One or more filters to limit the items returned in the response. Use the backupIds filter to return only the specified backups. Specify backups by their backup identifier (ID). Use the sourceBackupIds filter to return only the backups created from a source backup. The sourceBackupID of a source backup is returned by the CopyBackupToRegion operation. Use the clusterIds filter to return only the backups for the specified clusters. Specify clusters by their cluster identifier (ID). Use the states filter to return only backups that match the specified state.
      */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of backups to return in the response. When there are more backups than the number you specify, the response contains a NextToken value.
      */
    var MaxResults: js.UndefOr[MaxSize] = js.undefined
    /**
      * The NextToken value that you received in the previous response. Use this value to get more backups.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    var SortAscending: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DescribeBackupsResponse extends js.Object {
    /**
      * A list of backups.
      */
    var Backups: js.UndefOr[Backups] = js.undefined
    /**
      * An opaque string that indicates that the response contains only a subset of backups. Use this value in a subsequent DescribeBackups request to get more backups.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeClustersRequest extends js.Object {
    /**
      * One or more filters to limit the items returned in the response. Use the clusterIds filter to return only the specified clusters. Specify clusters by their cluster identifier (ID). Use the vpcIds filter to return only the clusters in the specified virtual private clouds (VPCs). Specify VPCs by their VPC identifier (ID). Use the states filter to return only clusters that match the specified state.
      */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of clusters to return in the response. When there are more clusters than the number you specify, the response contains a NextToken value.
      */
    var MaxResults: js.UndefOr[MaxSize] = js.undefined
    /**
      * The NextToken value that you received in the previous response. Use this value to get more clusters.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeClustersResponse extends js.Object {
    /**
      * A list of clusters.
      */
    var Clusters: js.UndefOr[Clusters] = js.undefined
    /**
      * An opaque string that indicates that the response contains only a subset of clusters. Use this value in a subsequent DescribeClusters request to get more clusters.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DestinationBackup extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
    var SourceBackup: js.UndefOr[BackupId] = js.undefined
    var SourceCluster: js.UndefOr[ClusterId] = js.undefined
    var SourceRegion: js.UndefOr[Region] = js.undefined
  }
  
  trait ExternalSubnetMapping
    extends /* key */ org.scalablytyped.runtime.StringDictionary[SubnetId]
  
  trait Filters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Strings]
  
  trait Hsm extends js.Object {
    /**
      * The Availability Zone that contains the HSM.
      */
    var AvailabilityZone: js.UndefOr[ExternalAz] = js.undefined
    /**
      * The identifier (ID) of the cluster that contains the HSM.
      */
    var ClusterId: js.UndefOr[ClusterId] = js.undefined
    /**
      * The identifier (ID) of the HSM's elastic network interface (ENI).
      */
    var EniId: js.UndefOr[EniId] = js.undefined
    /**
      * The IP address of the HSM's elastic network interface (ENI).
      */
    var EniIp: js.UndefOr[IpAddress] = js.undefined
    /**
      * The HSM's identifier (ID).
      */
    var HsmId: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.HsmId
    /**
      * The HSM's state.
      */
    var State: js.UndefOr[HsmState] = js.undefined
    /**
      * A description of the HSM's state.
      */
    var StateMessage: js.UndefOr[String] = js.undefined
    /**
      * The subnet that contains the HSM's elastic network interface (ENI).
      */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
  }
  
  trait InitializeClusterRequest extends js.Object {
    /**
      * The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use DescribeClusters.
      */
    var ClusterId: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.ClusterId
    /**
      * The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must be in PEM format and can contain a maximum of 5000 characters.
      */
    var SignedCert: Cert
    /**
      * The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster certificate. This can be a root (self-signed) certificate or a certificate chain that begins with the certificate that issued the cluster certificate and ends with a root certificate. The certificate or certificate chain must be in PEM format and can contain a maximum of 5000 characters.
      */
    var TrustAnchor: Cert
  }
  
  trait InitializeClusterResponse extends js.Object {
    /**
      * The cluster's state.
      */
    var State: js.UndefOr[ClusterState] = js.undefined
    /**
      * A description of the cluster's state.
      */
    var StateMessage: js.UndefOr[StateMessage] = js.undefined
  }
  
  trait ListTagsRequest extends js.Object {
    /**
      * The maximum number of tags to return in the response. When there are more tags than the number you specify, the response contains a NextToken value.
      */
    var MaxResults: js.UndefOr[MaxSize] = js.undefined
    /**
      * The NextToken value that you received in the previous response. Use this value to get more tags.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use DescribeClusters.
      */
    var ResourceId: ClusterId
  }
  
  trait ListTagsResponse extends js.Object {
    /**
      * An opaque string that indicates that the response contains only a subset of tags. Use this value in a subsequent ListTags request to get more tags.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of tags.
      */
    var TagList: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagList
  }
  
  trait RestoreBackupRequest extends js.Object {
    /**
      * The ID of the backup to be restored. To find the ID of a backup, use the DescribeBackups operation.
      */
    var BackupId: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.BackupId
  }
  
  trait RestoreBackupResponse extends js.Object {
    /**
      * Information on the Backup object created.
      */
    var Backup: js.UndefOr[Backup] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key of the tag.
      */
    var Key: TagKey
    /**
      * The value of the tag.
      */
    var Value: TagValue
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The cluster identifier (ID) for the cluster that you are tagging. To find the cluster ID, use DescribeClusters.
      */
    var ResourceId: ClusterId
    /**
      * A list of one or more tags.
      */
    var TagList: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagList
  }
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use DescribeClusters.
      */
    var ResourceId: ClusterId
    /**
      * A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag values.
      */
    var TagKeyList: awsDashSdkLib.clientsCloudhsmv2Mod.CloudHSMV2Ns.TagKeyList
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait _BackupState extends js.Object
  
  trait _ClusterState extends js.Object
  
  trait _HsmState extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type BackupId = java.lang.String
  type BackupPolicy = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | java.lang.String
  type BackupState = _BackupState | java.lang.String
  type Backups = js.Array[Backup]
  type Boolean = scala.Boolean
  type Cert = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  type ClusterState = _ClusterState | java.lang.String
  type Clusters = js.Array[Cluster]
  type EniId = java.lang.String
  type ExternalAz = java.lang.String
  type Field = java.lang.String
  type HsmId = java.lang.String
  type HsmState = _HsmState | java.lang.String
  type HsmType = java.lang.String
  type Hsms = js.Array[Hsm]
  type IpAddress = java.lang.String
  type MaxSize = scala.Double
  type NextToken = java.lang.String
  type PreCoPassword = java.lang.String
  type Region = java.lang.String
  type SecurityGroup = java.lang.String
  type StateMessage = java.lang.String
  type String = java.lang.String
  type Strings = js.Array[String]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  type VpcId = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

