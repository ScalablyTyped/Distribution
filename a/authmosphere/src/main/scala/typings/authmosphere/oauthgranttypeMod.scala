package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauthgranttypeMod {
  
  @js.native
  sealed trait OAuthGrantType extends StObject
  @JSImport("authmosphere/lib/src/types/OAuthGrantType", "OAuthGrantType")
  @js.native
  object OAuthGrantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OAuthGrantType with String] = js.native
    
    @js.native
    sealed trait AUTHORIZATION_CODE_GRANT extends OAuthGrantType
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with String = js.native
    
    @js.native
    sealed trait CLIENT_CREDENTIALS_GRANT extends OAuthGrantType
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with String = js.native
    
    @js.native
    sealed trait PASSWORD_CREDENTIALS_GRANT extends OAuthGrantType
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with String = js.native
    
    @js.native
    sealed trait REFRESH_TOKEN_GRANT extends OAuthGrantType
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with String = js.native
  }
}
