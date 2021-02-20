package typings.adobeEsModulesMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adobe/es-modules-middleware", "middleware")
  @js.native
  def middleware(): NextHandleFunction = js.native
  @JSImport("@adobe/es-modules-middleware", "middleware")
  @js.native
  def middleware(options: MiddlewareOptions): NextHandleFunction = js.native
  
  @js.native
  trait MiddlewareOptions extends StObject {
    
    /** a map of url base path to file system path from which to serve files */
    var paths: StringDictionary[String] = js.native
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
    
    @js.native
    trait ConfigOptions extends StObject {
      
      /**
        * used in Karma to aid in testing es-modules in the browser
        * see {@link https://github.com/adobe/es-modules-middleware}
        */
      var esModulesMiddleware: js.UndefOr[MiddlewareOptions] = js.native
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
