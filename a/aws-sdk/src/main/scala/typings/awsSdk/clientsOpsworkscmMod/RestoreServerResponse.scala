package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreServerResponse extends StObject {
  
  var Server: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.Server] = js.undefined
}
object RestoreServerResponse {
  
  inline def apply(): RestoreServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreServerResponse]
  }
  
  extension [Self <: RestoreServerResponse](x: Self) {
    
    inline def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
