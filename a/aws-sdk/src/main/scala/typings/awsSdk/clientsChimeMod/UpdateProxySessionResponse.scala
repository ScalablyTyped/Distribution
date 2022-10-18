package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProxySessionResponse extends StObject {
  
  /**
    * The proxy session details.
    */
  var ProxySession: js.UndefOr[typings.awsSdk.clientsChimeMod.ProxySession] = js.undefined
}
object UpdateProxySessionResponse {
  
  inline def apply(): UpdateProxySessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProxySessionResponse]
  }
  
  extension [Self <: UpdateProxySessionResponse](x: Self) {
    
    inline def setProxySession(value: ProxySession): Self = StObject.set(x, "ProxySession", value.asInstanceOf[js.Any])
    
    inline def setProxySessionUndefined: Self = StObject.set(x, "ProxySession", js.undefined)
  }
}
