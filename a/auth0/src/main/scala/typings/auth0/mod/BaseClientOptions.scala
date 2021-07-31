package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseClientOptions extends StObject {
  
  var baseUrl: String
  
  var clientId: js.UndefOr[String] = js.undefined
}
object BaseClientOptions {
  
  @scala.inline
  def apply(baseUrl: String): BaseClientOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseClientOptions]
  }
  
  @scala.inline
  implicit class BaseClientOptionsMutableBuilder[Self <: BaseClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
  }
}
