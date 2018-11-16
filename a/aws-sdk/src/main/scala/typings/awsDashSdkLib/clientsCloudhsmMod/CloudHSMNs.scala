package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudhsm", "CloudHSM")
@js.native
object CloudHSMNs extends js.Object {
  
  trait AddTagsToResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the AWS CloudHSM resource to tag.
         */
    var ResourceArn: java.lang.String
    /**
         * One or more tags.
         */
    var TagList: TagList
  }
  
  
  trait AddTagsToResourceResponse extends js.Object {
    /**
         * The status of the operation.
         */
    var Status: java.lang.String
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateHapgRequest extends js.Object {
    /**
         * The label of the new high-availability partition group.
         */
    var Label: Label
  }
  
  
  trait CreateHapgResponse extends js.Object {
    /**
         * The ARN of the high-availability partition group.
         */
    var HapgArn: js.UndefOr[HapgArn] = js.undefined
  }
  
  
  trait CreateHsmRequest extends js.Object {
    /**
         * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be ignored.
         */
    var ClientToken: js.UndefOr[ClientToken] = js.undefined
    /**
         * The IP address to assign to the HSM's ENI. If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
         */
    var EniIp: js.UndefOr[IpAddress] = js.undefined
    /**
         * The external ID from IamRoleArn, if present.
         */
    var ExternalId: js.UndefOr[ExternalId] = js.undefined
    /**
         * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
         */
    var IamRoleArn: IamRoleArn
    /**
         * The SSH public key to install on the HSM.
         */
    var SshKey: SshKey
    /**
         * The identifier of the subnet in your VPC in which to place the HSM.
         */
    var SubnetId: SubnetId
    var SubscriptionType: SubscriptionType
    /**
         * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
         */
    var SyslogIp: js.UndefOr[IpAddress] = js.undefined
  }
  
  
  trait CreateHsmResponse extends js.Object {
    /**
         * The ARN of the HSM.
         */
    var HsmArn: js.UndefOr[HsmArn] = js.undefined
  }
  
  
  trait CreateLunaClientRequest extends js.Object {
    /**
         * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
         */
    var Certificate: Certificate
    /**
         * The label for the client.
         */
    var Label: js.UndefOr[ClientLabel] = js.undefined
  }
  
  
  trait CreateLunaClientResponse extends js.Object {
    /**
         * The ARN of the client.
         */
    var ClientArn: js.UndefOr[ClientArn] = js.undefined
  }
  
  
  trait DeleteHapgRequest extends js.Object {
    /**
         * The ARN of the high-availability partition group to delete.
         */
    var HapgArn: HapgArn
  }
  
  
  trait DeleteHapgResponse extends js.Object {
    /**
         * The status of the action.
         */
    var Status: java.lang.String
  }
  
  
  trait DeleteHsmRequest extends js.Object {
    /**
         * The ARN of the HSM to delete.
         */
    var HsmArn: HsmArn
  }
  
  
  trait DeleteHsmResponse extends js.Object {
    /**
         * The status of the operation.
         */
    var Status: java.lang.String
  }
  
  
  trait DeleteLunaClientRequest extends js.Object {
    /**
         * The ARN of the client to delete.
         */
    var ClientArn: ClientArn
  }
  
  
  trait DeleteLunaClientResponse extends js.Object {
    /**
         * The status of the action.
         */
    var Status: java.lang.String
  }
  
  
  trait DescribeHapgRequest extends js.Object {
    /**
         * The ARN of the high-availability partition group to describe.
         */
    var HapgArn: HapgArn
  }
  
  
  trait DescribeHapgResponse extends js.Object {
    /**
         * The ARN of the high-availability partition group.
         */
    var HapgArn: js.UndefOr[HapgArn] = js.undefined
    /**
         * The serial number of the high-availability partition group.
         */
    var HapgSerial: js.UndefOr[java.lang.String] = js.undefined
    /**
         * 
         */
    var HsmsLastActionFailed: js.UndefOr[HsmList] = js.undefined
    /**
         * 
         */
    var HsmsPendingDeletion: js.UndefOr[HsmList] = js.undefined
    /**
         * 
         */
    var HsmsPendingRegistration: js.UndefOr[HsmList] = js.undefined
    /**
         * The label for the high-availability partition group.
         */
    var Label: js.UndefOr[Label] = js.undefined
    /**
         * The date and time the high-availability partition group was last modified.
         */
    var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * The list of partition serial numbers that belong to the high-availability partition group.
         */
    var PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined
    /**
         * The state of the high-availability partition group.
         */
    var State: js.UndefOr[CloudHsmObjectState] = js.undefined
  }
  
  
  trait DescribeHsmRequest extends js.Object {
    /**
         * The ARN of the HSM. Either the HsmArn or the SerialNumber parameter must be specified.
         */
    var HsmArn: js.UndefOr[HsmArn] = js.undefined
    /**
         * The serial number of the HSM. Either the HsmArn or the HsmSerialNumber parameter must be specified.
         */
    var HsmSerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined
  }
  
  
  trait DescribeHsmResponse extends js.Object {
    /**
         * The Availability Zone that the HSM is in.
         */
    var AvailabilityZone: js.UndefOr[AZ] = js.undefined
    /**
         * The identifier of the elastic network interface (ENI) attached to the HSM.
         */
    var EniId: js.UndefOr[EniId] = js.undefined
    /**
         * The IP address assigned to the HSM's ENI.
         */
    var EniIp: js.UndefOr[IpAddress] = js.undefined
    /**
         * The ARN of the HSM.
         */
    var HsmArn: js.UndefOr[HsmArn] = js.undefined
    /**
         * The HSM model type.
         */
    var HsmType: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The ARN of the IAM role assigned to the HSM.
         */
    var IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    /**
         * The list of partitions on the HSM.
         */
    var Partitions: js.UndefOr[PartitionList] = js.undefined
    /**
         * The serial number of the HSM.
         */
    var SerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined
    /**
         * The date and time that the server certificate was last updated.
         */
    var ServerCertLastUpdated: js.UndefOr[Timestamp] = js.undefined
    /**
         * The URI of the certificate server.
         */
    var ServerCertUri: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The HSM software version.
         */
    var SoftwareVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The date and time that the SSH key was last updated.
         */
    var SshKeyLastUpdated: js.UndefOr[Timestamp] = js.undefined
    /**
         * The public SSH key.
         */
    var SshPublicKey: js.UndefOr[SshKey] = js.undefined
    /**
         * The status of the HSM.
         */
    var Status: js.UndefOr[HsmStatus] = js.undefined
    /**
         * Contains additional information about the status of the HSM.
         */
    var StatusDetails: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The identifier of the subnet that the HSM is in.
         */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
    /**
         * The subscription end date.
         */
    var SubscriptionEndDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The subscription start date.
         */
    var SubscriptionStartDate: js.UndefOr[Timestamp] = js.undefined
    var SubscriptionType: js.UndefOr[SubscriptionType] = js.undefined
    /**
         * The name of the HSM vendor.
         */
    var VendorName: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The identifier of the VPC that the HSM is in.
         */
    var VpcId: js.UndefOr[VpcId] = js.undefined
  }
  
  
  trait DescribeLunaClientRequest extends js.Object {
    /**
         * The certificate fingerprint.
         */
    var CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined
    /**
         * The ARN of the client.
         */
    var ClientArn: js.UndefOr[ClientArn] = js.undefined
  }
  
  
  trait DescribeLunaClientResponse extends js.Object {
    /**
         * The certificate installed on the HSMs used by this client.
         */
    var Certificate: js.UndefOr[Certificate] = js.undefined
    /**
         * The certificate fingerprint.
         */
    var CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined
    /**
         * The ARN of the client.
         */
    var ClientArn: js.UndefOr[ClientArn] = js.undefined
    /**
         * The label of the client.
         */
    var Label: js.UndefOr[Label] = js.undefined
    /**
         * The date and time the client was last modified.
         */
    var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait GetConfigRequest extends js.Object {
    /**
         * The ARN of the client.
         */
    var ClientArn: ClientArn
    /**
         * The client version.
         */
    var ClientVersion: ClientVersion
    /**
         * A list of ARNs that identify the high-availability partition groups that are associated with the client.
         */
    var HapgList: HapgList
  }
  
  
  trait GetConfigResponse extends js.Object {
    /**
         * The certificate file containing the server.pem files of the HSMs.
         */
    var ConfigCred: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The chrystoki.conf configuration file.
         */
    var ConfigFile: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The type of credentials.
         */
    var ConfigType: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListAvailableZonesRequest extends js.Object
  
  
  trait ListAvailableZonesResponse extends js.Object {
    /**
         * The list of Availability Zones that have available AWS CloudHSM capacity.
         */
    var AZList: js.UndefOr[AZList] = js.undefined
  }
  
  
  trait ListHapgsRequest extends js.Object {
    /**
         * The NextToken value from a previous call to ListHapgs. Pass null if this is the first call.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListHapgsResponse extends js.Object {
    /**
         * The list of high-availability partition groups.
         */
    var HapgList: HapgList
    /**
         * If not null, more results are available. Pass this value to ListHapgs to retrieve the next set of items.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListHsmsRequest extends js.Object {
    /**
         * The NextToken value from a previous call to ListHsms. Pass null if this is the first call.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListHsmsResponse extends js.Object {
    /**
         * The list of ARNs that identify the HSMs.
         */
    var HsmList: js.UndefOr[HsmList] = js.undefined
    /**
         * If not null, more results are available. Pass this value to ListHsms to retrieve the next set of items.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListLunaClientsRequest extends js.Object {
    /**
         * The NextToken value from a previous call to ListLunaClients. Pass null if this is the first call.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListLunaClientsResponse extends js.Object {
    /**
         * The list of clients.
         */
    var ClientList: ClientList
    /**
         * If not null, more results are available. Pass this to ListLunaClients to retrieve the next set of items.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
         */
    var ResourceArn: java.lang.String
  }
  
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
         * One or more tags.
         */
    var TagList: TagList
  }
  
  
  trait ModifyHapgRequest extends js.Object {
    /**
         * The ARN of the high-availability partition group to modify.
         */
    var HapgArn: HapgArn
    /**
         * The new label for the high-availability partition group.
         */
    var Label: js.UndefOr[Label] = js.undefined
    /**
         * The list of partition serial numbers to make members of the high-availability partition group.
         */
    var PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined
  }
  
  
  trait ModifyHapgResponse extends js.Object {
    /**
         * The ARN of the high-availability partition group.
         */
    var HapgArn: js.UndefOr[HapgArn] = js.undefined
  }
  
  
  trait ModifyHsmRequest extends js.Object {
    /**
         * The new IP address for the elastic network interface (ENI) attached to the HSM. If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the new subnet.
         */
    var EniIp: js.UndefOr[IpAddress] = js.undefined
    /**
         * The new external ID.
         */
    var ExternalId: js.UndefOr[ExternalId] = js.undefined
    /**
         * The ARN of the HSM to modify.
         */
    var HsmArn: HsmArn
    /**
         * The new IAM role ARN.
         */
    var IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    /**
         * The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone as the current subnet.
         */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
    /**
         * The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
         */
    var SyslogIp: js.UndefOr[IpAddress] = js.undefined
  }
  
  
  trait ModifyHsmResponse extends js.Object {
    /**
         * The ARN of the HSM.
         */
    var HsmArn: js.UndefOr[HsmArn] = js.undefined
  }
  
  
  trait ModifyLunaClientRequest extends js.Object {
    /**
         * The new certificate for the client.
         */
    var Certificate: Certificate
    /**
         * The ARN of the client.
         */
    var ClientArn: ClientArn
  }
  
  
  trait ModifyLunaClientResponse extends js.Object {
    /**
         * The ARN of the client.
         */
    var ClientArn: js.UndefOr[ClientArn] = js.undefined
  }
  
  
  trait RemoveTagsFromResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
         */
    var ResourceArn: java.lang.String
    /**
         * The tag key or keys to remove. Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
         */
    var TagKeyList: TagKeyList
  }
  
  
  trait RemoveTagsFromResourceResponse extends js.Object {
    /**
         * The status of the operation.
         */
    var Status: java.lang.String
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
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
       */
    def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
       */
    def addTagsToResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
       */
    def addTagsToResource(params: AddTagsToResourceRequest): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
       */
    def addTagsToResource(
      params: AddTagsToResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
       */
    def createHapg(): awsDashSdkLib.libRequestMod.Request[CreateHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
       */
    def createHapg(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHapgResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
       */
    def createHapg(params: CreateHapgRequest): awsDashSdkLib.libRequestMod.Request[CreateHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
       */
    def createHapg(
      params: CreateHapgRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHapgResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
       */
    def createHsm(): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
       */
    def createHsm(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHsmResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
       */
    def createHsm(params: CreateHsmRequest): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
       */
    def createHsm(
      params: CreateHsmRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHsmResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
       */
    def createLunaClient(): awsDashSdkLib.libRequestMod.Request[CreateLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
       */
    def createLunaClient(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLunaClientResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
       */
    def createLunaClient(params: CreateLunaClientRequest): awsDashSdkLib.libRequestMod.Request[CreateLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
       */
    def createLunaClient(
      params: CreateLunaClientRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLunaClientResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
       */
    def deleteHapg(): awsDashSdkLib.libRequestMod.Request[DeleteHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
       */
    def deleteHapg(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHapgResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
       */
    def deleteHapg(params: DeleteHapgRequest): awsDashSdkLib.libRequestMod.Request[DeleteHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
       */
    def deleteHapg(
      params: DeleteHapgRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHapgResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
       */
    def deleteHsm(): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
       */
    def deleteHsm(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHsmResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
       */
    def deleteHsm(params: DeleteHsmRequest): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
       */
    def deleteHsm(
      params: DeleteHsmRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHsmResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
       */
    def deleteLunaClient(): awsDashSdkLib.libRequestMod.Request[DeleteLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
       */
    def deleteLunaClient(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLunaClientResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
       */
    def deleteLunaClient(params: DeleteLunaClientRequest): awsDashSdkLib.libRequestMod.Request[DeleteLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
       */
    def deleteLunaClient(
      params: DeleteLunaClientRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLunaClientResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
       */
    def describeHapg(): awsDashSdkLib.libRequestMod.Request[DescribeHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
       */
    def describeHapg(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeHapgResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
       */
    def describeHapg(params: DescribeHapgRequest): awsDashSdkLib.libRequestMod.Request[DescribeHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
       */
    def describeHapg(
      params: DescribeHapgRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeHapgResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
       */
    def describeHsm(): awsDashSdkLib.libRequestMod.Request[DescribeHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
       */
    def describeHsm(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeHsmResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
       */
    def describeHsm(params: DescribeHsmRequest): awsDashSdkLib.libRequestMod.Request[DescribeHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
       */
    def describeHsm(
      params: DescribeHsmRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeHsmResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
       */
    def describeLunaClient(): awsDashSdkLib.libRequestMod.Request[DescribeLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
       */
    def describeLunaClient(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLunaClientResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
       */
    def describeLunaClient(params: DescribeLunaClientRequest): awsDashSdkLib.libRequestMod.Request[DescribeLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
       */
    def describeLunaClient(
      params: DescribeLunaClientRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLunaClientResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
       */
    def getConfig(): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
       */
    def getConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
       */
    def getConfig(params: GetConfigRequest): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
       */
    def getConfig(
      params: GetConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
       */
    def listAvailableZones(): awsDashSdkLib.libRequestMod.Request[ListAvailableZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
       */
    def listAvailableZones(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAvailableZonesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAvailableZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
       */
    def listAvailableZones(params: ListAvailableZonesRequest): awsDashSdkLib.libRequestMod.Request[ListAvailableZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
       */
    def listAvailableZones(
      params: ListAvailableZonesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAvailableZonesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAvailableZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
       */
    def listHapgs(): awsDashSdkLib.libRequestMod.Request[ListHapgsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
       */
    def listHapgs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHapgsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHapgsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
       */
    def listHapgs(params: ListHapgsRequest): awsDashSdkLib.libRequestMod.Request[ListHapgsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
       */
    def listHapgs(
      params: ListHapgsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHapgsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHapgsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
       */
    def listHsms(): awsDashSdkLib.libRequestMod.Request[ListHsmsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
       */
    def listHsms(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHsmsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHsmsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
       */
    def listHsms(params: ListHsmsRequest): awsDashSdkLib.libRequestMod.Request[ListHsmsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
       */
    def listHsms(
      params: ListHsmsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHsmsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHsmsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
       */
    def listLunaClients(): awsDashSdkLib.libRequestMod.Request[ListLunaClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
       */
    def listLunaClients(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLunaClientsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLunaClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
       */
    def listLunaClients(params: ListLunaClientsRequest): awsDashSdkLib.libRequestMod.Request[ListLunaClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
       */
    def listLunaClients(
      params: ListLunaClientsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLunaClientsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLunaClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
       */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
       */
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
       */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
       */
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
       */
    def modifyHapg(): awsDashSdkLib.libRequestMod.Request[ModifyHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
       */
    def modifyHapg(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyHapgResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
       */
    def modifyHapg(params: ModifyHapgRequest): awsDashSdkLib.libRequestMod.Request[ModifyHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
       */
    def modifyHapg(
      params: ModifyHapgRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyHapgResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
       */
    def modifyHsm(): awsDashSdkLib.libRequestMod.Request[ModifyHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
       */
    def modifyHsm(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyHsmResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
       */
    def modifyHsm(params: ModifyHsmRequest): awsDashSdkLib.libRequestMod.Request[ModifyHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
       */
    def modifyHsm(
      params: ModifyHsmRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyHsmResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
       */
    def modifyLunaClient(): awsDashSdkLib.libRequestMod.Request[ModifyLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
       */
    def modifyLunaClient(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyLunaClientResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
       */
    def modifyLunaClient(params: ModifyLunaClientRequest): awsDashSdkLib.libRequestMod.Request[ModifyLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
       */
    def modifyLunaClient(
      params: ModifyLunaClientRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyLunaClientResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
       */
    def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
       */
    def removeTagsFromResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
       */
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
       */
    def removeTagsFromResource(
      params: RemoveTagsFromResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type AZ = java.lang.String
  type AZList = js.Array[AZ]
  type Certificate = java.lang.String
  type CertificateFingerprint = java.lang.String
  type ClientArn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientLabel = java.lang.String
  type ClientList = js.Array[ClientArn]
  type ClientToken = java.lang.String
  type ClientVersion = awsDashSdkLib.awsDashSdkLibStrings.`5DOT1` | awsDashSdkLib.awsDashSdkLibStrings.`5DOT3` | java.lang.String
  type CloudHsmObjectState = awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.DEGRADED | java.lang.String
  type EniId = java.lang.String
  type ExternalId = java.lang.String
  type HapgArn = java.lang.String
  type HapgList = js.Array[HapgArn]
  type HsmArn = java.lang.String
  type HsmList = js.Array[HsmArn]
  type HsmSerialNumber = java.lang.String
  type HsmStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED | awsDashSdkLib.awsDashSdkLibStrings.TERMINATING | awsDashSdkLib.awsDashSdkLibStrings.TERMINATED | awsDashSdkLib.awsDashSdkLibStrings.DEGRADED | java.lang.String
  type IamRoleArn = java.lang.String
  type IpAddress = java.lang.String
  type Label = java.lang.String
  type PaginationToken = java.lang.String
  type PartitionArn = java.lang.String
  type PartitionList = js.Array[PartitionArn]
  type PartitionSerial = java.lang.String
  type PartitionSerialList = js.Array[PartitionSerial]
  type SshKey = java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubscriptionType = awsDashSdkLib.awsDashSdkLibStrings.PRODUCTION | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = java.lang.String
  type VpcId = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2014-05-30` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

