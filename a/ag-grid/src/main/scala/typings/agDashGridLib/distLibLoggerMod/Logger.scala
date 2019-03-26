package typings
package agDashGridLib.distLibLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/logger", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(name: java.lang.String, isLoggingFunc: js.Function0[scala.Boolean]) = this()
  var isLoggingFunc: js.Any = js.native
  var name: js.Any = js.native
  def isLogging(): scala.Boolean = js.native
  def log(message: java.lang.String): scala.Unit = js.native
}

