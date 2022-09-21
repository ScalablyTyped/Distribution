package typings.ahooks

import typings.ahooks.ahooksStrings.css
import typings.ahooks.ahooksStrings.js_
import typings.ahooks.anon.PartialHTMLScriptElement
import typings.ahooks.anon.PartialHTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useExternalMod {
  
  @JSImport("ahooks/lib/useExternal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Status]
  inline def default(path: String): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[Status]
  inline def default(path: String, options: Options): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Status]
  inline def default(path: Unit, options: Options): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Status]
  
  trait Options extends StObject {
    
    var css: js.UndefOr[PartialHTMLStyleElement] = js.undefined
    
    @JSName("js")
    var js_ : js.UndefOr[PartialHTMLScriptElement] = js.undefined
    
    var `type`: js.UndefOr[js_ | css] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCss(value: PartialHTMLStyleElement): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setJs_(value: PartialHTMLScriptElement): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setType(value: js_ | css): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ahooks.ahooksStrings.unset
    - typings.ahooks.ahooksStrings.loading
    - typings.ahooks.ahooksStrings.ready
    - typings.ahooks.ahooksStrings.error
  */
  trait Status extends StObject
  object Status {
    
    inline def error: typings.ahooks.ahooksStrings.error = "error".asInstanceOf[typings.ahooks.ahooksStrings.error]
    
    inline def loading: typings.ahooks.ahooksStrings.loading = "loading".asInstanceOf[typings.ahooks.ahooksStrings.loading]
    
    inline def ready: typings.ahooks.ahooksStrings.ready = "ready".asInstanceOf[typings.ahooks.ahooksStrings.ready]
    
    inline def unset: typings.ahooks.ahooksStrings.unset = "unset".asInstanceOf[typings.ahooks.ahooksStrings.unset]
  }
}
