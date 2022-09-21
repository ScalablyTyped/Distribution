package typings.ajv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timestampMod {
  
  object default {
    
    inline def apply(str: String, allowDate: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], allowDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("ajv/dist/runtime/timestamp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/runtime/timestamp", "default.code")
    @js.native
    def code: String = js.native
    inline def code_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
  }
}
