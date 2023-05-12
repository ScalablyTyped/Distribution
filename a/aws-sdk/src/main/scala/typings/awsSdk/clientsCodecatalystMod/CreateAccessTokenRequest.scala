package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessTokenRequest extends StObject {
  
  /**
    * The date and time the personal access token expires, in coordinated universal time (UTC) timestamp format as specified in RFC 3339.
    */
  var expiresTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The friendly name of the personal access token.
    */
  var name: AccessTokenName
}
object CreateAccessTokenRequest {
  
  inline def apply(name: AccessTokenName): CreateAccessTokenRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setExpiresTime(value: js.Date): Self = StObject.set(x, "expiresTime", value.asInstanceOf[js.Any])
    
    inline def setExpiresTimeUndefined: Self = StObject.set(x, "expiresTime", js.undefined)
    
    inline def setName(value: AccessTokenName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
