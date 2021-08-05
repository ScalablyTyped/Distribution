package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0ParseHashError
  extends StObject
     with Auth0Error {
  
  var state: js.UndefOr[String] = js.undefined
}
object Auth0ParseHashError {
  
  inline def apply(error: LibErrorCodes | SpecErrorCodes | String): Auth0ParseHashError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0ParseHashError]
  }
  
  extension [Self <: Auth0ParseHashError](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
