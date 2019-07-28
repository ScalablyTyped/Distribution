package typings.authmosphere.libSrcTypesOAuthGrantTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OAuthGrantType extends js.Object

@JSImport("authmosphere/lib/src/types/OAuthGrantType", "OAuthGrantType")
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
  
  /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with String = js.native
  /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with String = js.native
  /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with String = js.native
  /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OAuthGrantType with String] = js.native
}

