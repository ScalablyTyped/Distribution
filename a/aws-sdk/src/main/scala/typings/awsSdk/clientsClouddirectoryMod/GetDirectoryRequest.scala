package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDirectoryRequest extends StObject {
  
  /**
    * The ARN of the directory.
    */
  var DirectoryArn: typings.awsSdk.clientsClouddirectoryMod.DirectoryArn
}
object GetDirectoryRequest {
  
  inline def apply(DirectoryArn: DirectoryArn): GetDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDirectoryRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryArn(value: DirectoryArn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
  }
}
