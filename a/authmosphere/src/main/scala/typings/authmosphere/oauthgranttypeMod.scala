package typings.authmosphere

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/OAuthGrantType", JSImport.Namespace)
@js.native
object oauthgranttypeMod extends js.Object {
  @js.native
  sealed trait OAuthGrantType extends js.Object
  
  @js.native
  object OAuthGrantType extends js.Object {
    @js.native
    sealed trait AUTHORIZATION_CODE_GRANT extends OAuthGrantType
    
    @js.native
    sealed trait CLIENT_CREDENTIALS_GRANT extends OAuthGrantType
    
    @js.native
    sealed trait PASSWORD_CREDENTIALS_GRANT extends OAuthGrantType
    
    @js.native
    sealed trait REFRESH_TOKEN_GRANT extends OAuthGrantType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OAuthGrantType with String] = js.native
    /* "authorization_code" */ @js.native
    object AUTHORIZATION_CODE_GRANT extends TopLevel[AUTHORIZATION_CODE_GRANT with String]
    
    /* "client_credentials" */ @js.native
    object CLIENT_CREDENTIALS_GRANT extends TopLevel[CLIENT_CREDENTIALS_GRANT with String]
    
    /* "password" */ @js.native
    object PASSWORD_CREDENTIALS_GRANT extends TopLevel[PASSWORD_CREDENTIALS_GRANT with String]
    
    /* "refresh_token" */ @js.native
    object REFRESH_TOKEN_GRANT extends TopLevel[REFRESH_TOKEN_GRANT with String]
    
  }
  
}

