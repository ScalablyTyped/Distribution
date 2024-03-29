package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDirectoryResponse extends StObject {
  
  /**
    * The ARN of the directory that has been disabled.
    */
  var DirectoryArn: Arn
}
object DisableDirectoryResponse {
  
  inline def apply(DirectoryArn: Arn): DisableDirectoryResponse = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDirectoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableDirectoryResponse] (val x: Self) extends AnyVal {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
  }
}
