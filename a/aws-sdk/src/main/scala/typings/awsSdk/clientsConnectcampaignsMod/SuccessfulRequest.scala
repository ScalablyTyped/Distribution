package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessfulRequest extends StObject {
  
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  var id: js.UndefOr[DialRequestId] = js.undefined
}
object SuccessfulRequest {
  
  inline def apply(): SuccessfulRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessfulRequest]
  }
  
  extension [Self <: SuccessfulRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setId(value: DialRequestId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
