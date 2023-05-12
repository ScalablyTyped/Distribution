package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystem extends StObject {
  
  /**
    * A list of administrative actions for the file system that are in process or waiting to be processed. Administrative actions describe changes to the Amazon FSx system that you have initiated using the UpdateFileSystem operation.
    */
  var AdministrativeActions: js.UndefOr[typings.awsSdk.clientsFsxMod.AdministrativeActions] = js.undefined
  
  /**
    * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Domain Name System (DNS) name for the file system.
    */
  var DNSName: js.UndefOr[typings.awsSdk.clientsFsxMod.DNSName] = js.undefined
  
  var FailureDetails: js.UndefOr[FileSystemFailureDetails] = js.undefined
  
  /**
    * The system-generated, unique 17-digit ID of the file system.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystemId] = js.undefined
  
  /**
    * The type of Amazon FSx file system, which can be LUSTRE, WINDOWS, ONTAP, or OPENZFS.
    */
  var FileSystemType: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystemType] = js.undefined
  
  /**
    * The Lustre version of the Amazon FSx for Lustre file system, either 2.10 or 2.12.
    */
  var FileSystemTypeVersion: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystemTypeVersion] = js.undefined
  
  /**
    * The ID of the Key Management Service (KMS) key used to encrypt Amazon FSx file system data. Used as follows with Amazon FSx file system types:   Amazon FSx for Lustre PERSISTENT_1 and PERSISTENT_2 deployment types only.  SCRATCH_1 and SCRATCH_2 types are encrypted using the Amazon FSx service KMS key for your account.   Amazon FSx for NetApp ONTAP   Amazon FSx for OpenZFS   Amazon FSx for Windows File Server  
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsFsxMod.KmsKeyId] = js.undefined
  
  /**
    * The lifecycle status of the file system. The following are the possible values and what they mean:    AVAILABLE - The file system is in a healthy state, and is reachable and available for use.    CREATING - Amazon FSx is creating the new file system.    DELETING - Amazon FSx is deleting an existing file system.    FAILED - An existing file system has experienced an unrecoverable failure. When creating a new file system, Amazon FSx was unable to create the file system.    MISCONFIGURED - The file system is in a failed but recoverable state.    MISCONFIGURED_UNAVAILABLE - (Amazon FSx for Windows File Server only) The file system is currently unavailable due to a change in your Active Directory configuration.    UPDATING - The file system is undergoing a customer-initiated update.  
    */
  var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined
  
  var LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration] = js.undefined
  
  /**
    * The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic network interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx file system was created in. For more information, see Elastic Network Interfaces in the Amazon EC2 User Guide.  For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx for Lustre file system, you can have more than one.
    */
  var NetworkInterfaceIds: js.UndefOr[typings.awsSdk.clientsFsxMod.NetworkInterfaceIds] = js.undefined
  
  /**
    * The configuration for this Amazon FSx for NetApp ONTAP file system.
    */
  var OntapConfiguration: js.UndefOr[OntapFileSystemConfiguration] = js.undefined
  
  /**
    * The configuration for this Amazon FSx for OpenZFS file system.
    */
  var OpenZFSConfiguration: js.UndefOr[OpenZFSFileSystemConfiguration] = js.undefined
  
  /**
    * The Amazon Web Services account that created the file system. If the file system was created by a user in IAM Identity Center, the Amazon Web Services account to which the IAM user belongs is the owner.
    */
  var OwnerId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the file system resource.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsFsxMod.ResourceARN] = js.undefined
  
  /**
    * The storage capacity of the file system in gibibytes (GiB).
    */
  var StorageCapacity: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageCapacity] = js.undefined
  
  /**
    * The type of storage the file system is using. If set to SSD, the file system uses solid state drive storage. If set to HDD, the file system uses hard disk drive storage. 
    */
  var StorageType: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageType] = js.undefined
  
  /**
    * Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and ONTAP MULTI_AZ_1 file system deployment type, there are two subnet IDs, one for the preferred file server and one for the standby file server. The preferred file server subnet identified in the PreferredSubnetID property. All other file systems have only one subnet ID. For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that contains the file system's endpoint. For MULTI_AZ_1 Windows and ONTAP file systems, the file system endpoint is available in the PreferredSubnetID.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.clientsFsxMod.SubnetIds] = js.undefined
  
  /**
    * The tags to associate with the file system. For more information, see Tagging your Amazon EC2 resources in the Amazon EC2 User Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
  
  /**
    * The ID of the primary virtual private cloud (VPC) for the file system.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsFsxMod.VpcId] = js.undefined
  
  /**
    * The configuration for this Amazon FSx for Windows File Server file system.
    */
  var WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration] = js.undefined
}
object FileSystem {
  
  inline def apply(): FileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystem] (val x: Self) extends AnyVal {
    
    inline def setAdministrativeActions(value: AdministrativeActions): Self = StObject.set(x, "AdministrativeActions", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeActionsUndefined: Self = StObject.set(x, "AdministrativeActions", js.undefined)
    
    inline def setAdministrativeActionsVarargs(value: AdministrativeAction*): Self = StObject.set(x, "AdministrativeActions", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    inline def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    inline def setFailureDetails(value: FileSystemFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setFileSystemType(value: FileSystemType): Self = StObject.set(x, "FileSystemType", value.asInstanceOf[js.Any])
    
    inline def setFileSystemTypeUndefined: Self = StObject.set(x, "FileSystemType", js.undefined)
    
    inline def setFileSystemTypeVersion(value: FileSystemTypeVersion): Self = StObject.set(x, "FileSystemTypeVersion", value.asInstanceOf[js.Any])
    
    inline def setFileSystemTypeVersionUndefined: Self = StObject.set(x, "FileSystemTypeVersion", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLifecycle(value: FileSystemLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setLustreConfiguration(value: LustreFileSystemConfiguration): Self = StObject.set(x, "LustreConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLustreConfigurationUndefined: Self = StObject.set(x, "LustreConfiguration", js.undefined)
    
    inline def setNetworkInterfaceIds(value: NetworkInterfaceIds): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "NetworkInterfaceIds", js.undefined)
    
    inline def setNetworkInterfaceIdsVarargs(value: NetworkInterfaceId*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value*))
    
    inline def setOntapConfiguration(value: OntapFileSystemConfiguration): Self = StObject.set(x, "OntapConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOntapConfigurationUndefined: Self = StObject.set(x, "OntapConfiguration", js.undefined)
    
    inline def setOpenZFSConfiguration(value: OpenZFSFileSystemConfiguration): Self = StObject.set(x, "OpenZFSConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOpenZFSConfigurationUndefined: Self = StObject.set(x, "OpenZFSConfiguration", js.undefined)
    
    inline def setOwnerId(value: AWSAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setStorageCapacity(value: StorageCapacity): Self = StObject.set(x, "StorageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUndefined: Self = StObject.set(x, "StorageCapacity", js.undefined)
    
    inline def setStorageType(value: StorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setWindowsConfiguration(value: WindowsFileSystemConfiguration): Self = StObject.set(x, "WindowsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWindowsConfigurationUndefined: Self = StObject.set(x, "WindowsConfiguration", js.undefined)
  }
}
