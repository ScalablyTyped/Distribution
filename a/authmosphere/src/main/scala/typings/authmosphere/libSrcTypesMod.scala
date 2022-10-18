package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesMod {
  
  @JSImport("authmosphere/lib/src/types", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.libSrcTypesLoggerMod.LogLevel & String] = js.native
    
    /* "debug" */ val debug: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.debug & String = js.native
    
    /* "error" */ val error: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.error & String = js.native
    
    /* "fatal" */ val fatal: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.fatal & String = js.native
    
    /* "info" */ val info: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.info & String = js.native
    
    /* "trace" */ val trace: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.trace & String = js.native
    
    /* "warn" */ val warn: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.warn & String = js.native
  }
  
  @JSImport("authmosphere/lib/src/types", "OAuthGrantType")
  @js.native
  object OAuthGrantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.libSrcTypesOauthgranttypeMod.OAuthGrantType & String] = js.native
    
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.libSrcTypesOauthgranttypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT & String = js.native
    
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOauthgranttypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT & String = js.native
    
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOauthgranttypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT & String = js.native
    
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.libSrcTypesOauthgranttypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT & String = js.native
  }
}
