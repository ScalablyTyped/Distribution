package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenValidityUnitsType extends StObject {
  
  /**
    *  A time unit of seconds, minutes, hours, or days for the value that you set in the AccessTokenValidity parameter. The default AccessTokenValidity time unit is hours.
    */
  var AccessToken: js.UndefOr[TimeUnitsType] = js.undefined
  
  /**
    * A time unit of seconds, minutes, hours, or days for the value that you set in the IdTokenValidity parameter. The default IdTokenValidity time unit is hours.
    */
  var IdToken: js.UndefOr[TimeUnitsType] = js.undefined
  
  /**
    * A time unit of seconds, minutes, hours, or days for the value that you set in the RefreshTokenValidity parameter. The default RefreshTokenValidity time unit is days.
    */
  var RefreshToken: js.UndefOr[TimeUnitsType] = js.undefined
}
object TokenValidityUnitsType {
  
  inline def apply(): TokenValidityUnitsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenValidityUnitsType]
  }
  
  extension [Self <: TokenValidityUnitsType](x: Self) {
    
    inline def setAccessToken(value: TimeUnitsType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    inline def setIdToken(value: TimeUnitsType): Self = StObject.set(x, "IdToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "IdToken", js.undefined)
    
    inline def setRefreshToken(value: TimeUnitsType): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "RefreshToken", js.undefined)
  }
}
