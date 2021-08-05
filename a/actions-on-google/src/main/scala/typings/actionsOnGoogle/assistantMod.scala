package typings.actionsOnGoogle

import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata
import typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworks
import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import typings.actionsOnGoogle.frameworkFrameworkMod.OmniHandler
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardHandler
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardResponse
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assistantMod {
  
  @JSImport("actions-on-google/dist/assistant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach[TService](service: TService): OmniHandler & BaseApp & TService = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(service.asInstanceOf[js.Any]).asInstanceOf[OmniHandler & BaseApp & TService]
  inline def attach[TService](service: TService, options: AppOptions): OmniHandler & BaseApp & TService = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OmniHandler & BaseApp & TService]
  
  @js.native
  trait AppHandler
    extends OmniHandler
       with BaseApp {
    
    /* InferMemberOverrides */
    override def apply(
      arg1: /* body */ JsonObject,
      arg2: /* headers */ Headers,
      arg3: /* metadata */ js.UndefOr[BuiltinFrameworkMetadata]
    ): js.Promise[StandardResponse] = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query],
      arg2: /* response */ Response_[js.Any]
    ): Unit = js.native
  }
  
  trait AppOptions extends StObject {
    
    /** @public */
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object AppOptions {
    
    inline def apply(): AppOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppOptions]
    }
    
    extension [Self <: AppOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  trait BaseApp
    extends StObject
       with ServiceBaseApp {
    
    /** @public */
    var debug: Boolean
    
    /** @public */
    var frameworks: BuiltinFrameworks
    
    /** @public */
    def use[TService, TPlugin](plugin: Plugin[TService, TPlugin]): this.type & TPlugin
  }
  object BaseApp {
    
    inline def apply(
      debug: Boolean,
      frameworks: BuiltinFrameworks,
      handler: (/* body */ JsonObject, /* headers */ Headers, /* metadata */ js.UndefOr[BuiltinFrameworkMetadata]) => js.Promise[StandardResponse],
      use: Plugin[js.Any, js.Any] => BaseApp & js.Any
    ): BaseApp = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], frameworks = frameworks.asInstanceOf[js.Any], handler = js.Any.fromFunction3(handler), use = js.Any.fromFunction1(use))
      __obj.asInstanceOf[BaseApp]
    }
    
    extension [Self <: BaseApp](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setFrameworks(value: BuiltinFrameworks): Self = StObject.set(x, "frameworks", value.asInstanceOf[js.Any])
      
      inline def setUse(value: Plugin[js.Any, js.Any] => BaseApp & js.Any): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    }
  }
  
  type Plugin[TService, TPlugin] = js.Function1[
    /* app */ AppHandler & TService & js.Any, 
    (AppHandler & TService & js.Any & TPlugin) | Unit
  ]
  
  trait ServiceBaseApp extends StObject {
    
    /** @public */
    def handler(/** @public */
    body: JsonObject, /** @public */
    headers: Headers): js.Promise[StandardResponse]
    def handler(
      /** @public */
    body: JsonObject,
      /** @public */
    headers: Headers,
      /** @public */
    metadata: BuiltinFrameworkMetadata
    ): js.Promise[StandardResponse]
    /** @public */
    @JSName("handler")
    var handler_Original: StandardHandler
  }
  object ServiceBaseApp {
    
    inline def apply(
      handler: (/* body */ JsonObject, /* headers */ Headers, /* metadata */ js.UndefOr[BuiltinFrameworkMetadata]) => js.Promise[StandardResponse]
    ): ServiceBaseApp = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction3(handler))
      __obj.asInstanceOf[ServiceBaseApp]
    }
    
    extension [Self <: ServiceBaseApp](x: Self) {
      
      inline def setHandler(
        value: (/* body */ JsonObject, /* headers */ Headers, /* metadata */ js.UndefOr[BuiltinFrameworkMetadata]) => js.Promise[StandardResponse]
      ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
    }
  }
}
