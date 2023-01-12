package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRepositoryAssociation extends StObject {
  
  /**
    * The system-generated, unique ID of the data repository association.
    */
  var AssociationId: js.UndefOr[DataRepositoryAssociationId] = js.undefined
  
  /**
    * A boolean flag indicating whether an import data repository task to import metadata should run after the data repository association is created. The task runs if this flag is set to true.   BatchImportMetaDataOnCreate is not supported for data repositories linked to an Amazon File Cache resource. 
    */
  var BatchImportMetaDataOnCreate: js.UndefOr[typings.awsSdk.clientsFsxMod.BatchImportMetaDataOnCreate] = js.undefined
  
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The path to the data repository that will be linked to the cache or file system.   For Amazon File Cache, the path can be an NFS data repository that will be linked to the cache. The path can be in one of two formats:   If you are not using the DataRepositorySubdirectories parameter, the path is to an NFS Export directory (or one of its subdirectories) in the format nsf://nfs-domain-name/exportpath. You can therefore link a single NFS Export to a single data repository association.   If you are using the DataRepositorySubdirectories parameter, the path is the domain name of the NFS file system in the format nfs://filer-domain-name, which indicates the root of the subdirectories specified with the DataRepositorySubdirectories parameter.     For Amazon File Cache, the path can be an S3 bucket or prefix in the format s3://myBucket/myPrefix/.   For Amazon FSx for Lustre, the path can be an S3 bucket or prefix in the format s3://myBucket/myPrefix/.  
    */
  var DataRepositoryPath: js.UndefOr[ArchivePath] = js.undefined
  
  /**
    * For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association. All the subdirectories must be on a single NFS file system. The Export paths are in the format /exportpath1. To use this parameter, you must configure DataRepositoryPath as the domain name of the NFS file system. The NFS file system domain name in effect is the root of the subdirectories. Note that DataRepositorySubdirectories is not supported for S3 data repositories.
    */
  var DataRepositorySubdirectories: js.UndefOr[SubDirectoriesPaths] = js.undefined
  
  var FailureDetails: js.UndefOr[DataRepositoryFailureDetails] = js.undefined
  
  /**
    * The globally unique ID of the Amazon File Cache resource.
    */
  var FileCacheId: js.UndefOr[typings.awsSdk.clientsFsxMod.FileCacheId] = js.undefined
  
  /**
    * A path on the Amazon File Cache that points to a high-level directory (such as /ns1/) or subdirectory (such as /ns1/subdir/) that will be mapped 1-1 with DataRepositoryPath. The leading forward slash in the path is required. Two data repository associations cannot have overlapping cache paths. For example, if a data repository is associated with cache path /ns1/, then you cannot link another data repository with cache path /ns1/ns2. This path specifies the directory in your cache where files will be exported from. This cache directory can be linked to only one data repository (S3 or NFS) and no other data repository can be linked to the directory.  The cache path can only be set to root (/) on an NFS DRA when DataRepositorySubdirectories is specified. If you specify root (/) as the cache path, you can create only one DRA on the cache. The cache path cannot be set to root (/) for an S3 DRA. 
    */
  var FileCachePath: js.UndefOr[Namespace] = js.undefined
  
  var FileSystemId: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystemId] = js.undefined
  
  /**
    * A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as /ns1/) or subdirectory (such as /ns1/subdir/) that will be mapped 1-1 with DataRepositoryPath. The leading forward slash in the name is required. Two data repository associations cannot have overlapping file system paths. For example, if a data repository is associated with file system path /ns1/, then you cannot link another data repository with file system path /ns1/ns2. This path specifies where in your file system files will be exported from or imported to. This file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.  If you specify only a forward slash (/) as the file system path, you can link only one data repository to the file system. You can only specify "/" as the file system path for the first data repository associated with a file system. 
    */
  var FileSystemPath: js.UndefOr[Namespace] = js.undefined
  
  /**
    * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system or cache. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined
  
  /**
    * Describes the state of a data repository association. The lifecycle can have the following values:    CREATING - The data repository association between the file system or cache and the data repository is being created. The data repository is unavailable.    AVAILABLE - The data repository association is available for use.    MISCONFIGURED - The data repository association is misconfigured. Until the configuration is corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).    UPDATING - The data repository association is undergoing a customer initiated update that might affect its availability.    DELETING - The data repository association is undergoing a customer initiated deletion.    FAILED - The data repository association is in a terminal state that cannot be recovered.  
    */
  var Lifecycle: js.UndefOr[DataRepositoryLifecycle] = js.undefined
  
  /**
    * The configuration for an NFS data repository linked to an Amazon File Cache resource with a data repository association.
    */
  var NFS: js.UndefOr[NFSDataRepositoryConfiguration] = js.undefined
  
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsFsxMod.ResourceARN] = js.undefined
  
  /**
    * The configuration for an Amazon S3 data repository linked to an Amazon FSx for Lustre file system with a data repository association.
    */
  var S3: js.UndefOr[S3DataRepositoryConfiguration] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
}
object DataRepositoryAssociation {
  
  inline def apply(): DataRepositoryAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRepositoryAssociation] (val x: Self) extends AnyVal {
    
    inline def setAssociationId(value: DataRepositoryAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setBatchImportMetaDataOnCreate(value: BatchImportMetaDataOnCreate): Self = StObject.set(x, "BatchImportMetaDataOnCreate", value.asInstanceOf[js.Any])
    
    inline def setBatchImportMetaDataOnCreateUndefined: Self = StObject.set(x, "BatchImportMetaDataOnCreate", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataRepositoryPath(value: ArchivePath): Self = StObject.set(x, "DataRepositoryPath", value.asInstanceOf[js.Any])
    
    inline def setDataRepositoryPathUndefined: Self = StObject.set(x, "DataRepositoryPath", js.undefined)
    
    inline def setDataRepositorySubdirectories(value: SubDirectoriesPaths): Self = StObject.set(x, "DataRepositorySubdirectories", value.asInstanceOf[js.Any])
    
    inline def setDataRepositorySubdirectoriesUndefined: Self = StObject.set(x, "DataRepositorySubdirectories", js.undefined)
    
    inline def setDataRepositorySubdirectoriesVarargs(value: Namespace*): Self = StObject.set(x, "DataRepositorySubdirectories", js.Array(value*))
    
    inline def setFailureDetails(value: DataRepositoryFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setFileCacheId(value: FileCacheId): Self = StObject.set(x, "FileCacheId", value.asInstanceOf[js.Any])
    
    inline def setFileCacheIdUndefined: Self = StObject.set(x, "FileCacheId", js.undefined)
    
    inline def setFileCachePath(value: Namespace): Self = StObject.set(x, "FileCachePath", value.asInstanceOf[js.Any])
    
    inline def setFileCachePathUndefined: Self = StObject.set(x, "FileCachePath", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setFileSystemPath(value: Namespace): Self = StObject.set(x, "FileSystemPath", value.asInstanceOf[js.Any])
    
    inline def setFileSystemPathUndefined: Self = StObject.set(x, "FileSystemPath", js.undefined)
    
    inline def setImportedFileChunkSize(value: Megabytes): Self = StObject.set(x, "ImportedFileChunkSize", value.asInstanceOf[js.Any])
    
    inline def setImportedFileChunkSizeUndefined: Self = StObject.set(x, "ImportedFileChunkSize", js.undefined)
    
    inline def setLifecycle(value: DataRepositoryLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setNFS(value: NFSDataRepositoryConfiguration): Self = StObject.set(x, "NFS", value.asInstanceOf[js.Any])
    
    inline def setNFSUndefined: Self = StObject.set(x, "NFS", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setS3(value: S3DataRepositoryConfiguration): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
