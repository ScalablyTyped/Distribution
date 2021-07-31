package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// LogService
// see http://docs.angularjs.org/api/ng/service/$log
// see http://docs.angularjs.org/api/ng/provider/$logProvider
///////////////////////////////////////////////////////////////////////////
trait ILogService extends StObject {
  
  def debug(args: js.Any*): Unit
  @JSName("debug")
  var debug_Original: ILogCall
  
  def error(args: js.Any*): Unit
  @JSName("error")
  var error_Original: ILogCall
  
  def info(args: js.Any*): Unit
  @JSName("info")
  var info_Original: ILogCall
  
  def log(args: js.Any*): Unit
  @JSName("log")
  var log_Original: ILogCall
  
  def warn(args: js.Any*): Unit
  @JSName("warn")
  var warn_Original: ILogCall
}
object ILogService {
  
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): ILogService = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[ILogService]
  }
  
  @scala.inline
  implicit class ILogServiceMutableBuilder[Self <: ILogService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
