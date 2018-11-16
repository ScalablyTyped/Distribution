package typings
package authmosphereLib.libSrcTypesOAuthGrantTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OAuthGrantType extends js.Object

@JSImport("authmosphere/lib/src/types/OAuthGrantType", "OAuthGrantType")
@js.native
object OAuthGrantType extends js.Object {
  @js.native
  sealed trait AUTHORIZATION_CODE_GRANT
    extends authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType
  
  @js.native
  sealed trait CLIENT_CREDENTIALS_GRANT
    extends authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType
  
  @js.native
  sealed trait PASSWORD_CREDENTIALS_GRANT
    extends authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType
  
  @js.native
  sealed trait REFRESH_TOKEN_GRANT
    extends authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType
  
  /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: AUTHORIZATION_CODE_GRANT with java.lang.String = js.native
  /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: CLIENT_CREDENTIALS_GRANT with java.lang.String = js.native
  /* "password" */ val PASSWORD_CREDENTIALS_GRANT: PASSWORD_CREDENTIALS_GRANT with java.lang.String = js.native
  /* "refresh_token" */ val REFRESH_TOKEN_GRANT: REFRESH_TOKEN_GRANT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType with java.lang.String
  ] = js.native
}

