package typings.atomically

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsLangMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/lang", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def isFunction(x: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    inline def isString(x: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(x.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def isUndefined(x: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(x.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  }
}
