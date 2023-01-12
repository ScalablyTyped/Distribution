package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedRequest extends StObject {
  
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  var failureCode: js.UndefOr[FailureCode] = js.undefined
  
  var id: js.UndefOr[DialRequestId] = js.undefined
}
object FailedRequest {
  
  inline def apply(): FailedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setFailureCode(value: FailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setId(value: DialRequestId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
