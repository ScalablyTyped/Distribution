package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("authmosphere/lib/src/types", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.loggerMod.LogLevel & String] = js.native
    
    /* "debug" */ val debug: typings.authmosphere.loggerMod.LogLevel.debug & String = js.native
    
    /* "error" */ val error: typings.authmosphere.loggerMod.LogLevel.error & String = js.native
    
    /* "fatal" */ val fatal: typings.authmosphere.loggerMod.LogLevel.fatal & String = js.native
    
    /* "info" */ val info: typings.authmosphere.loggerMod.LogLevel.info & String = js.native
    
    /* "trace" */ val trace: typings.authmosphere.loggerMod.LogLevel.trace & String = js.native
    
    /* "warn" */ val warn: typings.authmosphere.loggerMod.LogLevel.warn & String = js.native
  }
  
  @JSImport("authmosphere/lib/src/types", "OAuthGrantType")
  @js.native
  object OAuthGrantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.oauthgranttypeMod.OAuthGrantType & String] = js.native
    
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT & String = js.native
    
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT & String = js.native
    
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT & String = js.native
    
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT & String = js.native
  }
}
