package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLifecycleConfigurationRequest extends StObject {
  
  /**
    * The ID of the file system whose LifecycleConfiguration object you want to retrieve (String).
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
}
object DescribeLifecycleConfigurationRequest {
  
  inline def apply(FileSystemId: FileSystemId): DescribeLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLifecycleConfigurationRequest]
  }
  
  extension [Self <: DescribeLifecycleConfigurationRequest](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
