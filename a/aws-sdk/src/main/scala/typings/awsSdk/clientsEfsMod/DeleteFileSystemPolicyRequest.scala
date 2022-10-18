package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemPolicyRequest extends StObject {
  
  /**
    * Specifies the EFS file system for which to delete the FileSystemPolicy.
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
}
object DeleteFileSystemPolicyRequest {
  
  inline def apply(FileSystemId: FileSystemId): DeleteFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemPolicyRequest]
  }
  
  extension [Self <: DeleteFileSystemPolicyRequest](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
