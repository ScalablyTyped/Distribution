package typings.adobeEsModulesMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adobe/es-modules-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def middleware(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")().asInstanceOf[NextHandleFunction]
  @scala.inline
  def middleware(options: MiddlewareOptions): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  trait MiddlewareOptions extends StObject {
    
    /** a map of url base path to file system path from which to serve files */
    var paths: StringDictionary[String]
  }
  object MiddlewareOptions {
    
    @scala.inline
    def apply(paths: StringDictionary[String]): MiddlewareOptions = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaths(value: StringDictionary[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object karmaAugmentingMod {
    
    trait ConfigOptions extends StObject {
      
      /**
        * used in Karma to aid in testing es-modules in the browser
        * see {@link https://github.com/adobe/es-modules-middleware}
        */
      var esModulesMiddleware: js.UndefOr[MiddlewareOptions] = js.undefined
    }
    object ConfigOptions {
      
      @scala.inline
      def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      @scala.inline
      implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEsModulesMiddleware(value: MiddlewareOptions): Self = StObject.set(x, "esModulesMiddleware", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEsModulesMiddlewareUndefined: Self = StObject.set(x, "esModulesMiddleware", js.undefined)
      }
    }
  }
}
