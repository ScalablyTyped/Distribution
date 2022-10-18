package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectoryRequest extends StObject {
  
  /**
    * The ARN of the directory to delete.
    */
  var DirectoryArn: Arn
}
object DeleteDirectoryRequest {
  
  inline def apply(DirectoryArn: Arn): DeleteDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectoryRequest]
  }
  
  extension [Self <: DeleteDirectoryRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
  }
}
