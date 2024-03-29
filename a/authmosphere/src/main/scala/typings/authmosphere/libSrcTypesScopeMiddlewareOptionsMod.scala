package typings.authmosphere

import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.authmosphere.libSrcTypesPrecedenceMod.PrecedenceOptions
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesScopeMiddlewareOptionsMod {
  
  trait ScopeMiddlewareOptions extends StObject {
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var onAuthorizationFailedHandler: js.UndefOr[
        typings.authmosphere.libSrcTypesScopeMiddlewareOptionsMod.onAuthorizationFailedHandler
      ] = js.undefined
    
    var precedenceOptions: js.UndefOr[PrecedenceOptions] = js.undefined
  }
  object ScopeMiddlewareOptions {
    
    inline def apply(): ScopeMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScopeMiddlewareOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScopeMiddlewareOptions] (val x: Self) extends AnyVal {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setOnAuthorizationFailedHandler(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* resonse */ Response_[Any, Record[String, Any]], /* next */ NextFunction, /* scopes */ js.Array[String], /* logger */ Logger) => Unit
      ): Self = StObject.set(x, "onAuthorizationFailedHandler", js.Any.fromFunction5(value))
      
      inline def setOnAuthorizationFailedHandlerUndefined: Self = StObject.set(x, "onAuthorizationFailedHandler", js.undefined)
      
      inline def setPrecedenceOptions(value: PrecedenceOptions): Self = StObject.set(x, "precedenceOptions", value.asInstanceOf[js.Any])
      
      inline def setPrecedenceOptionsUndefined: Self = StObject.set(x, "precedenceOptions", js.undefined)
    }
  }
  
  type onAuthorizationFailedHandler = js.Function5[
    /* request */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resonse */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    /* scopes */ js.Array[String], 
    /* logger */ Logger, 
    Unit
  ]
}
