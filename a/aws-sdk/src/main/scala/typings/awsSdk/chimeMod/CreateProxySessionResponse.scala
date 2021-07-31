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
  
  @scala.inline
  def apply(): CreateProxySessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProxySessionResponse]
  }
  
  @scala.inline
  implicit class CreateProxySessionResponseMutableBuilder[Self <: CreateProxySessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxySession(value: ProxySession): Self = StObject.set(x, "ProxySession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxySessionUndefined: Self = StObject.set(x, "ProxySession", js.undefined)
  }
}
