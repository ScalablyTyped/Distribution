package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupPolicyRequest extends StObject {
  
  /**
    * Specifies which EFS file system to retrieve the BackupPolicy for.
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
}
object DescribeBackupPolicyRequest {
  
  inline def apply(FileSystemId: FileSystemId): DescribeBackupPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBackupPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
