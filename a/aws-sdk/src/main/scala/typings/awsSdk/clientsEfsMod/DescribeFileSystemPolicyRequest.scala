package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemPolicyRequest extends StObject {
  
  /**
    * Specifies which EFS file system to retrieve the FileSystemPolicy for.
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
}
object DescribeFileSystemPolicyRequest {
  
  inline def apply(FileSystemId: FileSystemId): DescribeFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFileSystemPolicyRequest]
  }
  
  extension [Self <: DescribeFileSystemPolicyRequest](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
