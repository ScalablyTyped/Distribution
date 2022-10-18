package typings.ajv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRuntimeQuoteMod {
  
  object default {
    
    inline def apply(s: String): String = ^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("ajv/dist/runtime/quote", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/runtime/quote", "default.code")
    @js.native
    def code: String = js.native
    inline def code_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
  }
}
