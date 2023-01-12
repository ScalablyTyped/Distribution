package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableDirectoryRequest extends StObject {
  
  /**
    * The ARN of the directory to enable.
    */
  var DirectoryArn: Arn
}
object EnableDirectoryRequest {
  
  inline def apply(DirectoryArn: Arn): EnableDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDirectoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableDirectoryRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
  }
}
