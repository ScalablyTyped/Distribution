package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProxySessionsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The proxy session details.
    */
  var ProxySessions: js.UndefOr[typings.awsSdk.chimeMod.ProxySessions] = js.undefined
}
object ListProxySessionsResponse {
  
  inline def apply(): ListProxySessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProxySessionsResponse]
  }
  
  extension [Self <: ListProxySessionsResponse](x: Self) {
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProxySessions(value: ProxySessions): Self = StObject.set(x, "ProxySessions", value.asInstanceOf[js.Any])
    
    inline def setProxySessionsUndefined: Self = StObject.set(x, "ProxySessions", js.undefined)
    
    inline def setProxySessionsVarargs(value: ProxySession*): Self = StObject.set(x, "ProxySessions", js.Array(value :_*))
  }
}
