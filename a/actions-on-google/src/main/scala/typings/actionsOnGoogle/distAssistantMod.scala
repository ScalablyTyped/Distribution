package typings.actionsOnGoogle

import typings.actionsOnGoogle.distCommonMod.JsonObject
import typings.actionsOnGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
import typings.actionsOnGoogle.distFrameworkFrameworkMod.BuiltinFrameworks
import typings.actionsOnGoogle.distFrameworkFrameworkMod.Headers
import typings.actionsOnGoogle.distFrameworkFrameworkMod.OmniHandler
import typings.actionsOnGoogle.distFrameworkFrameworkMod.StandardHandler
import typings.actionsOnGoogle.distFrameworkFrameworkMod.StandardResponse
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssistantMod {
  
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
      arg1: /* request */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      arg2: /* response */ Response_[Any, Record[String, Any]]
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
      use: Plugin[Any, Any] => BaseApp & Any
    ): BaseApp = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], frameworks = frameworks.asInstanceOf[js.Any], handler = js.Any.fromFunction3(handler), use = js.Any.fromFunction1(use))
      __obj.asInstanceOf[BaseApp]
    }
    
    extension [Self <: BaseApp](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setFrameworks(value: BuiltinFrameworks): Self = StObject.set(x, "frameworks", value.asInstanceOf[js.Any])
      
      inline def setUse(value: Plugin[Any, Any] => BaseApp & Any): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    }
  }
  
  type Plugin[TService, TPlugin] = js.Function1[
    /* app */ AppHandler & TService & Any, 
    (AppHandler & TService & Any & TPlugin) | Unit
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
