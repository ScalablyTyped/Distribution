package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorProxyResponse extends StObject {
  
  /**
    * The proxy configuration details.
    */
  var Proxy: js.UndefOr[typings.awsSdk.chimeMod.Proxy] = js.undefined
}
object GetVoiceConnectorProxyResponse {
  
  inline def apply(): GetVoiceConnectorProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorProxyResponse]
  }
  
  extension [Self <: GetVoiceConnectorProxyResponse](x: Self) {
    
    inline def setProxy(value: Proxy): Self = StObject.set(x, "Proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "Proxy", js.undefined)
  }
}
