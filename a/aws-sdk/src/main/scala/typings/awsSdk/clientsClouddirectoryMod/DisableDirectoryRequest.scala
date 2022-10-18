package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDirectoryRequest extends StObject {
  
  /**
    * The ARN of the directory to disable.
    */
  var DirectoryArn: Arn
}
object DisableDirectoryRequest {
  
  inline def apply(DirectoryArn: Arn): DisableDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDirectoryRequest]
  }
  
  extension [Self <: DisableDirectoryRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
  }
}
