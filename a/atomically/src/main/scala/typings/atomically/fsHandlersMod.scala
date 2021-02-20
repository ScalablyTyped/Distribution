package typings.atomically

import typings.atomically.typesMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsHandlersMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/fs_handlers", "default.isChangeErrorOk")
    @js.native
    def isChangeErrorOk(error: Exception): Boolean = js.native
    
    @JSImport("atomically/dist/utils/fs_handlers", "default.isRetriableError")
    @js.native
    def isRetriableError(error: Exception): Boolean = js.native
    
    @JSImport("atomically/dist/utils/fs_handlers", "default.onChangeError")
    @js.native
    def onChangeError(error: Exception): Unit = js.native
  }
}
