package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServerResponse extends StObject {
  
  /**
    * The server that is created by the request. 
    */
  var Server: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.Server] = js.undefined
}
object CreateServerResponse {
  
  inline def apply(): CreateServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServerResponse] (val x: Self) extends AnyVal {
    
    inline def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
