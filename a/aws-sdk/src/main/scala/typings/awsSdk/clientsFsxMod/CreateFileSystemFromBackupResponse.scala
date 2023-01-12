package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemFromBackupResponse extends StObject {
  
  /**
    * A description of the file system.
    */
  var FileSystem: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystem] = js.undefined
}
object CreateFileSystemFromBackupResponse {
  
  inline def apply(): CreateFileSystemFromBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileSystemFromBackupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFileSystemFromBackupResponse] (val x: Self) extends AnyVal {
    
    inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemUndefined: Self = StObject.set(x, "FileSystem", js.undefined)
  }
}
