package typings
package authmosphereLib.authmosphereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere", "OAuthGrantType")
@js.native
object OAuthGrantType extends js.Object {
  /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with java.lang.String = js.native
  /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with java.lang.String = js.native
  /* "password" */ val PASSWORD_CREDENTIALS_GRANT: authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with java.lang.String = js.native
  /* "refresh_token" */ val REFRESH_TOKEN_GRANT: authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    authmosphereLib.libSrcTypesOAuthGrantTypeMod.OAuthGrantType with java.lang.String
  ] = js.native
}

