package typings.authmosphere.libSrcTypesLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  def debug(message: String): Unit = js.native
  def debug(message: String, error: js.Any): Unit = js.native
  def error(message: String): Unit = js.native
  def error(message: String, error: js.Any): Unit = js.native
  def fatal(message: String): Unit = js.native
  def fatal(message: String, error: js.Any): Unit = js.native
  def info(message: String): Unit = js.native
  def info(message: String, error: js.Any): Unit = js.native
  def trace(message: String): Unit = js.native
  def trace(message: String, error: js.Any): Unit = js.native
  def warn(message: String): Unit = js.native
  def warn(message: String, error: js.Any): Unit = js.native
}

