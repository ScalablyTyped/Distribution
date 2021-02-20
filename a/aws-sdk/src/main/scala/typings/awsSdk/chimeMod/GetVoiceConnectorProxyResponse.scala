package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorProxyResponse extends StObject {
  
  /**
    * The proxy configuration details.
    */
  var Proxy: js.UndefOr[typings.awsSdk.chimeMod.Proxy] = js.native
}
object GetVoiceConnectorProxyResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorProxyResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorProxyResponseMutableBuilder[Self <: GetVoiceConnectorProxyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxy(value: Proxy): Self = StObject.set(x, "Proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "Proxy", js.undefined)
  }
}
