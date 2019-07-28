package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// LogService
// see http://docs.angularjs.org/api/ng.$log
// see http://docs.angularjs.org/api/ng.$logProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait ILogService extends js.Object {
  @JSName("debug")
  var debug_Original: ILogCall = js.native
  @JSName("error")
  var error_Original: ILogCall = js.native
  @JSName("info")
  var info_Original: ILogCall = js.native
  @JSName("log")
  var log_Original: ILogCall = js.native
  @JSName("warn")
  var warn_Original: ILogCall = js.native
  def debug(args: js.Any*): Unit = js.native
  def error(args: js.Any*): Unit = js.native
  def info(args: js.Any*): Unit = js.native
  def log(args: js.Any*): Unit = js.native
  def warn(args: js.Any*): Unit = js.native
}

