package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesOauthgranttypeMod {
  
  @js.native
  sealed trait OAuthGrantType extends StObject
  @JSImport("authmosphere/lib/src/types/OAuthGrantType", "OAuthGrantType")
  @js.native
  object OAuthGrantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OAuthGrantType & String] = js.native
    
    @js.native
    sealed trait AUTHORIZATION_CODE_GRANT
      extends StObject
         with OAuthGrantType
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.libSrcTypesOauthgranttypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT & String = js.native
    
    @js.native
    sealed trait CLIENT_CREDENTIALS_GRANT
      extends StObject
         with OAuthGrantType
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOauthgranttypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT & String = js.native
    
    @js.native
    sealed trait PASSWORD_CREDENTIALS_GRANT
      extends StObject
         with OAuthGrantType
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOauthgranttypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT & String = js.native
    
    @js.native
    sealed trait REFRESH_TOKEN_GRANT
      extends StObject
         with OAuthGrantType
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.libSrcTypesOauthgranttypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT & String = js.native
  }
}
