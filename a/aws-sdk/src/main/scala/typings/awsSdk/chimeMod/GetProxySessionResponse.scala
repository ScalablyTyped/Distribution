package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProxySessionResponse extends StObject {
  
  /**
    * The proxy session details.
    */
  var ProxySession: js.UndefOr[typings.awsSdk.chimeMod.ProxySession] = js.undefined
}
object GetProxySessionResponse {
  
  inline def apply(): GetProxySessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProxySessionResponse]
  }
  
  extension [Self <: GetProxySessionResponse](x: Self) {
    
    inline def setProxySession(value: ProxySession): Self = StObject.set(x, "ProxySession", value.asInstanceOf[js.Any])
    
    inline def setProxySessionUndefined: Self = StObject.set(x, "ProxySession", js.undefined)
  }
}
