package typings.authmosphere

import typings.authmosphere.getTokenInfoMod.GetTokenInfo
import typings.authmosphere.loggerMod.Logger
import typings.authmosphere.tokenMod.Token
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticationMiddlewareOptionsMod {
  
  trait AuthenticationMiddlewareOptions extends StObject {
    
    var getTokenInfo: js.UndefOr[GetTokenInfo[Record[String, js.Any]]] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var onNotAuthenticatedHandler: js.UndefOr[
        typings.authmosphere.authenticationMiddlewareOptionsMod.onNotAuthenticatedHandler
      ] = js.undefined
    
    var publicEndpoints: js.UndefOr[js.Array[String]] = js.undefined
    
    var tokenInfoEndpoint: String
  }
  object AuthenticationMiddlewareOptions {
    
    inline def apply(tokenInfoEndpoint: String): AuthenticationMiddlewareOptions = {
      val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationMiddlewareOptions]
    }
    
    extension [Self <: AuthenticationMiddlewareOptions](x: Self) {
      
      inline def setGetTokenInfo(
        value: (/* tokenInfoUrl */ String, /* accessToken */ String, /* logger */ js.UndefOr[Logger]) => js.Promise[Token[Record[String, js.Any]]]
      ): Self = StObject.set(x, "getTokenInfo", js.Any.fromFunction3(value))
      
      inline def setGetTokenInfoUndefined: Self = StObject.set(x, "getTokenInfo", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setOnNotAuthenticatedHandler(
        value: (/* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* resonse */ Response_[js.Any], /* next */ NextFunction, /* logger */ Logger) => Unit
      ): Self = StObject.set(x, "onNotAuthenticatedHandler", js.Any.fromFunction4(value))
      
      inline def setOnNotAuthenticatedHandlerUndefined: Self = StObject.set(x, "onNotAuthenticatedHandler", js.undefined)
      
      inline def setPublicEndpoints(value: js.Array[String]): Self = StObject.set(x, "publicEndpoints", value.asInstanceOf[js.Any])
      
      inline def setPublicEndpointsUndefined: Self = StObject.set(x, "publicEndpoints", js.undefined)
      
      inline def setPublicEndpointsVarargs(value: String*): Self = StObject.set(x, "publicEndpoints", js.Array(value :_*))
      
      inline def setTokenInfoEndpoint(value: String): Self = StObject.set(x, "tokenInfoEndpoint", value.asInstanceOf[js.Any])
    }
  }
  
  type onNotAuthenticatedHandler = js.Function4[
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* resonse */ Response_[js.Any], 
    /* next */ NextFunction, 
    /* logger */ Logger, 
    Unit
  ]
}
