package typings.authmosphere

import typings.authmosphere.loggerMod.Logger
import typings.authmosphere.precedenceMod.PrecedenceOptions
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopeMiddlewareOptionsMod {
  
  trait ScopeMiddlewareOptions extends StObject {
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var onAuthorizationFailedHandler: js.UndefOr[typings.authmosphere.scopeMiddlewareOptionsMod.onAuthorizationFailedHandler] = js.undefined
    
    var precedenceOptions: js.UndefOr[PrecedenceOptions] = js.undefined
  }
  object ScopeMiddlewareOptions {
    
    @scala.inline
    def apply(): ScopeMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScopeMiddlewareOptions]
    }
    
    @scala.inline
    implicit class ScopeMiddlewareOptionsMutableBuilder[Self <: ScopeMiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setOnAuthorizationFailedHandler(
        value: (/* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* resonse */ Response_[js.Any], /* next */ NextFunction, /* scopes */ js.Array[String], /* logger */ Logger) => Unit
      ): Self = StObject.set(x, "onAuthorizationFailedHandler", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnAuthorizationFailedHandlerUndefined: Self = StObject.set(x, "onAuthorizationFailedHandler", js.undefined)
      
      @scala.inline
      def setPrecedenceOptions(value: PrecedenceOptions): Self = StObject.set(x, "precedenceOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecedenceOptionsUndefined: Self = StObject.set(x, "precedenceOptions", js.undefined)
    }
  }
  
  type onAuthorizationFailedHandler = js.Function5[
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* resonse */ Response_[js.Any], 
    /* next */ NextFunction, 
    /* scopes */ js.Array[String], 
    /* logger */ Logger, 
    Unit
  ]
}
