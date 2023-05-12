package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProxySessionResponse extends StObject {
  
  /**
    * The proxy session details.
    */
  var ProxySession: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.ProxySession] = js.undefined
}
object GetProxySessionResponse {
  
  inline def apply(): GetProxySessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProxySessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProxySessionResponse] (val x: Self) extends AnyVal {
    
    inline def setProxySession(value: ProxySession): Self = StObject.set(x, "ProxySession", value.asInstanceOf[js.Any])
    
    inline def setProxySessionUndefined: Self = StObject.set(x, "ProxySession", js.undefined)
  }
}
