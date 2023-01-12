package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshTokenRequestBody extends StObject {
  
  /**
    * The token to use to refresh a previously issued access token that might have expired.
    */
  var token: SensitiveString
}
object RefreshTokenRequestBody {
  
  inline def apply(token: SensitiveString): RefreshTokenRequestBody = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTokenRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshTokenRequestBody] (val x: Self) extends AnyVal {
    
    inline def setToken(value: SensitiveString): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
