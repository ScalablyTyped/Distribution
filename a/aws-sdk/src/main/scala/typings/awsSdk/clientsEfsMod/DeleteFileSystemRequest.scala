package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemRequest extends StObject {
  
  /**
    * The ID of the file system you want to delete.
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
}
object DeleteFileSystemRequest {
  
  inline def apply(FileSystemId: FileSystemId): DeleteFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFileSystemRequest] (val x: Self) extends AnyVal {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
