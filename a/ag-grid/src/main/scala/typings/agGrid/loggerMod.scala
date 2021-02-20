package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("ag-grid/dist/lib/logger", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(name: String, isLoggingFunc: js.Function0[Boolean]) = this()
    
    def isLogging(): Boolean = js.native
    
    var isLoggingFunc: js.Any = js.native
    
    def log(message: String): Unit = js.native
    
    var name: js.Any = js.native
  }
  
  @JSImport("ag-grid/dist/lib/logger", "LoggerFactory")
  @js.native
  class LoggerFactory () extends StObject {
    
    def create(name: String): Logger = js.native
    
    def isLogging(): Boolean = js.native
    
    var logging: js.Any = js.native
    
    /* private */ def setBeans(gridOptionsWrapper: js.Any): js.Any = js.native
  }
}
