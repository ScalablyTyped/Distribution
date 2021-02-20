package typings.actionsOnGoogle

import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata
import typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworks
import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import typings.actionsOnGoogle.frameworkFrameworkMod.OmniHandler
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardHandler
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assistantMod {
  
  @JSImport("actions-on-google/dist/assistant", "attach")
  @js.native
  def attach[TService](service: TService): OmniHandler with BaseApp with TService = js.native
  @JSImport("actions-on-google/dist/assistant", "attach")
  @js.native
  def attach[TService](service: TService, options: AppOptions): OmniHandler with BaseApp with TService = js.native
  
  type AppHandler = OmniHandler with BaseApp
  
  @js.native
  trait AppOptions extends StObject {
    
    /** @public */
    var debug: js.UndefOr[Boolean] = js.native
  }
  object AppOptions {
    
    @scala.inline
    def apply(): AppOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppOptions]
    }
    
    @scala.inline
    implicit class AppOptionsMutableBuilder[Self <: AppOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  @js.native
  trait BaseApp extends ServiceBaseApp {
    
    /** @public */
    var debug: Boolean = js.native
    
    /** @public */
    var frameworks: BuiltinFrameworks = js.native
    
    /** @public */
    def use[TService, TPlugin](plugin: Plugin[TService, TPlugin]): this.type with TPlugin = js.native
  }
  
  type Plugin[TService, TPlugin] = js.Function1[
    /* app */ AppHandler with TService with js.Any, 
    (AppHandler with TService with js.Any with TPlugin) | Unit
  ]
  
  @js.native
  trait ServiceBaseApp extends StObject {
    
    /** @public */
    def handler(/** @public */
    body: JsonObject, /** @public */
    headers: Headers): js.Promise[StandardResponse] = js.native
    def handler(
      /** @public */
    body: JsonObject,
      /** @public */
    headers: Headers,
      /** @public */
    metadata: BuiltinFrameworkMetadata
    ): js.Promise[StandardResponse] = js.native
    /** @public */
    @JSName("handler")
    var handler_Original: StandardHandler = js.native
  }
}
