package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// LogService
// see http://docs.angularjs.org/api/ng/service/$log
// see http://docs.angularjs.org/api/ng/provider/$logProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait ILogService extends StObject {
  
  def debug(args: js.Any*): Unit = js.native
  @JSName("debug")
  var debug_Original: ILogCall = js.native
  
  def error(args: js.Any*): Unit = js.native
  @JSName("error")
  var error_Original: ILogCall = js.native
  
  def info(args: js.Any*): Unit = js.native
  @JSName("info")
  var info_Original: ILogCall = js.native
  
  def log(args: js.Any*): Unit = js.native
  @JSName("log")
  var log_Original: ILogCall = js.native
  
  def warn(args: js.Any*): Unit = js.native
  @JSName("warn")
  var warn_Original: ILogCall = js.native
}
