package typings.agDashGrid.distLibLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/logger", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(name: String, isLoggingFunc: js.Function0[Boolean]) = this()
  var isLoggingFunc: js.Any = js.native
  var name: js.Any = js.native
  def isLogging(): Boolean = js.native
  def log(message: String): Unit = js.native
}

