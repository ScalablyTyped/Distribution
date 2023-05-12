package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProxySessionResponse extends StObject {
  
  /**
    * The updated proxy session details.
    */
  var ProxySession: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.ProxySession] = js.undefined
}
object UpdateProxySessionResponse {
  
  inline def apply(): UpdateProxySessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProxySessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProxySessionResponse] (val x: Self) extends AnyVal {
    
    inline def setProxySession(value: ProxySession): Self = StObject.set(x, "ProxySession", value.asInstanceOf[js.Any])
    
    inline def setProxySessionUndefined: Self = StObject.set(x, "ProxySession", js.undefined)
  }
}
