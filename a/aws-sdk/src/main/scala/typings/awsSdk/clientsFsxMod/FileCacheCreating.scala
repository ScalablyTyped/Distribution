package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCacheCreating extends StObject {
  
  /**
    * A boolean flag indicating whether tags for the cache should be copied to data repository associations.
    */
  var CopyTagsToDataRepositoryAssociations: js.UndefOr[typings.awsSdk.clientsFsxMod.CopyTagsToDataRepositoryAssociations] = js.undefined
  
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Domain Name System (DNS) name for the cache.
    */
  var DNSName: js.UndefOr[typings.awsSdk.clientsFsxMod.DNSName] = js.undefined
  
  /**
    * A list of IDs of data repository associations that are associated with this cache.
    */
  var DataRepositoryAssociationIds: js.UndefOr[typings.awsSdk.clientsFsxMod.DataRepositoryAssociationIds] = js.undefined
  
  /**
    * A structure providing details of any failures that occurred.
    */
  var FailureDetails: js.UndefOr[FileCacheFailureDetails] = js.undefined
  
  /**
    * The system-generated, unique ID of the cache.
    */
  var FileCacheId: js.UndefOr[typings.awsSdk.clientsFsxMod.FileCacheId] = js.undefined
  
  /**
    * The type of cache, which must be LUSTRE.
    */
  var FileCacheType: js.UndefOr[typings.awsSdk.clientsFsxMod.FileCacheType] = js.undefined
  
  /**
    * The Lustre version of the cache, which must be 2.12.
    */
  var FileCacheTypeVersion: js.UndefOr[FileSystemTypeVersion] = js.undefined
  
  /**
    * Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed KMS key for your account is used. For more information, see Encrypt in the Key Management Service API Reference.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsFsxMod.KmsKeyId] = js.undefined
  
  /**
    * The lifecycle status of the cache. The following are the possible values and what they mean:    AVAILABLE - The cache is in a healthy state, and is reachable and available for use.    CREATING - The new cache is being created.    DELETING - An existing cache is being deleted.    UPDATING - The cache is undergoing a customer-initiated update.    FAILED - An existing cache has experienced an unrecoverable failure. When creating a new cache, the cache was unable to be created.  
    */
  var Lifecycle: js.UndefOr[FileCacheLifecycle] = js.undefined
  
  /**
    * The configuration for the Amazon File Cache resource.
    */
  var LustreConfiguration: js.UndefOr[FileCacheLustreConfiguration] = js.undefined
  
  var NetworkInterfaceIds: js.UndefOr[typings.awsSdk.clientsFsxMod.NetworkInterfaceIds] = js.undefined
  
  var OwnerId: js.UndefOr[AWSAccountId] = js.undefined
  
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsFsxMod.ResourceARN] = js.undefined
  
  /**
    * The storage capacity of the cache in gibibytes (GiB).
    */
  var StorageCapacity: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageCapacity] = js.undefined
  
  var SubnetIds: js.UndefOr[typings.awsSdk.clientsFsxMod.SubnetIds] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
  
  var VpcId: js.UndefOr[typings.awsSdk.clientsFsxMod.VpcId] = js.undefined
}
object FileCacheCreating {
  
  inline def apply(): FileCacheCreating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileCacheCreating]
  }
  
  extension [Self <: FileCacheCreating](x: Self) {
    
    inline def setCopyTagsToDataRepositoryAssociations(value: CopyTagsToDataRepositoryAssociations): Self = StObject.set(x, "CopyTagsToDataRepositoryAssociations", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToDataRepositoryAssociationsUndefined: Self = StObject.set(x, "CopyTagsToDataRepositoryAssociations", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    inline def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    inline def setDataRepositoryAssociationIds(value: DataRepositoryAssociationIds): Self = StObject.set(x, "DataRepositoryAssociationIds", value.asInstanceOf[js.Any])
    
    inline def setDataRepositoryAssociationIdsUndefined: Self = StObject.set(x, "DataRepositoryAssociationIds", js.undefined)
    
    inline def setDataRepositoryAssociationIdsVarargs(value: DataRepositoryAssociationId*): Self = StObject.set(x, "DataRepositoryAssociationIds", js.Array(value*))
    
    inline def setFailureDetails(value: FileCacheFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setFileCacheId(value: FileCacheId): Self = StObject.set(x, "FileCacheId", value.asInstanceOf[js.Any])
    
    inline def setFileCacheIdUndefined: Self = StObject.set(x, "FileCacheId", js.undefined)
    
    inline def setFileCacheType(value: FileCacheType): Self = StObject.set(x, "FileCacheType", value.asInstanceOf[js.Any])
    
    inline def setFileCacheTypeUndefined: Self = StObject.set(x, "FileCacheType", js.undefined)
    
    inline def setFileCacheTypeVersion(value: FileSystemTypeVersion): Self = StObject.set(x, "FileCacheTypeVersion", value.asInstanceOf[js.Any])
    
    inline def setFileCacheTypeVersionUndefined: Self = StObject.set(x, "FileCacheTypeVersion", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLifecycle(value: FileCacheLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setLustreConfiguration(value: FileCacheLustreConfiguration): Self = StObject.set(x, "LustreConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLustreConfigurationUndefined: Self = StObject.set(x, "LustreConfiguration", js.undefined)
    
    inline def setNetworkInterfaceIds(value: NetworkInterfaceIds): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "NetworkInterfaceIds", js.undefined)
    
    inline def setNetworkInterfaceIdsVarargs(value: NetworkInterfaceId*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value*))
    
    inline def setOwnerId(value: AWSAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setStorageCapacity(value: StorageCapacity): Self = StObject.set(x, "StorageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUndefined: Self = StObject.set(x, "StorageCapacity", js.undefined)
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
