package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemRequest extends StObject {
  
  /**
    * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The type of Amazon FSx file system to create. Valid values are WINDOWS, LUSTRE, ONTAP, and OPENZFS.
    */
  var FileSystemType: typings.awsSdk.clientsFsxMod.FileSystemType
  
  /**
    * (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that you're creating. Valid values are 2.10 and 2.12:   2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.   2.12 is supported by all Lustre deployment types. 2.12 is required when setting FSx for Lustre DeploymentType to PERSISTENT_2.   Default value = 2.10, except when DeploymentType is set to PERSISTENT_2, then the default is 2.12.  If you set FileSystemTypeVersion to 2.10 for a PERSISTENT_2 Lustre deployment type, the CreateFileSystem operation fails. 
    */
  var FileSystemTypeVersion: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystemTypeVersion] = js.undefined
  
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsFsxMod.KmsKeyId] = js.undefined
  
  var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.undefined
  
  var OntapConfiguration: js.UndefOr[CreateFileSystemOntapConfiguration] = js.undefined
  
  /**
    * The OpenZFS configuration for the file system that's being created.
    */
  var OpenZFSConfiguration: js.UndefOr[CreateFileSystemOpenZFSConfiguration] = js.undefined
  
  /**
    * A list of IDs specifying the security groups to apply to all network interfaces created for file system access. This list isn't returned in later requests to describe the file system.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.clientsFsxMod.SecurityGroupIds] = js.undefined
  
  /**
    * Sets the storage capacity of the file system that you're creating, in gibibytes (GiB).  FSx for Lustre file systems - The amount of storage capacity that you can configure depends on the value that you set for StorageType and the Lustre DeploymentType, as follows:   For SCRATCH_2, PERSISTENT_2 and PERSISTENT_1 deployment types using SSD storage type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.   For PERSISTENT_1 HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.   For SCRATCH_1 deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600 GiB.    FSx for ONTAP file systems - The amount of storage capacity that you can configure is from 1024 GiB up to 196,608 GiB (192 TiB).  FSx for OpenZFS file systems - The amount of storage capacity that you can configure is from 64 GiB up to 524,288 GiB (512 TiB).  FSx for Windows File Server file systems - The amount of storage capacity that you can configure depends on the value that you set for StorageType as follows:   For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).   For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).  
    */
  var StorageCapacity: typings.awsSdk.clientsFsxMod.StorageCapacity
  
  /**
    * Sets the storage type for the file system that you're creating. Valid values are SSD and HDD.   Set to SSD to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP, and OpenZFS deployment types.   Set to HDD to use hard disk drive storage. HDD is supported on SINGLE_AZ_2 and MULTI_AZ_1 Windows file system deployment types, and on PERSISTENT_1 Lustre file system deployment types.    Default value is SSD. For more information, see  Storage type options in the FSx for Windows File Server User Guide and Multiple storage options in the FSx for Lustre User Guide. 
    */
  var StorageType: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageType] = js.undefined
  
  /**
    * Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP MULTI_AZ_1 deployment types,provide exactly two subnet IDs, one for the preferred file server and one for the standby file server. You specify one of these subnets as the preferred subnet using the WindowsConfiguration &gt; PreferredSubnetID or OntapConfiguration &gt; PreferredSubnetID properties. For more information about Multi-AZ file system configuration, see  Availability and durability: Single-AZ and Multi-AZ file systems in the Amazon FSx for Windows User Guide and  Availability and durability in the Amazon FSx for ONTAP User Guide. For Windows SINGLE_AZ_1 and SINGLE_AZ_2 and all Lustre deployment types, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
    */
  var SubnetIds: typings.awsSdk.clientsFsxMod.SubnetIds
  
  /**
    * The tags to apply to the file system that's being created. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
  
  /**
    * The Microsoft Windows configuration for the file system that's being created. 
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
}
object CreateFileSystemRequest {
  
  inline def apply(FileSystemType: FileSystemType, StorageCapacity: StorageCapacity, SubnetIds: SubnetIds): CreateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemType = FileSystemType.asInstanceOf[js.Any], StorageCapacity = StorageCapacity.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemRequest]
  }
  
  extension [Self <: CreateFileSystemRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFileSystemType(value: FileSystemType): Self = StObject.set(x, "FileSystemType", value.asInstanceOf[js.Any])
    
    inline def setFileSystemTypeVersion(value: FileSystemTypeVersion): Self = StObject.set(x, "FileSystemTypeVersion", value.asInstanceOf[js.Any])
    
    inline def setFileSystemTypeVersionUndefined: Self = StObject.set(x, "FileSystemTypeVersion", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLustreConfiguration(value: CreateFileSystemLustreConfiguration): Self = StObject.set(x, "LustreConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLustreConfigurationUndefined: Self = StObject.set(x, "LustreConfiguration", js.undefined)
    
    inline def setOntapConfiguration(value: CreateFileSystemOntapConfiguration): Self = StObject.set(x, "OntapConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOntapConfigurationUndefined: Self = StObject.set(x, "OntapConfiguration", js.undefined)
    
    inline def setOpenZFSConfiguration(value: CreateFileSystemOpenZFSConfiguration): Self = StObject.set(x, "OpenZFSConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOpenZFSConfigurationUndefined: Self = StObject.set(x, "OpenZFSConfiguration", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setStorageCapacity(value: StorageCapacity): Self = StObject.set(x, "StorageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageType(value: StorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setWindowsConfiguration(value: CreateFileSystemWindowsConfiguration): Self = StObject.set(x, "WindowsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWindowsConfigurationUndefined: Self = StObject.set(x, "WindowsConfiguration", js.undefined)
  }
}
