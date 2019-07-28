package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem extends js.Object {
  /**
    * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsFsxMod.CreationTime] = js.undefined
  /**
    * The DNS name for the file system.
    */
  var DNSName: js.UndefOr[typings.awsDashSdk.clientsFsxMod.DNSName] = js.undefined
  var FailureDetails: js.UndefOr[FileSystemFailureDetails] = js.undefined
  /**
    * The system-generated, unique 17-digit ID of the file system.
    */
  var FileSystemId: js.UndefOr[typings.awsDashSdk.clientsFsxMod.FileSystemId] = js.undefined
  /**
    * The type of Amazon FSx file system, either LUSTRE or WINDOWS.
    */
  var FileSystemType: js.UndefOr[typings.awsDashSdk.clientsFsxMod.FileSystemType] = js.undefined
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an Amazon FSx for Windows File Server file system.
    */
  var KmsKeyId: js.UndefOr[typings.awsDashSdk.clientsFsxMod.KmsKeyId] = js.undefined
  /**
    * The lifecycle status of the file system:    AVAILABLE indicates that the file system is reachable and available for use.    CREATING indicates that Amazon FSx is in the process of creating the new file system.    DELETING indicates that Amazon FSx is in the process of deleting the file system.    FAILED indicates that Amazon FSx was not able to create the file system.    MISCONFIGURED indicates that the file system is in a failed but recoverable state.    UPDATING indicates that the file system is undergoing a customer initiated update.  
    */
  var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined
  var LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration] = js.undefined
  /**
    * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more information, see Elastic Network Interfaces in the Amazon EC2 User Guide.  For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx for Lustre file system, you can have more than one.
    */
  var NetworkInterfaceIds: js.UndefOr[typings.awsDashSdk.clientsFsxMod.NetworkInterfaceIds] = js.undefined
  /**
    * The AWS account that created the file system. If the file system was created by an AWS Identity and Access Management (IAM) user, the AWS account to which the IAM user belongs is the owner.
    */
  var OwnerId: js.UndefOr[AWSAccountId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the file system resource.
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsFsxMod.ResourceARN] = js.undefined
  /**
    * The storage capacity of the file system in gigabytes (GB).
    */
  var StorageCapacity: js.UndefOr[typings.awsDashSdk.clientsFsxMod.StorageCapacity] = js.undefined
  /**
    * The ID of the subnet to contain the endpoint for the file system. One and only one is supported. The file system is launched in the Availability Zone associated with this subnet.
    */
  var SubnetIds: js.UndefOr[typings.awsDashSdk.clientsFsxMod.SubnetIds] = js.undefined
  /**
    * The tags to associate with the file system. For more information, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsFsxMod.Tags] = js.undefined
  /**
    * The ID of the primary VPC for the file system.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsFsxMod.VpcId] = js.undefined
  /**
    * The configuration for this Microsoft Windows file system.
    */
  var WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration] = js.undefined
}

object FileSystem {
  @scala.inline
  def apply(
    CreationTime: CreationTime = null,
    DNSName: DNSName = null,
    FailureDetails: FileSystemFailureDetails = null,
    FileSystemId: FileSystemId = null,
    FileSystemType: FileSystemType = null,
    KmsKeyId: KmsKeyId = null,
    Lifecycle: FileSystemLifecycle = null,
    LustreConfiguration: LustreFileSystemConfiguration = null,
    NetworkInterfaceIds: NetworkInterfaceIds = null,
    OwnerId: AWSAccountId = null,
    ResourceARN: ResourceARN = null,
    StorageCapacity: js.UndefOr[StorageCapacity] = js.undefined,
    SubnetIds: SubnetIds = null,
    Tags: Tags = null,
    VpcId: VpcId = null,
    WindowsConfiguration: WindowsFileSystemConfiguration = null
  ): FileSystem = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName)
    if (FailureDetails != null) __obj.updateDynamic("FailureDetails")(FailureDetails)
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId)
    if (FileSystemType != null) __obj.updateDynamic("FileSystemType")(FileSystemType.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (LustreConfiguration != null) __obj.updateDynamic("LustreConfiguration")(LustreConfiguration)
    if (NetworkInterfaceIds != null) __obj.updateDynamic("NetworkInterfaceIds")(NetworkInterfaceIds)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (!js.isUndefined(StorageCapacity)) __obj.updateDynamic("StorageCapacity")(StorageCapacity)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration)
    __obj.asInstanceOf[FileSystem]
  }
}

