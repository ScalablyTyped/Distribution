package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDirectoryLoginOptions
  extends StObject
     with LoginOptions {
  
  var audience: js.UndefOr[String] = js.undefined
}
object DefaultDirectoryLoginOptions {
  
  inline def apply(password: String, username: String): DefaultDirectoryLoginOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDirectoryLoginOptions]
  }
  
  extension [Self <: DefaultDirectoryLoginOptions](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
  }
}
