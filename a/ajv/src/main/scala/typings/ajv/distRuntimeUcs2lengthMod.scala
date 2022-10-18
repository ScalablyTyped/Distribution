package typings.ajv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRuntimeUcs2lengthMod {
  
  object default {
    
    inline def apply(str: String): Double = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("ajv/dist/runtime/ucs2length", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/runtime/ucs2length", "default.code")
    @js.native
    def code: String = js.native
    inline def code_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
  }
}
