package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessTokenResponse extends StObject {
  
  /**
    * The system-generated unique ID of the access token.
    */
  var accessTokenId: AccessTokenId
  
  /**
    * The date and time the personal access token expires, in coordinated universal time (UTC) timestamp format as specified in RFC 3339. If not specified, the default is one year from creation.
    */
  var expiresTime: js.Date
  
  /**
    * The friendly name of the personal access token.
    */
  var name: AccessTokenName
  
  /**
    * The secret value of the personal access token.
    */
  var secret: AccessTokenSecret
}
object CreateAccessTokenResponse {
  
  inline def apply(
    accessTokenId: AccessTokenId,
    expiresTime: js.Date,
    name: AccessTokenName,
    secret: AccessTokenSecret
  ): CreateAccessTokenResponse = {
    val __obj = js.Dynamic.literal(accessTokenId = accessTokenId.asInstanceOf[js.Any], expiresTime = expiresTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessTokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessTokenId(value: AccessTokenId): Self = StObject.set(x, "accessTokenId", value.asInstanceOf[js.Any])
    
    inline def setExpiresTime(value: js.Date): Self = StObject.set(x, "expiresTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: AccessTokenName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: AccessTokenSecret): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
  }
}
