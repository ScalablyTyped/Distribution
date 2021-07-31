package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorProxyResponse extends StObject {
  
  /**
    * The proxy configuration details.
    */
  var Proxy: js.UndefOr[typings.awsSdk.chimeMod.Proxy] = js.undefined
}
object PutVoiceConnectorProxyResponse {
  
  @scala.inline
  def apply(): PutVoiceConnectorProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorProxyResponse]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorProxyResponseMutableBuilder[Self <: PutVoiceConnectorProxyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxy(value: Proxy): Self = StObject.set(x, "Proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "Proxy", js.undefined)
  }
}
