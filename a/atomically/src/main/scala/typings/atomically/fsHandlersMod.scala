package typings.atomically

import typings.atomically.typesMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsHandlersMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/fs_handlers", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def isChangeErrorOk(error: Exception): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChangeErrorOk")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isRetriableError(error: Exception): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRetriableError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def onChangeError(error: Exception): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChangeError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
