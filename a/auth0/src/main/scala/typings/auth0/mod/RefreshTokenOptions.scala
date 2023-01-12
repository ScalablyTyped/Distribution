package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshTokenOptions extends StObject {
  
  var refresh_token: String
}
object RefreshTokenOptions {
  
  inline def apply(refresh_token: String): RefreshTokenOptions = {
    val __obj = js.Dynamic.literal(refresh_token = refresh_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTokenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshTokenOptions] (val x: Self) extends AnyVal {
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
  }
}
