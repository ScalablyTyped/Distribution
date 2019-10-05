package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types", JSImport.Namespace)
@js.native
object libSrcTypesMod extends js.Object {
  @js.native
  object LogLevel extends js.Object {
    /* "debug" */ val debug: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.debug with String = js.native
    /* "error" */ val error: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.error with String = js.native
    /* "fatal" */ val fatal: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.fatal with String = js.native
    /* "info" */ val info: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.info with String = js.native
    /* "trace" */ val trace: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.trace with String = js.native
    /* "warn" */ val warn: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.warn with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.libSrcTypesLoggerMod.LogLevel with String] = js.native
  }
  
  @js.native
  object OAuthGrantType extends js.Object {
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with String = js.native
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with String = js.native
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with String = js.native
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType with String] = js.native
  }
  
}

