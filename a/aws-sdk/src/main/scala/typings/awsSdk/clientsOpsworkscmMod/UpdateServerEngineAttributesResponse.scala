package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServerEngineAttributesResponse extends StObject {
  
  /**
    * Contains the response to an UpdateServerEngineAttributes request. 
    */
  var Server: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.Server] = js.undefined
}
object UpdateServerEngineAttributesResponse {
  
  inline def apply(): UpdateServerEngineAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServerEngineAttributesResponse]
  }
  
  extension [Self <: UpdateServerEngineAttributesResponse](x: Self) {
    
    inline def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
