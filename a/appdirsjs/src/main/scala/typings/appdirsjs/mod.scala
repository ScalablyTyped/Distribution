package typings.appdirsjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("appdirsjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): Directories = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Directories]
  
  trait Directories extends StObject {
    
    var cache: String
    
    var config: String
    
    var data: String
    
    var runtime: js.UndefOr[String] = js.undefined
  }
  object Directories {
    
    inline def apply(cache: String, config: String, data: String): Directories = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directories]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Directories] (val x: Self) extends AnyVal {
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var appName: String
    
    var legacyPath: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(appName: String): Options = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setLegacyPath(value: String): Self = StObject.set(x, "legacyPath", value.asInstanceOf[js.Any])
      
      inline def setLegacyPathUndefined: Self = StObject.set(x, "legacyPath", js.undefined)
    }
  }
}
