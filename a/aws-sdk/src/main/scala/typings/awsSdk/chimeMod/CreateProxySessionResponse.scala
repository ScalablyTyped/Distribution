package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProxySessionResponse extends StObject {
  
  /**
    * The proxy session details.
    */
  var ProxySession: js.UndefOr[typings.awsSdk.chimeMod.ProxySession] = js.undefined
}
object CreateProxySessionResponse {
  
  inline def apply(): CreateProxySessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProxySessionResponse]
  }
  
  extension [Self <: CreateProxySessionResponse](x: Self) {
    
    inline def setProxySession(value: ProxySession): Self = StObject.set(x, "ProxySession", value.asInstanceOf[js.Any])
    
    inline def setProxySessionUndefined: Self = StObject.set(x, "ProxySession", js.undefined)
  }
}
