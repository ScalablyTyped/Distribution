package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProxySessionsResponse extends StObject {
  
  /**
    * The token used to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The proxy sessions' details.
    */
  var ProxySessions: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.ProxySessions] = js.undefined
}
object ListProxySessionsResponse {
  
  inline def apply(): ListProxySessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProxySessionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProxySessionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProxySessions(value: ProxySessions): Self = StObject.set(x, "ProxySessions", value.asInstanceOf[js.Any])
    
    inline def setProxySessionsUndefined: Self = StObject.set(x, "ProxySessions", js.undefined)
    
    inline def setProxySessionsVarargs(value: ProxySession*): Self = StObject.set(x, "ProxySessions", js.Array(value*))
  }
}
