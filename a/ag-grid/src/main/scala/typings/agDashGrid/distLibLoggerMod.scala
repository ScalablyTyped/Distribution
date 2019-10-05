package typings.agDashGrid

import typings.agDashGrid.distLibLoggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/logger", JSImport.Namespace)
@js.native
object distLibLoggerMod extends js.Object {
  @js.native
  class Logger protected () extends js.Object {
    def this(name: String, isLoggingFunc: js.Function0[Boolean]) = this()
    var isLoggingFunc: js.Any = js.native
    var name: js.Any = js.native
    def isLogging(): Boolean = js.native
    def log(message: String): Unit = js.native
  }
  
  @js.native
  class LoggerFactory () extends js.Object {
    var logging: js.Any = js.native
    def create(name: String): Logger = js.native
    def isLogging(): Boolean = js.native
    /* private */ def setBeans(gridOptionsWrapper: js.Any): js.Any = js.native
  }
  
}

