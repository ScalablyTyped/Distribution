package typings.authmosphere.authmosphereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere", "OAuthGrantType")
@js.native
object OAuthGrantType extends js.Object {
  /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with String = js.native
  /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with String = js.native
  /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with String = js.native
  /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType with String] = js.native
}

