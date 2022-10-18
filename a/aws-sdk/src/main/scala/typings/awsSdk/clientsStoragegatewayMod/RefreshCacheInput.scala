package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshCacheInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the file share you want to refresh.
    */
  var FileShareARN: typings.awsSdk.clientsStoragegatewayMod.FileShareARN
  
  /**
    * A comma-separated list of the paths of folders to refresh in the cache. The default is ["/"]. The default refreshes objects and folders at the root of the Amazon S3 bucket. If Recursive is set to true, the entire S3 bucket that the file share has access to is refreshed.
    */
  var FolderList: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FolderList] = js.undefined
  
  /**
    * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that were in the cache the last time the gateway listed the folder's contents. If this value set to true, each folder that is listed in FolderList is recursively updated. Otherwise, subfolders listed in FolderList are not refreshed. Only objects that are in folders listed directly under FolderList are found and used for the update. The default is true. Valid Values: true | false 
    */
  var Recursive: js.UndefOr[Boolean] = js.undefined
}
object RefreshCacheInput {
  
  inline def apply(FileShareARN: FileShareARN): RefreshCacheInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshCacheInput]
  }
  
  extension [Self <: RefreshCacheInput](x: Self) {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFolderList(value: FolderList): Self = StObject.set(x, "FolderList", value.asInstanceOf[js.Any])
    
    inline def setFolderListUndefined: Self = StObject.set(x, "FolderList", js.undefined)
    
    inline def setFolderListVarargs(value: Folder*): Self = StObject.set(x, "FolderList", js.Array(value*))
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "Recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "Recursive", js.undefined)
  }
}
