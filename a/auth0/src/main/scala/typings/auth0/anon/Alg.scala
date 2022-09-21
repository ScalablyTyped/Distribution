package typings.auth0.anon

import typings.auth0.auth0Strings.HS256
import typings.auth0.auth0Strings.RS256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alg extends StObject {
  
  // The algorithm used to sign the JsonWebToken
  var alg: js.UndefOr[HS256 | RS256] = js.undefined
  
  // The amount of time (in seconds) that the token will be valid after being issued
  var lifetime_in_seconds: js.UndefOr[Double] = js.undefined
  
  var scopes: js.UndefOr[js.Object] = js.undefined
}
object Alg {
  
  inline def apply(): Alg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alg]
  }
  
  extension [Self <: Alg](x: Self) {
    
    inline def setAlg(value: HS256 | RS256): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setLifetime_in_seconds(value: Double): Self = StObject.set(x, "lifetime_in_seconds", value.asInstanceOf[js.Any])
    
    inline def setLifetime_in_secondsUndefined: Self = StObject.set(x, "lifetime_in_seconds", js.undefined)
    
    inline def setScopes(value: js.Object): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
  }
}
