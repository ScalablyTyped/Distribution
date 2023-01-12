package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectSharedDirectoryRequest extends StObject {
  
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
    */
  var SharedDirectoryId: DirectoryId
}
object RejectSharedDirectoryRequest {
  
  inline def apply(SharedDirectoryId: DirectoryId): RejectSharedDirectoryRequest = {
    val __obj = js.Dynamic.literal(SharedDirectoryId = SharedDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectSharedDirectoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectSharedDirectoryRequest] (val x: Self) extends AnyVal {
    
    inline def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
  }
}
