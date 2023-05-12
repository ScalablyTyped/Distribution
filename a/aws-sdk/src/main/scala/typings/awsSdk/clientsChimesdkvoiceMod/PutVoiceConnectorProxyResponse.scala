package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorProxyResponse extends StObject {
  
  /**
    * The proxy configuration details.
    */
  var Proxy: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.Proxy] = js.undefined
}
object PutVoiceConnectorProxyResponse {
  
  inline def apply(): PutVoiceConnectorProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorProxyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorProxyResponse] (val x: Self) extends AnyVal {
    
    inline def setProxy(value: Proxy): Self = StObject.set(x, "Proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "Proxy", js.undefined)
  }
}
