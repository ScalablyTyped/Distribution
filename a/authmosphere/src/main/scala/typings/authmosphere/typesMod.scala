package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("authmosphere/lib/src/types", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.loggerMod.LogLevel with String] = js.native
    
    /* "debug" */ val debug: typings.authmosphere.loggerMod.LogLevel.debug with String = js.native
    
    /* "error" */ val error: typings.authmosphere.loggerMod.LogLevel.error with String = js.native
    
    /* "fatal" */ val fatal: typings.authmosphere.loggerMod.LogLevel.fatal with String = js.native
    
    /* "info" */ val info: typings.authmosphere.loggerMod.LogLevel.info with String = js.native
    
    /* "trace" */ val trace: typings.authmosphere.loggerMod.LogLevel.trace with String = js.native
    
    /* "warn" */ val warn: typings.authmosphere.loggerMod.LogLevel.warn with String = js.native
  }
  
  @JSImport("authmosphere/lib/src/types", "OAuthGrantType")
  @js.native
  object OAuthGrantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.oauthgranttypeMod.OAuthGrantType with String] = js.native
    
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with String = js.native
    
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with String = js.native
    
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with String = js.native
    
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with String = js.native
  }
}
