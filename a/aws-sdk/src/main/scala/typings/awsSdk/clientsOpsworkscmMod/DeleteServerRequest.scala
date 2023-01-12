package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServerRequest extends StObject {
  
  /**
    * The ID of the server to delete.
    */
  var ServerName: typings.awsSdk.clientsOpsworkscmMod.ServerName
}
object DeleteServerRequest {
  
  inline def apply(ServerName: ServerName): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServerRequest] (val x: Self) extends AnyVal {
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
