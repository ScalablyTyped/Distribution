package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemOpenZFSConfiguration extends StObject {
  
  /**
    * A list of tags to apply to the file system's final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.undefined
  
  /**
    * To delete a file system if there are child volumes present below the root volume, use the string DELETE_CHILD_VOLUMES_AND_SNAPSHOTS. If your file system has child volumes and you don't use this option, the delete request will fail.
    */
  var Options: js.UndefOr[DeleteFileSystemOpenZFSOptions] = js.undefined
  
  /**
    * By default, Amazon FSx for OpenZFS takes a final backup on your behalf when the DeleteFileSystem operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final backup. If you want to skip taking a final backup, set this value to true.
    */
  var SkipFinalBackup: js.UndefOr[Flag] = js.undefined
}
object DeleteFileSystemOpenZFSConfiguration {
  
  inline def apply(): DeleteFileSystemOpenZFSConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemOpenZFSConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFileSystemOpenZFSConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFinalBackupTags(value: Tags): Self = StObject.set(x, "FinalBackupTags", value.asInstanceOf[js.Any])
    
    inline def setFinalBackupTagsUndefined: Self = StObject.set(x, "FinalBackupTags", js.undefined)
    
    inline def setFinalBackupTagsVarargs(value: Tag*): Self = StObject.set(x, "FinalBackupTags", js.Array(value*))
    
    inline def setOptions(value: DeleteFileSystemOpenZFSOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setOptionsVarargs(value: DeleteFileSystemOpenZFSOption*): Self = StObject.set(x, "Options", js.Array(value*))
    
    inline def setSkipFinalBackup(value: Flag): Self = StObject.set(x, "SkipFinalBackup", value.asInstanceOf[js.Any])
    
    inline def setSkipFinalBackupUndefined: Self = StObject.set(x, "SkipFinalBackup", js.undefined)
  }
}
