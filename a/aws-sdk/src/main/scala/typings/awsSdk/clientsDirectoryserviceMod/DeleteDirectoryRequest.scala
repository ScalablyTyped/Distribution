package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectoryRequest extends StObject {
  
  /**
    * The identifier of the directory to delete.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
}
object DeleteDirectoryRequest {
  
  inline def apply(DirectoryId: DirectoryId): DeleteDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectoryRequest]
  }
  
  extension [Self <: DeleteDirectoryRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
