package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileCacheRequest extends StObject {
  
  /**
    * An idempotency token for resource creation, in a string of up to 64 ASCII characters. This token is automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK. By using the idempotent operation, you can retry a CreateFileCache operation without the risk of creating an extra cache. This approach can be useful when an initial call fails in a way that makes it unclear whether a cache was created. Examples are if a transport level timeout occurred, or your connection was reset. If you use the same client request token and the initial call created a cache, the client receives success as long as the parameters are the same.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
    */
  var CopyTagsToDataRepositoryAssociations: js.UndefOr[typings.awsSdk.clientsFsxMod.CopyTagsToDataRepositoryAssociations] = js.undefined
  
  /**
    * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements:   All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time.   An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.   DRA automatic import and automatic export is not supported.
    */
  var DataRepositoryAssociations: js.UndefOr[CreateFileCacheDataRepositoryAssociations] = js.undefined
  
  /**
    * The type of cache that you're creating, which must be LUSTRE.
    */
  var FileCacheType: typings.awsSdk.clientsFsxMod.FileCacheType
  
  /**
    * Sets the Lustre version for the cache that you're creating, which must be 2.12.
    */
  var FileCacheTypeVersion: FileSystemTypeVersion
  
  /**
    * Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed KMS key for your account is used. For more information, see Encrypt in the Key Management Service API Reference.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsFsxMod.KmsKeyId] = js.undefined
  
  /**
    * The configuration for the Amazon File Cache resource being created.
    */
  var LustreConfiguration: js.UndefOr[CreateFileCacheLustreConfiguration] = js.undefined
  
  /**
    * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access. This list isn't returned in later requests to describe the cache.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.clientsFsxMod.SecurityGroupIds] = js.undefined
  
  /**
    * The storage capacity of the cache in gibibytes (GiB). Valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
    */
  var StorageCapacity: typings.awsSdk.clientsFsxMod.StorageCapacity
  
  var SubnetIds: typings.awsSdk.clientsFsxMod.SubnetIds
  
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
}
object CreateFileCacheRequest {
  
  inline def apply(
    FileCacheType: FileCacheType,
    FileCacheTypeVersion: FileSystemTypeVersion,
    StorageCapacity: StorageCapacity,
    SubnetIds: SubnetIds
  ): CreateFileCacheRequest = {
    val __obj = js.Dynamic.literal(FileCacheType = FileCacheType.asInstanceOf[js.Any], FileCacheTypeVersion = FileCacheTypeVersion.asInstanceOf[js.Any], StorageCapacity = StorageCapacity.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileCacheRequest]
  }
  
  extension [Self <: CreateFileCacheRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setCopyTagsToDataRepositoryAssociations(value: CopyTagsToDataRepositoryAssociations): Self = StObject.set(x, "CopyTagsToDataRepositoryAssociations", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToDataRepositoryAssociationsUndefined: Self = StObject.set(x, "CopyTagsToDataRepositoryAssociations", js.undefined)
    
    inline def setDataRepositoryAssociations(value: CreateFileCacheDataRepositoryAssociations): Self = StObject.set(x, "DataRepositoryAssociations", value.asInstanceOf[js.Any])
    
    inline def setDataRepositoryAssociationsUndefined: Self = StObject.set(x, "DataRepositoryAssociations", js.undefined)
    
    inline def setDataRepositoryAssociationsVarargs(value: FileCacheDataRepositoryAssociation*): Self = StObject.set(x, "DataRepositoryAssociations", js.Array(value*))
    
    inline def setFileCacheType(value: FileCacheType): Self = StObject.set(x, "FileCacheType", value.asInstanceOf[js.Any])
    
    inline def setFileCacheTypeVersion(value: FileSystemTypeVersion): Self = StObject.set(x, "FileCacheTypeVersion", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLustreConfiguration(value: CreateFileCacheLustreConfiguration): Self = StObject.set(x, "LustreConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLustreConfigurationUndefined: Self = StObject.set(x, "LustreConfiguration", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setStorageCapacity(value: StorageCapacity): Self = StObject.set(x, "StorageCapacity", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
