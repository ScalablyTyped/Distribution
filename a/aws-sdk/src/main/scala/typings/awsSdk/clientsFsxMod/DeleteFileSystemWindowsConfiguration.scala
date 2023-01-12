package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemWindowsConfiguration extends StObject {
  
  /**
    * A set of tags for your final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.undefined
  
  /**
    * By default, Amazon FSx for Windows takes a final backup on your behalf when the DeleteFileSystem operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final backup. If you want to skip this backup, use this flag to do so.
    */
  var SkipFinalBackup: js.UndefOr[Flag] = js.undefined
}
object DeleteFileSystemWindowsConfiguration {
  
  inline def apply(): DeleteFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemWindowsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFileSystemWindowsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFinalBackupTags(value: Tags): Self = StObject.set(x, "FinalBackupTags", value.asInstanceOf[js.Any])
    
    inline def setFinalBackupTagsUndefined: Self = StObject.set(x, "FinalBackupTags", js.undefined)
    
    inline def setFinalBackupTagsVarargs(value: Tag*): Self = StObject.set(x, "FinalBackupTags", js.Array(value*))
    
    inline def setSkipFinalBackup(value: Flag): Self = StObject.set(x, "SkipFinalBackup", value.asInstanceOf[js.Any])
    
    inline def setSkipFinalBackupUndefined: Self = StObject.set(x, "SkipFinalBackup", js.undefined)
  }
}
