package typings.authmosphere

import typings.authmosphere.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/safe-logger", JSImport.Namespace)
@js.native
object safeLoggerMod extends js.Object {
  def safeLogger(): Logger = js.native
  def safeLogger(logger: Logger): Logger = js.native
}

