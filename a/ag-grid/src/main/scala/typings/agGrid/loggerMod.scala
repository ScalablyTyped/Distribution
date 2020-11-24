package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  
  @js.native
  class Logger protected () extends js.Object {
    def this(name: String, isLoggingFunc: js.Function0[Boolean]) = this()
    
    def isLogging(): Boolean = js.native
    
    var isLoggingFunc: js.Any = js.native
    
    def log(message: String): Unit = js.native
    
    var name: js.Any = js.native
  }
  
  @js.native
  class LoggerFactory () extends js.Object {
    
    def create(name: String): Logger = js.native
    
    def isLogging(): Boolean = js.native
    
    var logging: js.Any = js.native
    
    /* private */ def setBeans(gridOptionsWrapper: js.Any): js.Any = js.native
  }
}
