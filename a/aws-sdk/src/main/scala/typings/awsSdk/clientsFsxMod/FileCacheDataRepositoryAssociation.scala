package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCacheDataRepositoryAssociation extends StObject {
  
  /**
    * The path to the S3 or NFS data repository that links to the cache. You must provide one of the following paths:   The path can be an NFS data repository that links to the cache. The path can be in one of two formats:   If you are not using the DataRepositorySubdirectories parameter, the path is to an NFS Export directory (or one of its subdirectories) in the format nsf://nfs-domain-name/exportpath. You can therefore link a single NFS Export to a single data repository association.   If you are using the DataRepositorySubdirectories parameter, the path is the domain name of the NFS file system in the format nfs://filer-domain-name, which indicates the root of the subdirectories specified with the DataRepositorySubdirectories parameter.     The path can be an S3 bucket or prefix in the format s3://myBucket/myPrefix/.  
    */
  var DataRepositoryPath: ArchivePath
  
  /**
    * A list of NFS Exports that will be linked with this data repository association. The Export paths are in the format /exportpath1. To use this parameter, you must configure DataRepositoryPath as the domain name of the NFS file system. The NFS file system domain name in effect is the root of the subdirectories. Note that DataRepositorySubdirectories is not supported for S3 data repositories.
    */
  var DataRepositorySubdirectories: js.UndefOr[SubDirectoriesPaths] = js.undefined
  
  /**
    * A path on the cache that points to a high-level directory (such as /ns1/) or subdirectory (such as /ns1/subdir/) that will be mapped 1-1 with DataRepositoryPath. The leading forward slash in the name is required. Two data repository associations cannot have overlapping cache paths. For example, if a data repository is associated with cache path /ns1/, then you cannot link another data repository with cache path /ns1/ns2. This path specifies where in your cache files will be exported from. This cache directory can be linked to only one data repository, and no data repository other can be linked to the directory.  The cache path can only be set to root (/) on an NFS DRA when DataRepositorySubdirectories is specified. If you specify root (/) as the cache path, you can create only one DRA on the cache. The cache path cannot be set to root (/) for an S3 DRA. 
    */
  var FileCachePath: Namespace
  
  /**
    * The configuration for a data repository association that links an Amazon File Cache resource to an NFS data repository.
    */
  var NFS: js.UndefOr[FileCacheNFSConfiguration] = js.undefined
}
object FileCacheDataRepositoryAssociation {
  
  inline def apply(DataRepositoryPath: ArchivePath, FileCachePath: Namespace): FileCacheDataRepositoryAssociation = {
    val __obj = js.Dynamic.literal(DataRepositoryPath = DataRepositoryPath.asInstanceOf[js.Any], FileCachePath = FileCachePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCacheDataRepositoryAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileCacheDataRepositoryAssociation] (val x: Self) extends AnyVal {
    
    inline def setDataRepositoryPath(value: ArchivePath): Self = StObject.set(x, "DataRepositoryPath", value.asInstanceOf[js.Any])
    
    inline def setDataRepositorySubdirectories(value: SubDirectoriesPaths): Self = StObject.set(x, "DataRepositorySubdirectories", value.asInstanceOf[js.Any])
    
    inline def setDataRepositorySubdirectoriesUndefined: Self = StObject.set(x, "DataRepositorySubdirectories", js.undefined)
    
    inline def setDataRepositorySubdirectoriesVarargs(value: Namespace*): Self = StObject.set(x, "DataRepositorySubdirectories", js.Array(value*))
    
    inline def setFileCachePath(value: Namespace): Self = StObject.set(x, "FileCachePath", value.asInstanceOf[js.Any])
    
    inline def setNFS(value: FileCacheNFSConfiguration): Self = StObject.set(x, "NFS", value.asInstanceOf[js.Any])
    
    inline def setNFSUndefined: Self = StObject.set(x, "NFS", js.undefined)
  }
}
